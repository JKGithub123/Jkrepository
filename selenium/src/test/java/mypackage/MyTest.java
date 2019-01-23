package mypackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTest {
	WebDriver driver;
	
  @Test()
  public void testMethod() throws InterruptedException {
	  //selenium test code
	  //System.out.println("my test method");
	  driver.get("http://www.google.com");
	  driver.findElement(By.linkText("Gmail")).click();
	  
	  
  };
 
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	  driver = new ChromeDriver();
	  //System.out.println("before test");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  }

 

}
