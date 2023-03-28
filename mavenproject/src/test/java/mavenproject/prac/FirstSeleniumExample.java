package mavenproject.prac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();// inheritance method overriding
		driver.get("https://www.google.com");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		String title=driver.getTitle();
		System.out.println(title);
		//driver=new ChromeDriver();
		//driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.manage().window().minimize();
		Thread.sleep(5000);
		driver.manage().window().fullscreen();
		Thread.sleep(5000);
		//driver.quit();//close the current browser 
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		driver.close(); // close all the browser and kill the session
		

	}

}
