package src.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DynamicTableTaskPage extends BasePage {

    public final static By tableLocator = By.xpath("//div[@aria-label=\"Tasks\"]");
    public final static By chromeLabelLocator = By.xpath("//p[contains(text(),\"Chrome CPU:\")]");
    public final static By tableElemsList = By.xpath("//span[(text()=\"Chrome\")]/following-sibling::span[@role=\"cell\"]");

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

}
