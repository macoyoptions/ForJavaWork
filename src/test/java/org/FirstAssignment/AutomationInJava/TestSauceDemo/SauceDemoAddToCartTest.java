package org.FirstAssignment.AutomationInJava.TestSauceDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.FirstAssigment.AutomationInJava.SauceDemoProject.Pages.SauceDemoPage;
import org.FirstAssigment.AutomationInJava.TestBase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SauceDemoAddToCartTest extends TestBase {
    ExtentReports extent;
    ExtentTest test;

    @BeforeSuite
    public void setReport() {
        ExtentSparkReporter spark = new ExtentSparkReporter("test-output/extent-report.html");
        extent = new ExtentReports();
        extent.attachReporter(spark);
        extent.setSystemInfo("OS", System.getProperty("os.name"));
    }

    @Test(priority = 1, groups = {"smoke", "regression"}, description = "add to cart")
    public void testSauceDemoAddToCart() throws InterruptedException {

        test = extent.createTest("testSauceDemoAddtoCart");
        test.info("add to cart test started");

        //test steps
        TestBase testBase = new TestBase();
        testBase.setUp("firefox");
//        System.out.println("Page tittle is:" + driver.getTitle());
        SauceDemoPage sauceDemoPage = new SauceDemoPage();
        sauceDemoPage.inputUsername("standard_user");
        sauceDemoPage.inputPassword("secret_sauce");
        sauceDemoPage.clicklogin();
        logger.info("login button clicked");
        sauceDemoPage.GetConfirmLoginText();
        Thread.sleep(5000);
        sauceDemoPage.clickAddToCartButton();
        Thread.sleep(5000);
        sauceDemoPage.getPriceOfBackpack();
        logger.info("Price of backpack is: " + sauceDemoPage.getPriceOfBackpack());
        test.pass("Test passed");
        extent.flush();

        Thread.sleep(5000);
        sauceDemoPage.clickAddBikeLightButton();
        Thread.sleep(5000);
        test.pass("Test passed");
        extent.flush();
        sauceDemoPage.clickAddTShirtButton();
        Thread.sleep(5000);
        sauceDemoPage.ClickCart();
        Thread.sleep(5000);
    }
}
