package org.FirstAssignment.AutomationInJava.TestSauceDemo;

import org.FirstAssigment.AutomationInJava.SauceDemoProject.Pages.SauceDemoPage;
import org.FirstAssigment.AutomationInJava.TestBase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SauceDemoAddToCartTest extends TestBase {

    WebDriver driver;


    @Test
    public void testSauceDemoAddToCart() throws InterruptedException {
        //test steps
        driver = TestBase.setUp();
        driver.getTitle();
        System.out.println("Page tittle is:" + driver.getTitle());

        SauceDemoPage sauceDemoPage = new SauceDemoPage(driver);
        sauceDemoPage.inputUsername("standard_user");
        sauceDemoPage.inputPassword("secret_sauce");
        sauceDemoPage.login();
        sauceDemoPage.GetConfirmLoginText();
        Thread.sleep(5000);
        sauceDemoPage.clickAddToCartButton();
        Thread.sleep(5000);
        sauceDemoPage.getPriceOfBackpack();
        sauceDemoPage.clickAddBikeLightButton();
        sauceDemoPage.clickAddTShirtButton();
        sauceDemoPage.ClickCart();

    }
}
