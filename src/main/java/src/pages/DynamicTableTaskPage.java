package src.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static src.utils.Urls.BASE_URL;
import java.util.List;

public class DynamicTableTaskPage extends BasePage {

    private final static By tableLocator = By.xpath("//div[@aria-label=\"Tasks\"]");
    private final static By chromeLabelLocator = By.xpath("//p[contains(text(),\"Chrome CPU:\")]");
    private final static By tableElemsList = By.xpath("//span[(text()=\"Chrome\")]/following-sibling::span[@role=\"cell\"]");
    private final static By dynamicTableLinkLocator = By.linkText("Dynamic Table");
    public static final String DYNAMIC_TABLE_URL = BASE_URL + "dynamictable";

    public DynamicTableTaskPage(WebDriver driver) {
        super(driver);
    }

    private String getChromeLabelValue() {
        String chromeLabelText = (driver.findElement(chromeLabelLocator)).getText();
        return (chromeLabelText.split(": ", 2))[1];
    }

    public boolean valuesAreSame() {
        String chromeLabelValue = getChromeLabelValue();
        List<WebElement> elemsList = driver.findElements(tableElemsList);
        for (WebElement elem : elemsList) {
            String elemText = elem.getText();
            if (elemText.equals(chromeLabelValue)) {
                return true;
            }
        }
        return false;
    }

    public boolean dynamicTablePageIsCurrent() {
        driver.findElement(dynamicTableLinkLocator).click();
        return isUrlCorrect(DYNAMIC_TABLE_URL);
    }

}
