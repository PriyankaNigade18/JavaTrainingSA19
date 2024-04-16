package driverSession;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class FirstAppiumSession {
  @Test
  public void testDriverSession() throws MalformedURLException
  {
	  //Key value pair to pass to the appium server
	  DesiredCapabilities cap=new DesiredCapabilities();
	  cap.setCapability("platformName","android");
	  cap.setCapability("appium:automationName","uiautomator2");
	  cap.setCapability("appium:deviceName","pixel_6");
	  cap.setCapability("appium:udid","emulator-5554");
	  
	  String apppath=System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";
	  
	  cap.setCapability("appium:app",apppath);
	  
	  //server url to initiate session
	  URL url=new URL("http://0.0.0.0:4723");
	  
	  //AppiumDriver session
	  AppiumDriver driver=new AndroidDriver(url,cap);
	  System.out.println("Session Id: "+driver.getSessionId());
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
