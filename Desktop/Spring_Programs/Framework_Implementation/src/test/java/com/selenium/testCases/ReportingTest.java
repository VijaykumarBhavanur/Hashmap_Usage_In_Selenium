package com.selenium.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ReportingTest {
	@Test
	public void reportTest() throws IOException
	{
		ExtentHtmlReporter reporter =new ExtentHtmlReporter(System.getProperty("user.dir") + "/Reports/" +"LatestReport.html");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		
		
		ExtentTest logger1=extent.createTest("DemoTest");
		logger1.log(Status.INFO,"Demo Test1");
		logger1.log(Status.PASS,"Test Passed");
		logger1.pass("Details",MediaEntityBuilder.createScreenCaptureFromPath("/home/admin1/Pictures/Screenshot from 2019-12-09 11-28-49.png").build());

		extent.flush();
		
		
		
		ExtentTest logger2=extent.createTest("DemoTest");
		logger2.log(Status.INFO,"Demo Test2");
		logger2.log(Status.FAIL,"Test Failed");
		logger2.fail("Details",MediaEntityBuilder.createScreenCaptureFromPath("/home/admin1/Pictures/Screenshot from 2019-12-09 11-28-49.png").build());
		extent.flush();
		
		
		
	}
}
