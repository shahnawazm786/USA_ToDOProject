package stepdefs.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/features",
		glue = "stepdefs",
		tags="@login_valid_credential",
		plugin= {"pretty","html:target/example/Report.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"	
		}
		
		)
public class CucumberRunnerClass extends AbstractTestNGCucumberTests {

}
