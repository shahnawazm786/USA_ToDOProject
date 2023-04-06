package controls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = CommonMethods.getDriver();
		WebElement ele = CommonMethods.findElementByLocator(driver, "tagname", "button");
		ele.click();

	}

}
