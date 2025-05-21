package Mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserCommandsGoogleTask {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");  
		
		String PageTitle = driver.getTitle();
		System.out.println("Title of the Page : " + PageTitle);
		
		String PageURL = driver.getCurrentUrl();
		System.out.println("URL of the Page : " + PageURL);
		
		if(PageURL.equals("http://www.google.com/")){
			System.out.println("same page" + PageURL);
		}else {
			System.out.println("different page");
		}
		
		String PageSource = driver.getPageSource();
		//System.out.println("source code : " + PageSource);
		
		System.out.println("source  size : " + PageSource.length());
		
		//driver.close();
		driver.quit();

	}

}
