package com.insptesting;

import org.openqa.selenium.*;

import java.util.Random;

public abstract class BaseClass {

    public static WebElement getElement(WebDriver driver, By locator) {
        WebElement element = driver.findElement(locator);
        return element;
    }

    public static int getRandInt() {
        Random rand = new Random();
        int rand_int1 = rand.nextInt(1000);
        return rand_int1;
    }
}