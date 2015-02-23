package org.seleniumqa.lesson1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * Created by admin on 11.02.2015.
 */
public class SimpleNumber {
    public boolean isPrime(int n) {
        if (n == 1) return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0) return false;
        return true;
    }

    private int number;

    @BeforeTest
    public void setUp() {
        number = 13;
    }

    @Test
    public void isPrimeTest() {
        assertTrue(isPrime(number));
    }

    @AfterTest
    public void tearDown() {
        number = 0;
    }
}
