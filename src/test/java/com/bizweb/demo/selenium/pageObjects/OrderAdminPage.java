package com.bizweb.demo.selenium.pageobjects;

import com.bizweb.demo.selenium.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.List;

/**
 * Created by an on 13/06/2016.
 */
public class OrderAdminPage extends PageFactory{
//    private WebDriver driver;
//
//    private String pageTitleContain = "";
//    private String merchantDomain;

    @FindAll(@FindBy(xpath = "//a[@href='/admin/orders' and @class='btn btn-default']"))
    private List<WebElement> cancelOrder;

    public OrderAdminPage() throws Exception {
        PageFactory.initElements(new AjaxElementLocatorFactory(DriverFactory.getDriver(), 20), this);
    }

    public List<WebElement> getCancelOrder() {
        return cancelOrder;
    }
}
