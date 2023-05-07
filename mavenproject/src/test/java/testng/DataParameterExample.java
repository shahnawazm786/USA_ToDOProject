package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataParameterExample {

	@Test
	@Parameters("data")
	public void getData(String data) {
		System.out.println(data);
	}
}
