package Mypackage;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotRectagleSizeAdjust {
	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://scopeindia.org/");
		driver.manage().window().maximize();
		
//		Rectangle captureRect = new Rectangle(50, 50, 800, 600);
//		Thread.sleep(5000);
//        // Capture the screen area defined by the rectangle
//        BufferedImage image = new Robot().createScreenCapture(captureRect);
//        File path = new File("C:\\Screenshot\\PartialScreenshot.png");
//        path.getParentFile().mkdirs();
//        // Save the screenshot to a specific location
//        ImageIO.write(image, "png", path);
//
//        System.out.println("Screenshot saved successfully!");
//		
		// Wait for the page to load
        Thread.sleep(5000);

        // Take a screenshot of the entire page
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Read the screenshot as a BufferedImage
        BufferedImage fullImg = ImageIO.read(screenshot);

        // Crop the screenshot to a rectangle (x, y, width, height)
        BufferedImage croppedImg = fullImg.getSubimage(100, 100, 500, 300);

        // Save the cropped screenshot
        File path = new File("C:\\Screenshot\\PartialScreenshot.png");
        ImageIO.write(croppedImg, "png", path);

        System.out.println("Cropped screenshot saved successfully!");

        // Close the browser
        driver.quit();

	}
}
