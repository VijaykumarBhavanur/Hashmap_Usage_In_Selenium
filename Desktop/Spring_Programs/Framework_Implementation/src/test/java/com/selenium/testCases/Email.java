package com.selenium.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.selenium.PageObject.EmailPage;


public class Email extends BaseClass{
	@Test
	public void EmailTest() throws InterruptedException, IOException
	{
	
		Thread.sleep(3000);
		EmailPage email=new EmailPage(driver);
		email.setUserName(username);
		Thread.sleep(2000);
		email.clickunameNext();
		
		Thread.sleep(3000);
		
		email.setPassword(password);
		email.clickpassNext();
		
		Thread.sleep(3000);
		email.clickappButton();
		
		
		Thread.sleep(3000);
		
		email.clickgmailButton();
		Thread.sleep(5000);
		
		/*
		 * WebDriverWait wait=new WebDriverWait(driver, 30);
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
		 * "//div[normalize-space()='COMPOSE']")));
		 */
		
		//Scroll Down
		driver.manage().window().maximize();
		JavascriptExecutor jscript=(JavascriptExecutor)driver; 
		jscript.executeScript("scroll(0, 500);");
		Thread.sleep(5000);
		Assert.assertTrue(true);
		Thread.sleep(10000);
		
		
		
	}
}
