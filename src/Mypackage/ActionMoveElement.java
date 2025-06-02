package Mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionMoveElement {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		
        WebElement link_Home = driver.findElement(By.linkText("Home"));
        WebElement td_Home = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]"));
//        Point point = td_Home.getLocation();
//        System.out.println(point);
        Actions builder = new Actions(driver);
        Action mouseoverHome = builder.moveToElement(link_Home).build();
//        Action mouseoverHome = builder.moveByOffset(25, 286).build();
      
        
        String bgColor = td_Home.getCssValue("background-color");
        System.out.println("Before hover: " + bgColor);  
        Thread.sleep(3000);
        mouseoverHome.perform();       
        bgColor = td_Home.getCssValue("background-color");
        System.out.println("After hover: " + bgColor);
        
        Thread.sleep(3000);
        driver.quit();
        
	}
}
