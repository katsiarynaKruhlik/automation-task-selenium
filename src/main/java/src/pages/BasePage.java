package src.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import src.config.Driver;
import static src.config.DriverWait.*;
import org.openqa.selenium.WebDriver;
import src.interfaces.ILogger;

import java.util.concurrent.TimeUnit;


public abstract class BasePage implements ILogger {
    WebDriver driver = Driver.initDriver();


    public void refresh() {
        log().info("Refreshing");
        driver.navigate().refresh();

    }

    public void sleep(int sec) {
        try {
            TimeUnit.SECONDS.sleep(sec);
        } catch (InterruptedException ignored) {
        }
    }

    public void clickLocator(By locator) {
        waitForElemToBeClickable(2, locator).click();
    }

    public boolean isUrlCorrect(String url) {
        String currentUrl = driver.getCurrentUrl();
        return url.equals(currentUrl);
    }

    public String getElemIdByLocator(By locator) {
        WebElement elem = driver.findElement(locator);
        return elem.getAttribute("id");
    }
}
