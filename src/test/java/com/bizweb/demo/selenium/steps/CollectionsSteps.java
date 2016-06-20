package com.bizweb.demo.selenium.steps;

import com.bizweb.demo.selenium.model.product;
import com.bizweb.demo.selenium.pages.CollectionsPage;
import com.bizweb.demo.selenium.pages.ProductListGridSection;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;

import java.util.Optional;


/**
 * Created by an on 20/06/2016.
 */
public class CollectionsSteps {

    CollectionsPage collectionsPage;
    ProductListGridSection productListGridSection;

    @Step
    public void openCollectionsPage() {
        collectionsPage.open();
    }

    @Step
    public void selectProductByName(String productName) {
        Optional<product> productElement = productListGridSection.getProductFor(productName);
        if (productElement.isPresent()) {
            productElement.get().getBuyButton().click();
        }
    }

    @Step
    public void verifyDialogDisplay() {

    }

}
