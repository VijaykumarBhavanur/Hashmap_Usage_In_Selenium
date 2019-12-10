package com.selenium.testCases;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hybrid.hashmapusage.Data;
import com.selenium.PageObject.LoginPage;


public class HaspmapUsage {
	
	
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","/home/admin1/Documents/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://fundoopush-dev.bridgelabz.com/login");
	}
	
	@Test(priority = 1)
	public void hashmapTest() throws InterruptedException
	{
		String credentials[]=Data.getCredentials().get("admin").split("_");
		
		LoginPage login=new LoginPage(driver);
		Thread.sleep(5000);
		login.setUserName(credentials[0]);
		Thread.sleep(2000);
		
		login.setPassword(credentials[1]);
		Thread.sleep(2000);
		
		login.clickLogin();
		Thread.sleep(3000);
		
		login.clickLogout();
		login.yesButtonClick();
		assertTrue(true);
		
	}
	
	
	@Test(priority = 2)
	public void hashmapTest1() throws InterruptedException
	{
		
		
		String credentials[]=Data.getCredentials().get("user").split("_");
		LoginPage login=new LoginPage(driver);
		Thread.sleep(5000);
		login.setUserName(credentials[0]);
		Thread.sleep(2000);
		
		login.setPassword(credentials[1]);
		Thread.sleep(2000);
		
		login.clickLogin();
		Thread.sleep(3000);
		
		assertTrue(true);
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}

}
