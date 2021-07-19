package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
import src.pages.DynamicTableTaskPage;
import static src.utils.Urls.BASE_URL;


public class DynamicTableTaskTest extends BaseTest {

    @Epic(value = "Testing " + BASE_URL)
    @Feature(value = "Test for Dynamic table")
    @Test
    public void compareValuesOfCPU() {
        DynamicTableTaskPage dynamicTablePage = new DynamicTableTaskPage(driver);
        Assert.assertTrue(dynamicTablePage.dynamicTablePageIsCurrent());
        Assert.assertTrue(dynamicTablePage.valuesAreSame());
    }

}
