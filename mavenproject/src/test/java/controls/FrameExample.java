package controls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FrameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = CommonMethods.getDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		String str=driver.findElement(By.tagName("p")).getText();
		System.out.println(str);
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//div[@id='sidebar']"));

	}

}
