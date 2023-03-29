package mavenproject.prac;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondClass {

	public static void main(String[] args)  throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();// inheritance method overriding
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		//textBoxSendKeys(driver);
		//disabledText(driver);
		//readonlyText(driver);
		linkText(driver);
		Thread.sleep(5000);
		driver.quit();
	}
	public static void textBoxSendKeys(WebDriver driver)throws InterruptedException {
		WebElement textBox1 = driver.findElement(By.id("my-text-id"));
		textBox1.sendKeys("Hello");
		Thread.sleep(5000);
		textBox1.clear();
		Thread.sleep(5000);
		textBox1.sendKeys("Hello");
		WebElement textBox2 = driver.findElement(By.name("my-password"));
		textBox2.sendKeys("Password");
		Thread.sleep(5000);
		textBox2.clear();
		Thread.sleep(5000);
		textBox2.sendKeys("Password");
		Thread.sleep(5000);
		WebElement textArea = driver.findElement(By.name("my-textarea"));
		textArea.sendKeys("New Delhi");
	}
	public static void disabledText(WebDriver driver) {
		WebElement disableText = driver.findElement(By.name("my-disabled"));
		String text=disableText.getText();
		System.out.println(text);
		try {
		disableText.sendKeys("Hello");
		}catch(ElementNotInteractableException interactable) {
			System.out.println("Element disable, we can add text into it");
		}
	}
	public static void readonlyText(WebDriver driver) {
		WebElement readonlyText = driver.findElement(By.name("my-readonly"));
		String str = readonlyText.getText();
		System.out.println(str);
		try {
		readonlyText.clear();
		}catch(InvalidElementStateException inve) {
			System.out.println("Readonly text can't be cleared");
		}
		readonlyText.click();
	}
	public static void linkText(WebDriver driver)throws InterruptedException {
		WebElement link = driver.findElement(By.linkText("Return to index"));
		link.click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		WebElement link2 = driver.findElement(By.partialLinkText("Return"));
		link2.click();
		Thread.sleep(5000);
	}
}
