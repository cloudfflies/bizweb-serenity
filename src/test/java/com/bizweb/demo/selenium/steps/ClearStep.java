package com.bizweb.demo.selenium.steps;

import net.thucydides.core.annotations.Step;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

/**
 * Created by an on 21/06/2016.
 */
public class ClearStep {
    @Step
    public void clearBrowser() {
        getDriver().manage().deleteAllCookies();

    }
}
