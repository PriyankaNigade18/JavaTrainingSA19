package testAppGuestures;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import driverSession.DriverSession;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class ClickGestureTest {
  @Test
  public void testClick()
  {
	  AppiumDriver driver=DriverSession.initilizeAndroidSession();
	  
	  
	  //views
	  //driver.findElement(AppiumBy.accessibilityId("Views")).click();
  
	  WebElement ele=driver.findElement(AppiumBy.accessibilityId("Views"));
	  
	  driver.executeScript("mobile: clickGesture",ImmutableMap.of(
			  "elementId",((RemoteWebElement)ele).getId()
			  ));
	  
	  System.out.println("Element Clicked with Gesture!");
	  
	  
	  
	  
  
  
  
  
  }
}
