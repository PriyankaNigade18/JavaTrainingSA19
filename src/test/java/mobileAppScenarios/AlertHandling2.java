package mobileAppScenarios;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class AlertHandling2 extends BaseClass
{
  @Test
  public void testEntryDialog() throws InterruptedException 
  {
	//app
  driver.findElement(AppiumBy.accessibilityId("App")).click();
  	  //alerts
 driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
 
 	//entry
 	driver.findElement(AppiumBy.accessibilityId("Text Entry dialog")).click();
 	
 	//alert
 	Alert entryAlert=driver.switchTo().alert();
 	
 	driver.findElement(AppiumBy.id("io.appium.android.apis:id/username_edit")).sendKeys("Admin");
 	
 	//entryAlert.sendKeys("Admin");
 	
 	Thread.sleep(2000);
 	
 	entryAlert.accept();
 	
 	
 	
  
  
  }
}
