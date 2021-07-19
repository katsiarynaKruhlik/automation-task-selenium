package src.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static src.utils.Urls.BASE_URL;

public class TextInputTaskPage extends BasePage {

    private static final By textInputLocator = By.cssSelector("#newButtonName");
    private static final By changingNameBtn = By.cssSelector("#updatingButton");
    private static final By textInputLink = By.xpath("//a[@href=\"/textinput\"]");
    public static final String TEXT_INPUT_URL = BASE_URL + "textinput";

    public TextInputTaskPage(WebDriver driver) {
        super(driver);
    }

    public boolean textInputPageIsCurrent() {
        driver.findElement(textInputLink).click();
        return isUrlCorrect(TEXT_INPUT_URL);
    }

    public void inputBtnName() {
        WebElement textInput = driver.findElement(textInputLocator);
        textInput.isDisplayed();
        textInput.sendKeys("Fun button");
        driver.findElement(changingNameBtn).click();
    }

    public String getBtnName() {
        return driver.findElement(changingNameBtn).getText();
    }
}
