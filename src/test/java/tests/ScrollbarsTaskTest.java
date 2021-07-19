package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
import src.pages.ScrollbarsTaskPage;
import static src.utils.Urls.BASE_URL;

public class ScrollbarsTaskTest extends BaseTest {

    @Epic(value = "Testing " + BASE_URL)
    @Feature(value = "Test for Scrollbars")
    @Test
    public void findHidingBtn() {
        ScrollbarsTaskPage scrollbarsPage = new ScrollbarsTaskPage(driver);
        Assert.assertTrue(scrollbarsPage.scrollbarsPageIsCurrent());
        Assert.assertFalse(scrollbarsPage.btnLocationIsSame());
    }
}
