package com.bizweb.demo.selenium.pageObjects;

/**
 * Created by an on 12/06/2016.
 */
import com.bizweb.demo.selenium.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;


public class LoginPage extends PageFactory{

    private WebDriver driver;

    private String pageTitle = "Đăng nhập quản trị hệ thống";

    @FindBy(xpath = "id('Email')")
    private WebElement username;

    @FindBy(xpath = "id('Password')")
    private  WebElement password;

    @FindBy(xpath = "id('RememberMe')")
    private WebElement rememberMe;

    @FindBy(xpath = "/a[contains(@class, 'login-forgotpassword')]")
    private WebElement forgotPassword;

    @FindBy(xpath = "//input[contains(@value, 'Đăng nhập')]")
    private WebElement loginButton;

//    public loginPage(WebDriver dr) {
//        driver = dr;
//
//        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
//    }

    public LoginPage() throws Exception {
        PageFactory.initElements(new AjaxElementLocatorFactory(DriverFactory.getDriver(), 20), this);
    }

    public LoginPage inputUsername(String usernameString) {
        username.sendKeys(usernameString);

        return this;
    }

    public LoginPage inputPassword(String passwordString) {
        password.sendKeys(passwordString);

        return this;
    }

    public LoginPage clickLoginButton() {
        loginButton.click();

        return this;
    }

    public LoginPage loginAllByOne(String usernameString, String passwordString) {
        inputUsername(usernameString).
                inputPassword(passwordString).
                clickLoginButton();

        return this;
    }
}
