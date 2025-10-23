package org.FirstAssignment.AutomationInJava.TestSauceDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.FirstAssigment.AutomationInJava.SauceDemoProject.Pages.SauceDemoPage;
import org.FirstAssigment.AutomationInJava.TestBase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SauceDemoCheckOutTest extends TestBase {

    ExtentReports extent;
    ExtentTest test;

    @BeforeSuite
    public void setReport() {
        ExtentSparkReporter spark = new ExtentSparkReporter("test-output/extent-report.html");
        extent = new ExtentReports();
        extent.attachReporter(spark);
        extent.setSystemInfo("OS", System.getProperty("os.name"));
    }


    @Test
    public void testSauceDemoCheckOut() throws InterruptedException{
        //test steps
        test = extent.createTest("testSauceCheckOut");
        test.info("checkout test started");

        TestBase testBase = new TestBase();
        testBase.setUp("firefox");
//        driver.getTitle();
//        System.out.println("Page tittle is:" + driver.getTitle());
        SauceDemoPage sauceDemoPage = new SauceDemoPage();
        sauceDemoPage.inputUsername("standard_user");
        sauceDemoPage.inputPassword("secret_sauce");
        sauceDemoPage.clicklogin();
        logger.info("login button clicked");
        sauceDemoPage.ClickCart();
        sauceDemoPage.ClickCheckOut();
        test.pass("Test passed");
        extent.flush();
        sauceDemoPage.InputFirstName("Ademoye");
        sauceDemoPage.InputLastName("Balogun");
        sauceDemoPage.InputPostalCode("1234");
        sauceDemoPage.ClickContinue();
        sauceDemoPage.ClickFinish();
        Thread.sleep(1000);
        sauceDemoPage.SuccessOrderText();
//        logger.info("success message: " + sauceDemoPage.SuccessOrderText());
        test.pass("Test passed");
        extent.flush();
    }
}
