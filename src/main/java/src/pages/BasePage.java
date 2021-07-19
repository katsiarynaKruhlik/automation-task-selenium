package src.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import src.interfaces.ILogger;


public abstract class BasePage implements ILogger {
    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isUrlCorrect(String url) {
        String currentUrl = driver.getCurrentUrl();
        return url.equals(currentUrl);
    }


}
