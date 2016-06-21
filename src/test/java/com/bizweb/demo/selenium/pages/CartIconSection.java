package com.bizweb.demo.selenium.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

/**
 * Created by an on 20/06/2016.
 */
public class CartIconSection extends PageObject{

    @FindBy(xpath = "//a[@class='cart-icon']")
    private WebElement cartIcon;

    public String getCartString() {
        return cartIcon.getText();
    }

    public int getCartQuantity() {
        return Integer.parseInt(cartIcon.getText().split("\\s+")[0]);
    }
}
