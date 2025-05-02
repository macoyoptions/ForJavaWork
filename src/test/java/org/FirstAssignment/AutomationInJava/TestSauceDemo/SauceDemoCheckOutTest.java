package org.FirstAssignment.AutomationInJava.TestSauceDemo;

import org.FirstAssigment.AutomationInJava.SauceDemoProject.Pages.SauceDemoPage;
import org.FirstAssigment.AutomationInJava.TestBase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SauceDemoCheckOutTest {

    WebDriver driver;


    @Test
    public void testSauceDemoCheckOut(){
        //test steps
        driver = TestBase.setUp();
        driver.getTitle();
        System.out.println("Page tittle is:" + driver.getTitle());

        SauceDemoPage sauceDemoPage = new SauceDemoPage(driver);
        sauceDemoPage.inputUsername("standard_user");
        sauceDemoPage.inputPassword("secret_sauce");
        sauceDemoPage.login();
        sauceDemoPage.ClickCart();
        sauceDemoPage.ClickCheckOut();
        sauceDemoPage.InputFirstName("Ademoye");
        sauceDemoPage.InputLastName("Balogun");
        sauceDemoPage.InputPostalCode("1234");
        sauceDemoPage.ClickContinue();
        sauceDemoPage.ClickFinish();
        sauceDemoPage.SuccessOrderText();






    }
}
