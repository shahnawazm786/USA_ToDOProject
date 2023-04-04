package controls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RangeExample {

	private static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//my-range
		driver=CommonMethods.getDriver();
		//selectOptions(driver);
		WebElement ele = CommonMethods.findElementByLocator(driver, "name", "my-range");
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		action.dragAndDropBy(ele, -200, 0).build().perform();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
