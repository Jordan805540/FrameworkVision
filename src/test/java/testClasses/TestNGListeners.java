package testClasses;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.Screenshots;



public class TestNGListeners extends BaseTest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case :"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	System.out.println("Test case passed :"+result.getName());
	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed :"+result.getName());
		
		
		
		try {
			Screenshots.captureScreenshot(driver, result.getName());
		} catch (IOException e) {
			
			
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case skipped :"+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Execution started :"+context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Execution finished :"+context.getName());
	}
	
	

}
