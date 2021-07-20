package src.config;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import src.utils.BasePathEnum;
import java.util.concurrent.TimeUnit;

public class Driver {
    private static WebDriver driver;

    private Driver() {}

    public static WebDriver initDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", BasePathEnum.CHROME_DRIVER_PATH.getPath());

            ChromeOptions options = new ChromeOptions();
            options.addArguments("enable-automation");
            options.addArguments("--window-size=1920,1080");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-extensions");
            options.addArguments("--dns-prefetch-disable");
            options.addArguments("--ignore-ssl-errors=yes");
            options.addArguments("--ignore-certificate-errors");
            options.addArguments("disable-extensions");

            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }
        return driver;
    }
}
