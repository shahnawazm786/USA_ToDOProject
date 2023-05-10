package stepdefs.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/features",
		glue = "stepdefs",
		tags="@cart_shoes",
		dryRun = true,
		monochrome = true,
		plugin = {"pretty","html:target/cucumber-reports/index.html"}
		
		)
public class CucumberRunnerTests extends AbstractTestNGCucumberTests {

}
