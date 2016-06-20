package com.bizweb.demo.selenium.model;

import org.openqa.selenium.WebElement;

/**
 * Created by an on 20/06/2016.
 */
public class product {
    private final String name;
    private final String link;
    private final String imgLink;
    private final String price;

    private WebElement imageClickArea;
    private WebElement nameClickArea;
    private WebElement buyButton;

    public product(String name, String link, String imgLink, String price, WebElement imageClickArea, WebElement nameClickArea, WebElement buyButton) {
        this.name = name;
        this.link = link;
        this.imgLink = imgLink;
        this.price = price;
        this.imageClickArea = imageClickArea;
        this.nameClickArea = nameClickArea;
        this.buyButton = buyButton;
    }

    public String getName() {
        return name;
    }

    public String getLink() {
        return link;
    }

    public String getUrlLink() {
        return imgLink;
    }

    public String getPrice() {
        return price;
    }

    public WebElement getImageClickArea() {
        return imageClickArea;
    }

    public WebElement getNameClickArea() {
        return nameClickArea;
    }

    public WebElement getBuyButton() {
        return buyButton;
    }



}
