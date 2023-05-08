package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample_01 {

	@DataProvider(name="user-age")
	public Object[][] dataMethod(){
		return new Object[][] {{20},{30},{40},{50}};
	}
	
	@Test(dataProvider = "user-age")
	public void getData(int age) {
		System.out.println("User age is ->"+age);
	}
	@DataProvider(name="mult-data")
	public Object[][] dataMultiDimensionData() {
		return new Object[][] {
			{"Yahoo",500},
			{"Google",800},
			{"Facebook",750},
			{"Linkedin",550}
			};
	}
	@Test(dataProvider = "mult-data")
	public void multDataTest(String name,int value) {
		System.out.println("Name\t"+name+"\t value=\t"+value);
	}
	
	
}
