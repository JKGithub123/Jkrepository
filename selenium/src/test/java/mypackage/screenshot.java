package mypackage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;


public class screenshot {
@Test
  public  void captureScreenShot(){
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://demo.automationtesting.in/Alerts.html");
		File src= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				
		try {
			FileUtils.copyFile(src, new File("C:\\Selenium\\"+timeStamp()+"ss.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}
			public static String timeStamp(){			
				
				return new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date());
		}		
}		
	//CaptureScreen.captureScreenShot(driver);		
			

			
			
			
			
		
		







	
	
	
	
	
 
 
