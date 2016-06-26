package com.bizweb.demo.selenium.cucumbertestcases;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.Ignore;
import org.junit.runner.RunWith;

/**
 * Created by an on 20/06/2016.
 */
//@Ignore
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/LoginFeature"},
        glue = { "com.bizweb.demo.selenium.stepdefinitions" })
public class LoginTestsBW {
}
