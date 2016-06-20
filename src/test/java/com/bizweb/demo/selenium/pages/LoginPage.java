package com.bizweb.demo.selenium.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by an on 20/06/2016.
 */
@DefaultUrl("https://shopthoitranghn.bizwebvietnam.net/account/login")
public class LoginPage extends PageObject {

    @FindBy(xpath = "//h3")
    private WebElement titleForm;

    @FindBy(xpath = "//p[@class='text-danger']")
    private List<WebElement> errorMessages;

    @FindBy(xpath = "//input[@name='email']")
    private WebElement emailTextbox;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordTextbox;

    @FindBy(xpath = "//button[@class='btn-cart']")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @WhenPageOpens
    public LoginPage waitUntilTitleFormVisible() {
        element(titleForm).waitUntilVisible();

        return this;
    }

    public LoginPage fillEmail(String email) {
        element(emailTextbox).clear();
        element(emailTextbox).type(email);

        return this;
    }
    public LoginPage fillPassword(String password) {
        element(passwordTextbox).clear();
        element(passwordTextbox).type(password);

        return this;
    }

    public void clickSignUpButton() {
        loginButton.click();
    }

    public int numberOfError() {
        return errorMessages.size();
    }


}
