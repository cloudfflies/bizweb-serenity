package com.bizweb.demo.selenium.steps;

import com.bizweb.demo.selenium.pages.HomePage;
import com.bizweb.demo.selenium.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

/**
 * Created by an on 20/06/2016.
 */
public class LoginSteps {

    LoginPage loginPage;
    HomePage homePage;

    @Step
    public void openLoginPage() {
        loginPage.open();
    }

    @Step
    public void fillEmail(String email) {
        loginPage.fillEmail(email);
    }

    @Step
    public void fillPassword(String password) {
        loginPage.fillPassword(password);
    }

    @Step
    public void clickLoginButton() {
        loginPage.clickSignUpButton();
    }

    @Step
    public void verifyIsError(int number) {
        Assert.assertEquals(number, loginPage.numberOfError());
    }

    @Step
    public void verifyRedirectHomePage() {
        homePage.compatibleWithUrl("gooog.le");
    }
}
