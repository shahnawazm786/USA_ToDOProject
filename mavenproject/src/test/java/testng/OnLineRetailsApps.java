package testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OnLineRetailsApps {
	WebDriver driver;
	String url=null;
	String userName=null;
	String password=null;
	@BeforeSuite
	public void start() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		

	}
	
	@BeforeClass
	public void setup() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		url=System.getProperty("siteUrl");
		userName=System.getProperty("user");
		password=System.getProperty("password");
		driver.get(url);
		
	}
	
	@Test
	public void login_test() {
	System.out.println(userName);
	System.out.println(password);
	}
	
	@AfterSuite
	public void teardown() {
		driver.manage().deleteAllCookies();
		driver.quit();
	}
}
