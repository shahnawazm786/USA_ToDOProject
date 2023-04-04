package controls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileInputExample {

	private static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver=CommonMethods.getDriver();
		//selectOptions(driver);
		WebElement ele = CommonMethods.findElementByLocator(driver, "name", "my-file");
		ele.sendKeys("C:\\files\\demo1.txt");
		Thread.sleep(2000);
		driver.quit();
	}

}
