package reports;

import org.testng.IReporter;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener
{
	
	public void onTestSuccess(ITestResult res)
	{
		System.out.println("Test is pass "+res.getName());
		
	}
	
	public void onTestFailure(ITestResult res)
	{
		System.out.println("Test is Fail "+res.getName());
		
	}

}
