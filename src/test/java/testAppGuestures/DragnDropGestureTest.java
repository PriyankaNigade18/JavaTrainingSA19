package testAppGuestures;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import driverSession.DriverSession;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class DragnDropGestureTest {
  @Test
  public void testDragnDrop() 
  {
	  
	  
	  AppiumDriver driver=DriverSession.initilizeAndroidSession();
	  
	  //views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //drag n drop
	  driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
	  
	  //ele-circle3
	  WebElement ele=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_3"));
	  
	  //gesture
	  driver.executeScript("mobile: dragGesture",ImmutableMap.of(
			  "elementId",((RemoteWebElement)ele).getId(),
			  "endX",693,
			  "endY",1110
			  ));
	  
	  
	  //text message
	  String text=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_result_text")).getText();
	  System.out.println("After Gesture Result text is: "+text);
	  
	  
	  
	  
	  
  }
}
