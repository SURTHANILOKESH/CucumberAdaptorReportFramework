package com.sadakar.common;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends BasePage {

	@Before
	public static void setupDriver() throws InterruptedException {

//		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@After
	public static void quitDriver() throws Exception {
		driver.quit();
//		Desktop.getDesktop().browse(new File("Reports/Spark.html").toURI());
	}

}
