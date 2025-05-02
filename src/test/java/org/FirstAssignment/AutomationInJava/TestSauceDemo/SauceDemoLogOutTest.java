package org.FirstAssignment.AutomationInJava.TestSauceDemo;

import org.FirstAssigment.AutomationInJava.SauceDemoProject.Pages.SauceDemoPage;
import org.FirstAssigment.AutomationInJava.TestBase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SauceDemoLogOutTest {

    WebDriver driver;


    @Test
    public void testSauceDemoLogout(){
        //test steps
        driver = TestBase.setUp();
        driver.getTitle();
        System.out.println("Page tittle is:" + driver.getTitle());

        SauceDemoPage sauceDemoPage = new SauceDemoPage(driver);
        sauceDemoPage.inputUsername("standard_user");
        sauceDemoPage.inputPassword("secret_sauce");
        sauceDemoPage.login();
        sauceDemoPage.clickmenu();
        sauceDemoPage.logout();
    }
}
