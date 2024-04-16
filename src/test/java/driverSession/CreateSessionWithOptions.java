package driverSession;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class CreateSessionWithOptions {
  @Test
  public void testDriverSession() throws MalformedURLException
  {
	  
	  UiAutomator2Options options=new UiAutomator2Options();
	  options.setPlatformName("android");
	  
	  String apppath=System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";
	  options.setCapability("app", apppath);
	  
	  
	  //server address
	  URL url=new URL("http://0.0.0.0:4723");
	  
	  //create driver session
	  AppiumDriver driver=new AndroidDriver(url,options);
	  System.out.println("Session id is: "+driver.getSessionId());
	  
	  
	  
	  
	  
  }
}
