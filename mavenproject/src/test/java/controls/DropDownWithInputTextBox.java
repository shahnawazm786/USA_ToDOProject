package controls;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DropDownWithInputTextBox {

	private static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver=CommonMethods.getDriver();
		//selectOptions(driver);
		selectOptionsByControl(driver);
		Thread.sleep(2000);
		driver.quit();
	}
	public static void selectOptions(WebDriver driver) {
		WebElement ele = CommonMethods.findElementByLocator(driver, "name", "my-datalist");
		ele.click();
		ele.sendKeys("San Francisco");
		
	}
	public static void selectOptionsByControl(WebDriver driver) {
		WebElement ele = CommonMethods.findElementByLocator(driver, "name", "my-datalist");
		ele.click();
		Actions action=new Actions(driver);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		
		
		
	}
}
