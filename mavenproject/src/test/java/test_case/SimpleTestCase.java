package test_case;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import controls.CommonMethods;

public class SimpleTestCase {
	WebDriver driver=null;
	@BeforeTest
	public void startup() {
		 driver = CommonMethods.getDriver();
	}
	
	@Test
	public void testClcik() throws InterruptedException {
		
		//selectOptions(driver);
		WebElement ele = CommonMethods.findElementByLocator(driver, "name", "my-file");
		ele.sendKeys("C:\\files\\demo1.txt");
		Thread.sleep(10000);
		
	}
	@AfterTest
	public void quit() {
		driver.quit();
	}
}
