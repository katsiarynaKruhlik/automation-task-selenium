package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
import src.pages.ProgressBarTaskPage;
import static src.utils.Urls.BASE_URL;

public class ProgressBarTaskTest extends BaseTest {

    @Epic(value = "Testing " + BASE_URL)
    @Feature(value = "Test for Progress bar")
    @Test
    public void waitForProgressBar(){
        ProgressBarTaskPage progressBarPage = new ProgressBarTaskPage(driver);
        Assert.assertTrue(progressBarPage.progressBarPageIsCurrent());
        progressBarPage.clickStart();
        progressBarPage.waitTillCondition();
    }
}
