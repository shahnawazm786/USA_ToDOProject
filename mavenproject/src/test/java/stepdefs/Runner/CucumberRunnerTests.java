package stepdefs.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/features",
		glue = "stepdefs",
		tags="@cart_shoes",
		dryRun = true,
		monochrome = true
		
		)
public class CucumberRunnerTests extends AbstractTestNGCucumberTests {

}
