package Mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Highlight {
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
       	driver.manage().window().maximize();
       	
        WebElement username = driver.findElement(By.id("email"));
    	highLightElement(username); // Highlight user name field
    	username.sendKeys("abcd@gmail.com");
    	Thread.sleep(2000);
    	 	
    	 WebElement password = driver.findElement(By.id("pass")); 	
    	 highLightElement(password); // Highlight password field
    	 password.sendKeys("123456");
    	 Thread.sleep(2000);
    	 	
    	 WebElement loginButton = driver.findElement(By.name("login")); 	
    	 highLightElement(loginButton); 
    	 loginButton.click();  

	}
	
	public static void highLightElement(WebElement element){
   	   JavascriptExecutor js = (JavascriptExecutor)driver;  
   	   js.executeScript("arguments[0].setAttribute('style','background: #fff3a1; border: 2px solid red;');", element);  
   	 } 
}
