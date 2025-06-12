package Mypackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

        // Set the explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Launch the browser and navigate to the demo page
        driver.get("https://demoqa.com/elements");
        
        // Maximize the browser window
        driver.manage().window().maximize();

        // Get the actual value of the title
        String expectedTitle = "DEMOQA";
        String actualTitle = driver.getTitle();

        // Compare the actual title with the expected title
        if (actualTitle.contentEquals(expectedTitle)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        // Wait for the Textbox element to be visible and click it
        WebElement textbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[1]/div/ul/li[1]")));
        textbox.click();

        // Optionally, perform additional actions or assertions here

        // Close the browser
//        driver.quit();
	}


}
