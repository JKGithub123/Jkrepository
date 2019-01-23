package mypackage;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Scroll {
  @Test
 
public void test() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
				driver.get("http://www.google.com");
				driver.findElement(By.name("q")).sendKeys("selenium");
				driver.findElement(By.name("btnK")).click();	
				
				
				JavascriptExecutor js= (JavascriptExecutor) driver;
		
				js.executeScript("window.scrollBy(0,1000)");
		
				
  }			
				
				
}  
 
