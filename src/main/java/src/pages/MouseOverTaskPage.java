package src.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import src.utils.BasePathEnum;

public class MouseOverTaskPage extends BasePage {

    private static final By clickMeBtn = By.xpath("Click me");
    private static final By clickCountLocator = By.cssSelector("#clickCount");
    private static final By mouseOverLink = By.linkText("Mouse Over");
    private static final String MOUSE_OVER_URL = BasePathEnum.BASE_URL.getPath() + "mouseover";

    public MouseOverTaskPage(WebDriver driver) {
        super(driver);
    }

    public boolean mouseOverPageIsCurrent() {
        driver.findElement(mouseOverLink).click();
        return isUrlCorrect(MOUSE_OVER_URL);
    }

    public void makeClicks() {
        WebElement clickMeElem = driver.findElement(clickMeBtn);
        clickMeElem.click();
        clickMeElem.click();
    }

    public String getNumberOfClicks() {
        String numberOfClicks = driver.findElement(clickCountLocator).getText();
        log().info("After 2 clicks: " + numberOfClicks);
        return numberOfClicks;
    }

}
