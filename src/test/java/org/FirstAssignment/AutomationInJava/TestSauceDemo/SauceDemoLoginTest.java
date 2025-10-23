package org.FirstAssignment.AutomationInJava.TestSauceDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.FirstAssigment.AutomationInJava.SauceDemoProject.Pages.SauceDemoPage;
import org.FirstAssigment.AutomationInJava.TestBase;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SauceDemoLoginTest extends TestBase {
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
    public void TestSauceDemo() throws InterruptedException {
        //test steps
        test = extent.createTest("testSauceLogin");
        test.info("Standard login test started");
        TestBase testBase = new TestBase();
        testBase.setUp("firefox");
        SauceDemoPage sauceDemoPage = new SauceDemoPage();
        sauceDemoPage.inputUsername("standard_user");
        Thread.sleep(1000);
        sauceDemoPage.inputPassword("secret_sauce");
        sauceDemoPage.clicklogin();
        Thread.sleep(1000);
        sauceDemoPage.GetConfirmLoginText();
        Thread.sleep(1000);
        TestBase.driver.getTitle();
        Thread.sleep(1000);
        sauceDemoPage.clickmenu();
        Thread.sleep(1000);
        sauceDemoPage.logout();
        Thread.sleep(1000);
        test.pass("Test passed");
        extent.flush();
    }

    @Test
    public void testSauceDemoLockedOutUserLogin() throws InterruptedException {
        //test steps
        test = extent.createTest("testLockedOutUser");
        test.info("LockedOutUser login test started");
        TestBase testBase = new TestBase();
        testBase.setUp("firefox");
        SauceDemoPage sauceDemoPage = new SauceDemoPage();
        sauceDemoPage.inputUsername("locked_out_user");
        Thread.sleep(1000);
        sauceDemoPage.inputPassword("secret_sauce");
        sauceDemoPage.clicklogin();
        Thread.sleep(1000);
        sauceDemoPage.getLockedOutUserText();
        Thread.sleep(1000);
        test.pass("Test passed");
        extent.flush();
    }

    @Test
    public void testSauceDemoProblemUserLogin() throws InterruptedException {
        //test steps
        test = extent.createTest("testProblemUser");
        test.info("ProblemUser Login test started");
        TestBase testBase = new TestBase();
        testBase.setUp("firefox");
        SauceDemoPage sauceDemoPage = new SauceDemoPage();
        sauceDemoPage.inputUsername("problem_user");
        Thread.sleep(1000);
        sauceDemoPage.inputPassword("secret_sauce");
        sauceDemoPage.clicklogin();
        Thread.sleep(1000);
        sauceDemoPage.getProblemUserText();
        Thread.sleep(1000);
        test.pass("Test passed");
        extent.flush();
    }

    @Test
    public void testSauceDemoPerformanceGlitchUserLogin() throws InterruptedException {
        //test steps
        test = extent.createTest("testPerformanceGlitchUser");
        test.info("PerformanceGlitchUser login test started");
        TestBase testBase = new TestBase();
        testBase.setUp("firefox");
        SauceDemoPage sauceDemoPage = new SauceDemoPage();
        sauceDemoPage.inputUsername("performance_glitch_user");
        Thread.sleep(1000);
        sauceDemoPage.inputPassword("secret_sauce");
        Thread.sleep(2000);
        sauceDemoPage.clicklogin();
        Thread.sleep(5000);
        sauceDemoPage.getPerformanceGlitchUserText();
        Thread.sleep(1000);
        test.pass("Test passed");
        extent.flush();
    }

}
