package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;


import java.time.Duration;

public class SecondTestCase {
    WebDriver driver;

    @DataProvider(name = "productPrices")
    public Object[][] productData() {
        return new Object[][]{
                {"Test.allTheThings() T-Shirt (Red)"},
                {"Sauce Labs Fleece Jacket"},
                {"Sauce Labs Bike Light"}
        };
    }

    @BeforeMethod
    public void setupDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-features=PasswordChangeDetection,PasswordLeakDetection,AutofillKeyedPasswords");
        options.addArguments("--incognito");
        options.addArguments("--disable-popup-blocking");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
    }

    @AfterMethod
    public void tearDown() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
            wait.until(ExpectedConditions.elementToBeClickable(By.id("react-burger-menu-btn"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.id("reset_sidebar_link"))).click();
        } catch (Exception e) {
            System.out.println("Помилка під час очищення: " + e.getMessage());
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }

    @Test(dataProvider = "productPrices")
    public void checkProductPrice(String productName) throws InterruptedException {
        driver.get("https://www.saucedemo.com");

        // Login
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        // Добавляємо товари до кошика
        String productId = "add-to-cart-" + productName
                .toLowerCase()
                .replace(" ", "-");

        WebElement productButton = driver.findElement(By.id(productId));
        productButton.click();

        // add-to-cart-test.allthethings()-t-shirt-(red)
        // add-to-cart-test.allthethings()-t-shirt-(red)

        // {"Test.allTheThings() T-Shirt (Red)"},
        // {"Sauce Labs Fleece Jacket"},
        // {"Sauce Labs Bike Light"}

        // Отримуємо ціну на сторінці товарів
        String pricesOnPage = driver.findElement(By.xpath("//*[text()='" + productName + "']/../../..//div[@class='inventory_item_price']"))
                .getText().trim().replace("$", "");

        System.out.println("_________________________________________________");

        // Переходимо у кошик
        driver.findElement(By.className("shopping_cart_link")).click();
        Thread.sleep(1000);

        // Перевіряємо, що ціни збігаються
        String pricesOnBucket = driver.findElement(By.xpath("//*[text()='" + productName + "']/../../..//div[@class='inventory_item_price']"))
                .getText().trim().replace("$", "");

        Assert.assertEquals(pricesOnPage, pricesOnBucket, "Ціна для T-Shirt не збігається!");
    }
}
