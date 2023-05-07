package testng;
import org.testng.annotations.*;
public class DataProiver_1 {
	
	@Test(dataProvider = "data-provider",dataProviderClass = DataProviderExample.class)
	public void showValue(String val) {
		System.out.println(val);
	}

}
