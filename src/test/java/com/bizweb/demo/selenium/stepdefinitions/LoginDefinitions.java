package com.bizweb.demo.selenium.stepdefinitions;

import com.bizweb.demo.selenium.steps.LoginSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

/**
 * Created by an on 20/06/2016.
 */
public class LoginDefinitions {

    @Steps
    LoginSteps loginSteps;

    @Given("I want to login to an account")
    public void iWantToLogin() throws Throwable {
        loginSteps.openLoginPage();
    }

    @When("I fill email to login form with '(.*)'")
    public void iFillEmail(String email) throws Throwable {
        loginSteps.fillEmail(email);
    }

    @When("I fill password to login form with '(.*)'")
    public void iFillPassword(String password) throws Throwable {
        loginSteps.fillPassword(password);
    }

    @When("I click Login button")
    public void iClickLoginButton() throws Throwable {
        loginSteps.clickLoginButton();
    }

    @Then("I should see in login form '(\\d+)' error messages")
    public void verifySuccess(int number) throws Throwable {
            loginSteps.verifyIsError(number);
    }
}
