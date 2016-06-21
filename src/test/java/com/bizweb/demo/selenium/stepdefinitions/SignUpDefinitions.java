package com.bizweb.demo.selenium.stepdefinitions;

import com.bizweb.demo.selenium.steps.SignUpSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

/**
 * Created by an on 20/06/2016.
 */
public class SignUpDefinitions {

    @Steps
    SignUpSteps signUpSteps;

    @Given("I want to sign up an account")
    public void iWantToSignUp() throws Throwable {
        signUpSteps.openSignUpPage();
    }

    @When("I fill first name with '(.*)'")
    public void iFillFirstName(String firstName) throws Throwable {
        signUpSteps.fillFirstName(firstName);
    }

    @When("I fill last name with '(.*)'")
    public void iFillLastName(String lastName) throws Throwable {
        signUpSteps.fillLastName(lastName);
    }

    @When("I fill email with '(.*)'")
    public void iFillEmail(String email) throws Throwable {
        signUpSteps.fillEmail(email);
    }

    @When("I fill password with '(.*)'")
    public void iFillPassword(String password) throws Throwable {
        signUpSteps.fillPassword(password);
    }

    @When("I click SignUp button")
    public void iClickSignUpButton() throws Throwable {
        signUpSteps.clickSignUpButton();
    }

    @Then("I should see '(\\d+)' error message")
    public void numberOfErrorIs(int numberOfError) throws Throwable {
        signUpSteps.verifyIsError(numberOfError);
    }
}
