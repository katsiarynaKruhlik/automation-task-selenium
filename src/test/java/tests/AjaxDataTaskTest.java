package tests;

import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
import src.pages.AjaxDataTaskPage;

public class AjaxDataTaskTest extends BaseTest {



    @Feature(value = "Test for AJAX data")
    @Test
    public void checkIfLabelTextAppeared() {
        AjaxDataTaskPage ajaxDataPage = new AjaxDataTaskPage(driver);
        Assert.assertTrue(ajaxDataPage.ajaxDataPageIsCurrent());
        ajaxDataPage.waitUntilLabelTextAppears();
        Assert.assertTrue(ajaxDataPage.labelTextIsFound());
    }

}
