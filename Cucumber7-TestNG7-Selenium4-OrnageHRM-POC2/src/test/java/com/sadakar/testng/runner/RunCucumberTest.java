package com.sadakar.testng.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions; 
@CucumberOptions(
		
		
		//tags="@LoginValidCredentials",
		//tags="@DashboardTabCountOfQuickLaunhElements",
		//tags="@DirectoryTabNavigationFromDashboardTab",
		//tags="@DirectoryTabIsSearchButtonDisplayed",
		tags="@test",
		
		//tags="@LoginValidCredentials and not @DashboardTabCountOfQuickLaunhElements and not @DirectoryTabNavigationFromDashboardTab and not @DirectoryTabIsSearchButtonDisplayed",
		
		features = "classpath:features", 
		
		glue = {"com.sadakar.common", "com.sadakar.stepdefinitions",
				"com.sadakar.testng.runner"},

		plugin = {"pretty", 
				"html:target/cucumber-reports-html.html", 
				"json:target/cucumber-reports-json.json", 
				"junit:target/cucumber-reports-xml.xml", 
				"rerun:target/rerun.txt", 
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, 
		
		monochrome = true)
public class RunCucumberTest extends AbstractTestNGCucumberTests {


}
