package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetStartedPage {
	WebDriver driver;
	
	@FindBy(xpath = "(//a[text()='Request a quote'])[1]")
	WebElement btn_request_a_quote;
	
	public GetStartedPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickOnRequestQuote() {
		btn_request_a_quote.click();
	}
}
