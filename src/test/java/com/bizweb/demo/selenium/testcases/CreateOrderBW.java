package com.bizweb.demo.selenium.testcases;

/**
 * Created by an on 12/06/2016.
 */

import com.bizweb.demo.selenium.DriverFactory;
import com.bizweb.demo.selenium.pageObjects.CreateOrderPage;
import com.bizweb.demo.selenium.pageObjects.LoginPage;
import com.bizweb.demo.selenium.pageObjects.OrderPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import org.testng.Assert;

public class CreateOrderBW extends DriverFactory{
    @Test
    private void createOneOrder() throws Exception {
        WebDriver driver = DriverFactory.getDriver();

        String merchantDomain = "https://anteo.bizwebvietnam.net";

        driver.get(merchantDomain + "/admin");

//        loginPage loginPage = new loginPage(driver);
        LoginPage loginPage = new LoginPage();
        loginPage.loginAllByOne("cloudfflies@gmail.com", "123456");

//        Tắt quảng cáo hihi
//        driver.findElement(By.className("fancybox-close")).click();

        driver.get(merchantDomain + "/admin/orders/create");
        CreateOrderPage createOrderPage = new CreateOrderPage(driver);
        createOrderPage
                .searchVariant("")
                .selectVariant(1)
                .createWithoutPayment();

        OrderPage orderPage = new OrderPage();


        new WebDriverWait(driver, 10)
                .until(ExpectedConditions
                        .invisibilityOfAllElements(orderPage.getCancelOrder()));

        Assert.assertTrue(orderPage.getCancelOrder().isEmpty());
    }
}
