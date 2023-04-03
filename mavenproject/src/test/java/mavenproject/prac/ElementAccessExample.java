package mavenproject.prac;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementAccessExample {

	public static void main(String[] args) throws Exception {
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
		//anchorByLinkText(driver);
		//textareaInput(driver);
		tagName(driver);

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
	public static void textareaInput(WebDriver driver) {
		WebElement textarea = driver.findElement(By.name("my-textarea"));
		textarea.sendKeys("Hello");
		textarea.sendKeys(Keys.ENTER);
		textarea.sendKeys("Hello 1");
		textarea.sendKeys(Keys.ENTER);
		textarea.sendKeys("Hello 2");
		textarea.sendKeys(Keys.ENTER);
			
	}
	public static void tagName(WebDriver driver) throws Exception {
	List<WebElement> input = driver.findElements(By.tagName("input"));
	for(WebElement ele:input) {
		System.out.println(ele.getAttribute("type"));
	}
	if(input.size()==14) {
		System.out.println("14 element founds");
		//throw new Exception("14 elements found");
	}
	else
	{
		System.out.println("14 element not founds");
		//throw new Exception("Size mis-matched");
	}
	}
	
}
