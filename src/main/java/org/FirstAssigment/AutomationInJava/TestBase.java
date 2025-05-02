package org.FirstAssigment.SauceDemoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver.Navigation;

import java.time.Duration;

public class TestBase {

    protected static WebDriver driver;

    public static WebDriver setUp(){
        //Set the path to your local ChromeDriver
        System.setProperty("webdriver.chrome.driver", "src/main/Drivers/Chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        return driver;

    }
}
