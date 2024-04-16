package testAppGuestures;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import driverSession.DriverSession;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class LocatorsInAppium {
  @Test
  public void testLocators()
  {
	  //create driver session
	  AppiumDriver driver=DriverSession.initilizeAndroidSession();
	  
	  //AccessibilityId
	  WebElement ele1=driver.findElement(AppiumBy.accessibilityId("Access'ibility"));
	  System.out.println("Text of Element1: "+ele1.getText());
	  ele1.click();
	  
	  //back()
	  driver.navigate().back();
	  
	  //xpath
	  WebElement ele2=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Animation\"]"));
	  System.out.println("Text of Element2 is: "+ele2.getText());
	  ele2.click();
	  
	  //back()
	  driver.navigate().back();
	  
	  //className
	 WebElement ele3= driver.findElements(AppiumBy.className("android.widget.TextView")).get(4);
	 System.out.println("Text of Element3 is: "+ele3.getText());
	 ele3.click();
	 
	 //back()
	  driver.navigate().back();
	 
	  //resource-id (id locator)
	  WebElement ele4=driver.findElements(AppiumBy.id("android:id/text1")).get(10);
	  System.out.println("Text of Element4 is: "+ele4.getText());
	  ele4.click();
	  
	  //back()
	  driver.navigate().back();
	  
	  //text UiSelector()
	  WebElement ele5=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Views\")"));
	  System.out.println("Text of Element5 is: "+ele5.getText());
	  ele5.click();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
