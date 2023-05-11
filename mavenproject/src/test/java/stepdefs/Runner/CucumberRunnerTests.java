package stepdefs.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/features",
		glue = "stepdefs",
		tags="@cart_shoes",
				dryRun = true,
				monochrome = true,
				plugin = {"pretty","json:target/cucumber-reports/cucumber.json",
						"html:target/cucumber-reports/cucumberreport.html",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
		 
		
		)
public class CucumberRunnerTests extends AbstractTestNGCucumberTests {

}
