package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
import src.pages.DynamicIdTaskPage;
import static src.utils.Urls.BASE_URL;

public class DynamicIdTaskTest extends BaseTest {

    @Epic(value = "Testing " + BASE_URL)
    @Feature(value = "Test for Dynamic ID")
    @Test
    public void compareBtnDynamicId() {
        DynamicIdTaskPage dynamicIdPage = new DynamicIdTaskPage(driver);
        Assert.assertTrue(dynamicIdPage.dynamicIdPageIsCurrent());
        Assert.assertFalse(dynamicIdPage.btnIdIsSame());
    }
}
