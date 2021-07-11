package src.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import src.config.Driver;


public class VisibilityTaskPage extends BasePage {

    public static final By hideBtnLocator = By.xpath("//*[text()='Hide']");
    public static final By removedBtn = (By.cssSelector("#removedButton"));
    private static final By zeroWidthBtn = (By.cssSelector("#zeroWidthButton"));

    private static final By overlappedBtn = (By.cssSelector("#overlappedButton"));
    private static final By hidingLayerElem = (By.cssSelector("#hidingLayer"));

    private static final By transparentBtn = (By.cssSelector("#transparentButton"));
    private static final By invisibleBtn = (By.cssSelector("#invisibleButton"));
    private static final By notDisplayedBtn = (By.cssSelector("#notdisplayedButton"));
    private static final By offscreenBtn = (By.cssSelector("#offscreenButton"));

    public boolean isRemovedBtnVisible() {
        return !(driver.findElements(removedBtn)).isEmpty();
    }

    public boolean isZeroWidthBtnVisible() {
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
//        double buttonTop = offscreenButtonLocator.get("top");
//        double buttonLeft = parseLocatorSizeValue(offscreenButtonLocator, "left");
//        return (buttonTop > -0010.0) || (buttonLeft > -0080.0);
        double buttonX = (driver.findElement(offscreenBtn)).getLocation().getX();
        double buttonY = (driver.findElement(offscreenBtn)).getLocation().getY();
        return (buttonY > -0010.0) || (buttonX > -0080.0);
    }

}
