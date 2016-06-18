package com.bizweb.demo.selenium.config;

/**
 * Created by an on 09/06/2016.
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public interface DriverSetup {
    WebDriver getWebDriverObject (DesiredCapabilities desiredCapabilities);
    DesiredCapabilities getDesiredCapabilities();
}
