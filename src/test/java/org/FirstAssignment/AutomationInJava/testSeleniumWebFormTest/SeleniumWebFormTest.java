package org.FirstAssignment.AutomationInJava.testSeleniumWebFormTest;

import org.FirstAssigment.AutomationInJava.SeleniumWebForm.Pages.SeleniumWebFormPage;
import org.FirstAssigment.AutomationInJava.TestBase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SeleniumWebFormTest extends TestBase {


    @Test
    public void testSeleniumForm(){
        //test steps

        TestBase testBase = new TestBase();
        testBase.setUp("firefox");
        System.out.println("Page tittle is:" + driver.getTitle());
        SeleniumWebFormPage seleniumWebFormPage = new SeleniumWebFormPage(driver);

        seleniumWebFormPage.getTextBoxValue("welcome to selenium web form");
        seleniumWebFormPage.clickSubmitButton();
        testBase.driver.getTitle();
        System.out.println("Message:" + seleniumWebFormPage.getMessageText());
    }
}
