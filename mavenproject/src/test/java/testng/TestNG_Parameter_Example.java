package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Parameter_Example {
	
	@Test
	@Parameters("browser")
	public void getData(String browser) {
		System.out.println("Running test case -> \t"+browser);
	}

}
