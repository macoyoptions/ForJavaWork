package org.FirstAssigment.SauceDemoProject.Mappings;

import org.FirstAssigment.SauceDemoProject.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumWebFormMappings{

    WebDriver driver;

    public SeleniumWebFormMappings(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#my-text-id")
    public WebElement textBox;

    @FindBy(css = "body > main > div > form > div > div:nth-child(2) > button")
    public WebElement submitButton;

    @FindBy(id = "message")
    public WebElement message;
}
