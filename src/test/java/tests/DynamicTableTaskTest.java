package tests;


import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;
import src.pages.DynamicTableTaskPage;
import static src.utils.Locators.dynamicTableLinkLocator;
import static src.utils.Urls.*;


public class DynamicTableTaskTest extends BaseTest {
    DynamicTableTaskPage dynamicTablePage = new DynamicTableTaskPage();

    @Epic(value = "Testing " + BASE_URL)
    @Feature(value = "Test for " + DYNAMIC_TABLE_URL)
    @Test
    public void compareValuesOfCPU() {
        openDynamicTablePage();
        Assert.assertTrue(dynamicTablePage.valuesAreSame());
    }

    @Step
    public void openDynamicTablePage() {
        dynamicTablePage.clickLocator(dynamicTableLinkLocator);
        Assert.assertTrue(dynamicTablePage.isUrlCorrect(DYNAMIC_TABLE_URL));

    }

}
