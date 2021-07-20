package tests;

import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
import src.pages.ProgressBarTaskPage;

public class ProgressBarTaskTest extends BaseTest {

    @Feature(value = "Test for Progress bar")
    @Test
    public void waitForProgressBar(){
        ProgressBarTaskPage progressBarPage = new ProgressBarTaskPage(driver);
        Assert.assertTrue(progressBarPage.progressBarPageIsCurrent());
        progressBarPage.clickStart();
        progressBarPage.waitTillCondition();
    }
}
