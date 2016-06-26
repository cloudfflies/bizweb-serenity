package com.bizweb.demo.selenium.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;

import net.thucydides.core.annotations.At;

/**
 * Created by an on 20/06/2016.
 */
@At("https://shopthoitranghn.bizwebvietnam.net/")
public class HomePage extends PageObject{


    public HomePage(WebDriver driver) {
        super(driver);
    }
}
