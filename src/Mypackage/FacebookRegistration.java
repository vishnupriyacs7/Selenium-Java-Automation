package Mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		//SELECT CREATE ACCOUNT
		WebElement account = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));
		account.click();
		Thread.sleep(1000);
		
		
		//SEND DATAS AND FILL THE FORM
		WebElement name = driver.findElement(By.name("firstname"));
		name.sendKeys("Vishnupriya");
		Thread.sleep(1000);
//		
		WebElement surname = driver.findElement(By.name("lastname"));
		surname.sendKeys("C S");
		Thread.sleep(1000);
//		
		WebElement mobEmail = driver.findElement(By.name("reg_email__"));
		mobEmail.sendKeys("vishnupriyacs@gmail.com");
		Thread.sleep(1000);
//
//		
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("vIshnupriyacs@2024");
		Thread.sleep(1000);
//		
		//select day month year
		Select day = new Select(driver.findElement(By.name("birthday_day")));
		day.selectByVisibleText("20");
		Thread.sleep(1000);
		System.out.println(day.isMultiple());
		day.deselectByVisibleText("20");
//		
		Select month = new Select(driver.findElement(By.name("birthday_month")));
		List <WebElement> elementCount = month.getOptions();
    	System.out.println(elementCount.size());
//    	
//    	//for each loop
//    	for(WebElement mon :elementCount ){
//    	      String sValue = mon.getText();
//    	      System.out.println(sValue);
//    	}


//		month.selectByValue("2");
//		Thread.sleep(1000);
		
		Select year = new Select(driver.findElement(By.name("birthday_year")));
		year.selectByIndex(3);
		Thread.sleep(1000);
		
//		driver.findElement(By.xpath("//*[@class=\"_8esa\"]")).click();
		
		
		//list gender
//				List<WebElement>gender = driver.findElements(By.name("sex"));
//			
//				
				
//				System.out.println("Available gender values:");
//				for (WebElement radioButton : gender) {
//					// Get the value attribute of each radio button
//					String genderValue = radioButton.getAttribute("value");
//					System.out.println(genderValue);
//					Thread.sleep(1000);
//				}
//				
//				

				
				

	}

}
