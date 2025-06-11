package Mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollExample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		try {
            // Navigate to the Linux page on Wikipedia
            driver.get("https://en.wikipedia.org/wiki/Linux");

            // Wait for the page to load completely
            Thread.sleep(2000); // Optional: wait for 2 seconds

            // Find the "History" section header element (as an example)
            WebElement element = driver.findElement(By.id("History"));

            // Create an instance of JavascriptExecutor
            JavascriptExecutor js = (JavascriptExecutor) driver;
            Thread.sleep(3000);

            // Scroll the page until the element is in view
            js.executeScript("arguments[0].scrollIntoView();", element);

            // Optional: Wait for a few seconds to see the result
            Thread.sleep(3000); // wait for 2 seconds

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }

	}

}
