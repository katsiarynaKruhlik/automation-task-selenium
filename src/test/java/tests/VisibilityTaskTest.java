package tests;

import io.qameta.allure.Feature;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;
import src.pages.VisibilityTaskPage;

public class VisibilityTaskTest extends BaseTest {

    @Feature(value = "Test for Visibility")
    @Test
    public void checkVisibilityOfAllBtns() {
        VisibilityTaskPage visibilityPage = new VisibilityTaskPage(driver);

        Assert.assertTrue(visibilityPage.visibilityPageIsCurrent());
        visibilityPage.hideButtons();

        Assert.assertThrows(NoSuchElementException.class, visibilityPage::isRemovedBtnVisible);

        Assert.assertFalse(visibilityPage.isZeroWidthBtnVisible());

        Assert.assertFalse(visibilityPage.isOverlappedBtnVisible());

        Assert.assertFalse(visibilityPage.isTransparentBtnVisible());

        Assert.assertFalse(visibilityPage.isInvisibleBtnVisible());

        Assert.assertFalse(visibilityPage.isNotDisplayedBtnVisible());

        Assert.assertFalse(visibilityPage.isOffscreenBtnVisible());
    }
}
