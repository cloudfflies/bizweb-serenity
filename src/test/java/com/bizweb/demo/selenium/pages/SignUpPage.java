package com.bizweb.demo.selenium.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import net.thucydides.core.csv.converters.BooleanTypeConverter;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by an on 20/06/2016.
 */
@DefaultUrl("https://shopthoitranghn.bizwebvietnam.net/account/register")
public class SignUpPage extends PageObject {

    @FindBy(xpath = "//h3")
    private WebElement titleForm;

    @FindBy(xpath = "//p[@class='text-danger']")
    private List<WebElement> errorMessage;

    @FindBy(xpath = "//input[@name='firstName']")
    private WebElement firstNameTextbox;

    @FindBy(xpath = "//input[@name='lastName']")
    private WebElement lastNameTextbox;

    @FindBy(xpath = "//input[@name='email']")
    private WebElement emailTextbox;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordTextbox;

    @FindBy(xpath = "//button[@class='btn-cart']")
    private WebElement signupButton;

    @FindBy(xpath = "id('customer_register')//x:a")
    private WebElement loginLink;

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    @WhenPageOpens
    public SignUpPage waitUntilTitleFormVisible() {
        element(titleForm).waitUntilVisible();

        return this;
    }

    public SignUpPage fillFirstName(String firstName) {
        element(firstNameTextbox).clear();
        element(firstNameTextbox).type(firstName);

        return this;
    }
    
    public SignUpPage fillLastName(String lastName) {
        element(lastNameTextbox).clear();
        element(lastNameTextbox).type(lastName);

        return this;
    }

    public SignUpPage fillEmail(String email) {
        element(emailTextbox).clear();
        element(emailTextbox).type(email);

        return this;
    }
    public SignUpPage fillPassword(String password) {
        element(passwordTextbox).clear();
        element(passwordTextbox).type(password);

        return this;
    }

//    public HomePage clickSignUpButton() {
//        signupButton.click();
//
//        return new HomePage(getDriver());
//    }

    public void clickSignUpButton() {
        signupButton.click();
    }

    public int numberOfErrorMessage() {
        return errorMessage.size();
    }

    public LoginPage clickBackHomePage() {
        loginLink.click();


        return new LoginPage(getDriver());
    }
}
