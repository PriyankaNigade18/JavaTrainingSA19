package mobileAppScenarios;

import org.openqa.selenium.ScreenOrientation;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Lock_Unlock_Rotate extends BaseClass
{
  @Test
  public void testLock_Unlock_Rotate()
  {
	  /*
	 ((AndroidDriver)driver).lockDevice();
	 System.out.println("Device is Locked!");
	 
	 ((AndroidDriver)driver).unlockDevice();
	 System.out.println("Device is UnLocked!");
	 */
	  
	  //rotate
	  ((AndroidDriver)driver).rotate(ScreenOrientation.LANDSCAPE);
	  
	  System.out.println("Device Rotating to Landscape!");

	 
	 
  }
  
}
