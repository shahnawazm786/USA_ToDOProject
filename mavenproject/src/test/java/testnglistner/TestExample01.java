package testnglistner;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class TestExample01 {
	
	@Test
	public void test001() {
		assertFalse(true);
	}
	
	@Test
	public void test002() {
		assertTrue(true);
	}

}
