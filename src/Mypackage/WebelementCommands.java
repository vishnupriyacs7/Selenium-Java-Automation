package Mypackage;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;

public class WebelementCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
//		driver.navigate().to("https://www.google.com/");		
		driver.manage().window().maximize();
		
//		WebElement search = driver.findElement(By.name("q"));
//		
//		System.out.println("Display status of search field : " + search.isDisplayed());
//		System.out.println("Enable status of search field : " + search.isEnabled());
//		System.out.println("selection status of search field : " + search.isSelected());
//		search.sendKeys("S");
//		Thread.sleep(2000);
//		
//		search.sendKeys("o");
//		
//		Thread.sleep(3000);
//		
//		search.clear();
//		Thread.sleep(3000);
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.name("email"));
//		System.out.println("Display status" + username.isDisplayed());
		Thread.sleep(3000);
		
//		WebElement hiddenField = driver.findElement(By.name("jazoest"));
//		System.out.println("Display status" + hiddenField.isDisplayed());
		
		username.sendKeys("8765");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("qwerty");
		
		WebElement loginButton = driver.findElement(By.name("login"));
		System.out.println("tagname of loginbutton : " + loginButton.getTagName());
		System.out.println("Attribute - loginbutton : " + loginButton.getAttribute("id"));
		System.out.println("css property of loginbutton : " + loginButton.getCssValue("font-size"));
		
		Dimension size = loginButton.getSize();
		System.out.println("size" + size);
		System.out.println("width " + size.width);
		System.out.println("height " + size.height);
		
		Point p = loginButton.getLocation();
		System.out.println("size" + p);
		System.out.println("width " + p.x);
		System.out.println("height " + p.y);
		
		//loginButton.submit();
		
		driver.quit();
		
		
		
		

	}

}
