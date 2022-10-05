package com.sadakar.stepdefinitions;

import org.openqa.selenium.By;

import com.sadakar.common.BasePage;

import io.cucumber.java.en.And;

public class HRMLogout extends BasePage{

	@And("Logout from HRM application")
	public void logoutHRM() {
		driver.findElement(By.xpath("//span/p")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}
}
