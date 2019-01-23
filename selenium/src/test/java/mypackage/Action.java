package mypackage;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Action {
	 		WebDriver driver;
		  	@Test
		  public void actionExample() throws InterruptedException {
			driver.get("http://automationpractice.com/index.php");
			
			try {
			WebElement menu= driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
		
			Actions action=new Actions(driver);
			action.moveToElement(menu).build().perform();
			//action.moveToElement(menu).click().keyDown(menu,Keys.SHIFT);
			
			//driver.findElement(By.linkText("TOPS")).click();
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
 
