package com.saucedemo.automation.pages;

import java.time.Duration;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saucedemo.automation.utils.WaitUtils;

public class LoginPage{
	private WebDriver driver;
	private WaitUtils wait;
	
	
	public LoginPage(WebDriver driver,WaitUtils wait) {
		this.driver = driver;
		this.wait = wait;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css="#user-name")
	private WebElement usernameField;
	
	@FindBy(css="#password")
	private WebElement passwordField;
	
	@FindBy(xpath="//*[@id=\"login-button\"]")
	private WebElement loginButton;
	
	@FindBy(xpath="//*[@data-test=\"error\"]")
	private WebElement errorTextMessage;
	
	@FindBy(xpath="//*[@id=\"react-burger-menu-btn\"]")
	private WebElement burgerMenu;
	
	@FindBy(xpath="//*[@id=\"logout_sidebar_link\"]")
	private WebElement logout_sidebar;
	
	
	public void clickAndFillUsername(String username) {
		wait.waitForVisibilityOfElement(usernameField);
		usernameField.click();
		usernameField.sendKeys(username);
	}
	
	public void clickAndFillPassword(String password) {
		wait.waitForVisibilityOfElement(passwordField);
		passwordField.click();
		passwordField.sendKeys(password);
	}
	
	public void clickOnLoginButton() {
		wait.waitForElementToBeClickable(loginButton);
		loginButton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	
	}
	
	public String getTitle() {
		return driver.getTitle();
		
	}
	
	public String getEmptyMessage() {
		wait.waitForVisibilityOfElement(errorTextMessage);
		return errorTextMessage.getText();
		
	}
	
	public void clickOnMenu() {
		wait.waitForVisibilityOfElement(burgerMenu);
		burgerMenu.click();
	}	
	
	public void clickOnLogout() {
		wait.waitForVisibilityOfElement(logout_sidebar);
		logout_sidebar.click();
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
