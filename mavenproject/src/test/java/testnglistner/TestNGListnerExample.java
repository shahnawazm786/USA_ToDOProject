package testnglistner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListnerExample implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed");
	System.out.println("Method failed"+ result.getName());

	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
	System.out.println("Method passed"+ result.getName());

	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
	
}
