package controls;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledInputText {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();// inheritance method overriding
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();
		disableInputEnterText(driver);
		disableInputClearInputText(driver);
		Thread.sleep(5);
		disableInputClickEvent(driver);
		Thread.sleep(5);
	}
	public static void disableInputEnterText(WebDriver driver) {
		WebElement ele = driver.findElement(By.name("my-disabled"));
		try {
			ele.sendKeys("I am disable text");
		}catch(ElementNotInteractableException e)
		{
			System.out.println(ele + " -> is disabled");
		}
		// Exception can be thrown 
		// 1. Element disabled
		// 2. Element is present into the html source but height and width is 0
		// ElementNotInteractableException
		
	}
	public static void disableInputClearInputText(WebDriver driver) {
		WebElement ele = driver.findElement(By.name("my-disabled"));
		try {
		ele.clear();
		}catch(InvalidElementStateException e) {
			System.out.println(ele+" -> is disabled ");
		}
		// Exception can be thrown 
		// 1. Element disabled
		// 2. Element is present into the html source but height and width is 0
		// InvalidElementStateException
	}
	public static void disableInputClickEvent(WebDriver driver) {
		WebElement ele = driver.findElement(By.name("my-disabled"));
		ele.click();
	}
}
