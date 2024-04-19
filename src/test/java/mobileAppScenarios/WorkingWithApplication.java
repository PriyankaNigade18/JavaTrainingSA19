package mobileAppScenarios;

import java.time.Duration;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class WorkingWithApplication extends BaseClass
{
  @Test
  public void testCommandsForApp() throws InterruptedException
  {
	  System.out.println("Current status of application is: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));
	  
	  Thread.sleep(2000);
	  
	  //terminate app
	  ((AndroidDriver)driver).terminateApp("io.appium.android.apis");
	  
	  System.out.println("After terminate App Current status of application is: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));

	  //activateApp
	  ((AndroidDriver)driver).activateApp("io.appium.android.apis");
	  System.out.println("After Activate App Current status of application is: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));
	  
	  //uninstall app
	  
	  ((AndroidDriver)driver).removeApp("io.appium.android.apis");
	  
	  System.out.println("After Uninstalled App Current status of application is: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));

	  
	  
	  //install 
	  
	  String appPath=System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";
	  
	  ((AndroidDriver)driver).installApp(appPath);
	  
	  System.out.println("After installed App Current status of application is: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));

	//activateApp
	  ((AndroidDriver)driver).activateApp("io.appium.android.apis");
	  System.out.println("After Activate App Current status of application is: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));
	  
	  
	  
	  //background
	  ((AndroidDriver)driver).runAppInBackground(Duration.ofMillis(5000));
	  
	  

	  
	  
	  
  }
}
