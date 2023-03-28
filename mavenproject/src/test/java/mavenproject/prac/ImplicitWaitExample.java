package mavenproject.prac;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

public class ImplicitWaitExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//http://localhost:8080/
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();// inheritance method overriding
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		//by name getting element
		WebElement ele = driver.findElement(By.name("username"));
		ele.clear();
		ele.sendKeys("Admin");
		WebElement ele1 = driver.findElement(By.name("password"));
		ele1.clear();
		ele1.sendKeys("admin123");
		WebElement btn = driver.findElement(By.tagName("button"));
		btn.click();
		Thread.sleep(3000);
		driver.close();
		

	}

}
