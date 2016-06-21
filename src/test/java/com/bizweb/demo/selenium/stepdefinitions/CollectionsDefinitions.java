package com.bizweb.demo.selenium.stepdefinitions;

import com.bizweb.demo.selenium.steps.ClearStep;
import com.bizweb.demo.selenium.steps.CollectionsSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

/**
 * Created by an on 20/06/2016.
 */
public class CollectionsDefinitions {

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

    @When("I double select product have name '(.*)'")
    public void iSelectProductNameTwice(String productName) {
        collectionsSteps.doubleSelectProductByName(productName);
    }

    @Then("I should see a dialog")
    public void iShouldSeeADialog() {
        collectionsSteps.verifyDialogDisplay();
    }

    @Then("I should see the dialog to close")
    public void iShouldSeeADialogClose() {
        collectionsSteps.verifyDialogClose();
    }

    @Then("Quantity of products in mini cart should be '(\\d+)'")
    public void productQuantityMiniCartShould(int quantity) {
        collectionsSteps.verifyCartQuantity(quantity);
    }
}
