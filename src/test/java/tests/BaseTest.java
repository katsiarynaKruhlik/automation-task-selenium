package tests;

import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import src.config.Driver;
import src.interfaces.ILogger;

import static src.utils.Urls.BASE_URL;

public abstract class BaseTest implements ILogger {
    static WebDriver driver;

    @BeforeSuite
    public void setup() {
        log().info("Opening web driver");
        driver = Driver.initDriver();
        driver.get(BASE_URL);
    }

    @AfterClass
    public void returnHome() {
        driver.navigate().back();
    }

    @AfterSuite
    public void shutdown() {
        log().info("Closing web driver");
        driver.quit();
    }

}
