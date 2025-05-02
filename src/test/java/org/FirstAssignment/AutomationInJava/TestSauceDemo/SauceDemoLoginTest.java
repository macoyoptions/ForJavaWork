package org.FirstAssignment.AutomationInJava.TestSauceDemo;

import org.FirstAssigment.AutomationInJava.SauceDemoProject.Pages.SauceDemoPage;
import org.FirstAssigment.AutomationInJava.SeleniumWebForm.Pages.SeleniumWebFormPage;
import org.FirstAssigment.AutomationInJava.TestBase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SauceDemoLoginTest extends TestBase {

    WebDriver driver;


    @Test
    public void testSauceDemo(){
        //test steps
        driver = TestBase.setUp();
        driver.getTitle();
        System.out.println("Page tittle is:" + driver.getTitle());

        SauceDemoPage sauceDemoPage = new SauceDemoPage(driver);
        sauceDemoPage.inputUsername("standard_user");
        sauceDemoPage.inputPassword("secret_sauce");
        sauceDemoPage.login();
        sauceDemoPage.GetConfirmLoginText();
        sauceDemoPage.clickmenu();
        sauceDemoPage.logout();
    }

    @Test
    public void testSauceDemoLockedOutUserLogin() {
        //test steps
        driver = TestBase.setUp();
        driver.getTitle();

        SauceDemoPage sauceDemoPage = new SauceDemoPage(driver);
        sauceDemoPage.inputUsername("locked_out_user");
        sauceDemoPage.inputPassword("secret_sauce");
        sauceDemoPage.login();
        sauceDemoPage.getLockedOutUserText();

    }

    @Test
    public void testSauceDemoProblemUserLogin() {
        //test steps
        driver = TestBase.setUp();
        driver.getTitle();

        SauceDemoPage sauceDemoPage = new SauceDemoPage(driver);
        sauceDemoPage.inputUsername("problem_user");
        sauceDemoPage.inputPassword("secret_sauce");
        sauceDemoPage.login();
        sauceDemoPage.getProblemUserText();
    }

    @Test
    public void testSauceDemoPerformanceGlitchUserLogin() {
        //test steps
        driver = TestBase.setUp();
        driver.getTitle();

        SauceDemoPage sauceDemoPage = new SauceDemoPage(driver);
        sauceDemoPage.inputUsername("performance_glitch_user");
        sauceDemoPage.inputPassword("secret_sauce");
        sauceDemoPage.login();
        sauceDemoPage.getPerformanceGlitchUserText();
    }

}
