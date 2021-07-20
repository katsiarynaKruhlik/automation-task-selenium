package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
import src.pages.MouseOverTaskPage;

public class MouseOverTaskTest extends BaseTest {

    @Feature(value = "Test for Mouse over")
    @Description("Check whether link is clickable after hovering")
    @Test
    public void isLinkClickable(){
        MouseOverTaskPage mouseOverPage = new MouseOverTaskPage(driver);
        Assert.assertTrue(mouseOverPage.mouseOverPageIsCurrent());
        mouseOverPage.makeClicks();
        Assert.assertEquals(mouseOverPage.getNumberOfClicks(), "2");
    }
}
