package com.saucedemo.automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.saucedemo.automation.utils.ConfigReader;
import com.saucedemo.automation.utils.WaitUtils;

public class BaseTest {
    
    protected WebDriver driver;
    protected WaitUtils wait;
    
    //hrllo
    //
    @BeforeClass
    public void setup() {
        String browser = ConfigReader.getProperties("browser");
        
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } 
        else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } 
        else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } 
        else {
            throw new RuntimeException("Invalid browser: " + browser);
        }

        driver.manage().window().maximize();
        wait = new WaitUtils(driver);
        driver.get(ConfigReader.getProperties("url"));
    }
    
    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}