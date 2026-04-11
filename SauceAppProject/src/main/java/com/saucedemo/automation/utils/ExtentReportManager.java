package com.saucedemo.automation.utils;


import com.aventstack.extentreports.ExtentReports;  
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {
	public static ExtentReports getreportbyextent() {
		ExtentSparkReporter esr  = new ExtentSparkReporter("Reports/extendreport.html");
		esr.config().setReportName("utkarsh");
		esr.config().setDocumentTitle("Sauce Project");
		ExtentReports ER = new ExtentReports();
		ER.attachReporter(esr);
		ER.setSystemInfo("QA", "utkarsh mohokar");
		return  ER;
	}
}