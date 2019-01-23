package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.Alert;

public class alert {
	WebDriver driver;
	  @Test
	  public void testN() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://demo.automationtesting.in/Alerts.html");
		  driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
  }
}
