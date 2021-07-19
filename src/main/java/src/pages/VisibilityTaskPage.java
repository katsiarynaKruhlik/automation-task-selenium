package src.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import static src.utils.Urls.*;

public class VisibilityTaskPage extends BasePage {

    private static final By hideBtn = By.xpath("//*[text()='Hide']");

    private static final By removedBtn = (By.cssSelector("#removedButton"));
    private static final By zeroWidthBtn = (By.cssSelector("#zeroWidthButton"));
    private static final By overlappedBtn = (By.cssSelector("#overlappedButton"));
    private static final By hidingLayerElem = (By.cssSelector("#hidingLayer"));
    private static final By transparentBtn = (By.cssSelector("#transparentButton"));
    private static final By invisibleBtn = (By.cssSelector("#invisibleButton"));
    private static final By notDisplayedBtn = (By.cssSelector("#notdisplayedButton"));
    private static final By offscreenBtn = (By.cssSelector("#offscreenButton"));

    private static final By visibilityLinkLocator = (By.linkText("Visibility"));
    public static final String VISIBILITY_URL = BASE_URL + "visibility";

    public VisibilityTaskPage(WebDriver driver) {
        super(driver);
    }

    public boolean visibilityPageIsCurrent() {
        driver.findElement(visibilityLinkLocator).click();
        return isUrlCorrect(VISIBILITY_URL);
    }

    public void hideButtons() {
        driver.findElement(hideBtn).click();
    }

    public void isRemovedBtnVisible() {
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.MILLISECONDS);
        log().info("checking removed button");
        driver.findElement(removedBtn);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public boolean isZeroWidthBtnVisible() {
        log().info("checking zero width button");
        double buttonWidth = driver.findElement(zeroWidthBtn).getSize().getWidth();
        return buttonWidth > 0.0;
    }

    public boolean isOverlappedBtnVisible() {
        boolean locationOfElemsIsSame = ((driver.findElement(hidingLayerElem)).getLocation()).equals((driver.findElement(overlappedBtn)).getLocation());
        boolean hidingLayerIsTransparent = ((driver.findElement(hidingLayerElem)).getCssValue("color").equals("rgba(0, 0, 0, 0)"));
        return (!locationOfElemsIsSame) &&
                (hidingLayerIsTransparent);
    }

    public boolean isTransparentBtnVisible() {
        return Integer.parseInt((driver.findElement(transparentBtn)).getCssValue("opacity")) > 0;
    }

    public boolean isInvisibleBtnVisible() {
        return !((driver.findElement(invisibleBtn)).getCssValue("visibility")).equals("hidden");
    }

    public boolean isNotDisplayedBtnVisible() {
        return !((driver.findElement(notDisplayedBtn)).getCssValue("display").equals("none"));
    }

    public boolean isOffscreenBtnVisible() {
        double buttonX = (driver.findElement(offscreenBtn)).getLocation().getX();
        double buttonY = (driver.findElement(offscreenBtn)).getLocation().getY();
        return (buttonY > -0010.0) || (buttonX > -0080.0);
    }

}
