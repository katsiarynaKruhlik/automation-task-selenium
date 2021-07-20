package tests;

import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
import src.pages.ScrollbarsTaskPage;

public class ScrollbarsTaskTest extends BaseTest {

    @Feature(value = "Test for Scrollbars")
    @Test
    public void findHidingBtn() {
        ScrollbarsTaskPage scrollbarsPage = new ScrollbarsTaskPage(driver);
        Assert.assertTrue(scrollbarsPage.scrollbarsPageIsCurrent());
        Assert.assertFalse(scrollbarsPage.btnLocationIsSame());
    }
}
