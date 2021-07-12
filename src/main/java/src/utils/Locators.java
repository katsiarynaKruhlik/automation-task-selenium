package src.utils;

import org.openqa.selenium.By;

public class Locators {
    public static final By visibilityLinkLocator = By.cssSelector("a[href=\"/visibility\"]");
    public static final By scrollbarsLinkLocator = By.linkText("Scrollbars");
    public static final By ajaxLinkLocator = By.cssSelector("a[href=\"/ajax\"]");
    public static final By dynamicIdLinkLocator = By.linkText("Dynamic ID");
    public static final By dynamicTableLinkLocator = By.linkText("Dynamic Table");
}
