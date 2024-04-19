package reports;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ListnersTest {
  @Test
  public void testCase1()
  {
	  String act="Selenium WebDriver is an API";
	  String exp="Selenium WebDriver is an API";
	  
	  Assert.assertEquals(act,exp,"Strings are not Equal!");
	  System.out.println("Strings are Equal!");
  }
  
  
  @Test
  public void testCase2()
  {
	  String act="Selenium WebDriver is an API";
	  String exp="Selenium WebDriver is an interface for WebUI test";
  
	  Assert.assertEquals(act,exp,"Strings are not Equal!");
	  System.out.println("Strings are Equal!");
	  
  }
}
