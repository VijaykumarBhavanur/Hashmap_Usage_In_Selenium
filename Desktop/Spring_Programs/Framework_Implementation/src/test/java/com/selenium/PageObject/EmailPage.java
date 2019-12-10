package com.selenium.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailPage {
	WebDriver localDriver;
	public EmailPage(WebDriver remoteDriver) {
		localDriver=remoteDriver;
		PageFactory.initElements(remoteDriver,this);
	}
	
	@FindBy(id = "identifierId")
	WebElement txtEmail;
	
	
	
	@FindBy(id="identifierNext")
	WebElement unameNext;
	
	@FindBy(name = "password")
	WebElement txtPassword;
	
	
	@FindBy(id="passwordNext")
	WebElement passNext;
	
	@FindBy(xpath = "//*[@class='gb_Se']")
	WebElement appButton;
	
	
	@FindBy(xpath = "//a[@id='gb23']//span[@class='gb_r']")
	WebElement gmailButton;
	
	@FindBy(id = "//div[contains(text(),'Compose')]")
	WebElement composeButton;
	
	
	public void setUserName(String email)
	{
		txtEmail.sendKeys(email);
	}
	
	public void setPassword(String email)
	{
		txtPassword.sendKeys(email);
	}
	
	
	public void clickunameNext()
	{
		unameNext.click();
	}
	
	public void clickpassNext()
	{
		passNext.click();
	}
	
	public void clickappButton()
	{
		appButton.click();
	}
	
	public void clickgmailButton()
	{
		gmailButton.click();
	}
	
	public void clickcomposeButton()
	{
		composeButton.click();
	}
	
}
