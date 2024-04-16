package testAppGuestures;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import driverSession.DriverSession;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class LongclickGestureTest {
  @Test
  public void testLongClick()
  {
	  //Drag and Drop
	  
	  AppiumDriver driver=DriverSession.initilizeAndroidSession();
	  
	  //views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //drag n drop
	  driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
	  
	  
	  //ele-circle1
	  WebElement ele=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
	  
	  //gesture
	  driver.executeScript("mobile: longClickGesture",ImmutableMap.of(
			  "elementId",((RemoteWebElement)ele).getId(),
			  "duration",3000
			  
			  ));
	  
	  System.out.println("Long click Gesture is Completed!");
	  
	  
	  
	  
	  
	  
	  
  }
}
