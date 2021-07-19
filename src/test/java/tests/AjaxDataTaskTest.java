package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
import src.pages.AjaxDataTaskPage;
import static src.utils.Urls.BASE_URL;

public class AjaxDataTaskTest extends BaseTest {


    @Epic(value = "Testing " + BASE_URL)
    @Feature(value = "Test for AJAX data")
    @Test
    public void checkIfLabelTextAppeared() {
        AjaxDataTaskPage ajaxDataPage = new AjaxDataTaskPage(driver);
        Assert.assertTrue(ajaxDataPage.ajaxDataPageIsCurrent());
        ajaxDataPage.waitUntilLabelTextAppears();
        Assert.assertTrue(ajaxDataPage.labelTextIsFound());
    }

}
