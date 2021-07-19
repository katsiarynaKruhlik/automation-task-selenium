package src.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static src.utils.Urls.BASE_URL;


public class AjaxDataTaskPage extends BasePage {
    private final static By btnTriggeringAjaxRequest = By.cssSelector("#ajaxButton");
    private final static By labelTextElem = (By.xpath("//*[text()='Data loaded with AJAX get request.']"));
    private static final By ajaxLinkLocator = By.linkText("AJAX Data");
    public static final String AJAX_DATA_URL = BASE_URL + "ajax";

    public AjaxDataTaskPage(WebDriver driver) {
        super(driver);
    }

    public void waitUntilLabelTextAppears() {
        driver.findElement(btnTriggeringAjaxRequest).click();
        log().info("Waiting for Label text to appear");
        wait = new WebDriverWait(driver, 16);
        wait.until(ExpectedConditions.presenceOfElementLocated(labelTextElem));
    }

    public boolean labelTextIsFound() {
        log().info("Trying to find text label");
        return driver.findElement(labelTextElem).isDisplayed();
    }

    public boolean ajaxDataPageIsCurrent() {
        driver.findElement(ajaxLinkLocator).click();
        return isUrlCorrect(AJAX_DATA_URL);
    }
}
