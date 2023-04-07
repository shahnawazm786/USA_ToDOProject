package selenium_method;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import controls.CommonMethods;

public class JavaScriptExecutorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = CommonMethods.getDriver();
		WebElement button = CommonMethods.findElementByLocator(driver, "tagname", "button");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		System.out.println(js.executeScript("return document.title"));
		String script="arguments[0].click();";
		js.executeScript(script, button);
		driver.get("https://www.selenium.dev/documentation/legacy/selenium_2/faq/#q-how-do-i-execute-javascript-directly");
		js.executeScript("window.scrollTo(0,1500);");
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight);");

	}

}
