package src.config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverWait {
    static WebDriver driver = Driver.initDriver();

    public static void waitForPresenceOfElemLocated(int waitTimeInSec, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, waitTimeInSec);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public static WebElement waitForElemToBeClickable(int waitTimeInSec, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, waitTimeInSec);
        WebElement elem = driver.findElement(locator);
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        return elem;
    }


}
