package testAppGuestures;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import driverSession.DriverSession;
import helper.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class ScrollGesture {
  @Test
  public void testScrollGesture() throws InterruptedException 
  {
	  AppiumDriver driver=DriverSession.initilizeAndroidSession();
	  
	  //views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //element to scroll
	  
	  WebElement ele=driver.findElement(AppiumBy.id("android:id/list"));
	  
	  //scrollDown
	  Utility.scrollDown(driver, ele);
	  
	  
	  /*
	  //gesture
	  driver.executeScript("mobile: scrollGesture",ImmutableMap.of(
			  "elementId",((RemoteWebElement)ele).getId(),
			  "direction","down",
			  "percent",0.75
			    
			  ));
	  
	  */
	  System.out.println("Page is Scrolling down!");
	  
	  
	  Thread.sleep(3000);
	  
	  
	  Utility.scrollUp(driver, ele);
	  System.out.println("Scroll up function is completed!");
	  
	  
	  
	  
	  
	  
  }
}
