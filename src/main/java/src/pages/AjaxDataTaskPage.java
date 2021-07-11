package src.pages;

import org.openqa.selenium.By;
import static src.config.DriverWait.*;

public class AjaxDataTaskPage extends BasePage {
    public final static By buttonTriggeringAjaxRequestLocator = By.cssSelector("#ajaxButton");
    public final static By labelTextElem = (By.xpath("//*[text()='Data loaded with AJAX get request.']"));

    public void waitUntilLabelTextAppears() {
        log().info("Waiting for Label text to appear");
        waitForPresenceOfElemLocated(16, labelTextElem);
    }
}
