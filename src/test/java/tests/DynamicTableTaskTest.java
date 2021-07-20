package tests;

import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
import src.pages.DynamicTableTaskPage;


public class DynamicTableTaskTest extends BaseTest {

    @Feature(value = "Test for Dynamic table")
    @Test
    public void compareValuesOfCPU() {
        DynamicTableTaskPage dynamicTablePage = new DynamicTableTaskPage(driver);
        Assert.assertTrue(dynamicTablePage.dynamicTablePageIsCurrent());
        Assert.assertTrue(dynamicTablePage.valuesAreSame());
    }

}
