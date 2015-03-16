package org.seleniumqa.org.seleniumqa.lesson7.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.IOException;

/**
 * Created by admin on 16.03.2015.
 */
public class WebDriverFactory {

    public static WebDriver getWebDriver(String browser) throws IOException {
        if (browser.equals("firefox")) {
            return new FirefoxDriver();
        } else if (browser.equals("chrome")) {
            return new ChromeDriver();
        } else if (browser.equals("ie")) {
            return new InternetExplorerDriver();
        } else {
            throw new IllegalArgumentException("Incorrect argument type");
        }
    }
}
