package com.bizweb.demo.selenium;

/**
 * Created by an on 06/06/2016.
 */
import org.junit.runners.AllTests;
import org.openqa.selenium.WebDriver;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeSuite;

import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.After;
import org.junit.runner.RunWith;
import org.junit.extensions.cpsuite.ClasspathSuite;
import org.junit.extensions.cpsuite.ClasspathSuite.*;
import static org.junit.extensions.cpsuite.SuiteType.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class DriverFactory {
    private static List<WebDriverThread> webDriverThreadPool = Collections.synchronizedList(new ArrayList<WebDriverThread>());
    private static ThreadLocal<WebDriverThread> driverThread;

//    @BeforeSuite
    @BeforeClass
    public static void instantiateDriverObject() {
        System.out.println("tao pool");
        driverThread = new ThreadLocal<WebDriverThread>() {
            @Override
            protected WebDriverThread initialValue() {
                WebDriverThread webDriverThread = new WebDriverThread();
                webDriverThreadPool.add(webDriverThread);
                return webDriverThread;
            }
        };
    }

    public static WebDriver getDriver() throws Exception {
        return driverThread.get().getDriver();
    }

//    @AfterMethod
//    public static void quitDriver() throws Exception {
//        driverThread.get().quitDriver();
//    }
    @After
    public void tearDown() throws Exception {
        System.out.println("DDaay laf clearCoo");
        getDriver().manage().deleteAllCookies();
    }

//    @AfterSuite
    @AfterClass
    public static void closeDriverObjects() {
        for (WebDriverThread webDriverThread: webDriverThreadPool) {
            webDriverThread.quitDriver();
        }
    }
}
