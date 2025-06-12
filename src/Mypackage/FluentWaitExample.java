package Mypackage;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitExample {
	public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        try {          
            driver.get("https://www.wikipedia.org/");
            
            Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30)) // Max wait time
                .pollingEvery(Duration.ofSeconds(5)) // Polling interval
                .ignoring(NoSuchElementException.class); // Ignore exceptions
          
            WebElement searchInput = wait.until(d -> d.findElement(By.name("search"))); // Changed parameter name to 'd'
            searchInput.sendKeys("Selenium (software)");
           
            WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
            searchButton.click();
         
            wait.until(d -> d.getTitle().toLowerCase().startsWith("selenium (software)")); // Changed parameter name to 'd'            
            System.out.println("Page title is: " + driver.getTitle());
        } finally {
//            driver.quit();
        }
    }
}
