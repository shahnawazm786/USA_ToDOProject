package controls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ColorPickerExample {

	private static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//my-colors
		
		driver=CommonMethods.getDriver();
		//selectOptions(driver);
		WebElement ele = CommonMethods.findElementByLocator(driver, "name", "my-colors");
		Thread.sleep(2000);
		ele.sendKeys("Black");
		Thread.sleep(2000);
		driver.quit();
	}

}
