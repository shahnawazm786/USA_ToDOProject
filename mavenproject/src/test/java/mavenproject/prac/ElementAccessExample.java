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
		inpuByID(driver);

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

}
