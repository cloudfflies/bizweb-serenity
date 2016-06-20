package com.bizweb.demo.selenium.pages;

import com.bizweb.demo.selenium.model.product;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jruby.RubyProcess;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by an on 20/06/2016.
 */
public class ProductListGridSection extends PageObject {

    @FindBy(xpath = "//div[@class='product-list-grid']")
    private WebElement ListGridSection;

    @FindBy(xpath = "//div[@class='product-carousel']")
    private List<WebElement> products;

//    public ProductListGridSection(WebDriver driver) {
//        super(driver);
//    }

    public List<product> getProductsList() {
        System.out.println("dday la size");
//        System.out.println(products.size());
        System.out.println(findAll(By.xpath("//div[@class='product-carousel']")).size());
        return findAll(By.xpath("//div[@class='product-carousel']"))
                .stream()
                .map(ProductListGridSection::convertToProduct)
                .collect(Collectors.toList());
    }

    public Optional<product> getProductFor(String productName) {
        return getProductsList()
                .stream()
                .filter(item -> item.getName().equals(productName))
                .findFirst();
    }

    private static product convertToProduct(WebElement productElement) {
        WebElement productImageElement = productElement.findElement(By.xpath("//a[@class='product-image']"));
        WebElement imgElement = productElement.findElement(By.xpath("//img[@class='img-responsive']"));
        WebElement productNameElement = productElement.findElement(By.xpath("//h3[@class='product-name']/a"));
        WebElement productPriceElement = productElement.findElement(By.xpath("//p[@class='product-price']"));
        WebElement addProductButton = productElement.findElement(By.xpath("//a[@class='product-atc']"));

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
