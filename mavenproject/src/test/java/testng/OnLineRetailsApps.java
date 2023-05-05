package testng;

import java.time.Duration;

import org.openqa.selenium.By;
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
	String txt_user_name_by_name="username";
	String txt_password_by_name="password";
	String btn_login_by_xpath="//button[@type='submit']";
	
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
		System.out.println(System.getProperty("studentName"));
		driver.get(url);
		
	}
	
	@Test
	public void login_test() {
		System.out.println(userName);
		System.out.println(password);
		driver.findElement(By.name(txt_user_name_by_name)).clear();
		driver.findElement(By.name(txt_user_name_by_name)).sendKeys(userName);
		driver.findElement(By.name(txt_password_by_name)).clear();
		driver.findElement(By.name(txt_password_by_name)).sendKeys(password);
		driver.findElement(By.xpath(btn_login_by_xpath)).click();
	
	}
	
	@AfterSuite
	public void teardown() {
		driver.manage().deleteAllCookies();
		driver.quit();
	}
}
