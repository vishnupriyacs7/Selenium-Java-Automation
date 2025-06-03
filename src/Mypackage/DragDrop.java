package Mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DragDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

        driver.get("file:///D:/html/iframe.html");
//        driver.switchTo().frame(0); 
//        driver.switchTo().frame("iframe-a"); 
        WebElement iframe =  driver.findElement(By.name("iframe-a"));
        driver.switchTo().frame(iframe); 
        
        driver.findElement(By.linkText("Home")).click();
	}

}
