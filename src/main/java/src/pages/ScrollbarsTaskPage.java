package src.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import src.utils.BasePathEnum;
import src.utils.JsExecutor;

public class ScrollbarsTaskPage extends BasePage {
    private static final By hidingBtnLocator = (By.xpath("//*[@id=\"hidingButton\"]"));
    private static final By scrollbarsLinkLocator = By.linkText("Scrollbars");
    public static final String SCROLLBARS_URL = BasePathEnum.BASE_URL.getPath() + "scrollbars";

    public ScrollbarsTaskPage(WebDriver driver) {
        super(driver);
    }

    public Point getHidingBtnLocation() {
        log().info("Getting hiding button location");
        return (driver.findElement(hidingBtnLocator)).getLocation();
    }

    public boolean btnLocationIsSame() {
        Point initialBtnLocation = getHidingBtnLocation();
        log().info("Scrolling hiding button to be visible");
        JsExecutor.jsScrollIntoView(driver, hidingBtnLocator);
        Point finalBtnLocation = getHidingBtnLocation();
        return initialBtnLocation.equals(finalBtnLocation);
    }

    public boolean scrollbarsPageIsCurrent() {
        driver.findElement(scrollbarsLinkLocator).click();
        return isUrlCorrect(SCROLLBARS_URL);
    }

}
