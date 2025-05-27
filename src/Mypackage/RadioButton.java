package Mypackage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    driver.get("https://demoqa.com/elements");
	    driver.manage().window().maximize();   

	    //click radio button element
	    driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[1]/div/ul/li[3]")).click();
	     
	    //Identifying  radio button using its ID as a locator
	    WebElement radio = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[3]/label"));
	   // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", radio);

	    boolean radioBtnIsDisplayed = radio.isDisplayed();
   	 	System.out.println("Is radio button displayed: "+radioBtnIsDisplayed);
   	
   	 	boolean radioBtnIsEnabled = radio.isEnabled();
   	 	System.out.println("Is radio button enabled: "+radioBtnIsEnabled);

   	 	boolean radioBtnIsSelected = radio.isSelected();
   	 	System.out.println("Default Radio button selection Status: "+radioBtnIsSelected);
   	 	Thread.sleep(500);
   	 	
   	 	//Selecting radio button
   	 	radio.click();
   	 	Thread.sleep(2000);
   	 	//re-checking the  radio button selection status and printing it..
   	 	boolean radioBtnNewSelectionStatus = radio.isSelected();
   	 	System.out.println("Radio Selection status after perform click() event: "+radioBtnNewSelectionStatus);
//   	driver.quit();

	}

}
