package Mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadSK {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		 
    	WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
 
    	// enter the file path onto the file-selection input field
    	uploadElement.sendKeys("C:/Users/HP/OneDrive/Pictures/59860.jpg");
 
    	// check the "I accept the terms of service" check box
    	driver.findElement(By.id("terms")).click();
 
    	// click the "UploadFile" button
    	driver.findElement(By.name("send")).click();


	}
}
