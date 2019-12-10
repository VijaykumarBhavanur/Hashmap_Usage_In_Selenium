package com.selenium.testCases;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReadPDF {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Documents/chromedriver");
		driver = new ChromeDriver();
	}

	@Test
	public void readPDF() throws IOException {

		driver.get("file:///home/admin1/Desktop/sample.pdf");
		URL url = new URL(driver.getCurrentUrl());
		InputStream is = url.openStream();
		BufferedInputStream fileToParse = new BufferedInputStream(is);
		PDDocument document = null;
		try {
			document = PDDocument.load(fileToParse);
			String output = new PDFTextStripper().getText(document);
			System.out.println("File content ::::::\n\n" + output);
			Assert.assertEquals(true, output.contains(" This is a small demonstration .pdf file"));

		} finally {
			if (document != null) {
				document.close();
			}
			fileToParse.close();
			is.close();
		}
	}

	@AfterMethod
	public void releaseResource() {
		driver.close();
	}

}
