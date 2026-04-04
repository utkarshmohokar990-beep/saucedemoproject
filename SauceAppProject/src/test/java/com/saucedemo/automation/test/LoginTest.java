package com.saucedemo.automation.test;

import org.testng.annotations.Test;
import com.saucedemo.automation.base.BaseTest;
import com.saucedemo.automation.pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void verifyLogin() {
        LoginPage lp = new LoginPage(driver, wait);
        
        lp.clickAndFillUsername("standard_user");
        lp.clickAndFillPassword("secret_sauce");
        lp.clickOnLoginButton();
    }
}


//user.name=utkarshm
//user.email=utkarshmohokar990@gmail.com

