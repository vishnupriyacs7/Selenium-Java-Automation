package Mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		
		String PageTitle = driver.getTitle();
		System.out.println("Title of the Page : " + PageTitle);
		
		String PageURL = driver.getCurrentUrl();
		System.out.println("URL of the Page : " + PageURL);
		
		String PageSource = driver.getPageSource();
		System.out.println("source code : " + PageSource);
		
		System.out.println("source  size : " + PageSource.length());
		
		//driver.close();
		driver.quit();
	}

}
