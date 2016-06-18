package com.bizweb.demo.selenium.testcases;

import com.bizweb.demo.selenium.DriverFactory;
import org.openqa.selenium.WebDriver;

import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.junit.extensions.cpsuite.ClasspathSuite;
//import org.junit.extensions.cpsuite.ClasspathSuite.*;
//import static org.junit.extensions.cpsuite.SuiteType.*;


import com.bizweb.demo.selenium.pageObjects.LoginPage;

/**
 * Created by an on 12/06/2016.
 */
//@RunWith(ClasspathSuite.class)
//@SuiteTypes(RUN_WITH_CLASSES)
public class LoginBW extends DriverFactory {
    private WebDriver inputUsernameAndPasswordAndclickButton(String merchaintDomain, String usernameString, String passwordString) throws Exception {
        WebDriver driver = DriverFactory.getDriver();

//        loginPage loginPage = new loginPage(driver);
        driver.get(merchaintDomain + "/admin");
        LoginPage loginPage = new LoginPage();

        loginPage.
//                loadPage(merchaintDomain).
                inputUsername(usernameString).
                inputPassword(passwordString).
                clickLoginButton();
        System.out.println(driver.getTitle());
        return driver;
    }

    @Test
    public void caseDung() throws Exception {
        inputUsernameAndPasswordAndclickButton("https://anteo.bizwebvietnam.net", "cloudfflies@gmail.com", "123456");
    }

    @Test
    public void caseGanDung() throws Exception {
        inputUsernameAndPasswordAndclickButton("https://haicaynam.bizwebvietnam.net", "csdfkloudfflies@gmail.com", "123456");
    }
}
