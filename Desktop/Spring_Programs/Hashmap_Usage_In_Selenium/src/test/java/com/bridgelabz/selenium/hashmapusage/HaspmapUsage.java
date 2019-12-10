package com.bridgelabz.selenium.hashmapusage;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bridgelabz.selenium.hashmapusage.util.Data;
import com.bridgelabz.selenium.hashmapusage.util.pages.LoginPage;


/**
 * 
 * @author Vijaykumar Bhavanur 
 * purpose: To demonstrate usage of hashmap in selenium
 * 
 */
public class HaspmapUsage {

	// Defining driver instance reference
	WebDriver driver;

	/**
	 * Method used to create and initialize driver instance
	 */
	@BeforeMethod
	public void setup() {

		// To set the path of the driver for the respective browser
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Documents/chromedriver");

		// Creating browser instance based on driver
		driver = new ChromeDriver();

		// To Open URL of application to be tested
		driver.get("https://fundoopush-dev.bridgelabz.com/login");
	}

	/**
	 * Method to Test login functionality using Hashmap with high priority i.e "1"
	 * 
	 * @throws InterruptedException
	 */
	@Test(priority = 1)
	public void hashmapTest() throws InterruptedException {

		// Getting credentials from hashmap util class and extract "admin" credentials
		String credentials[] = Data.getCredentials().get("admin").split("_");

		// Creating login page object
		LoginPage login = new LoginPage(driver);

		// wait for 5seconds
		Thread.sleep(5000);

		// Setting username which is read from hashmap to username field
		login.setUserName(credentials[0]);

		// wait for 2seconds
		Thread.sleep(2000);

		// Setting password which is read from hashmap to password field
		login.setPassword(credentials[1]);

		// wait for 2seconds
		Thread.sleep(2000);

		// Clicking login button
		login.clickLogin();

		// wait for 3seconds
		Thread.sleep(3000);

		// Clicking logout button
		login.clickLogout();

		// Clicking yes button
		login.yesButtonClick();

		// Asserts that a condition is true
		assertTrue(true);

	}

	@Test(priority = 2)
	public void hashmapTest1() throws InterruptedException {

		// Getting credentials from hashmap util class and extract "user" credentials
		String credentials[] = Data.getCredentials().get("user").split("_");

		// Creating login page object
		LoginPage login = new LoginPage(driver);

		// wait for 5seconds
		Thread.sleep(5000);

		// Setting username which is read from hashmap to username field
		login.setUserName(credentials[0]);

		// wait for 2seconds
		Thread.sleep(2000);

		// Setting password which is read from hashmap to password field
		login.setPassword(credentials[1]);

		// wait for 2seconds
		Thread.sleep(2000);

		// Clicking login button
		login.clickLogin();

		// wait for 3seconds
		Thread.sleep(3000);

		// Clicking logout button
		login.clickLogout();

		// Clicking yes button
		login.yesButtonClick();

		// Asserts that a condition is true
		assertTrue(true);

	}

	/**
	 * Method to close resource such as browser after executing test methods
	 */
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
