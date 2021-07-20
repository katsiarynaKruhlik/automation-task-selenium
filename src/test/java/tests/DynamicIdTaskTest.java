package tests;

import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
import src.pages.DynamicIdTaskPage;

public class DynamicIdTaskTest extends BaseTest {

    @Feature(value = "Test for Dynamic ID")
    @Test
    public void compareBtnDynamicId() {
        DynamicIdTaskPage dynamicIdPage = new DynamicIdTaskPage(driver);
        Assert.assertTrue(dynamicIdPage.dynamicIdPageIsCurrent());
        Assert.assertFalse(dynamicIdPage.btnIdIsSame());
    }
}
