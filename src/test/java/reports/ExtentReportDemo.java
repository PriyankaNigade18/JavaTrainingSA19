package reports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportDemo {
  @Test
  public void testReport()
  {
	  //create ExtentReport instance
	  ExtentReports extent=new ExtentReports();
	  
	  //path
	  ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReports/AutomationReport.html");
	  
	  //configuration
	  spark.config().setDocumentTitle("Sprint1 Automation Report");
	  spark.config().setReportName("AppiumTestReport");
	  spark.config().setTheme(Theme.DARK);
	  
	  //attache report
	  extent.attachReporter(spark);
	  
	  //create test
	  ExtentTest test=extent.createTest("AppiumTestautomationReport");	 
	  
	  test.log(Status.PASS,"Test case is pass!");
	  
	  test.log(Status.FAIL,"Test case is Fail!");
	  
	  test.log(Status.INFO,"Test case info!");
	    
	  test.log(Status.SKIP,"Test case is skip!");
	  
	  
	  //flush()
	  extent.flush();
  }
}
