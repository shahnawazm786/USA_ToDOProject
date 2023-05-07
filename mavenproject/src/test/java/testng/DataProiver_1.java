package testng;
import org.testng.annotations.*;
public class DataProiver_1 {
	
	@Test(dataProvider = "data-provider",dataProviderClass = DataProviderExample.class)
	public void showValue(String val) {
		System.out.println(val);
	}
	
	@Test(dataProvider = "multi-data-provider",dataProviderClass = DataProviderExample.class)
	public void multipParaShowValue(int x,int y,int z) {
		System.out.println("Sum is \t"+(x+y+z));
	}

}
