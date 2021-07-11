package src.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import src.utils.JsExecutor;

public class ScrollbarsTaskPage extends BasePage {
    private static final By hidingBtnLocator = (By.xpath("//*[@id=\"hidingButton\"]"));

    public Point getHidingBtnLocation() {
        log().info("Getting hiding button location");
        return (driver.findElement(hidingBtnLocator)).getLocation();
    }

    public void scrollHidingBtn() {
        log().info("Scrolling hiding button to be visible");
        JsExecutor.jsScrollIntoView(driver, hidingBtnLocator);
    }

}
