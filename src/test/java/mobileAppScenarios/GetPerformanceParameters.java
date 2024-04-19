package mobileAppScenarios;

import java.util.List;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class GetPerformanceParameters extends BaseClass
{
  @Test
  public void testPerformance()
  {
	  /*
	   * Returns the information of the system state which is supported to
	   * read as like cpu, memory, network traffic, and battery
	   */
  
	  System.out.println("******System Perfomance parameters********");
	  
	  List<String> list=((AndroidDriver)driver).getSupportedPerformanceDataTypes();
	  System.out.println(list);
	  //[cpuinfo, memoryinfo, batteryinfo, networkinfo]
	  
	  System.out.println("*****Performance for Batteryinfo*****");
	 List<List<Object>> batteryData=((AndroidDriver)driver).getPerformanceData("io.appium.android.apis","batteryinfo",5);
	  System.out.println(batteryData);
	  
//	  System.out.println("*****Performance for Cpuinfo*****");
//		 List<List<Object>> cpuData=((AndroidDriver)driver).getPerformanceData("io.appium.android.apis","cpuinfo",5);
//		  System.out.println(cpuData);
//		  
		  System.out.println("*****Performance for Memoryinfo*****");
			 List<List<Object>> memoryData=((AndroidDriver)driver).getPerformanceData("io.appium.android.apis","memoryinfo",5);
			  System.out.println(memoryData);
			  
			  System.out.println("*****Performance forNetworkinfo*****");
				 List<List<Object>> networkData=((AndroidDriver)driver).getPerformanceData("io.appium.android.apis","networkinfo",5);
				  System.out.println(networkData);
	  
	  
	  
	  
	  
	  
  
  }
}
