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

public class SauceDemoLogOutTest {
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
    public void testSauceDemoLogout() throws InterruptedException {
        //test steps
        test = extent.createTest("testLogout");
        test.info("Logout test started");

        TestBase testBase = new TestBase();
        testBase.setUp("firefox");
        SauceDemoPage sauceDemoPage = new SauceDemoPage();
        sauceDemoPage.inputUsername("standard_user");
        Thread.sleep(1000);
        sauceDemoPage.inputPassword("secret_sauce");
        sauceDemoPage.clicklogin();
        Thread.sleep(1000);
        sauceDemoPage.clickmenu();
        Thread.sleep(1000);
        sauceDemoPage.logout();
        Thread.sleep(1000);
        test.pass("Test passed");
        extent.flush();
    }
}
