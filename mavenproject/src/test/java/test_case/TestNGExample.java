package test_case;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExample {
@BeforeSuite
public void beforeSuite() {
	System.out.println("Before Suite");
}

@BeforeClass
public void beforeClass() {
	System.out.println("Before Class");
}
	
@BeforeMethod
public void beforeMethod() {
	System.out.println("Before Method");
}
/*
@BeforeTest
public void beforeTest() {
	System.out.println("Before Method");
}
*/
	
	@Test(invocationCount = 3)
	public void Method1() {
		System.out.println("TestNG print - Test1");
	}

	@Test
	public void Method2() {
		System.out.println("TestNG print - Test1");
	}
	
	@Test
	public void Dashboard() {
		System.out.println("TestNG print - Test1");
	}
	
	
@AfterMethod
public void afterMethod() {
	System.out.println("After Method");
}

@AfterClass
public void afterClass() {
	System.out.println("After class");
}
@AfterSuite
public void afterSuite() {
	System.out.println("After Suite");
}
}
