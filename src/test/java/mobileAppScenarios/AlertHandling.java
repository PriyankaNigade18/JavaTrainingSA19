package mobileAppScenarios;

import org.openqa.selenium.Alert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import driverSession.DriverSession;
import helper.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class AlertHandling 
{
	public AppiumDriver driver;
	
	@BeforeClass
	public void preSetup()
	{
		//create session
		   driver=DriverSession.initilizeAndroidSession();	  
		  
		   Utility.getScreenshot(driver);
		  //app
		  
		  driver.findElement(AppiumBy.accessibilityId("App")).click();
		  
		  //alerts
		  driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		  
	}
	
	
  @Test(priority=1)
  public void testAlert1() 
  {
	  /*
	   * Alert is interface in Selenium
	   * 
	   * Ok-->accept()
	   * Cancel--->dismiss()
	   * text--->getText()
	   * prompt--->sendKeys()
	   */
	  
//	  //create session
//	  AppiumDriver driver=DriverSession.initilizeAndroidSession();	  
//	  
//	  //app
//	  
//	  driver.findElement(AppiumBy.accessibilityId("App")).click();
//	  
//	  //alerts
//	  driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
//	  
	  //first option
	  driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a message")).click();
	  Utility.getScreenshot(driver);
	  //open Alert window
	  
	  Alert alt1=driver.switchTo().alert();
	  
	  System.out.println("Alert text is: "+alt1.getText());
	  alt1.accept();
	  System.out.println("First Alert handles Properly!");
	  
 }
  
  @Test(priority=2,dependsOnMethods = "testAlert1")
  public void testAlert2()
  {
	  //option 2
	  driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a long message")).click();
	  Utility.getScreenshot(driver);
	  //alert will open
	  Alert alt2= driver.switchTo().alert();
	  System.out.println("Alert 2 text is: "+alt2.getText());

	  alt2.dismiss();
	  
  }
  
  
  
  
  
  
}
