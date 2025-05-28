package Mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CountrySelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		//selectByVisibleText()
		Select obSelect = new Select(driver.findElement(By.name("country")));
		obSelect.selectByIndex(73);
		Thread.sleep(1000);
		
		
		Select opSelect = new Select(driver.findElement(By.name("country")));
		List<WebElement> eleCount = opSelect.getOptions();
		System.out.println(eleCount.size());
		int iSize =eleCount.size();
		for(int i=0;i<iSize;i++) {
			String sValue = eleCount.get(i).getText();
			if(sValue.equals("EUROPA ISLAND")) {
				opSelect.selectByIndex(i);
			}
		}
		
		
		Select oSelect = new Select(driver.findElement(By.name("country")));
		oSelect.selectByVisibleText("ALGERIA");
		Thread.sleep(1000);
		
		
		for(int i=0;i<iSize;i++) {
			String sValue = eleCount.get(i).getText();
			System.out.println(sValue);
		}
		
		Select newSelect=new Select(driver.findElement(By.name("country")));
		newSelect.selectByIndex(42);
		
		Thread.sleep(1000);

	}

}
