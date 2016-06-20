package com.bizweb.demo.selenium.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

/**
 * Created by an on 20/06/2016.
 */
@DefaultUrl("https://shopthoitranghn.bizwebvietnam.net/collections/all")
public class CollectionsPage extends PageObject{

    public CollectionsPage(WebDriver driver) {

        super(driver);
    }

    public ProductListGridSection getProductListGridSection() {
        return new ProductListGridSection();
    }
}
