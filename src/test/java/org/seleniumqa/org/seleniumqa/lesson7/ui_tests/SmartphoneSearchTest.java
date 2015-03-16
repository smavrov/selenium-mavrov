package org.seleniumqa.org.seleniumqa.lesson7.ui_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.seleniumqa.org.seleniumqa.lesson7.core.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by admin on 16.03.2015.
 */
public class SmartphoneSearchTest extends TestBase {

    @Test
    public void searchSmartphoneTest() {
        driver.get("http://www.rozetka.com.ua");
        WebElement searchField = driver.findElement(By.className("header-search-input-text"));
        searchField.sendKeys(TestData.smartphoneModel);
        WebElement button = driver.findElement(By.className("btn-link-i"));
        button.click();
        WebElement result = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[1]/div/div[1]/header/h1"));

        Assert.assertEquals(result.getText(), "Мобильный телефон Samsung Galaxy S5 G900H Black");
    }

}
