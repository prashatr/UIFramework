package com.Pages;

import com.Domain.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPage extends BasePage {

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void clickSearch() {

        driver.findElement(By.className("search-icon")).click();

    }

    public void enterTextInSearchBox(String text) {

        driver.findElement(By.cssSelector("input.input.search-input")).sendKeys(text);

    }

    public void clickEnterOnSearchBox() throws InterruptedException {

        driver.findElement(By.cssSelector("input.input.search-input")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
    }

    public boolean getListofSearchResults(String text) {
        List<WebElement> ele = driver.findElements(By.xpath("//h3[@class='section-title']//following::div[@class='destination-menu']"));
        boolean valuePresent = false;
        for (WebElement e : ele) {
            if (e.getText().compareToIgnoreCase(text) == 0) {
                valuePresent = true;
                break;
            }
        }
        return valuePresent;
    }

}

