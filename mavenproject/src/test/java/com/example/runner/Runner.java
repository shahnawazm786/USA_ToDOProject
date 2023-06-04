package com.example.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/features",
		glue = "com.example.stepdefs",
		tags="@nopsanity",
		plugin= {"pretty","html:target/example/Report.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"	
		}
		)
public class Runner extends AbstractTestNGCucumberTests {

}
