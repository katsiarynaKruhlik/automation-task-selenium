package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;
import src.pages.AjaxDataTaskPage;
import static src.pages.AjaxDataTaskPage.*;
import static src.utils.Locators.ajaxLinkLocator;
import static src.utils.Urls.*;

public class AjaxDataTaskTest extends BaseTest {
    AjaxDataTaskPage ajaxDataPage = new AjaxDataTaskPage();


    @Epic(value = "Testing " + BASE_URL)
    @Feature(value = "Test for " + AJAX_DATA_URL)
    @Test
    public void checkIfLabelTextAppeared() {
        openAjaxDataPage();
        ajaxDataPage.clickLocator(buttonTriggeringAjaxRequestLocator);
        ajaxDataPage.waitUntilLabelTextAppears();
        Assert.assertTrue((driver.findElement(labelTextElem)).isDisplayed());
    }

    @Step
    public void openAjaxDataPage() {
        ajaxDataPage.clickLocator(ajaxLinkLocator);
        Assert.assertTrue(ajaxDataPage.isUrlCorrect(AJAX_DATA_URL));
    }
}
