package com.saucedemo.automation.test;

import org.testng.Assert; 

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.saucedemo.automation.base.BaseTest;
import com.saucedemo.automation.pages.LoginPage;
import com.saucedemo.automation.utils.ExtentReportManager;



@Listeners(com.saucedemo.automation.listeners.TestListener.class)
public class LoginTest extends BaseTest {
	ExtentReports extent = ExtentReportManager.getreportbyextent();
	ExtentTest test;
	
	
    @Test(priority = 1)
    public void verifyLogin() {
    	test = extent.createTest("verifyLogin");
        LoginPage lp = new LoginPage(driver, wait);
        lp.clickAndFillUsername("standard_user");
        lp.clickAndFillPassword("secr\\et_sace");
        lp.clickOnLoginButton();
        String actualurl  = lp.getTitle();
        String expectedurl = "Swag Labs";
        Assert.assertEquals(actualurl, expectedurl);
        test.info("login pass");
      	extent.flush();
        //hello
    }
    
   
    
    @Test(priority = 2)
    public void veriyLoginWithInvalidCreadentials() {
    	test = extent.createTest("veriyLoginWithInvalidCreadentials");
        LoginPage lp = new LoginPage(driver, wait);
        lp.clickAndFillUsername("stanSS");
        lp.clickAndFillPassword("secrsacss");
        lp.clickOnLoginButton();
        String actualtext  = lp.getEmptyMessage();
        	System.out.println(actualtext);
        String expectedurl = "Epic sadface: Username and password do not match any user in this service";
        Assert.assertEquals(actualtext, expectedurl);
        test.info("login pass");
      	extent.flush();
    }
    
    
    @Test(priority = 3)
    public void veriyLoginwithEmptyPassword() {
    	test = extent.createTest("veriyLoginwithEmptyPassword");
        LoginPage lp = new LoginPage(driver, wait);
        lp.clickAndFillUsername("standard_user");
        lp.clickOnLoginButton();
        String actualtext  = lp.getEmptyMessage();
        	System.out.println(actualtext);
        String expectedurl = "Epic sadface: Password is required";
        Assert.assertEquals(actualtext, expectedurl);
        test.info("login pass");
      	extent.flush();
    }
    
    
    
    @Test(priority = 4)
    public void veriyLoginwithEmptyUsername() {
    	test = extent.createTest("veriyLoginwithEmptyUsername");
        LoginPage lp = new LoginPage(driver, wait);
        lp.clickAndFillPassword("secret_sauce");
        lp.clickOnLoginButton();
        String actualtext  = lp.getEmptyMessage();
        	System.out.println(actualtext);
        String expectedurl = "Epic sadface: Username is required";
        Assert.assertEquals(actualtext, expectedurl);
        test.info("login pass");
      	extent.flush();
    }
    
    
    @Test(priority = 5)
    public void veriyLoginandlogoutfunctionality() {
    	test = extent.createTest("veriyLoginandlogoutfunctionality");
        LoginPage lp = new LoginPage(driver, wait);
        lp.clickAndFillUsername("standard_user");
        lp.clickAndFillPassword("secret_sauce");
        lp.clickOnLoginButton();
        lp.clickOnMenu();
        lp.clickOnLogout();
        test.info("login pass");
      	extent.flush();
    }
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


















//user.name=utkarshm
//user.email=utkarshmohokar990@gmail.com

