package org.FirstAssignment.AutomationInJava.testSeleniumWebFormTest;

import org.FirstAssigment.AutomationInJava.SeleniumWebForm.Pages.SeleniumWebFormPage;
import org.FirstAssigment.AutomationInJava.TestBase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SeleniumWebFormTest extends TestBase {

    WebDriver driver;


    @Test
    public void testSeleniumform(){
        //test steps
        driver = TestBase.setUp();
        driver.getTitle();
        System.out.println("Page tittle is:" + driver.getTitle());
        SeleniumWebFormPage seleniumWebFormPage = new SeleniumWebFormPage(driver);

        seleniumWebFormPage.getTextBoxValue("welcome to selenium web form");
        seleniumWebFormPage.clickSubmitButton();
        System.out.println("Message:" + seleniumWebFormPage.getMessageText());
    }
}
