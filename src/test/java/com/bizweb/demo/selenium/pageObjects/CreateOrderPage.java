package com.bizweb.demo.selenium.pageObjects;

/**
 * Created by an on 12/06/2016.
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.List;

public class CreateOrderPage extends PageFactory{

    private WebDriver driver;

    private String merchantDomain;
    private String subURL = "/admin/orders/create";
    private String pageTitleContain = "Thêm mới đơn hàng";

    @FindBy(xpath = "id('product_search_input')")
    private WebElement productSearchInput;

    @FindBys({
            @FindBy(xpath = "id('next-popover--1')"),
            @FindBy(xpath = "//li[contains(@class,'resource-search-result')]"),
            @FindBy(xpath = "//a[@class= 'js-selectable-variant']")
    })
    private List<WebElement> variantResult;

    @FindBy(xpath = "//a[@class= 'btn btn-default btn-save btn-pending']")
    private WebElement paymentPendingConfirmer;

    public CreateOrderPage(WebDriver dr) {
        driver = dr;
        this.merchantDomain = merchantDomain;

        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
    }

    public CreateOrderPage searchVariant(String searchKey) {
        productSearchInput.sendKeys(searchKey);

        return this;
    }

    public CreateOrderPage selectVariant(int positionNumber) {
        variantResult.get(positionNumber).click();

        return this;
    }

    public CreateOrderPage createWithoutPayment() {
        paymentPendingConfirmer.click();

        return this;
    }
}
