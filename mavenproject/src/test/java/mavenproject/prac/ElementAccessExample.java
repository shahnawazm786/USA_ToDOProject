package mavenproject.prac;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementAccessExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();// inheritance method overriding
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();
		//inputByName(driver);
		//inpuByID(driver);
		//inpuByCssSelector(driver);
		//inpuByClass(driver);
		//anchorByPartialText(driver);
		anchorByLinkText(driver);

	}
	public static void inputByName(WebDriver driver) {
		WebElement input = driver.findElement(By.name("my-text"));
		input.clear();
		input.sendKeys("Automation");
		
	}
	
	public static void inpuByID(WebDriver driver) {
		WebElement input = driver.findElement(By.id("my-text-id"));
		input.clear();
		input.sendKeys("Automation By ID");
		
	}
	public static void inpuByCssSelector(WebDriver driver) {
		WebElement input = driver.findElement(By.cssSelector("input[myprop='myvalue']"));
		input.clear();
		input.sendKeys("Automation By css selector");
		
	}
	public static void inpuByClass(WebDriver driver) {
		WebElement input = driver.findElement(By.className("form-control"));
		input.clear();
		input.sendKeys("Automation By css selector");
	}
	public static void anchorByPartialText(WebDriver driver) {
		WebElement anchor = driver.findElement(By.partialLinkText("Return"));
		anchor.click();
	}
	public static void anchorByLinkText(WebDriver driver) {
		WebElement anchor = driver.findElement(By.partialLinkText("Return to index"));
		anchor.click();
	}
	
}
