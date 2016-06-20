package com.bizweb.demo.selenium.cucumbertestcases;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Created by an on 19/06/2016.
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/login_to_admin.feature",
            glue = {"com.bizweb.demo.selenium.steps.LoginAdminSteps"})
public class TryCucumberLoginBW {
}
