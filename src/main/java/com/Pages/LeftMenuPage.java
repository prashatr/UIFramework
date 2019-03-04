package com.Pages;

import com.Domain.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LeftMenuPage extends BasePage {

    public LeftMenuPage(WebDriver driver) {
        super(driver);
    }

    public void clickonTopLeftMenu() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.className("nav-icon")).click();
    }

    public void selectDestination(String text) throws InterruptedException {
        List<WebElement> ele = driver.findElements(By.cssSelector("div.menu-container div.destination-menu"));
        for (WebElement e : ele) {
            if (e.getText().compareToIgnoreCase(text) == 0) {
                e.click();
                break;
            }
        }
        Thread.sleep(1000);
    }

    public String pageHeaderTitle() {
        return driver.findElement(By.cssSelector("div.hero-title.caps")).getText();
    }
}
