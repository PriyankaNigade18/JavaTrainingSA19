package driverSession;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class DriverSession 
{
	public static AppiumDriver driver;

	public static AppiumDriver initilizeAndroidSession()
	{
		UiAutomator2Options options=new UiAutomator2Options();
		  options.setPlatformName("android");
		  
		  String apppath=System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";
		  options.setCapability("app", apppath);
		  
		  URL url;
		  try {
		  //server address
		  url=new URL("http://0.0.0.0:4723");
		  
		  //create driver session
		  driver=new AndroidDriver(url,options);
		  System.out.println("Session id is: "+driver.getSessionId());
		  }catch(MalformedURLException e)
		  {
			  System.out.println("Check the server address!");
		  }
		  
		  return driver;
	}
}
