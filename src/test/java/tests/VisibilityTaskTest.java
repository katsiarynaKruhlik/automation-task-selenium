package tests;

import static src.utils.ScreenshotTaker.takeScreenshot;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;
import src.pages.VisibilityTaskPage;
import static src.pages.VisibilityTaskPage.*;
import static src.utils.Locators.visibilityLinkLocator;
import static src.utils.Urls.*;

public class VisibilityTaskTest extends BaseTest {
    VisibilityTaskPage visibilityPage = new VisibilityTaskPage();

    @Epic(value = "Testing " + BASE_URL)
    @Feature(value = "Test for " + VISIBILITY_URL)
    @Test
    public void checkVisibilityOfAllBtns() {
        openVisibilityPage();
        visibilityPage.clickLocator(hideBtnLocator);

        takeScreenshot(driver);
        Assert.assertFalse(visibilityPage.isRemovedBtnVisible());

        Assert.assertFalse(visibilityPage.isZeroWidthBtnVisible());

        Assert.assertFalse(visibilityPage.isOverlappedBtnVisible());

        Assert.assertFalse(visibilityPage.isTransparentBtnVisible());

        Assert.assertFalse(visibilityPage.isInvisibleBtnVisible());

        Assert.assertFalse(visibilityPage.isNotDisplayedBtnVisible());

        Assert.assertFalse(visibilityPage.isOffscreenBtnVisible());
    }

    @Step
    public void openVisibilityPage() {
        visibilityPage.clickLocator(visibilityLinkLocator);
        Assert.assertTrue(visibilityPage.isUrlCorrect(VISIBILITY_URL));
    }


}
