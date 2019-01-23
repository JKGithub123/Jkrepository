package mypackage;



import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class Checkbox {
	 WebDriver driver;
	  	public void testUpload() throws InterruptedException {
	  	driver.get("https://smartwebby.com/PHP/Phptips2.asp");	
	  		  	
	  	List<WebElement> elements=driver.findElements(By.name("chkexpert[]2"));
	  	
	  	
	  	
	  	
	  	for ( WebElement el : elements ) {
	  		if ( !el.isSelected() ) {
	  	        el.click();
	  	    }
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
 


