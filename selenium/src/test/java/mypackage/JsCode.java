package mypackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

		public class JsCode {
			WebDriver driver;
			  
			@Test
			  public void testmercury() {
				driver.get("http://www.newtours.demoaut.com/");
				JavascriptExecutor js = (JavascriptExecutor) driver;  
				String title=js.executeScript("return document.title").toString();
				System.out.println(title);
				
				WebElement name= driver.findElement(By.name("userName"));
				WebElement pwd= driver.findElement(By.name("password"));
	
				
				js.executeScript("arguments[0].value='mercury';",name);
				js.executeScript("arguments[0].value='mercury';",pwd);
				
				
				driver.findElement(By.name("login")).click();
							
				 
			} 

			  @BeforeTest
			  public void beforeTest() {
				
				  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
				
				  driver= new ChromeDriver();	 
				  driver.manage().window().maximize();
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				  
		}
		} 
