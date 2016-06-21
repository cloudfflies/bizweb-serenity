package com.bizweb.demo.selenium.steps;

import com.bizweb.demo.selenium.model.product;
import com.bizweb.demo.selenium.pages.CartIconSection;
import com.bizweb.demo.selenium.pages.CollectionsPage;
import com.bizweb.demo.selenium.pages.ProductListGridSection;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.jruby.RubyProcess;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static org.assertj.core.api.Assertions.*;
import java.util.Optional;


/**
 * Created by an on 20/06/2016.
 */
public class CollectionsSteps {

    CollectionsPage collectionsPage;
    ProductListGridSection productListGridSection;
    CartIconSection cartIconSection;

    @Step
    public void openCollectionsPage() {
        collectionsPage.open();
    }

    @Step
    public void selectProductByName(String productName) {
        Optional<product> productElement = productListGridSection.getProductFor(productName);
        if (productElement.isPresent()) {
            WebElement buyButton = productElement.get().getBuyButton();
            buyButton.click();
        }
    }

    @Step
    public void doubleSelectProductByName(String productName) {
        Optional<product> productElement = productListGridSection.getProductFor(productName);
        if (productElement.isPresent()) {
            WebElement buyButton = productElement.get().getBuyButton();

//            Actions action = new Actions(getDriver());
////            action.doubleClick(buyButton).perform();
//            action.moveToElement(buyButton).doubleClick().build().perform();
            buyButton.click();
            try {
                Thread.sleep(10);                 //1000 milliseconds is one second.
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            buyButton.click();
             buyButton.click();
        }
    }

    @Step
    public void verifyDialogDisplay() {
        assertThat(productListGridSection.isDialogDisplay()).isTrue();
    }

    @Step
    public void verifyCartQuantity(int quantity) {
        assertThat(cartIconSection.getCartQuantity()).isEqualTo(quantity);
    }

    @Step
    public void verifyDialogClose() {
        assertThat(productListGridSection.isNotDialogDisplay()).isFalse();
    }

}
