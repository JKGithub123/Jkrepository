package mypackage;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class dataprovider {
  @Test(dataProvider = "mydata")
  
  
  
  public void f(String a, String b) {
	  
	  System.out.println("username is  " +a);
	  System.out.println("password is  " +b);
	  
  }
    

  @DataProvider
  public Object[][] mydata() {
    return new Object[][] {
      new Object[] { "SAM", "abcd@123" },
      new Object[] { "Ram", "abcd@432" },
    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

} 
 
