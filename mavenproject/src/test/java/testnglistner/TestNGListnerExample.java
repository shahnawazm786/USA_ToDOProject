package testnglistner;

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
	
	
}
