package controls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButtonExample {

	private static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//
		driver=CommonMethods.getDriver();
		//selectOptions(driver);
		WebElement ele = CommonMethods.findElementByLocator(driver, "id", "my-radio-1");
		Thread.sleep(2000);
		if(ele.isSelected()) {
			System.out.println("It is selected");
		}
		else
		{
			ele.click();
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
