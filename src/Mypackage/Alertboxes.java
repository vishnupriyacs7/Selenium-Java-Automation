package Mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Alertboxes {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Alert box
		driver.navigate().to("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		Thread.sleep(3000);
		
		//switch to frame
		driver.switchTo().frame("iframeResult");
				
		//find try it element
		WebElement tryit = driver.findElement(By.xpath("/html/body/button"));
		tryit.click();
		Thread.sleep(3000);
		
		//click ok button
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		//confirm box
		driver.navigate().to("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		Thread.sleep(3000);
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("/html/body/button")).click();
		
		Thread.sleep(3000);
						
		//click cancel button
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		
		//get text
		driver.findElement(By.xpath("/html/body/button")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		//prompt box
		driver.navigate().to("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("/html/body/button")).click();
		Thread.sleep(3000);
		
		//send data to prompt box
		driver.switchTo().alert().sendKeys("prompt alert testing ");
		driver.switchTo().alert().accept();
		
		
		//send data to prompt box
//				Alert promptAlert = driver.switchTo().alert();
//				promptAlert.sendKeys("prompt alert testing");
//				// Accept the alert (you can also use `dismiss()` to cancel)
//				promptAlert.accept();
	}

}
