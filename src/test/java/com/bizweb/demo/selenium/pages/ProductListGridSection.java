package com.bizweb.demo.selenium.pages;

import com.bizweb.demo.selenium.model.product;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jruby.RubyProcess;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by an on 20/06/2016.
 */
public class ProductListGridSection extends PageObject {

    @FindBy(xpath = "id('add_succes')")
    WebElementFacade successDialog;

    public boolean isDialogDisplay() {
        successDialog.waitUntilVisible();
        return successDialog.isPresent();
    }

    public boolean isNotDialogDisplay() {
        successDialog.waitUntilNotVisible();
        return successDialog.isCurrentlyVisible();
    }

    public List<product> getProductsList() {

        return findAll(By.cssSelector(".product-list-grid .product-carousel"))
                .stream()
                .map(ProductListGridSection::convertToProduct)
                .collect(Collectors.toList());
    }

    public Optional<product> getProductFor(String productName) {
        return getProductsList()
                .stream()
                .filter(item -> item.getName().contentEquals(productName))
                .findFirst();
    }

    private static product convertToProduct(WebElement productElement) {
        WebElement productImageElement = productElement.findElement(By.cssSelector("a.product-image"));
        WebElement imgElement = productElement.findElement(By.cssSelector("img.img-responsive"));
        WebElement productNameElement = productElement.findElement(By.cssSelector("h3.product-name"));
        WebElement productPriceElement = productElement.findElement(By.cssSelector("p.product-price"));
        WebElement addProductButton = productElement.findElement(By.cssSelector("a.product-atc"));
        System.out.println(productNameElement.getText());
        return new product(productNameElement.getText(),
                productNameElement.getAttribute("href"),
                imgElement.getAttribute("src"),
                productPriceElement.getText(),
                productImageElement,
                productNameElement,
                addProductButton
                );

    }
}
