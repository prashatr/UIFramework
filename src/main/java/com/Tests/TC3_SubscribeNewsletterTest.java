package com.Tests;

import com.Pages.SubscribeNewsletterPage;
import com.Domain.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC3_SubscribeNewsletterTest extends BaseTest {

    @Test
    public void subscribeNewsletter() throws InterruptedException {
        SubscribeNewsletterPage subscribe = new SubscribeNewsletterPage(getDriver());

        subscribe.enterEmailforNewsletter("abc@xyz4.com");
        subscribe.clickButtontoSubscribe();

        Assert.assertEquals(subscribe.verifyCheckedinMessage(), "You are now checked-in!");
    }
}
