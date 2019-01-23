package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NewTourRegistration {
	WebDriver driver;
  @Test
  public void testN() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://newtours.demoaut.com/");
	  driver.findElement(By.linkText("REGISTER")).click();
	  driver.findElement(By.name("firstName")).sendKeys("JK");
	  driver.findElement(By.name("lastName")).sendKeys("JK");
	  driver.findElement(By.name("phone")).sendKeys("123456789");
	  driver.findElement(By.id("userName")).sendKeys("abc@gmail.com");
	  driver.findElement(By.name("address1")).sendKeys("abcd");
	  driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("address2");
	  driver.findElement(By.cssSelector("input[name='city']")).sendKeys("amz");
	  driver.findElement(By.name("state")).sendKeys("TN");
	  driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("123456789");
	  Select s = new Select(driver.findElement(By.name("country")));
	  s.selectByVisibleText("INDIA");
	  
	  driver.findElement(By.name("email")).sendKeys("1234");
	  driver.findElement(By.name("password")).sendKeys("1234");
	  driver.findElement(By.name("confirmPassword")).sendKeys("1234");
	  driver.findElement(By.xpath("//input[@name='register']")).click();
	  
	  
  }
}
