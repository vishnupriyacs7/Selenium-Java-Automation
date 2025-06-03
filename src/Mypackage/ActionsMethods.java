package Mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethods {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		
		WebElement username = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		
		action.moveToElement(driver.findElement(By.linkText("Forgotten password?"))).perform();
		System.out.println("moved");
		 Thread.sleep(3000);
        
        action.clickAndHold(username).perform();
        System.out.println("click and hold");
		
        Thread.sleep(2000);
        
        action.doubleClick(username).perform();
        Thread.sleep(2000);
        
        action.moveByOffset(50, 60).perform();
        action.contextClick(username).perform();
        
        Thread.sleep(2000);

        action.sendKeys(username, "Selenium Actions Example").perform();
        action.sendKeys(password, "Example").perform();
        
        action.keyDown(Keys.ENTER).perform();
        action.keyUp(Keys.ENTER).perform();
        action.keyDown(Keys.ENTER);
        System.out.println("ENTER key pressed and released");
        
        Thread.sleep(2000);
        driver.quit();
		
	}


}
