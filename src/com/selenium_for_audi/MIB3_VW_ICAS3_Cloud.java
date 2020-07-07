package com.selenium_for_audi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

class ServerResults_ICAS3 {
    int buildNo;

    WebDriver makeDriver() {
        System.setProperty("webdriver.gecko.driver", "C:\\SeleniumDrivers\\GeckoDriver.exe");
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setCapability("marionette", true);
        WebDriver driver = new FirefoxDriver(firefoxOptions);
        driver.get("http://gh-dsk0247:8080/login?from=%2F");
        WebElement username = driver.findElement(By.id("j_username"));
        WebElement password = driver.findElement(By.name("j_password"));
        WebElement login = driver.findElement(By.xpath("//button[@id='yui-gen1-button']"));
        username.sendKeys("joe");
        password.sendKeys("jenkins");
        login.click();
        return driver;
    }

    // 1 - FUNCTIONAL server_azure_CVT_VW_ICAS3_Int
    void openResult_server_azure_CVT_VW_ICAS3_Int_Functional(int bn, WebDriver driver) throws AWTException,
            InterruptedException {
        buildNo = bn;
        LinkedHashMap<String, Integer> langs = new LinkedHashMap<>();
        langs.put("ENU", 1);
        langs.put("ENG", 2);
        langs.put("FRF", 3);
        langs.put("DUN", 4);
        langs.put("GED", 5);
        langs.put("ITI", 6);
        langs.put("PLP", 7);
        langs.put("PTP", 8);
        langs.put("SPE", 9);
        langs.put("SWS", 10);
        langs.put("CZC", 11);

        for (Map.Entry entry : langs.entrySet()) {
            String url_server_azure_CVT_VW_ICAS3_Int_Functional;
            url_server_azure_CVT_VW_ICAS3_Int_Functional = "http://gh-dsk0247:8080/job/MIB3+%20VW-ICAS3%20" +
                    "Cloud%20-%20Functional" +
                    "/" + bn + "/Language=ALL," +
                    "Server=server_azure_CVT_VW_ICAS3_Int," +
                    "label=master/artifact/logs/MIB3+VW/" + entry.getKey() + "/Functional_All_Tests" +
                    "/server_azure_CVT_VW_ICAS3_Int" +
                    "/report_email.html";
            System.out.println(url_server_azure_CVT_VW_ICAS3_Int_Functional);
            driver.get(url_server_azure_CVT_VW_ICAS3_Int_Functional);
            //   Thread.sleep(2000);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().window().maximize();
//To open a new tab and open new links in new tabs
            Robot r = new Robot();
            r.keyPress(KeyEvent.VK_CONTROL);
            r.keyPress(KeyEvent.VK_T);
            r.keyRelease(KeyEvent.VK_CONTROL);
            r.keyRelease(KeyEvent.VK_T);
            Thread.sleep(1000);
//To switch to the new tab
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get((Integer) entry.getValue()));
            System.out.println("Finished opening results for server: server_azure_CVT_VW_ICAS3_Int_Functional");
            System.out.println("language: " + entry.getKey() + " and build: " + bn);
        }
    }

    // 2 - FUNCTIONAL server_mtldev_VW_ICAS3_Ext
    void openResult_server_mtldev_VW_ICAS3_Ext_Functional(int bn, WebDriver driver) throws AWTException,
            InterruptedException {
        buildNo = bn;
        LinkedHashMap<String, Integer> langs = new LinkedHashMap<>();
        langs.put("ENU", 1);
        langs.put("ENG", 2);
        langs.put("FRF", 3);
        langs.put("DUN", 4);
        langs.put("GED", 5);
        langs.put("ITI", 6);
        langs.put("PLP", 7);
        langs.put("PTP", 8);
        langs.put("SPE", 9);
        langs.put("SWS", 10);
        langs.put("CZC", 11);
        for (Map.Entry entry : langs.entrySet()) {
            String url_server_mtldev_VW_ICAS3_Ext_Functional;
            url_server_mtldev_VW_ICAS3_Ext_Functional = "http://gh-dsk0247:8080/job/MIB3+%20VW-ICAS3%20" +
                    "Cloud%20-%20Functional" +
                    "/" + bn + "/Language=ALL," +
                    "Server=server_mtldev_VW_ICAS3_Ext," +
                    "label=master/artifact/logs/MIB3+VW/" + entry.getKey() + "/Functional_All_Tests" +
                    "/server_mtldev_VW_ICAS3_Ext" +
                    "/report_email.html";
            System.out.println(url_server_mtldev_VW_ICAS3_Ext_Functional);
            driver.get(url_server_mtldev_VW_ICAS3_Ext_Functional);
            //   Thread.sleep(2000);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().window().maximize();
//To open a new tab and open new links in new tabs
            Robot r = new Robot();
            r.keyPress(KeyEvent.VK_CONTROL);
            r.keyPress(KeyEvent.VK_T);
            r.keyRelease(KeyEvent.VK_CONTROL);
            r.keyRelease(KeyEvent.VK_T);
            Thread.sleep(1000);
//To switch to the new tab
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get((Integer) entry.getValue()));
            System.out.println("Finished opening results for server: server_mtldev_VW_ICAS3_Ext_Functional");
            System.out.println("language: " + entry.getKey() + " and build: " + bn);
        }
    }

    // 3 - FUNCTIONAL server_mtldev_VW_ICAS3_Int
    void openResult_server_mtldev_VW_ICAS3_Int_Functional(int bn, WebDriver driver) throws AWTException,
            InterruptedException {
        buildNo = bn;
        LinkedHashMap<String, Integer> langs = new LinkedHashMap<>();
        langs.put("ENU", 1);
        langs.put("ENG", 2);
        langs.put("FRF", 3);
        langs.put("DUN", 4);
        langs.put("GED", 5);
        langs.put("ITI", 6);
        langs.put("PLP", 7);
        langs.put("PTP", 8);
        langs.put("SPE", 9);
        langs.put("SWS", 10);
        langs.put("CZC", 11);
        for (Map.Entry entry : langs.entrySet()) {
            String url_server_mtldev_VW_ICAS3_Int_Functional;
            url_server_mtldev_VW_ICAS3_Int_Functional = "http://gh-dsk0247:8080/job/MIB3+%20VW-ICAS3%20" +
                    "Cloud%20-%20Functional" +
                    "/" + bn + "/Language=ALL," +
                    "Server=server_mtldev_VW_ICAS3_Int," +
                    "label=master/artifact/logs/MIB3+VW/" + entry.getKey() + "/Functional_All_Tests" +
                    "/server_mtldev_VW_ICAS3_Int" +
                    "/report_email.html";
            System.out.println(url_server_mtldev_VW_ICAS3_Int_Functional);
            driver.get(url_server_mtldev_VW_ICAS3_Int_Functional);
            //   Thread.sleep(2000);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().window().maximize();
//To open a new tab and open new links in new tabs
            Robot r = new Robot();
            r.keyPress(KeyEvent.VK_CONTROL);
            r.keyPress(KeyEvent.VK_T);
            r.keyRelease(KeyEvent.VK_CONTROL);
            r.keyRelease(KeyEvent.VK_T);
            Thread.sleep(1000);
//To switch to the new tab
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get((Integer) entry.getValue()));
            System.out.println("Finished opening results for server: server_mtldev_VW_ICAS3_Int_Functional");
            System.out.println("language: " + entry.getKey() + " and build: " + bn);
        }
    }

    // 4 - REGRESSION server_azure_CVT_VW_ICAS3_Int
    void openResult_server_azure_CVT_VW_ICAS3_Int_Regression(int bn, WebDriver driver) throws AWTException,
            InterruptedException {
        buildNo = bn;
        LinkedHashMap<String, Integer> langs = new LinkedHashMap<>();
        langs.put("CZC", 1);
        langs.put("FRF", 2);
        langs.put("GED", 3);
        langs.put("ITI", 4);
        langs.put("SPE", 5);
        langs.put("ENG", 6);

        for (Map.Entry entry : langs.entrySet()) {
            String url_server_azure_CVT_VW_ICAS3_Int_Regression;
            url_server_azure_CVT_VW_ICAS3_Int_Regression = "http://gh-dsk0247:8080/job/MIB3+%20VW-ICAS3%20" +
                    "Cloud%20-%20Regression/Language=ALL," +
                    "Server=server_mtldev_VW_ICAS3_Int," +
                    "label=master/" + bn + "/artifact/logs/MIB3+VW/" + entry.getKey() + "/Regression_All_Tests" +
                    "/server_mtldev_VW_ICAS3_Int" +
                    "/report_email.html";
            System.out.println(url_server_azure_CVT_VW_ICAS3_Int_Regression);
            driver.get(url_server_azure_CVT_VW_ICAS3_Int_Regression);
            //   Thread.sleep(2000);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().window().maximize();
//To open a new tab and open new links in new tabs
            Robot r = new Robot();
            r.keyPress(KeyEvent.VK_CONTROL);
            r.keyPress(KeyEvent.VK_T);
            r.keyRelease(KeyEvent.VK_CONTROL);
            r.keyRelease(KeyEvent.VK_T);
            Thread.sleep(1000);
//To switch to the new tab
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get((Integer) entry.getValue()));
            System.out.println("Finished opening results for server: server_azure_CVT_VW_ICAS3_Int_Regression");
            System.out.println("language: " + entry.getKey() + " and build: " + bn);
        }
    }

    // 5 - REGRESSION server_mtldev_VW_ICAS3_Ext
    void openResult_server_mtldev_VW_ICAS3_Ext_Regression(int bn, WebDriver driver) throws AWTException,
            InterruptedException {
        buildNo = bn;
        LinkedHashMap<String, Integer> langs = new LinkedHashMap<>();
        langs.put("CZC", 1);
        langs.put("FRF", 2);
        langs.put("GED", 3);
        langs.put("ITI", 4);
        langs.put("SPE", 5);
        langs.put("ENG", 6);

        for (Map.Entry entry : langs.entrySet()) {
            String url_server_mtldev_VW_ICAS3_Ext_Regression;
            url_server_mtldev_VW_ICAS3_Ext_Regression = "http://gh-dsk0247:8080/job/MIB3+%20VW-ICAS3%20Cloud%20-%20" +
                    "Regression/Language=ALL," +
                    "Server=server_mtldev_VW_ICAS3_Ext," +
                    "label=master/" + bn + "/artifact/logs/MIB3+VW/" + entry.getKey() + "/Regression_All_Tests" +
                    "/server_mtldev_VW_ICAS3_Ext" +
                    "/report_email.html";
            System.out.println(url_server_mtldev_VW_ICAS3_Ext_Regression);
            driver.get(url_server_mtldev_VW_ICAS3_Ext_Regression);
            //   Thread.sleep(2000);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().window().maximize();
//To open a new tab and open new links in new tabs
            Robot r = new Robot();
            r.keyPress(KeyEvent.VK_CONTROL);
            r.keyPress(KeyEvent.VK_T);
            r.keyRelease(KeyEvent.VK_CONTROL);
            r.keyRelease(KeyEvent.VK_T);
            Thread.sleep(1000);
//To switch to the new tab
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get((Integer) entry.getValue()));
            System.out.println("Finished opening results for server: server_mtldev_VW_ICAS3_Ext_Regression");
            System.out.println("language: " + entry.getKey() + " and build: " + bn);
        }
    }

    // 6 - REGRESSION server_mtldev_VW_ICAS3_Int
    void openResult_server_mtldev_VW_ICAS3_Int_Regression(int bn, WebDriver driver) throws AWTException,
            InterruptedException {
        buildNo = bn;
        LinkedHashMap<String, Integer> langs = new LinkedHashMap<>();
        langs.put("CZC", 1);
        langs.put("FRF", 2);
        langs.put("GED", 3);
        langs.put("ITI", 4);
        langs.put("SPE", 5);
        langs.put("ENG", 6);

        for (Map.Entry entry : langs.entrySet()) {
            String url_server_mtldev_VW_ICAS3_Int_Regression;
            url_server_mtldev_VW_ICAS3_Int_Regression = "http://gh-dsk0247:8080/job/MIB3+%20VW-ICAS3%20Cloud%20-%20" +
                    "Regression/Language=ALL," +
                    "Server=server_mtldev_VW_ICAS3_Int," +
                    "label=master/" + bn + "/artifact/logs/MIB3+VW/" + entry.getKey() + "/Regression_All_Tests" +
                    "/server_mtldev_VW_ICAS3_Int" +
                    "/report_email.html";
            System.out.println(url_server_mtldev_VW_ICAS3_Int_Regression);
            driver.get(url_server_mtldev_VW_ICAS3_Int_Regression);
            //   Thread.sleep(2000);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().window().maximize();
//To open a new tab and open new links in new tabs
            Robot r = new Robot();
            r.keyPress(KeyEvent.VK_CONTROL);
            r.keyPress(KeyEvent.VK_T);
            r.keyRelease(KeyEvent.VK_CONTROL);
            r.keyRelease(KeyEvent.VK_T);
            Thread.sleep(1000);
//To switch to the new tab
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get((Integer) entry.getValue()));
            System.out.println("Finished opening results for server: server_mtldev_VW_ICAS3_Int_Regression");
            System.out.println("language: " + entry.getKey() + " and build: " + bn);
        }
    }
}

public class MIB3_VW_ICAS3_Cloud {
    public static void main(String[] args) throws InterruptedException, AWTException {
        ServerResults_ICAS3 serverResultsICAS3 = new ServerResults_ICAS3();
        WebDriver driver = serverResultsICAS3.makeDriver();
        int newBuildNo =0;
        int oldBuildNo =0;
        // Functional
        newBuildNo = 574;
        oldBuildNo = 567;

        // Regression
//        newBuildNo = 274;
//        oldBuildNo = 269;

        // 1 - FUNCTIONAL server_azure_CVT_VW_ICAS3_Int
        serverResultsICAS3.openResult_server_azure_CVT_VW_ICAS3_Int_Functional(newBuildNo, driver);
        WebDriver driver1 = serverResultsICAS3.makeDriver();
        serverResultsICAS3.openResult_server_azure_CVT_VW_ICAS3_Int_Functional(oldBuildNo, driver1);

        // 2 - FUNCTIONAL server_mtldev_VW_ICAS3_Ext
//        serverResultsICAS3.openResult_server_mtldev_VW_ICAS3_Ext_Functional(newBuildNo,driver);
//        WebDriver driver1 = serverResultsICAS3.makeDriver();
//        serverResultsICAS3.openResult_server_mtldev_VW_ICAS3_Ext_Functional(oldBuildNo,driver1);

        // 3 - FUNCTIONAL server_mtldev_VW_ICAS3_Int
//        serverResultsICAS3.openResult_server_mtldev_VW_ICAS3_Int_Functional(newBuildNo, driver);
//        WebDriver driver1 = serverResultsICAS3.makeDriver();
//        serverResultsICAS3.openResult_server_mtldev_VW_ICAS3_Int_Functional(oldBuildNo, driver1);

        // 4 - REGRESSION server_azure_CVT_VW_ICAS3_Int
//        serverResultsICAS3.openResult_server_azure_CVT_VW_ICAS3_Int_Regression(newBuildNo, driver);
//        WebDriver driver1 = serverResultsICAS3.makeDriver();
//        serverResultsICAS3.openResult_server_azure_CVT_VW_ICAS3_Int_Regression(oldBuildNo, driver1);

        // 5 - REGRESSION server_mtldev_VW_ICAS3_Ext
//        serverResultsICAS3.openResult_server_mtldev_VW_ICAS3_Ext_Regression(newBuildNo, driver);
//        WebDriver driver1 = serverResultsICAS3.makeDriver();
//        serverResultsICAS3.openResult_server_mtldev_VW_ICAS3_Ext_Regression(oldBuildNo, driver1);

        // 6 - REGRESSION server_mtldev_VW_ICAS3_Int
//        serverResultsICAS3.openResult_server_mtldev_VW_ICAS3_Int_Regression(newBuildNo, driver);
//        WebDriver driver1 = serverResultsICAS3.makeDriver();
//        serverResultsICAS3.openResult_server_mtldev_VW_ICAS3_Int_Regression(oldBuildNo, driver1);
    }
}