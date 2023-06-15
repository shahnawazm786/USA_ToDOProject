package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/features",
		glue = "stepdefs",
		tags="@tag2"
		/*plugin= {"pretty","html:target/example/Report.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"	
		}*/
		
		)

public class MyRunner extends AbstractTestNGCucumberTests {

}
