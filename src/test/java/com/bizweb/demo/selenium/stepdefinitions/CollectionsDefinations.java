package com.bizweb.demo.selenium.stepdefinitions;

import com.bizweb.demo.selenium.steps.CollectionsSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

/**
 * Created by an on 20/06/2016.
 */
public class CollectionsDefinations {

    @Steps
    CollectionsSteps collectionsSteps;

    @Given("I want to shopping")
    public void iWantToShopping() {
        collectionsSteps.openCollectionsPage();
    }

    @When("I select product have name '(.*)'")
    public void iSelectProductName(String productName) {
        collectionsSteps.selectProductByName(productName);
    }

    @Then("I should see a dialog")
    public void iShouldSeeADialog() {
        collectionsSteps.verifyDialogDisplay();
    }
}
