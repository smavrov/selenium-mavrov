package org.seleniumqa.lesson6;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by admin on 04.03.2015.
 */
public class StylusSearchTest {
    WebDriver driver = new FirefoxDriver();

    @BeforeClass
    public void setTestEnv() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://www.stylus.com.ua/");
    }

    @Test
    public void searchTest() {
        /*WebElement searchField = driver.findElement(By.id("search_text"));
        searchField.sendKeys("Sony");
        WebElement searchButton = driver.findElement(By.id("button"));
        searchButton.click();
        WebElement sonyLink = driver.findElement(By.xpath("./*//*[@id='col1_content']/table[2]/tbody/tr[1]/td[1]/table/tbody/tr/td[2]/h4/a"));

        Assert.assertEquals(sonyLink.getText().contains("Sony"), true);*/
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(By.name("search_text")));
        builder.click();
        builder.sendKeys("Sony");
        builder.sendKeys(Keys.ENTER);
        builder.perform();

        //builder.moveToElement(driver.findElement(By.name("button")));

    }

    @AfterClass
    public void testDown() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
        driver.quit();
    }
}
