package src.pages;

import src.utils.BasePathEnum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicIdTaskPage extends BasePage {

    private final static By btnWithDynamicId = By.xpath("//*[text()='Button with Dynamic ID']");
    private static final By dynamicIdLinkLocator = By.linkText("Dynamic ID");
    private static final String DYNAMIC_ID_URL = BasePathEnum.BASE_URL.getPath() + "dynamicid";

    public DynamicIdTaskPage(WebDriver driver) {
        super(driver);
    }

    public boolean dynamicIdPageIsCurrent() {
        driver.findElement(dynamicIdLinkLocator).click();
        return isUrlCorrect(DYNAMIC_ID_URL);
    }

    public boolean btnIdIsSame() {
        String initialBtnId = driver.findElement(btnWithDynamicId).getAttribute("id");
        driver.navigate().refresh();
        String finalBtnId = driver.findElement(btnWithDynamicId).getAttribute("id");
        return initialBtnId.equals(finalBtnId);
    }
}
