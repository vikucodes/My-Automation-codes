package Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListeners implements ITestListener{
	
	
	public void onStart(ITestContext context) {
		
		System.out.println("Test execution is started......");
	}
	
	public void onTestStart(ITestResult result) {
	
		System.out.println("Test started.....");
	}
	
	
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("execute on test pass");
	}
	
	public void onTestFailure(ITestResult result) 
	
	{
	System.out.println("on test fail");	
		
	}
	
	public void onTestSkipped(ITestResult result) {
		
	System.out.println("on test skip");	
	}
	
	public void onTestFinish(ITestContext context) {
	System.out.println("test complited");	
		
	}
	}
	


