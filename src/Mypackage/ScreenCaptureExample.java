package Mypackage;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenCaptureExample {
	public static void main(String[] args) {
		
        try {
            // Create a Robot instance
            Robot robot = new Robot();
            // Capture the entire screen
            BufferedImage image = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
//            System.out.println("ss captured");
//            ImageIO.write(image, "png", new File("C:\\Screenshots\\CurrentScreenshot.png"));
//            System.out.println("ss saved");
            Date date = new Date();
            String imageName = "SCREENSHOT"+date.getTime()+".jpeg";
            // Specify the location to save the screenshot
            File screenshotFile = new File("C:\\AutomationRobot\\"+imageName);
            // Create the directory if it doesn't exist
            screenshotFile.getParentFile().mkdirs();
            // Write the image to the specified file
            ImageIO.write(image, "jpeg", screenshotFile);
            System.out.println("Screenshot saved at: " + screenshotFile.getAbsolutePath());
            
            
          
        } catch (AWTException | IOException e) {
            e.printStackTrace();
        }
    }

}
