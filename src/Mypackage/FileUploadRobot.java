package Mypackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadRobot {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		 
    	WebElement uploadElement = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/form/div[2]/div[1]/div/div"));
    	uploadElement.click();
 
    	Robot robot = new Robot();

        String filePath = "C:\\Users\\HP\\Desktop\\upload.exe";
        
        robot.delay(1000); 
//        for (char c : filePath.toCharArray()) {
//            robot.keyPress(KeyEvent.getExtendedKeyCodeForChar(c));
//            robot.keyRelease(KeyEvent.getExtendedKeyCodeForChar(c));
//        }
        
     // Set the file path to clipboard
        StringSelection selection = new StringSelection(filePath);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection,null);

        //  Ctrl+V (paste) 
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        //  Enter 
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
        Thread.sleep(2000);
        
        driver.findElement(By.id("terms")).click();

        driver.findElement(By.name("send")).click();

	}
}
