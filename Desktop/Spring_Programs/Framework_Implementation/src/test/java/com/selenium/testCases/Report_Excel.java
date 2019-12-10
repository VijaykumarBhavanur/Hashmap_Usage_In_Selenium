package com.selenium.testCases;

import org.automationtesting.excelreport.Xl;

public class Report_Excel {

	public static void main(String[] args) {
		try {
			Xl.generateReport("test_report.xlsx");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
