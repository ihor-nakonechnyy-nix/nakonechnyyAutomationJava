package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class SecondTestCase {
    WebDriver driver;

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
    public void TearDown() throws InterruptedException {
        try {
            driver.findElement(By.id("react-burger-menu-btn")).click();
            Thread.sleep(1000);

            driver.findElement(By.id("reset_sidebar_link")).click();
            Thread.sleep(500);
        } finally {
            if (driver != null) {
                driver.quit();

            }
        }

        {

        }
    }


    @Test
    public void checkProductPrice() throws InterruptedException {
        driver.get("https://www.saucedemo.com");

        // Login
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        WebElement t_Shirt = driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
        t_Shirt.click();

        WebElement jacket = driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
        jacket.click();

        WebElement bike = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
        bike.click();

        String price1 = driver.findElement(By.xpath("//*[text()='Test.allTheThings() T-Shirt (Red)']/../../..//div[@class='inventory_item_price']")).getText().trim().replace("$", "");
        String price2 = driver.findElement(By.xpath("//*[text()='Sauce Labs Fleece Jacket']/../../..//div[@class='inventory_item_price']")).getText().trim().replace("$", "");
        String price3 = driver.findElement(By.xpath("//*[text()='Sauce Labs Bike Light']/../../..//div[@class='inventory_item_price']")).getText().trim().replace("$", "");

        System.out.println(price1);
        System.out.println(price2);
        System.out.println(price3);

        System.out.println("_________________________________________________");

        driver.findElement(By.className("shopping_cart_link")).click();
        Thread.sleep(1000);

        String price1Bucket = driver.findElement(By.xpath("//*[text()='Test.allTheThings() T-Shirt (Red)']/../../..//div[@class='inventory_item_price']")).getText().trim().replace("$", "");
        String price2Bucket = driver.findElement(By.xpath("//*[text()='Sauce Labs Fleece Jacket']/../../..//div[@class='inventory_item_price']")).getText().trim().replace("$", "");
        String price3Bucket = driver.findElement(By.xpath("//*[text()='Sauce Labs Bike Light']/../../..//div[@class='inventory_item_price']")).getText().trim().replace("$", "");

        System.out.println(price1Bucket);
        System.out.println(price2Bucket);
        System.out.println(price3Bucket);

        Assert.assertEquals(price1, price1Bucket, "Ціна для T-Shirt не збігається!");
        Assert.assertEquals(price2, price2Bucket, "Ціна для Jacket не збігається!");
        Assert.assertEquals(price3, price3Bucket, "Ціна для Bike Light не збігається!");

    }
}

