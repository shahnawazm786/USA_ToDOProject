package stepdefs.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/features",
		glue = ""
		)
public class CucumberRunnerClass extends AbstractTestNGCucumberTests {

}
