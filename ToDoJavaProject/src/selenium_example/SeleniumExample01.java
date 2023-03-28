package selenium_example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumExample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\eclipseworkspace_morning_batch\\ToDoJavaProject\\resources\\drivers\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();

		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");

		ChromeDriver driver = new ChromeDriver(chromeOptions);
		//WebDriver driver=new ChromeDriver(); C
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.8.1");
		driver.close();
	}

}
