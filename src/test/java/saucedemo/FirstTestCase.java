package saucedemo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FirstTestCase {

    private static WebDriver driver;

    @Test
    void test1() throws InterruptedException {
        // Ініціалізація драйвера
        initDriver();

        // Відкриваємо сайт
        driver.get("https://www.saucedemo.com");

        // Вводимо логін для заблокованого користувача
        WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        username.sendKeys("locked_out_user");

        // Вводимо неправильний пароль
        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("secret_sauc");

        // Натискаємо кнопку логіну
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        // Перевіряємо, що логотип "Swag Labs" присутній
        WebElement logo = driver.findElement(By.xpath("//div[@class='login_logo']"));
        String logoText = logo.getText();
        Assert.assertEquals(logoText.trim(), "Swag Labs", "не відображається");

        Thread.sleep(1000);

        // Перевіряємо повідомлення про помилку
        WebElement error = driver.findElement(By.xpath("//h3[@data-test='error']"));
        String errorMessage = error.getText();
        Assert.assertEquals(errorMessage.trim(), "Epic sadface: Username and password do not match any user in this service", "не відображається");

        // Закриваємо повідомлення про помилку
        WebElement closeButton = driver.findElement(By.xpath("//button[@class='error-button']"));
        closeButton.click();

        Thread.sleep(1000);

        // Закриваємо браузер
        driver.quit();
    }

    @Test
    void test2() throws InterruptedException {
        // Ініціалізація драйвера
        initDriver();

        // Відкриваємо сайт
        driver.get("https://www.saucedemo.com");

        // Вводимо логін стандартного користувача
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");

        // Вводимо пароль
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");

        // Натискаємо кнопку логіну
        driver.findElement(By.id("login-button")).click();

        // Перевіряємо, що ми на сторінці товарів
        WebElement inventoryContainer = driver.findElement(By.id("inventory_container"));
        Assert.assertTrue(inventoryContainer.isDisplayed());

        // Обираємо сортування товарів за ціною (від меншої до більшої)
        Select dropdown = new Select(driver.findElement(By.className("product_sort_container")));
        dropdown.selectByVisibleText("Price (low to high)");

        // Збираємо всі ціни товарів
        List<WebElement> inventoryItemPrice = driver.findElements(By.cssSelector(".inventory_item_price"));
        List<Double> itemPrices = new ArrayList<>();
        for (WebElement priceElement : inventoryItemPrice) {
            String priceItemText = priceElement.getText().replace("$", ""); // Прибираємо знак "$"
            itemPrices.add(Double.parseDouble(priceItemText)); // Перетворюємо на double
            System.out.println(priceItemText); // Виводимо ціну
        }

        // Додаємо товар "Sauce Labs Bolt T-Shirt" у корзину
        WebElement addButton = driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));

        // Зчитуємо дані з картки товару
        WebElement productCard = addButton.findElement(By.xpath("./ancestor::div[@class='inventory_item']"));

        String nameBefore = productCard.findElement(By.className("inventory_item_name")).getText();
        String descBefore = productCard.findElement(By.className("inventory_item_desc")).getText();
        double priceBefore = Double.parseDouble(productCard.findElement(By.className("inventory_item_price")).getText().replace("$", ""));

        // Створюємо об’єкт товару до кошика
        Product productBefore = new Product(nameBefore, priceBefore, descBefore, 1);

        // Натискаємо "Add to Cart"
        addButton.click();

        // Переходимо до кошика
        driver.findElement(By.className("shopping_cart_link")).click();
        Thread.sleep(1000);

        // Перевіряємо, що кнопка змінилася на "Remove"
        WebElement smallCartButton = driver.findElement(By.className("btn_small"));
        Assert.assertEquals(smallCartButton.getText(), "Remove");

        // Перевіряємо, що в корзині 1 товар
        WebElement shoppingCartBadge = driver.findElement(By.className("shopping_cart_badge"));
        Assert.assertEquals(shoppingCartBadge.getText(), "1");

        // Зчитуємо дані товару в кошику
        WebElement nameElement = driver.findElement(By.className("inventory_item_name"));
        WebElement priceElement = driver.findElement(By.className("inventory_item_price"));
        WebElement descElement = driver.findElement(By.className("inventory_item_desc"));

        //  Створюємо новий об’єкт Product, вже з інформацією з кошика.
        Product productInCart = new Product(nameElement.getText(), Double.parseDouble(priceElement.getText().replace("$", "")), descElement.getText(), 1);

        // Порівнюємо обидва об’єкти
        Assert.assertEquals(productInCart.productName, productBefore.productName, "Назви не збігаються");
        Assert.assertEquals(productInCart.productPrice, productBefore.productPrice, "Ціни не збігаються");
        Assert.assertEquals(productInCart.productDescription, productBefore.productDescription, "Опис не збігається");
        Assert.assertEquals(productInCart.itemsInCart, productBefore.itemsInCart, "Кількість товарів не збігається");

        System.out.println("Дані в корзині відповідають вибраному товару!");

        // Натискаємо "Remove" у кошику
        smallCartButton.click();
        Thread.sleep(1000); // коротке очікування, можна замінити на явне

        // Перевіряємо що кошик пустий
        List<WebElement> cartBadges = driver.findElements(By.className("shopping_cart_badge"));
        Assert.assertTrue(cartBadges.isEmpty(), "Значок кількості товарів все ще відображається після видалення");

        //Натискаємо на кнопку "continue-shopping" та переходимо на сторінку усіх продуктів
        driver.findElement(By.id("continue-shopping")).click();

        // Зчитуємо товар знову
        WebElement addButtonAgain = driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
        WebElement productCardAgain = addButtonAgain.findElement(By.xpath("./ancestor::div[@class='inventory_item']"));
        String nameAgain = productCardAgain.findElement(By.className("inventory_item_name")).getText();
        String descAgain = productCardAgain.findElement(By.className("inventory_item_desc")).getText();
        double priceAgain = Double.parseDouble(productCardAgain.findElement(By.className("inventory_item_price")).getText().replace("$", ""));

        // зберігаємо дані продукту в нової обєкті класу Product
        Product productAgain = new Product(nameAgain, priceAgain, descAgain, 0);

        // Натискаємо "Add to cart" щоб добавити в корзину товар "Sauce Labs Backpack"
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

        // Переходимо в корзину
        driver.findElement(By.className("shopping_cart_link")).click();

        // Натискаємо "checkout" кнопку
        driver.findElement(By.id("checkout")).click();

        // Заповнюємо поня сторінки "checkout"
        driver.findElement(By.id("first-name")).sendKeys("Ihor");
        driver.findElement(By.id("last-name")).sendKeys("Nakonechnyy");
        driver.findElement(By.id("postal-code")).sendKeys("7777");
        driver.findElement(By.id("continue")).click();

        // Порівняння цін товару на сторінці Checkout: Overview
        WebElement itemPrice = driver.findElement(By.className("inventory_item_price"));
        WebElement itemTotalPrice = driver.findElement(By.className("summary_subtotal_label"));

        String itemPriceText = itemPrice.getText().replace("$", "").trim();
        String itemTotalPriceText = itemTotalPrice.getText().replace("Item total: $", "").trim();

        if (itemPriceText.equals(itemTotalPriceText)) {
            System.out.println("Ціни збігаються");
        } else {
            System.out.println("Ціни не збігаються");
        }

        System.out.println(itemPriceText);
        System.out.println(itemTotalPriceText);

        // Клік на кнопці "finish"
        driver.findElement(By.id("finish")).click();

        // Перевіряємо 'Pony Express' сторінці присутнє
        WebElement ponyExpress = driver.findElement(By.className("pony_express"));
        Assert.assertTrue(ponyExpress.isDisplayed());

        //Закриваємо браузер
        driver.quit();
    }

    private static void initDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-features=PasswordChangeDetection,PasswordLeakDetection,AutofillKeyedPasswords");
        options.addArguments("--incognito");
        options.addArguments("--disable-popup-blocking");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
    }

}
