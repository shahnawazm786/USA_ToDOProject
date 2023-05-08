package testng;

import org.testng.annotations.Test;

public class AccessTestDataFromDifferentClass {

	@Test(dataProvider = "user-age",dataProviderClass = DataProviderExample_01.class)
	public void testAge(int age) {
		System.out.println("Age of user is \t"+age);
	}
	
}
