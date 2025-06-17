package selenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SimpleSeleniumPracticeProject {

    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        initDriver();

        driver.get("https://demoqa.com/buttons");

        // task 1
        // Fill all the provided fields. Click the 'Submit' button. Check that the registration message is displayed.
        // If it happens to be easy, check that the registration message contains the same data that was used for registration

        driver.get("https://demoqa.com/buttons");

        // task 2
        // Click the 'Click me' button. Assert that 'You have done a dynamic click' message is displayed
        // Do the right click on the 'Right Click me' button. Assert that 'You have done a right click' message is displayed
        // Do the double click on the 'Double Click me' button. Assert that 'You have done a dynamic click' message is displayed


        Thread.sleep(5000);

        driver.quit();
    }

    private static void initDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}
