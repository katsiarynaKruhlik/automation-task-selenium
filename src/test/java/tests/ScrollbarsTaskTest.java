package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.openqa.selenium.Point;
import org.testng.Assert;
import org.testng.annotations.Test;
import src.pages.ScrollbarsTaskPage;
import static src.utils.Locators.scrollbarsLinkLocator;
import static src.utils.Urls.*;

public class ScrollbarsTaskTest extends BaseTest {
    ScrollbarsTaskPage scrollbarsPage = new ScrollbarsTaskPage();

    @Epic(value = "Testing " + BASE_URL)
    @Feature(value = "Test for " + SCROLLBARS_URL)
    @Test
    public void findHidingBtn() {
        openScrollbarsPage();
        Point initialBtnLocation = scrollbarsPage.getHidingBtnLocation();
        scrollbarsPage.scrollHidingBtn();
        Point finalBtnLocation = scrollbarsPage.getHidingBtnLocation();
//        isHidingBtnInProperPlace(finalBtnLocation);
        Assert.assertNotEquals(finalBtnLocation, initialBtnLocation);
    }

    @Step
    public void openScrollbarsPage() {
        scrollbarsPage.clickLocator(scrollbarsLinkLocator);
        Assert.assertTrue(scrollbarsPage.isUrlCorrect(SCROLLBARS_URL));
    }

//    @Step
//    @Test
//    public void isHidingBtnInProperPlace(Point finalBtnLocation) {
//        Point properFinalLocation = new Point(476, 418);
//        Assert.assertEquals(properFinalLocation, finalBtnLocation);
//    }
}
