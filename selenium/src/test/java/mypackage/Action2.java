package mypackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Action2 {
	 		WebDriver driver;
		  	@Test
		  public void actionExample() throws InterruptedException {
			driver.get("http:www.facebook.com");
			
			try {
				WebElement txtUsername = driver.findElement(By.id("email"));

				Actions builder = new Actions(driver);
				Action seriesOfActions = builder
					.moveToElement(txtUsername)
					.click()
					
					
					.keyDown(txtUsername, Keys.SHIFT)
					.sendKeys(txtUsername, "jk")
					.keyUp(txtUsername, Keys.SHIFT)
					.doubleClick(txtUsername)
					.contextClick()
					.build();
					
				seriesOfActions.perform() ;
			}
			catch(Exception e){
				e.printStackTrace();
				
			
					
			}
				}
		
		
		  @BeforeTest
	  public void beforeTest() {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		  driver= new ChromeDriver();	 
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
	}
	} 
 
