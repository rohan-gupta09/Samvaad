package RoughPage;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RoughClass {

	public static  void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");  

	     WebDriver driver=new ChromeDriver();  
	        
	     driver.navigate().to("https://www.google.com/");  
	     
	     Thread.sleep(5000);
	    
	     driver.findElement(By.xpath("//input[@name = 'q']")).sendKeys("rohan");
	     Thread.sleep(5000);
	      driver.findElement(By.xpath("(//input[@name='btnK'])[1]")).click();
	      driver.close();
	      System.out.println("First - Commit");
		
		
		
	}

}
