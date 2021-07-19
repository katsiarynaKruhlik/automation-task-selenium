package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
import src.pages.TextInputTaskPage;
import static src.utils.Urls.BASE_URL;

public class TextInputTaskTest extends BaseTest {

    @Epic(value = "Testing " + BASE_URL)
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
