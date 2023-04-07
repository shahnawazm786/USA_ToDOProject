package selenium_method;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;

import controls.CommonMethods;

public class MethodsExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = CommonMethods.getDriver();
		WebElement ele = CommonMethods.findElementByLocator(driver, "id", "my-text-id");
		System.out.println(ele.getTagName());
		System.out.println(ele.isDisplayed()); // return true if it is displayed on the page
		System.out.println(ele.isEnabled());// return true if it is enabled
		System.out.println(ele.isSelected());
		File scrFile = ele.getScreenshotAs(OutputType.FILE);
	    Files.copy(scrFile, new File("element.png"));
	    File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(scrFile1, new File("fullpage.png"));
		
	}

}
