package controls;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ReadOnlyTextBoxExample {

	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		driver=CommonMethods.getDriver();
		readOnlyInputEnterText(driver);
		readOnlyInputClickEvent(driver);
		readOnlyInputGetText(driver);
		Thread.sleep(5000);
		driver.quit();
	}
	public static void readOnlyInputEnterText(WebDriver driver) {
		WebElement ele = CommonMethods.findElementByLocator(driver, "name", "my-readonly");
		ele.sendKeys("Hello");
		
	}
	public static void readOnlyInputClickEvent(WebDriver driver) {
		WebElement ele = CommonMethods.findElementByLocator(driver, "name", "my-readonly");
		ele.click();
	}
	public static void readOnlyInputGetText(WebDriver driver) {
		WebElement ele = CommonMethods.findElementByLocator(driver, "name", "my-readonly");
		String str=ele.getText();
		System.out.println(str);
		str=ele.getAttribute("value");
		System.out.println(str +" value of value attribute");
	}

}
