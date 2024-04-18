package helper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;

public class Utility 
{
	
	public static void scrolDownUpToCount(AppiumDriver driver,WebElement ele,int count)
	{
		for(int i=1;i<=count;i++)
		{
		driver.executeScript("mobile: scrollGesture",ImmutableMap.of(
				  "elementId",((RemoteWebElement)ele).getId(),
				  "direction","down",
				  "percent",0.75
				    
				  ));
		}
	}
	
	
	
	public static void scrollDown(AppiumDriver driver,WebElement ele)
	{
		driver.executeScript("mobile: scrollGesture",ImmutableMap.of(
				  "elementId",((RemoteWebElement)ele).getId(),
				  "direction","down",
				  "percent",0.75
				    
				  ));
	}
	
	
	public static void scrollUp(AppiumDriver driver,WebElement ele)
	{
		driver.executeScript("mobile: scrollGesture",ImmutableMap.of(
				  "elementId",((RemoteWebElement)ele).getId(),
				  "direction","up",
				  "percent",0.75
				    
				  ));
	}
	
	
	public static void scrollLeft(AppiumDriver driver,WebElement ele)
	{
		driver.executeScript("mobile: scrollGesture",ImmutableMap.of(
				  "elementId",((RemoteWebElement)ele).getId(),
				  "direction","left",
				  "percent",0.75
				    
				  ));
	}
	
	
	public static void scrollRight(AppiumDriver driver,WebElement ele)
	{
		driver.executeScript("mobile: scrollGesture",ImmutableMap.of(
				  "elementId",((RemoteWebElement)ele).getId(),
				  "direction","right",
				  "percent",0.75
				    
				  ));
	}
	
	
	public static void swipeLeft(AppiumDriver driver,WebElement ele)
	{
		driver.executeScript("mobile: swipeGesture",ImmutableMap.of(
				  "elementId",((RemoteWebElement)ele).getId(),
				  "direction","left",
				  "percent",0.75
				  ));
	}
	
	
	public static void swipeRight(AppiumDriver driver,WebElement ele)
	{
		driver.executeScript("mobile: swipeGesture",ImmutableMap.of(
				  "elementId",((RemoteWebElement)ele).getId(),
				  "direction","right",
				  "percent",0.75
				  ));
	}
	
	public static void swipeup(AppiumDriver driver,WebElement ele)
	{
		driver.executeScript("mobile: swipeGesture",ImmutableMap.of(
				  "elementId",((RemoteWebElement)ele).getId(),
				  "direction","up",
				  "percent",0.75
				  ));
	}
	
	public static void swipeDown(AppiumDriver driver,WebElement ele)
	{
		driver.executeScript("mobile: swipeGesture",ImmutableMap.of(
				  "elementId",((RemoteWebElement)ele).getId(),
				  "direction","down",
				  "percent",0.75
				  ));
	}

}
