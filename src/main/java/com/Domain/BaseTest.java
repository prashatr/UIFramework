package com.Domain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    private WebDriver driver;

    @BeforeTest
    public void setUp() {
        String exePath = "/Users/prashant/Documents/automationFramework/UIFramework/chromedriver";
        System.setProperty("webdriver.chrome.driver", exePath);
        driver = new ChromeDriver();
        driver.get("http://room5.trivago.com/");
    }

    @AfterTest
    public void quit() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
