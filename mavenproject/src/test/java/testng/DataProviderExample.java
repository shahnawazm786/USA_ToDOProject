package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class DataProviderExample {

	@DataProvider(name="data-provider")
	public Object[][] dataProviderMethod(){
		return new Object[][] {{"First Value"},{"Second Value"},{"Third value"}};
	}
	
	@Test(dataProvider = "data-provider")
	public void displayData(String val) {
		System.out.println(val);
	}
	
}
