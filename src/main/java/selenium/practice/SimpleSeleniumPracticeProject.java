package selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.interactions.Actions;


import java.time.Duration;

public class SimpleSeleniumPracticeProject {

    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        initDriver();

        // task 1
        // Fill all the provided fields. Click the 'Submit' button. Check that the registration message is displayed.
        // If it happens to be easy, check that the registration message contains the same data that was used for registration

        driver.get("https://demoqa.com/text-box");

        WebElement inputName = driver.findElement(By.id("userName"));
        inputName.sendKeys("Ihor");

        WebElement inputEmail = driver.findElement(By.id("userEmail"));
        inputEmail.sendKeys("Ihor@gmail.com");

        WebElement inputCurrentAddress = driver.findElement(By.id("currentAddress"));
        inputCurrentAddress.sendKeys("42-2630 Hegal Place, Alexandria, Virginia");

        WebElement inputPermanentAddress = driver.findElement(By.id("permanentAddress"));
        inputPermanentAddress.sendKeys("1164 Morning Glory Circle, Westport, CT/t");

        WebElement pressSubmit = driver.findElement(By.id("submit"));
        pressSubmit.click();


        WebElement fieldWithInput = driver.findElement(By.id("output"));
        String inputValues = fieldWithInput.getText();

        if (!inputValues.isEmpty()) {
            System.out.println("Поле заповнено чудово");
        } else {
            System.out.println("Поле порожнє");
        }


        String actualName = inputName.getAttribute("value");
        Assert.assertEquals(actualName, "Ihor", "не відображається правильно");

        String actualEmail = inputEmail.getAttribute("value");
        Assert.assertEquals(actualEmail, "Ihor@gmail.com", "не відображається правильно");

        String actualCurrentAddress = inputCurrentAddress.getAttribute("value");
        Assert.assertEquals(actualCurrentAddress, "42-2630 Hegal Place, Alexandria, Virginia", "не відображається");

        String actualPermanentAddress = inputPermanentAddress.getAttribute("value");
        Assert.assertEquals(actualPermanentAddress, "1164 Morning Glory Circle, Westport, CT/t", "не відображається");

        Thread.sleep(2000);


        driver.get("https://demoqa.com/buttons");

        // task 2
        // Click the 'Click me' button. Assert that 'You have done a dynamic click' message is displayed
        // Do the right click on the 'Right Click me' button. Assert that 'You have done a right click' message is displayed
        // Do the double click on the 'Double Click me' button. Assert that 'You have done a dynamic click' message is displayed


        WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClickBtn).perform();

        boolean doubleClickMessage = driver.findElement(By.id("doubleClickMessage")).isDisplayed();
        if (doubleClickMessage)
            System.out.println("Ok");
        Thread.sleep(1000);


        WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightClickBtn).perform();

        boolean rightClickMessage = driver.findElement(By.id("rightClickMessage")).isDisplayed();
        if (rightClickMessage)
            System.out.println("Ok");

        Thread.sleep(1000);

        WebElement сlickMe = driver.findElement(By.xpath("//button[normalize-space(text())='Click Me']"));
        сlickMe.click();


        boolean dynamicClickMessage = driver.findElement(By.id("dynamicClickMessage")).isDisplayed();
        if (dynamicClickMessage)
            System.out.println("Ok");


        Thread.sleep(5000);

        driver.quit();
    }

    private static void initDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}
