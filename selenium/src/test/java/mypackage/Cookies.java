package mypackage;

import org.testng.annotations.Test;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Cookies {
	WebDriver driver;
		@Test
public void testmercury() {
			driver.manage().deleteAllCookies();
			driver.get("http://www.yahoo.com");
//			Cookie name= new Cookie("mycookie", "cr7");
//		driver.manage().addCookie(name);
	/*	System.out.println(name.getDomain());
		System.out.println(name.getValue());*/
		
	        Set <Cookie> cookieList= driver.manage().getCookies();
	        for(Cookie  getcookie :cookieList) {
	        	
	        	getcookie.getDomain();
	        	
	        	System.out.println("Name of the cookie :"+getcookie.getName()+
	        			"and its value :"+getcookie.getValue()+
	        			"domain :"+getcookie.getDomain()+
	        			"path : "+getcookie.getPath()+
	        			"exp date "+getcookie.getExpiry()+
	        			"is secure" + getcookie.isSecure()+
	        			"is http"+ getcookie.isHttpOnly()
	 	);
	        	
	        	
	      // driver.manage().deleteAllCookies();
	        	
	        	
	        }
			
			
			
			
}






@BeforeTest
public void beforeTest() {

System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

driver= new ChromeDriver();	 
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}
} 

 


		
		
