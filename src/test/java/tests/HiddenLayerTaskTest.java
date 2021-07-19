package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.openqa.selenium.WebDriverException;
import org.testng.Assert;
import org.testng.annotations.Test;
import src.pages.HiddenLayersTaskPage;
import static src.utils.Urls.BASE_URL;

public class HiddenLayerTaskTest extends BaseTest {

    @Epic(value = "Testing " + BASE_URL)
    @Feature(value = "Test for Hidden layers")
    @Test
    public void checkIfBtnIsClickable() {
        HiddenLayersTaskPage hiddenLayersPage = new HiddenLayersTaskPage(driver);
        Assert.assertTrue(hiddenLayersPage.hiddenLayersPageIsCurrent());
        Assert.assertThrows(WebDriverException.class, hiddenLayersPage::clickGreenBtn);
    }
}
