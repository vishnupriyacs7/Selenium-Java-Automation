package Mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementCommands {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
	     driver.navigate().to("https://www.facebook.com/");
	     Thread.sleep(3000);
	     
	     //maximize window size
	     driver.manage().window().maximize();
	     Thread.sleep(3000);
	     
	        //by name
       WebElement elements = driver.findElement(By.name("email"));
       elements.sendKeys("vishnupriyacs@gmail.com");
       Thread.sleep(3000);
       elements.clear();
       
       WebElement textcontent = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[1]/h2"));
       System.out.println(textcontent.getText());
       System.out.println(elements.isDisplayed());
       System.out.println(elements.isEnabled());
       System.out.println(elements.isSelected());
	     
	     //tagname command
	     WebElement element = driver.findElement(By.id("email"));
	     String tagName = element.getTagName();
	     System.out.println(tagName);
	     
	     String attr = element.getAttribute("placeholder");
	     System.out.println("attribute of the element " + attr);
	     
	     //get css value
	     WebElement ele = driver.findElement(By.linkText("Forgotten password?"));
	     System.out.println(ele.getText());
	     System.out.println(ele.getCssValue("color"));
	     
	     //get css value
	     WebElement property = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button"));
	     String fontSize = property.getCssValue("font-size");
	     System.out.println("css property : "+fontSize);

	     //get height and width of an element
	     Dimension size = ele.getSize();
	     System.out.println("Width : " + size.width);
	     System.out.println("Height : " + size.height);
	     
	     
	     //find x and y points of the element
	     Point p = property.getLocation();
	     System.out.println("xOffset : " + p.x);
	     System.out.println("yOffset : " + p.y);

	     property.submit();

	}

}
