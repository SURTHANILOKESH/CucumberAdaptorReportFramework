package com.sadakar.stepdefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.sadakar.common.BasePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HRMLoginPage extends BasePage {

	@Given("User login to HRM application with UserName and Password")
	public void loginToHRMApp(io.cucumber.datatable.DataTable dataTable) {
//		driver.get("https://opensource-demo.orangehrmlive.com/");

		List<List<String>> cells = dataTable.cells();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(cells.get(0).get(0));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(cells.get(0).get(1));
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@When("Click on submit button")
	public void clickOnLogin() {
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
	}	
		
	@Then("validate the URL")
	public void validateURL() {
		String expected_URL = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String actual_URL = driver.getCurrentUrl();
		Assert.assertEquals(actual_URL, expected_URL, "URL mismatched");

	}

}
