package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	//String link_get_started_xpath="//a[text()='Get started' and @class='get-started-link btn black-border-button']";
	//By link_get_started_xpath_by;

	@FindBy(xpath = "//a[text()='Get started' and @class='get-started-link btn black-border-button']")
	WebElement link_get_started_by_xpath;

	@FindBy(xpath="//a[text()='Store demo' ]")
	WebElement link_store_demo_by_xpath;

	
	//]
	@FindBy(xpath="//a[text()='Showcase' ")
	WebElement link_showcase_by_path;


	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void navigateGetStart() {
		link_get_started_by_xpath.click();
	}
	public void navigateStoreDemo() {
		link_store_demo_by_xpath.click();
	}
	public void navigateShowcase() {
		link_showcase_by_path.click();
	}

}
