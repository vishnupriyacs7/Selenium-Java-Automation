package Mypackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotScroll {

	public static void main(String[] args) throws InterruptedException, AWTException {
		 WebDriver driver = new EdgeDriver();
         driver.get("https://jqueryui.com/droppable/");             
         Thread.sleep(2000);

         Robot robot = new Robot();
         Thread.sleep(2000);
         robot.keyPress(KeyEvent.VK_PAGE_DOWN);
         robot.keyPress(KeyEvent.VK_PAGE_DOWN);
         robot.keyRelease(KeyEvent.VK_PAGE_DOWN);


         Thread.sleep(2000);
         robot.keyPress(KeyEvent.VK_PAGE_UP);
         robot.keyPress(KeyEvent.VK_PAGE_UP);
         robot.keyRelease(KeyEvent.VK_PAGE_UP);
         
         Thread.sleep(2000);
         
         Actions act = new Actions(driver);
         act.moveToElement(driver.findElement(By.linkText("Draggable"))).perform();
         
         robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
         
         Thread.sleep(2000);
         driver.quit();
         
         

	}

}
