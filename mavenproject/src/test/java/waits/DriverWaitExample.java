package waits;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import controls.CommonMethods;

public class DriverWaitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * alert is present
			element exists
			element is visible
			title contains
			title is
			element staleness
			visible text
		 * */
		WebDriver driver = CommonMethods.getDriver();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20)); //maximum
		// pooling by default 500 milli-second
		wait.pollingEvery(Duration.ofMillis(100));
		wait.ignoring(NoSuchElementException.class);
		WebElement cal = wait.until(ExpectedConditions.elementToBeClickable(CommonMethods.findElementByLocator(driver, "name", "my-date")));
		cal.click();
		
		/*
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(20)); //maximum
		// pooling by default 500 milli-second
		wait
				.until(ExpectedConditions
						.and(ExpectedConditions.elementToBeClickable(CommonMethods.findElementByLocator(driver, "name", "my-date")
			)));
		*/
		// fluent wait - event and handler
		Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(30))
				  .pollingEvery(Duration.ofSeconds(5))
				  .ignoring(NoSuchElementException.class);

				WebElement foo = fwait.until(d -> {
				  return d.findElement(By.id("foo"));
				});
		
	}

}
