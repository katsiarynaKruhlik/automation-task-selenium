package src.utils;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import src.config.Driver;
import src.interfaces.ILogger;


public class TestListener implements ITestListener, ILogger {
    WebDriver driver = Driver.initDriver();

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] takeScreenshot(WebDriver driver) {
        log().info("Taking screenshot...");
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        log().info("___________ " + iTestContext.getName() + " ___________");
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
    }

    @Override
    public void onTestStart(ITestResult iTestResult) {
        log().info("Test started: " + iTestResult.getMethod().getConstructorOrMethod().getName());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        log().info("Test SUCCESS: " + iTestResult.getMethod().getConstructorOrMethod().getName());
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        takeScreenshot(driver);
        log().error("Test FAILURE: " + iTestResult.getMethod().getConstructorOrMethod().getName());

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        takeScreenshot(driver);
        log().error("Test SKIPPED: " + iTestResult.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        takeScreenshot(driver);
        log().warn("Failed but within success percentage: " + iTestResult.getName());
    }

}
