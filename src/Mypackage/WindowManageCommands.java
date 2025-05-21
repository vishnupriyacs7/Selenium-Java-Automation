package Mypackage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowManageCommands {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		//open full window
		driver.manage().window().maximize();
		
		//get size of the window
		Dimension dimension = driver.manage().window().getSize();
		System.out.println("window size " + dimension);
		System.out.println("Height : " +dimension.height);
		System.out.println("width : " +dimension.width);
		
		//get position
		Point point= driver.manage().window().getPosition();
		System.out.println("position " +point);
		System.out.println("X : " +point.x);
		System.out.println("Y : " + point.y);
		
		//set size
		Dimension newDimension = new Dimension(800, 600);
		driver.manage().window().setSize(newDimension);
		
		//set position
		Point newPoint = new Point(300, 500);
		driver.manage().window().setPosition(newPoint);
		
		Thread.sleep(3000);

		driver.quit();

	}

}
