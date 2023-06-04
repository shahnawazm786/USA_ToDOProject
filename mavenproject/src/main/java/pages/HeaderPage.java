package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HeaderPage {

	WebDriver driver;
	public HeaderPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Product']")
	WebElement menu_product_by_xpath;
	//
	
	@FindBy(xpath="//span[text()='Store demo']")
	WebElement menu_store_Demo_by_xpath;
}
