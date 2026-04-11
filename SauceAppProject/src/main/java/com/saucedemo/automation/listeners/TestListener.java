package com.saucedemo.automation.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.saucedemo.automation.utils.ExtentReportManager;


public class TestListener implements ITestListener{
	 ExtentReports ER = ExtentReportManager.getreportbyextent();
	 ExtentTest ET;
	    
	
	@Override
	public void onTestStart(ITestResult result){
		System.out.println(result.getName());
	}
	
	@Override
	 public void onTestSuccess(ITestResult result) {
	        System.out.println("PASS: " + result.getName());
	 }

	@Override
	 public void onTestFailure(ITestResult result) {
	        System.out.println("FAIL: " + result.getName());
	    }
	    
	@Override
	   public void onFinish(ITestContext context) {
	        System.out.println("Execution Finished");
	    }
	}