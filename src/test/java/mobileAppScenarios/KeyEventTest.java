package mobileAppScenarios;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import helper.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class KeyEventTest extends BaseClass
{
  @Test
  public void testTextArea() 
  {
	  //views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //scroll down
	  WebElement ele=driver.findElement(AppiumBy.id("android:id/list"));
	  Utility.scrolDownUpToCount(driver, ele, 3);
	  
	  
	  
	  //text
	  driver.findElement(AppiumBy.accessibilityId("TextFields")).click();
	  
	  
	  //enter data
	  WebElement textArea=driver.findElement(AppiumBy.id("io.appium.android.apis:id/edit"));
	  textArea.sendKeys("Hello All!");
	  
	  
	  //((AndroidDriver)driver).pressKey(new KeyEvent().withKey(AndroidKey.ENTER));
	  driver.findElement(AppiumBy.id("io.appium.android.apis:id/edit1")).click();
	  
	  
	  ((AndroidDriver)driver).pressKey(new KeyEvent().withKey(AndroidKey.T));
	  ((AndroidDriver)driver).pressKey(new KeyEvent().withKey(AndroidKey.E));
	  ((AndroidDriver)driver).pressKey(new KeyEvent().withKey(AndroidKey.S));
	  ((AndroidDriver)driver).pressKey(new KeyEvent().withKey(AndroidKey.T));
	  ((AndroidDriver)driver).pressKey(new KeyEvent().withKey(AndroidKey.I));
	  ((AndroidDriver)driver).pressKey(new KeyEvent().withKey(AndroidKey.N));
	  ((AndroidDriver)driver).pressKey(new KeyEvent().withKey(AndroidKey.G));
	  
  }
  
}
