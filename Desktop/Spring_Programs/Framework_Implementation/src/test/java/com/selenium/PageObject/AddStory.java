package com.selenium.PageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddStory {
	WebDriver localDriver;

	public AddStory(WebDriver remoteDriver) {
		localDriver = remoteDriver;
		PageFactory.initElements(remoteDriver, this);

	}

	@FindBy(xpath ="//mat-icon[@class='mat-icon-floating mat-icon material-icons notranslate mat-icon-no-color']")
	WebElement addCTA;
	
	
	@FindBy(xpath ="//button[contains(text(),'ADD STORY')]")
	WebElement addStory;
	
	
	@FindBy(xpath = "//textarea[@id='mat-input-3']")
	WebElement infoURL;
	
	
	@FindBy(xpath = "//span[contains(text(),'Post')]")
	WebElement postButton;
	
	@FindBy(xpath = "//input[@id='mat-input-32']")
	WebElement title;
	
	
	
	
	
	public void clickaddCTA()
	{
		addCTA.click();
	}
	
	public void clickaddStory()
	{
		addStory.click();
	}
	
	public void setURL(String url) throws AWTException
	{
		JavascriptExecutor js = (JavascriptExecutor)localDriver ;
		
		js.executeScript("document.getElementById('mat-input-3').value='"+url+"'");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_SPACE);
		robot.keyRelease(KeyEvent.VK_SPACE);
		
	}
	
	public void clickpostButton()
	{
		postButton.click();
	}
	
	public void setTitle(String title) throws AWTException
	{
		JavascriptExecutor js = (JavascriptExecutor)localDriver ;
		
		js.executeScript("document.getElementById('mat-input-32').value='"+title+"'");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_SPACE);
		robot.keyRelease(KeyEvent.VK_SPACE);
		
	}
	
}
