package Mypackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Launch the browser and navigate to Google
        driver.get("https://www.google.com/");
        
        // Maximize the browser window
//        driver.manage().window().maximize();

        // Get the title of the page
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        
        driver.findElement(By.id("APjFqbfyggub")).click();

        // Compare the actual title with the expected title
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        // Close the browser
        driver.quit();
    }


}
