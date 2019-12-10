package com.hybrid.fileuploaddownload;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class FileUpload {
	
	
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","/home/admin1/Documents/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://tus.io/demo.html");
		driver.manage().window().maximize();
	}
	
	@Test(priority = 2)
	public void uploadTest() throws InterruptedException
	{
		
		  driver.findElement(By.xpath("//body/div[@class='wrapper']/div[@class='content']/div[@class='container']/p/input[1]"
		  )).sendKeys("/home/admin1/Desktop/browse.png");
		  Thread.sleep(15000); 
		  driver.close();
	}
}
