package RoughPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\New folder\\DDF-WorkPulse\\src\\test\\resources\\Drivers\\chromedriver.exe");  

	     WebDriver driver=new ChromeDriver();  
	        
	     driver.navigate().to("https://demo.guru99.com/v4");  

	}

}
