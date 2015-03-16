package org.seleniumqa.org.seleniumqa.lesson7.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.seleniumqa.org.seleniumqa.lesson7.ui_tests.TestData;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by admin on 16.03.2015.
 */
public class TestBase {
    protected static WebDriver driver;
    protected static WebDriverWait wait;

    @BeforeSuite
    public static void initTestEnv() throws IOException {
        driver = WebDriverFactory.getWebDriver(TestData.webBrowser);
        wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
    }

    @AfterSuite
    public void testDown() {
        driver.quit();
    }
}
