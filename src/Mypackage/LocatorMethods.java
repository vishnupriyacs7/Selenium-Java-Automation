package Mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorMethods {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
	     driver.get("https://www.facebook.com/");
	        
	        //by id
	        WebElement element = driver.findElement(By.id("icp-nav-flyout"));
	        element.click();
	        
	        //by name
	        WebElement email = driver.findElement(By.name("email"));
	        email.sendKeys("vishnupriyacs@gmail.com");
	        
	        //by classname 
	        WebElement element1 = driver.findElement(By.className("icp-nav-link-inner"));
	        element1.click();
	        
	        //by tagname
	        WebElement button = driver.findElement(By.tagName("a"));//<button>...</button>
			button.click();
			
			//by link text
	        WebElement link = driver.findElement(By.linkText ("Forgotten password?"));//<a>Forgotten password?</a>
			link.click();
			
			//by css selector
	        driver.findElement(By.cssSelector("#email")).sendKeys("abcd@gmail.com"); //if id attribute use # symbol	        
	        driver.findElement(By.cssSelector(".inputtext")).sendKeys("xyz@gmail.com");//if id attribute use . symbol
	        	        
	        WebElement password = driver.findElement(By.cssSelector("#pass"));
	        // . symbol indicates class="_6ltj" for id use # symbol
	        password.click();
	        password.sendKeys("1234");
	        
	        //by xpath
	        WebElement linktextcontent = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[3]/a"));
	        linktextcontent.click();	        
	        
	}

}
