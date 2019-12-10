package com.selenium.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Date_Test {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Documents/chromedriver");
		driver = new ChromeDriver();
	}

	@Test
	public void dateTest() throws InterruptedException {
		driver.get("http://demo.guru99.com/test/");
		WebElement dateBox = driver.findElement(By.xpath("//form//input[@name='bdaytime']"));
		dateBox.sendKeys("05121994");
		Thread.sleep(5000);

	}

	@AfterMethod
	public void releaseResource() {
		driver.close();
	}
}
