package org.FirstAssigment.AutomationInJava.SauceDemoProject.Pages;

import org.FirstAssigment.AutomationInJava.SauceDemoProject.mappings.SauceDemoMappings;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import static org.FirstAssigment.AutomationInJava.TestBase.driver;

import java.time.Duration;

import static org.testng.Assert.*;


public class SauceDemoPage extends SauceDemoMappings{

    public SauceDemoPage(){
        super(driver);
    }

    public void inputUsername(String inputUsername) {
        // Code to set the value of the username
        username.sendKeys(inputUsername);
    }

    public void inputPassword(String inputPassword) {
        // Code to set the value for password
        password.sendKeys(inputPassword);
    }

    public void clicklogin() {
        // Code to click on login button
        login.click();WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(driver -> {
            String title = driver.getTitle();
            return title.equals("Swag Labs");
        });

    }
    public void GetConfirmLoginText() {
        // Code to get confirmation login text
        confirmLogin.getText();

    }

    public void clickmenu() {
        // Code to click the menu bar
        clickmenu.click();

    }

    public void logout() {
        // Code to click on logout button
        logoutbutton.click();
    }

    public void getLockedOutUserText() {
        // Code to click on logout button
        confirmlogoutuser.getText();
        assertTrue(confirmlogoutuser.isDisplayed(), "locked out user message");
        assertEquals(confirmlogoutuser.getText(), "Epic sadface: Sorry, this user has been locked out.");
        System.out.println("locked out user message:"+confirmlogoutuser.getText());
    }

    public void getProblemUserText() {
        // Code to click on logout button
        confirmproblemuser.getText();
        assertTrue(confirmproblemuser.isDisplayed(), "problem user message");
        assertEquals(confirmproblemuser.getText(), "Swag Labs");
        System.out.println("problem user message:"+confirmproblemuser.getText());
    }


    public void getPerformanceGlitchUserText() {
        // Code to click on logout button
        PerformanceGlitchUser.getText();
        assertTrue(PerformanceGlitchUser.isDisplayed(), "performance glitch user message");
        assertEquals(PerformanceGlitchUser.getText(), "Swag Labs");
        System.out.println("problem user message:"+PerformanceGlitchUser.getText());
    }

//    Add to cart

    public void clickAddToCartButton() {
        addToCartButton.click();
    }

    public String getPriceOfBackpack() {
        priceOfBackpack.getText();
        return null;
    }

    public void clickAddBikeLightButton() {
        addBikeLight.click();
    }

    public void clickAddTShirtButton() {
        addTShirt.click();
    }

    public void ClickCart() {
        ClickAddToCartButton.click();
    }

    public void ClickCheckOut() {
        clickCheckOutButton.click();
    }

    public void InputFirstName(String InputFirstName) {
        firstname.sendKeys(InputFirstName);
    }


    public void InputLastName(String InputLastName) {
        lastname.sendKeys(InputLastName);
    }

    public void InputPostalCode(String InputPostalCode) {
        postalcode.sendKeys(InputPostalCode);
    }

    public void ClickContinue() {
        ClickContinue.click();
    }

    public void ClickFinish() {
        ClickFinish.click();
    }

    public void SuccessOrderText() {
        // Code to click on logout button
        SuccessOrder.getText();
        assertTrue(SuccessOrder.isDisplayed(), "success message");
        assertEquals(SuccessOrder.getText(), "Thank you for your order!");
        System.out.println("success message:"+SuccessOrder.getText());
    }













}
