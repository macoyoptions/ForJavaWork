package org.FirstAssigment.AutomationInJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.apache.logging.log4j.Logger;

public class TestBase {

    public static WebDriver driver;
    public static Logger logger = LogManager.getLogger(TestBase.class);

    @Parameters({"browser"})
    public void setUp(String browserName) {
        logger.info("Setting up the test environment for browser: " + browserName);
//        initialize the WebDriver based on the specified browser
        if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        } else if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions options = new FirefoxOptions();
            driver = new FirefoxDriver(options);
        } else {
            throw new IllegalArgumentException("Browser not supported:" + browserName);
        }

        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @AfterMethod
    public void tearDown(){
//         close browser after the test
        if (driver != null){
            driver.quit();
            logger.info("Browser closed successfully.");
        }
    }
}










//public class TestBase {
//
//
//    public static WebDriver driver;
//    public static WebDriver setUp(String firefox){
//        //Set the path to your local ChromeDriver
////        System.setProperty("webdriver.chrome.driver", "src/main/Drivers/Chrome/chromedriver.exe");
////        WebDriver driver = new ChromeDriver();
//        System.setProperty("webdriver.gecko.driver", "src/main/Drivers/Firefox/geckodriver.exe");
//        // Set Firefox binary path (this is the missing part)
//        FirefoxOptions options = new FirefoxOptions();
//        options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
//        driver = new FirefoxDriver(options);
//        driver.manage().window().maximize();
//        driver.get("https://www.saucedemo.com/");
//        return driver;
//    }
//    @AfterTest
//    public void tearDown(){
//        //close browser after test
//        if (driver != null){
//            driver.quit();
//        }
//    }
//}


//https://www.selenium.dev/selenium/web/web-form.html
//driver.get("https://www.selenium.dev/selenium/web/web-form.html");

