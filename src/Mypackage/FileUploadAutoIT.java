package Mypackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FileUploadAutoIT {
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new EdgeDriver();                                                                                            	
   	    driver.get("http:\\demo.guru99.com/test/upload"); 
   	    driver.manage().window().maximize();
   	    Thread.sleep(1000);
   	    
        WebElement uploadElement=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/form/div[2]/div[1]/div/div"));
      
        uploadElement.click();
        Thread.sleep(1000);
   	
   		// below line execute the AutoIT script .
   	   // Runtime.getRuntime().exec("C:/Users/HP/OneDrive/Desktop/uploadfile.exe");      
        
        ProcessBuilder processBuilder = new ProcessBuilder("C:/Users/HP/Desktop/upload.exe");
        processBuilder.start();  
        Thread.sleep(3000);
        
        driver.findElement(By.id("terms")).click();
        
    	// click the "UploadFile" button
    	driver.findElement(By.name("send")).click();
    	

	}
}
