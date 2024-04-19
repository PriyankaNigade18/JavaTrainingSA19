package mobileAppScenarios;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import helper.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class ToggleData_Wifi_AirplaneMode extends BaseClass
{
  @Test
  public void testToggleSetup() throws InterruptedException
  {
	  /*
	   * toggleData()
	   * toggleWifi()
	   * toggleAirplanemode()
	   */
	  
	  
	  System.out.println("Wifi is ON");
	  //on to off
	  ((AndroidDriver)driver).toggleWifi();
	  
	  System.out.println("Wifi is OFF");
	  
	  //off to on
	  ((AndroidDriver)driver).toggleWifi();
	  
	  Thread.sleep(2000);
	  
	  //mobile data
	  
	  System.out.println("MobileData is ON");
	  
	  //element
	 WebElement ele= driver.findElements(AppiumBy.className("android.view.ViewGroup")).get(6);
	  
	  Utility.swipeLeft(driver,ele);
	  
	  Thread.sleep(2000);
	  //on to off
	  ((AndroidDriver)driver).toggleData();
	  
	  System.out.println("MobileData is OFF");
	  
	  //off to on
	  ((AndroidDriver)driver).toggleData();
	  
	  
	  System.out.println("Airplane mode status is OFF");
	  
	  //off to on
	  ((AndroidDriver)driver).toggleAirplaneMode();
	  
	  System.out.println("Airplane mode status is ON");
	  //on to off
	  ((AndroidDriver)driver).toggleAirplaneMode();
	  
	  

	  
	  
	  
	  
	  
	  
  }
}
