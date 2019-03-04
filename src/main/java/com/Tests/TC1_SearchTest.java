package com.Tests;

import com.Domain.BaseTest;
import com.Pages.SearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC1_SearchTest extends BaseTest {

    @Test
    public void searchTest() throws InterruptedException {

        SearchPage search = new SearchPage(getDriver());

        search.clickSearch();
        search.enterTextInSearchBox("asia");
        search.clickEnterOnSearchBox();

        Assert.assertEquals(search.getListofSearchResults("asia"), true);

    }
}
