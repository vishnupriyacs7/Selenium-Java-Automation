package Mypackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBy {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		try {
            // Navigate to a website with horizontal scrolling content
            driver.get("https://www.wikipedia.org/");

            // Optional: Wait for the page to load
            Thread.sleep(2000); // wait for 2 seconds

            // Create an instance of JavascriptExecutor
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");  

            // Scroll horizontally by 1000 pixels
            //js.executeScript("window.scrollBy(0, 1000);");

            // Optional: Wait to observe the result
            Thread.sleep(2000); // wait for 2 seconds

            // Scroll back to the left by 500 pixels
            //js.executeScript("window.scrollBy(0, -500);");

            // Optional: Wait to observe the result
            Thread.sleep(2000); // wait for 2 seconds

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
	}

}
