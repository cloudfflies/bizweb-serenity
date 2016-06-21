package com.bizweb.demo.selenium.stepdefinitions;

import com.bizweb.demo.selenium.steps.ClearStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

/**
 * Created by an on 21/06/2016.
 */
public class ClearDefinitions {
    @Steps
    ClearStep clearStep;

    @Given("Prepare browser")
    public void clearBrowser() {
        clearStep.clearBrowser();
    }

}
