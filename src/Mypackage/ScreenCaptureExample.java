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

public class ScreenCaptureExample {
	public static void main(String[] args) {
        try {
            // Create a Robot instance
            Robot robot = new Robot();
            // Capture the entire screen
            BufferedImage image = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
            Date date = new Date();
            String imageName = "SCREENSHOT"+date.getTime()+".jpeg";
            // Specify the location to save the screenshot
            File screenshotFile = new File("C:\\Screenshots\\"+imageName);
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
