package com.bizweb.demo.selenium.steps;

import com.bizweb.demo.selenium.pages.SignUpPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

/**
 * Created by an on 20/06/2016.
 */
public class LoginSteps {

    SignUpPage signUpPage;

    @Step
    public void openSignUpPage() {
        signUpPage.open();
    }

    @Step
    public void fillFirstName(String firstName) {
        signUpPage.fillFirstName(firstName);
    }

    @Step
    public void fillLastName(String lastName) {
        signUpPage.fillLastName(lastName);
    }

    @Step
    public void fillEmail(String email) {
        signUpPage.fillEmail(email);
    }

    @Step
    public void fillPassword(String password) {
        signUpPage.fillPassword(password);
    }

    @Step
    public void clickSignUpButton() {
        signUpPage.clickSignUpButton();
    }

    @Step
    public void verifyIsError(Boolean isError) {
        Assert.assertEquals(isError, signUpPage.isError());
    }
}
