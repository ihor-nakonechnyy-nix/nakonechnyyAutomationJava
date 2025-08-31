package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class SecondTestCase {

    WebDriver driver;
    WebDriverWait wait;

    @DataProvider(name = "productNames")
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
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown() {
        try {
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

    @Test(dataProvider = "productNames")
    public void checkProductPrice(String productName) {
        driver.get("https://www.saucedemo.com");

        // Логін
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name"))).sendKeys("standard_user");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password"))).sendKeys("secret_sauce");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button"))).click();

        // Додаємо товар у кошик (по назві)
        String addToCartXpath = "//*[text()='%s']/../../..//button".formatted(productName);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(addToCartXpath))).click();

        // Ціна на сторінці товарів
        String productPriceXpath = "//*[text()='%s']/../../..//div[@class='inventory_item_price']"
                .formatted(productName);
        String priceOnPage = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(productPriceXpath))
        ).getText().trim().replace("$", "");

        // Переходимо у кошик
        wait.until(ExpectedConditions.elementToBeClickable(By.className("shopping_cart_link"))).click();

        // Ціна в кошику (той самий XPath працює і в корзині)
        String priceInCart = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(productPriceXpath))
        ).getText().trim().replace("$", "");

        // Порівняння
        Assert.assertEquals(priceOnPage, priceInCart, "Ціна не збігається!");
    }
}
