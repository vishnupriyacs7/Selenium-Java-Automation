package Mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///D:/html/formtask2.html");
//		driver.manage().window().maximize();	
		
		//selectByVisibleText()
		Select oSelect = new Select(driver.findElement(By.id("course")));
		System.out.println("Multiple select Available : " + oSelect.isMultiple());
		oSelect.selectByVisibleText("Engineering");
		Thread.sleep(3000);
		oSelect.selectByVisibleText("IT");
		Thread.sleep(3000);
		
			
		//selectByindex()
		oSelect.selectByIndex(2);
		Thread.sleep(3000);
		
		//selectByValue()
		oSelect.selectByValue("commerce");
		Thread.sleep(3000);
		
		oSelect.deselectByIndex(2);
		Thread.sleep(3000);
		oSelect.deselectByValue("engineering");
		Thread.sleep(3000);
		oSelect.deselectByVisibleText("IT");
		
		oSelect.selectByVisibleText("Engineering");
		Thread.sleep(3000);
		oSelect.selectByVisibleText("IT");
		Thread.sleep(3000);
		oSelect.selectByIndex(2);
		Thread.sleep(3000);
		oSelect.deselectAll();
		
		

		//oSelect.deselectAll();
		

	}

}
