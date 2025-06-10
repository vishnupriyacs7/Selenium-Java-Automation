package Mypackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

        // Navigate to Google's home page
        driver.get("https://www.w3schools.com/java/default.asp");

        // Store the parent window handle (main Google home page window)
        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window Handle: " + parentWindow);
        
        driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[1]/div[1]/div[4]/p/a")).click();

        // Get all the window handles (the main window and the new one)
        Set<String> allTabs = driver.getWindowHandles();
        System.out.println("Tabs are " + allTabs);

        // Switch to the new tab
        for (String tab : allTabs) {
            if (!tab.equals(parentWindow)) {
                // Switch to the new tab
                driver.switchTo().window(tab);
                System.out.println("Switched to new tab: " + tab);

                // Perform actions in the new tab, e.g., print the title and URL
                System.out.println("New Tab Title: " + driver.getTitle());
                System.out.println("New Tab URL: " + driver.getCurrentUrl());
                Thread.sleep(3000);
                // Close the new tab
                driver.close();
                Thread.sleep(3000);
                System.out.println("New tab closed.");
            }
        }

        // Switch back to the original tab
        driver.switchTo().window(parentWindow);
        System.out.println("Switched back to parent tab: " + driver.getTitle());
        Thread.sleep(3000);
        // Close the driver
        driver.quit();
        
        

	}
}
