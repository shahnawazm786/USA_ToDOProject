package testng;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Thread_Count_Example {
	
	@Test(invocationCount = 5,alwaysRun = true)
	public void Login_Test() {
		System.out.println("Login Test");
	}
	@Test(alwaysRun = false,skipFailedInvocations = false)
	public void Login_Test_Not_run() {
		System.out.println("Login Test");
		throw new SkipException("Skip");
		
	}

}
// 100 test case 
// 90 pass
// 10 fails