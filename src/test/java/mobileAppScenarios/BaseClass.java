package mobileAppScenarios;

import java.time.Duration;

import org.testng.annotations.*;

import driverSession.DriverSession;
import io.appium.java_client.AppiumDriver;

public class BaseClass 
{
	public AppiumDriver driver;
	
	
	@BeforeClass
	public void setUp()
	{
		driver=DriverSession.initilizeAndroidSession();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
