package com.Tests;

import com.Domain.BaseTest;
import com.Pages.FillContactFormPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC2_FillContactFormTest extends BaseTest {

    @Test
    public void fillContactFormTest() throws InterruptedException {

        FillContactFormPage fillContactForm = new FillContactFormPage(getDriver());

        fillContactForm.clickonContactLink();

        fillContactForm.switchToDifferentTab();

        fillContactForm.enterDetailsonContactForm("ABC", "Trivago Test", "abc@xyz.com");

        fillContactForm.clickCheckbox();

        fillContactForm.clickSubmitButton();

        Assert.assertEquals(fillContactForm.verifyMessageonSubmit(), "Message Sent Successfully!");

    }
}
