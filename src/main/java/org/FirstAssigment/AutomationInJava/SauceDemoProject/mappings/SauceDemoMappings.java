package org.FirstAssigment.AutomationInJava.SauceDemoProject.mappings;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoMappings {

    public SauceDemoMappings(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#user-name")
    public WebElement username;


    @FindBy(css = "#password")
    public WebElement password;

    @FindBy(id = "login-button")
    public WebElement login;

    @FindBy(css = "#header_container > div.primary_header > div.header_label > div")
    public WebElement confirmLogin;

    @FindBy(css = "#react-burger-menu-btn")
    public WebElement clickmenu;

    @FindBy(css = "#logout_sidebar_link")
    public WebElement logoutbutton;

    @FindBy(css = "#login_button_container > div > form > div.error-message-container.error > h3")
    public WebElement confirmlogoutuser;

    @FindBy(css = ".app_logo")
    public WebElement confirmproblemuser;

    @FindBy(css = ".app_logo")
    public WebElement PerformanceGlitchUser;

    @FindBy(css = "#add-to-cart-sauce-labs-backpack")
    public WebElement addToCartButton;

    @FindBy(css = "#inventory_container > div > div:nth-child(1) > div.inventory_item_description > div.pricebar > div")
    public WebElement priceOfBackpack;


    @FindBy(css = "#add-to-cart-sauce-labs-bike-light")
    public WebElement addBikeLight;


    @FindBy(css = "#add-to-cart-sauce-labs-bolt-t-shirt")
    public WebElement addTShirt;

    @FindBy(css = "#shopping_cart_container > a")
    public WebElement ClickAddToCartButton;

    @FindBy(name = "checkout")
    public WebElement clickCheckOutButton;

    @FindBy(id = "first-name")
    public WebElement firstname;

    @FindBy(id = "last-name")
    public WebElement lastname;

    @FindBy(id = "postal-code")
    public WebElement postalcode;

    @FindBy(name = "continue")
    public WebElement ClickContinue;

    @FindBy(id = "finish")
    public WebElement ClickFinish;

    @FindBy(css = "#checkout_complete_container > h2")
    public WebElement SuccessOrder;
}
