package com.bizweb.demo.selenium.steps.scenariosteps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

//import static org.junit.Assert.assertThat;
import static org.assertj.core.api.Assertions.assertThat;

import com.bizweb.demo.selenium.pageobjects.LoginAdminPage;
/**
 * Created by an on 19/06/2016.
 */
public class LoginAdminPageSteps extends ScenarioSteps {

    LoginAdminPage loginAdminPage;

    @Step
    public void fillEmail(String email) {
        loginAdminPage.inputUsername(email);
    }

    @Step
    public void fillPassword(String password) {
        loginAdminPage.inputPassword(password);
    }

    @Step
    public void clickLoginButton() {
        loginAdminPage.clickLoginButton();
    }

    @Step
    public void titleShouldContain(String titleContain) {
        assertThat(loginAdminPage.getTitle()).contains(titleContain));
    }
}
