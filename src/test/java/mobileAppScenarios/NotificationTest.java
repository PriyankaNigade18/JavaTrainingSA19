package mobileAppScenarios;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class NotificationTest extends BaseClass 
{
  @Test
  public void testNotification()
  {
	  //To open notifications in the device
	  ((AndroidDriver)driver).openNotifications();
	  
	  
	  System.out.println("*********Notifications Title**********");
	  //Notification title
	 List<WebElement> titleList= driver.findElements(AppiumBy.id("android:id/title"));
	 for(WebElement i:titleList)
	 {
		 System.out.println(i.getText());
	 }
	 
	  System.out.println("*********Notifications Text**********");
	  List<WebElement> textList=driver.findElements(AppiumBy.id("android:id/text"));
	  	
	  for(WebElement i:textList)
	  {
		  System.out.println(i.getText());
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	 
	 
  }
}
