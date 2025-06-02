package Mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

        driver.get("https://jqueryui.com/droppable/");
        
        //driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        driver.switchTo().frame(0);
        
        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));

        // Perform drag and drop
        Actions actions = new Actions(driver);
        Thread.sleep(3000);
       // actions.dragAndDrop(draggable, droppable).perform();
       
        actions.dragAndDropBy(draggable, 80, 40).perform();

        // Verify the drop
        String droppedText = droppable.getText();
        System.out.println("Droppable text after drop: " + droppedText);

        // Close the browser
//        driver.quit();

	}
}

// Switch to the iframe containing the draggable and droppable elements
//driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
