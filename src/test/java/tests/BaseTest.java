package tests;

import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import src.config.Driver;
import src.interfaces.ILogger;
import static src.utils.Urls.*;

public abstract class BaseTest implements ILogger {
    WebDriver driver;


    @BeforeClass
    public void setup() {
        driver = Driver.initDriver();
        log().info("Opening home page");
        driver.get(BASE_URL);
    }

    @AfterSuite
    public void shutdown() {
        log().info("Closing web driver");
        driver.quit();
    }

}
