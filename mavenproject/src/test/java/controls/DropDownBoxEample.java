package controls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownBoxEample {

	private static WebDriver driver;

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		driver=CommonMethods.getDriver();
		//selectDropDownBoxByValue(driver);
		Thread.sleep(2000);
		selectDropDownBoxByVisibleText(driver);
		driver.quit();
	}
	public static void selectDropDownBoxByValue(WebDriver driver) throws Exception {
		WebElement ele=CommonMethods.findElementByLocator(driver, "name", "my-select");
		Select sel=new Select(ele);
		sel.selectByValue("1");
		Thread.sleep(5000);
		sel.selectByValue("2");
		Thread.sleep(5000);
		sel.selectByValue("3");
		Thread.sleep(5000);
	}
	public static void selectDropDownBoxByVisibleText(WebDriver driver) throws Exception {
		WebElement ele=CommonMethods.findElementByLocator(driver, "name", "my-select");
		Select sel=new Select(ele);
		sel.selectByVisibleText("One");
		Thread.sleep(5000);
		sel.selectByVisibleText("Two");
		Thread.sleep(5000);
		sel.selectByVisibleText("Three");
		Thread.sleep(5000);
	}
	
}
