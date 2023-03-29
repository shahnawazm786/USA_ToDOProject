package mavenproject.prac;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;

public class SecondClass {

	public static void main(String[] args)  throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();// inheritance method overriding
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();
		textBoxSendKeys(driver);
		//disabledText(driver);
		//readonlyText(driver);
		//linkText(driver);
		//selectDropDown(driver);
		
		//inputSelectDropDown(driver);
		//fileUpload(driver);
		//colorPicker(driver);
		//datePicker(driver);
		//rangePicker(driver);
		//getElementByCSSSelector(driver);
		getElementByClass(driver);
		Thread.sleep(5000);
		//driver.quit();
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
	public static void selectDropDown(WebDriver driver) throws InterruptedException {
		
		Select sel=new Select(driver.findElement(By.name("my-select")));
		sel.selectByValue("1");
		//sel.deselectAll();
		
		List<WebElement> list = sel.getOptions();
		for(WebElement e:list) {
			System.out.println(e.getText());
		}
		Thread.sleep(5000);
	}
	public static void inputSelectDropDown(WebDriver driver) {
		WebElement input = driver.findElement(By.name("my-datalist"));
		input.click();
		input.sendKeys("San Francisco");
		input.click();
		//input.sendKeys(Keys.ENTER);
		//Select sel=new Select(driver.findElement(By.id("San Francisco")));
		//sel.selectByValue("San Francisco");
	}
	public static void fileUpload(WebDriver driver) {
		WebElement file = driver.findElement(By.name("my-file"));
		file.sendKeys("c:/files/demo.txt");
	}
	public static void colorPicker(WebDriver driver) {
		WebElement color = driver.findElement(By.name("my-colors"));
		color.click();
		color.sendKeys(Keys.DOWN);
		color.sendKeys(Keys.DOWN);
		driver.findElement(By.name("my-colors")).clear();
	}
	public static void datePicker(WebDriver driver) {
		WebElement datePic = driver.findElement(By.name("my-date"));
		datePic.click();
		driver.findElement(By.xpath("//td[text()='4']")).click();
	}
	public static void rangePicker(WebDriver driver) {
		WebElement range = driver.findElement(By.name("my-range"));
		//range.click();
		Actions action=new Actions(driver);
		/*action.dragAndDropBy(range, 0, -200).dragAndDropBy(range, -200,100).
		build().perform();*/
		action.click(range).sendKeys(Keys.LEFT).build().perform();
		action.click(range).sendKeys(Keys.LEFT).build().perform();
		
	}
	public static void getElementByCSSSelector(WebDriver driver) throws InterruptedException{
		String ele="input[name='my-text']";
		WebElement cssElement = driver.findElement(By.cssSelector(ele));
		cssElement.sendKeys("Hello CSS selector");
		Thread.sleep(5000);
		cssElement.clear();		
		// second way
		WebElement css2 = driver.findElement(By.cssSelector("input#my-text-id"));
		css2.sendKeys("Second way of css selector");
		Thread.sleep(5000);
		cssElement.clear();	
		WebElement css3 = driver.findElement(By.cssSelector("#my-text-id"));
		css3.sendKeys("Third way of css selector");
		Thread.sleep(5000);
		
	}
	public static void getElementByClass(WebDriver driver) {
		List<WebElement> list = driver.findElements(By.className("w-100"));
		System.out.println(list.size());
		for(WebElement e:list) {
			System.out.println(e.getTagName());
		}
	}
}
