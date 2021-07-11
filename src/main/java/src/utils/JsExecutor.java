package src.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JsExecutor {

    private static JavascriptExecutor jsExecutor;

    public static void jsScrollIntoView(WebDriver driver, By locator) {
        jsExecutor = (JavascriptExecutor) driver;
        WebElement elem = driver.findElement(locator);
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", elem
        );
    }


}
