package testAppGuestures;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import driverSession.DriverSession;
import helper.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class SwipeGesture {
  @Test
  public void testSwipeGesture() throws InterruptedException 
  {
	  //create driver session
	  AppiumDriver driver=DriverSession.initilizeAndroidSession();
	  //implicitly Wait
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  //views
	  
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //Gallery
	  driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
	  
	  //photos
	  driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
	  
	  //swipe element
	  WebElement ele=driver.findElement(AppiumBy.id("io.appium.android.apis:id/gallery"));
	  
	  
	  //gesture
//	  driver.executeScript("mobile: swipeGesture",ImmutableMap.of(
//			  "elementId",((RemoteWebElement)ele).getId(),
//			  "direction","left",
//			  "percent",0.75
//			  ));
	  
	  Utility.swipeLeft(driver, ele);
	  
	  System.out.println("Swipe left is completed!");
	  
	  Thread.sleep(2000);
	  Utility.swipeRight(driver, ele);
	  
	  System.out.println("Swipe right is completed!");
	  
	  
	  
	  
	  
	  
	  
  
  
  
  }
}
