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
		
		WebElement surname = driver.findElement(By.name("lastname"));
		surname.sendKeys("C S");
		Thread.sleep(1000);
		
		WebElement mobEmail = driver.findElement(By.name("reg_email__"));
		mobEmail.sendKeys("vishnupriyacs@gmail.com");
		Thread.sleep(1000);
		
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("vIshnupriyacs@2025");
		Thread.sleep(1000);
		
		//select day month year
		Select day = new Select(driver.findElement(By.name("birthday_day")));
		day.selectByVisibleText("20");
		Thread.sleep(1000);
		System.out.println(day.isMultiple());
		
		Select month = new Select(driver.findElement(By.name("birthday_month")));
		List <WebElement> monthOptions= month.getOptions();
    	System.out.println(monthOptions.size());
    	
//    	//for each loop
    	for(WebElement mon :monthOptions ){
    	      String sValue = mon.getText();
    	      System.out.println(sValue);
    	}

		month.selectByValue("2");
		Thread.sleep(1000);
		
		Select year = new Select(driver.findElement(By.name("birthday_year")));
		year.selectByIndex(20);
		Thread.sleep(1000);
		
//		driver.findElement(By.xpath("//*[@class=\"_8esa\"]")).click();
				
		//gender using label field
		List<WebElement>gender = driver.findElements(By.className("_58mt"));
						
		System.out.println("Available gender values:");
		for (WebElement radioButton : gender) {
				// Get the value attribute of each radio button
				String genderValue = radioButton.getText();
				System.out.println(genderValue);
				if(genderValue.equalsIgnoreCase("Female")) {
					radioButton.click();
					break;
				}
				Thread.sleep(1000);
		}
			
		Thread.sleep(3000);
		driver.quit();
	}

}
