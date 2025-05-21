package Mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println("title" + driver.getTitle()) ;
		driver.navigate().forward();
		Thread.sleep(2000);
		System.out.println("title" + driver.getTitle()) ;
		Thread.sleep(2000);
		driver.navigate().refresh();
		System.out.println("page refreshed") ;
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.quit();

	}

}
