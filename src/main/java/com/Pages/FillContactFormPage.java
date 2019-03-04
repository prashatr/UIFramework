package com.Pages;

import com.Domain.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class FillContactFormPage extends BasePage {
    public FillContactFormPage(WebDriver driver) {
        super(driver);
    }

    public void clickonContactLink() throws InterruptedException {
        driver.findElement(By.xpath("//a[text()='Contact']")).click();
        Thread.sleep(1000);
    }

    public void switchToDifferentTab() throws InterruptedException {
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "\t");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Thread.sleep(1000);
    }

    public void enterDetailsonContactForm(String message, String fullName, String email) {
        writeTextonMessageBox(message);
        writeFullName(fullName);
        writeEmail(email);
    }

    public void writeTextonMessageBox(String text) {
        driver.findElement(By.className("contact-msg")).sendKeys(text);
    }

    public void writeFullName(String fullName) {
        driver.findElement(By.xpath("//span[text()='Full Name']//following-sibling::input[@class='contact-input']")).sendKeys(fullName);
    }

    public void writeEmail(String email) {
        driver.findElement(By.xpath("//span[text()='Your Email']//following-sibling::input[@class='contact-input']")).sendKeys(email);
    }

    public void clickCheckbox() {
        driver.findElement(By.id("confirm")).click();
    }

    public void clickSubmitButton() throws InterruptedException {
        driver.findElement(By.className("contact-submit")).click();
        Thread.sleep(2000);
    }

    public String verifyMessageonSubmit() {
        return driver.findElement(By.cssSelector("p.feedback")).getText();
    }


}
