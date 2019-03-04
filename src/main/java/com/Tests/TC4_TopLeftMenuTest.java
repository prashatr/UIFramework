package com.Tests;

import com.Domain.BaseTest;
import com.Pages.LeftMenuPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC4_TopLeftMenuTest extends BaseTest {

    @Test
    public void leftMenuTest() throws InterruptedException {
        LeftMenuPage leftMenu = new LeftMenuPage(getDriver());
        leftMenu.clickonTopLeftMenu();
        leftMenu.selectDestination("midwest");

        Assert.assertEquals(leftMenu.pageHeaderTitle().toLowerCase(), "midwest");

    }

}
