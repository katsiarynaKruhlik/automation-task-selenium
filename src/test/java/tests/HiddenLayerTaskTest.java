package tests;

import io.qameta.allure.Feature;
import org.openqa.selenium.WebDriverException;
import org.testng.Assert;
import org.testng.annotations.Test;
import src.pages.HiddenLayersTaskPage;

public class HiddenLayerTaskTest extends BaseTest {

    @Feature(value = "Test for Hidden layers")
    @Test
    public void checkIfBtnIsClickable() {
        HiddenLayersTaskPage hiddenLayersPage = new HiddenLayersTaskPage(driver);
        Assert.assertTrue(hiddenLayersPage.hiddenLayersPageIsCurrent());
        Assert.assertThrows(WebDriverException.class, hiddenLayersPage::clickGreenBtn);
    }
}
