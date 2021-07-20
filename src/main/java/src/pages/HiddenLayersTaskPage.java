package src.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import src.utils.BasePathEnum;

public class HiddenLayersTaskPage extends BasePage {
    private static final By greenBtn = By.cssSelector("#greenButton");
    private static final By hiddenLayersLink = By.linkText("Hidden Layers");
    public static final String HIDDEN_LAYERS_URL = BasePathEnum.BASE_URL.getPath() + "hiddenlayers";

    public HiddenLayersTaskPage(WebDriver driver) {
        super(driver);
    }

    public boolean hiddenLayersPageIsCurrent() {
        driver.findElement(hiddenLayersLink).click();
        return isUrlCorrect(HIDDEN_LAYERS_URL);
    }

    public void clickGreenBtn() {
        driver.findElement(greenBtn).click();
        log().info("The next click cannot be performed");
        driver.findElement(greenBtn).click();
    }
}
