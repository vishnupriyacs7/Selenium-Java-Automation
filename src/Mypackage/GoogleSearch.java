package Mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	     driver.get("https://google.com/");
	     driver.manage().window().maximize();
	     
	     WebElement search = driver.findElement(By.id("APjFqb"));
	     System.out.println("selected");
	     search.sendKeys("Testing");
	     search.submit();
	     
	     WebElement result = driver.findElement(By.xpath("/html/body/div[3]/div/div[13]/div/div[2]/div[2]/div/div/div[1]/div/div/div/div[1]/div/div/span/a/h3\r\n"));
	     result.click();
	     driver.close();	     
	     
	}

}
