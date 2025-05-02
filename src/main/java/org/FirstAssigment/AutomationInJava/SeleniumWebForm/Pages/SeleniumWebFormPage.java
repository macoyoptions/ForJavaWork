package org.FirstAssigment.SauceDemoProject.Pages;

import io.opentelemetry.api.common.Value;
import org.FirstAssigment.SauceDemoProject.Mappings.SeleniumWebFormMappings;
import org.openqa.selenium.WebDriver;
import org.FirstAssigment.SauceDemoProject.Mappings.SeleniumWebFormMappings;
import org.openqa.selenium.support.PageFactory;

public class SeleniumWebFormPage {

    private SeleniumWebFormMappings mappings;

    public SeleniumWebFormPage(WebDriver driver) {
        this.mappings = new SeleniumWebFormMappings(driver);
        PageFactory.initElements(driver, this.mappings);

    }

    public void getTextBoxValue(String value){
        // Code to set the value of the textbox
        System.out.println("Setting text box value: " + value);
        mappings.textBox.sendKeys(value);

    }

    public void clickSubmitButton(){
        // Code to click the submit button
        System.out.println("Clicking submit button");
        mappings.submitButton.click();

    }


    public String getMessageText(){
        // Code to get the message text
        return mappings.message.getText();
    }

}
