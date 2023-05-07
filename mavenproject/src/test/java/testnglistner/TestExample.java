package testnglistner;

import static org.testng.Assert.assertFalse;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestExample {
	
	@Test
	public void testPass() {
		System.out.println("Passed--Test");
	}
	@Test
	public void testSkipped() {
		throw new SkipException("Skipped Test");
		
	}
	@Test
	public void testFailed() {
		assertFalse(true);
	}

}
