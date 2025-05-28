package Mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		//selectByVisibleText()
		Select country = new Select(driver.findElement(By.name("country")));
		country.selectByIndex(73);
		Thread.sleep(1000);
		//ANGOLA BOLIVIA
		
		country.selectByVisibleText("ANGOLA");
		Thread.sleep(1000);
		
		country.selectByValue("BOLIVIA");
		Thread.sleep(1000);
		
		List options = country.getOptions();
		int size = options.size();
		System.out.println("Number of Options :" + size);
		
		//printing country names
		for(int i = 0 ; i<size ; i++) {
			String countryName = ((WebElement) options.get(i)).getText();
			if(countryName.equalsIgnoreCase("SERBIA")) {
				country.selectByIndex(i);
				System.out.println("Country 'serbia' selected.");
			}
			System.out.println(countryName);
		}
		
		driver.quit();

	}

}
