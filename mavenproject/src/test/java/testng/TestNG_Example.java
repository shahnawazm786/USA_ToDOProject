package testng;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG_Example {

	@Test
	public void my_login() {
		System.out.println("Login");
	}
	
	@Test
	public void my_log() {
		System.out.println("Login");
	}
	
	
	@Test(priority = 0)
	public void test() {
		System.out.println("Hello Program");
	}
	
	@Test(priority = 1)
	public void test1() {
		System.out.println("Failed");
		Assert.assertFalse(true);
	}
	
	
	@Test(priority = 2)
	public void test3() {
		throw new SkipException("Skip");
	}
	
}
