package com.sadakar.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sadakar.common.BasePage;

import io.cucumber.java.en.And;

public class MyInfo extends BasePage{

	@And("Click on MyInfo and add nick name and after click on save")
	public void changeNickName() {
		
		WebElement myInfo = driver.findElement(By.xpath("//span[.='My Info']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(myInfo)).click();
		
		
	}
}
