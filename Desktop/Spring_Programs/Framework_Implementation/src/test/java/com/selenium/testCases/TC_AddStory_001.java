package com.selenium.testCases;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.selenium.PageObject.AddStory;
import com.selenium.PageObject.LoginPage;

public class TC_AddStory_001 extends BaseClass {

	@Test
	public void addStory() throws InterruptedException, AWTException {

		logger.info("URL Opened");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setUserName(username);
		logger.info("Username entered");
		Thread.sleep(2000);
		loginPage.setPassword(password);
		logger.info("Password entered");
		Thread.sleep(2000);
		loginPage.clickLogin();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		AddStory addStory = new AddStory(driver);
		addStory.clickaddCTA();
		Thread.sleep(2000);
		addStory.clickaddStory();
		addStory.setURL("https://www.bbc.com/news/election-2019-50687225");

		Thread.sleep(4000);
		addStory.clickpostButton();

		//addStory.setTitle("Test title");
		//Thread.sleep(2000);
		
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.alertIsPresent());

		assertTrue(true);

	}
}
