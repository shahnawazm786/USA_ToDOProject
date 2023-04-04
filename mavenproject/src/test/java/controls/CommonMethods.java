package controls;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonMethods {
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();// inheritance method overriding
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();
		return driver;
	}
	public static WebElement findElementByLocator(WebDriver driver,String typeOfAccess,String locator)
	{
		WebElement ele=null;
		if(typeOfAccess.equalsIgnoreCase("id")) {
			ele = driver.findElement(By.id(locator));
		}else if(typeOfAccess.equalsIgnoreCase("name")) {
			ele= driver.findElement(By.name(locator));
		}else if(typeOfAccess.equalsIgnoreCase("cssSelector")) {
			ele= driver.findElement(By.cssSelector(locator));
		}else if(typeOfAccess.equalsIgnoreCase("class")) {
			ele= driver.findElement(By.className(locator));
		}else if(typeOfAccess.equalsIgnoreCase("xpath")) {
			ele=driver.findElement(By.xpath(locator));
		}else if(typeOfAccess.equalsIgnoreCase("partial link text")) {
			ele=driver.findElement(By.partialLinkText(locator));
		}else if(typeOfAccess.equalsIgnoreCase("link text")) {
			ele= driver.findElement(By.linkText(locator));
			
		}else if(typeOfAccess.equalsIgnoreCase("tagname")) {
			ele= driver.findElement(By.tagName(locator));
		}else
		{
			return ele;
		}
		return ele;
	}

}
