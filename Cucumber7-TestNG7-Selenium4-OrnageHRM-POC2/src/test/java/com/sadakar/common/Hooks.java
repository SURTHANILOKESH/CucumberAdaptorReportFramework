package com.sadakar.common;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends BasePage {

//	@BeforeTest
	@Before
	public static void setupDriver() {

//		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		chromeOptions.addArguments("start-maximized");
		driver = new ChromeDriver(chromeOptions);
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

//	@AfterTest.
	@After
	public static void quitDriver() throws Exception {
		driver.quit();
//		Desktop.getDesktop().browse(new File("Reports/Spark.html").toURI());
	}

}
