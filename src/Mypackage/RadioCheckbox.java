package Mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioCheckbox {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    driver.navigate().to("https://demo.guru99.com/test/radio.html");
	    Thread.sleep(3000);
	     
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	     
	    //list buttons
		List<WebElement> btn = driver.findElements(By.name("webform"));
		System.out.println(btn);
			
		//forEach loop
		for(WebElement ele:btn) {
				ele.isDisplayed();
				ele.isEnabled();
				ele.isSelected();
				ele.click();
				System.out.println(ele.isSelected());
				Thread.sleep(1000);
		}
	}

}
