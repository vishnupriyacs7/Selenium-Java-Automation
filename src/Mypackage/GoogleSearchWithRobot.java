package Mypackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchWithRobot {
	public static void main(String[] args) {
        try {
            WebDriver driver = new ChromeDriver();

            driver.get("https://www.google.com");
//            WebElement searchBox = driver.findElement(By.name("q"));
//            searchBox.click();
//            searchBox.sendKeys("Selenium WebDriver");
            driver.findElement(By.name("q")).sendKeys("testing");
            Thread.sleep(2000);
            // Use Robot class to simulate pressing the DOWN arrow key and ENTER
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_DOWN); // Move down in the suggestions
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyRelease(KeyEvent.VK_DOWN); // Release the DOWN key
            Thread.sleep(3000); // Wait for half a second
            robot.keyPress(KeyEvent.VK_ENTER); // Press ENTER to submit the search
            robot.keyRelease(KeyEvent.VK_ENTER); // Release the ENTER key
            // Wait for the search results to load
            Thread.sleep(3000);
            // Optional: Use Robot to press ESC to close any modal or dropdown (if needed)
            robot.keyPress(KeyEvent.VK_ESCAPE);
            robot.keyRelease(KeyEvent.VK_ESCAPE);

            // Close the browser
            driver.quit();
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }

}
