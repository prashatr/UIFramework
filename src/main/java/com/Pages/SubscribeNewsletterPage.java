package com.Pages;

import com.Domain.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SubscribeNewsletterPage extends BasePage {

    public SubscribeNewsletterPage(WebDriver driver) {
        super(driver);
    }

    public void enterEmailforNewsletter(String email) {
        driver.findElement(By.cssSelector("input.et-email")).sendKeys(email);
    }

    public void clickButtontoSubscribe() throws InterruptedException {
        driver.findElement(By.cssSelector("button.submit")).click();
        Thread.sleep(2000);
    }

    public String verifyCheckedinMessage() {
        return driver.findElement(By.cssSelector("p.submitted.h1")).getText();
    }
}
