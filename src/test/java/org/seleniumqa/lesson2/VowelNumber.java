package org.seleniumqa.lesson2;

import org.testng.annotations.*;

import static org.testng.Assert.*;


/**
 * Created by admin on 11.02.2015.
 */
public class VowelNumber {

    public int vowelCount(String s) {
        int count = 0;
        String vowel = "aeiouAEIOU";
        for (char c : s.toCharArray())
            if (vowel.contains(String.valueOf(c)))
                count++;
        return count;
    }

    private String testWord;
    private int count;

    @BeforeTest
    public void setTestEnv() {
        testWord = "confidEnt";
        count = 3;
    }

    @Test
    public void vowelCountTest() {
        assertEquals(vowelCount(testWord), count);
    }

    @BeforeMethod
    public void initTest() {
        testWord = "HelLo";
        count = 2;
    }
    @Test
    public void vowelCountTest2() {
        assertTrue(vowelCount(testWord) == count);
    }

    @AfterTest
    public void resetTestEnv() {
        testWord = "";
        count = 0;
    }
}
