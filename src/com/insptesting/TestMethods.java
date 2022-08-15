package com.insptesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMethods extends BaseClass {

    static WebDriver driver;

    public static void navigateToWebsite() {
        System.setProperty("webdriver.chrome.driver", "/Users/carlthomas/Downloads/chromedriver"); //Replace chromedriver URL with your own
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(TestData.WEBSITE_URL);
    }

    public static void acceptCookies() {
        By gotItButton = By.xpath("//*[text()='Got it']");
        getElement(driver, gotItButton).click();
    }

    public static void clickLoadShedding() throws InterruptedException {
        By clickLoadShedding = By.id("nav_item_351");
        Thread.sleep(2000);
        getElement(driver, clickLoadShedding).click();

    }

    public static void selectLights() {
        By lights = By.xpath("//a[@href='https://www.takealot.com/loadshedding-" +
                "rechargeable-led-light-bulb-cool-white-3-pack/PLID72547922']");
        getElement(driver, lights).click();

    }

    public static void addToCart() {
        By addToCart = By.name("Add to Cart");
        getElement(driver, addToCart).click();
    }

    public static void goToCart() {
        By goToCart = By.name("Go to Cart");
        getElement(driver, goToCart).click();
    }

    public static void proceedToCheckout() {
        By proceedToCheckout = By.name("Proceed to Checkout");
        getElement(driver, proceedToCheckout).click();
    }

    public static void enterEmailAddress() {
        By enterEmailAddress = By.name("email");
        getElement(driver, enterEmailAddress).click();
        getElement(driver, enterEmailAddress).sendKeys(TestData.EMAIL_ADDRESS);
    }

    public static void enterPassword() {
        By enterPassword = By.name("Password");
        getElement(driver, enterPassword).click();
        getElement(driver, enterPassword).sendKeys(TestData.PASSWORD);
    }
}