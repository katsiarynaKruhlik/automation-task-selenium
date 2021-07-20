package src.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import src.utils.BasePathEnum;
import java.util.concurrent.TimeUnit;

public class ProgressBarTaskPage extends BasePage {

    private static final By progressBarLocator = By.cssSelector("#progressBar");
    private static final By startBtn = By.cssSelector("#startButton");
    private static final By stopBtn = By.cssSelector("#stopButton");
    private static final By progressBarLink = By.linkText("Progress Bar");
    public static final String PROGRESS_BAR_URL = BasePathEnum.BASE_URL.getPath() + "progressbar";

    public ProgressBarTaskPage(WebDriver driver) {
        super(driver);
    }

    public boolean progressBarPageIsCurrent() {
        driver.findElement(progressBarLink).click();
        return isUrlCorrect(PROGRESS_BAR_URL);
    }

    public void clickStart() {
        log().info("Click start button");
        driver.findElement(startBtn).click();
        driver.findElement(stopBtn).isDisplayed();
    }

    public String getPercentage() {
        return driver.findElement(progressBarLocator).getAttribute("aria-valuenow");
    }

    public void waitTillCondition() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        final WebElement progressBarElem = driver.findElement(progressBarLocator);
        int percentage = 25;
        while (percentage < 75) {
            percentage = Integer.parseInt(progressBarElem.getAttribute("aria-valuenow"));
            if (percentage >= 75) {
                driver.findElement(stopBtn).click();
                log().info(getPercentage());
            }
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
