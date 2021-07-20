package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
import src.pages.TextInputTaskPage;

public class TextInputTaskTest extends BaseTest {

    @Feature(value = "Test for Text Input")
    @Description("Check whether button name changes after text input")
    @Test
    public void renameBtn(){
        TextInputTaskPage textInputPage = new TextInputTaskPage(driver);
        Assert.assertTrue(textInputPage.textInputPageIsCurrent());
        textInputPage.inputBtnName();
        Assert.assertEquals(textInputPage.getBtnName(), "Fun button");
    }
}
