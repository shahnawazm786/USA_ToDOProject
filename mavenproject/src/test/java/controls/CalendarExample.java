package controls;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalendarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = CommonMethods.getDriver();
		WebElement cal = CommonMethods.findElementByLocator(driver, "name", "my-date");
		cal.click();
		List<WebElement> list = CommonMethods.findElementByLocators(driver, "tagname", "td");
		System.out.println(list.size());
		for(WebElement l:list) {
			if(l.getText().equals("19")) {
				l.click();
				break;
			}
			System.out.println(l.getText());
			
		}
		//StaleElementReferenceException
		// elements -> before it was into the page
		// now the element has been removed from the dom somehow, or state has been changed
		
		
	}

}
