package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;
import src.pages.DynamicIdTaskPage;
import static src.pages.DynamicIdTaskPage.*;
import static src.utils.Urls.*;
import static src.utils.Locators.dynamicIdLinkLocator;

public class DynamicIdTaskTest extends BaseTest {
    DynamicIdTaskPage dynamicIdPage = new DynamicIdTaskPage();

    @Epic(value = "Testing " + BASE_URL)
    @Feature(value = "Test for " + DYNAMIC_ID_URL)
    @Test
    public void compareBtnDynamicId() {
        openDynamicIdPage();
        dynamicIdPage.clickLocator(btnWithDynamicIdLocator);

        String initialBtnId = dynamicIdPage.getElemIdByLocator(btnWithDynamicIdLocator);
        dynamicIdPage.refresh();
        String finalBtnId = dynamicIdPage.getElemIdByLocator(btnWithDynamicIdLocator);
        Assert.assertNotEquals(initialBtnId, finalBtnId);
    }

    @Step
    public void openDynamicIdPage() {
        dynamicIdPage.clickLocator(dynamicIdLinkLocator);
        Assert.assertTrue(dynamicIdPage.isUrlCorrect(DYNAMIC_ID_URL));
    }

}
