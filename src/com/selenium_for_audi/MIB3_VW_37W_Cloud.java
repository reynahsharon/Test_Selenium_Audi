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

class ServerResults_37W {
    int buildNo;

    WebDriver makeDriver() {
//        System.setProperty("webdriver.gecko.driver", "C:\\SeleniumDrivers\\GeckoDriver.exe");
        System.setProperty("webdriver.gecko.driver", "./src/resources/drivers/geckodriver.exe");
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setCapability("marionette", true);
        WebDriver driver = new FirefoxDriver(firefoxOptions);
        driver.get("http://gh-dsk0247:8080/login?from=%2F");
        WebElement username = driver.findElement(By.id("j_username"));
        WebElement password = driver.findElement(By.name("j_password"));
        WebElement login = driver.findElement(By.xpath("//*[@name='Submit']"));
        username.sendKeys("joe");
        password.sendKeys("jenkins");
        login.click();
        return driver;
    }

    // 1- FUNCTIONAL server_azure_CVT_VW_37W_Internal
    void openResult_server_azure_CVT_VW_37W_Internal_Functional(int bn, WebDriver driver) throws AWTException,
            InterruptedException {
        buildNo = bn;
        LinkedHashMap<String, Integer> langs = new LinkedHashMap<>();
        langs.put("CZC", 1);
        langs.put("ENG", 2);
        langs.put("ENU", 3);
        langs.put("FRF", 4);
        langs.put("GED", 5);
        langs.put("ITI", 6);
        langs.put("SPE", 7);

        for (Map.Entry entry : langs.entrySet()) {
            String url_server_azure_CVT_VW_37W_Internal_Functional;
            url_server_azure_CVT_VW_37W_Internal_Functional = "http://gh-dsk0247:8080/job/MIB3+%20VW-37W%20Cloud" +
                    "%20-%20Functional" +
                    "/" + bn + "/Language=ALL," +
                    "Server=server_azure_CVT_VW_37W_Internal," +
                    "label=master/artifact/logs/MIB3+VW/" + entry.getKey() + "/Functional_All_Tests" +
                    "/server_azure_CVT_VW_37W_Internal" +
                    "/report_email.html";
            System.out.println(url_server_azure_CVT_VW_37W_Internal_Functional);
            driver.get(url_server_azure_CVT_VW_37W_Internal_Functional);
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

    // 2- FUNCTIONAL server_mtldev_VW_37W_InternalPS
    void openResult_server_mtldev_VW_37W_InternalPS_Functional(int bn, WebDriver driver) throws AWTException,
            InterruptedException {
        buildNo = bn;
        LinkedHashMap<String, Integer> langs = new LinkedHashMap<>();
        langs.put("CZC", 1);
        langs.put("ENG", 2);
        langs.put("ENU", 3);
        langs.put("FRF", 4);
        langs.put("GED", 5);
        langs.put("ITI", 6);
        langs.put("SPE", 7);

        for (Map.Entry entry : langs.entrySet()) {
            String url_server_mtldev_VW_37W_InternalPS_Functional;
            url_server_mtldev_VW_37W_InternalPS_Functional = "http://gh-dsk0247:8080/job/MIB3+%20VW-37W%20" +
                    "Cloud%20-%20Functional" +
                    "/" + bn + "/Language=ALL," +
                    "Server=server_mtldev_VW_37W_InternalPS," +
                    "label=master/artifact/logs/MIB3+VW/" + entry.getKey() + "/Functional_All_Tests" +
                    "/server_mtldev_VW_37W_InternalPS" +
                    "/report_email.html";
            System.out.println(url_server_mtldev_VW_37W_InternalPS_Functional);
            driver.get(url_server_mtldev_VW_37W_InternalPS_Functional);
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
            System.out.println("Finished opening results for server: server_mtldev_VW_37W_InternalPS_Functional");
            System.out.println("language: " + entry.getKey() + " and build: " + bn);
        }
    }

    // 3- FUNCTIONAL server_mtldev_VW_37W_External
    void openResult_server_mtldev_VW_37W_External_Functional(int bn, WebDriver driver) throws AWTException,
            InterruptedException {
        buildNo = bn;
        LinkedHashMap<String, Integer> langs = new LinkedHashMap<>();
        langs.put("CZC", 1);
        langs.put("ENG", 2);
        langs.put("ENU", 3);
        langs.put("FRF", 4);
        langs.put("GED", 5);
        langs.put("ITI", 6);
        langs.put("SPE", 7);

        for (Map.Entry entry : langs.entrySet()) {
            String url_server_mtldev_VW_37W_External_Functional;
            url_server_mtldev_VW_37W_External_Functional = "http://gh-dsk0247:8080/job/MIB3+%20VW-37W%20Cloud%20" +
                    "-%20Functional" +
                    "/" + bn + "/Language=ALL," +
                    "Server=server_mtldev_VW_37W_External," +
                    "label=master/artifact/logs/MIB3+VW/" + entry.getKey() + "/Functional_All_Tests" +
                    "/server_mtldev_VW_37W_External" +
                    "/report_email.html";
            System.out.println(url_server_mtldev_VW_37W_External_Functional);
            driver.get(url_server_mtldev_VW_37W_External_Functional);
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

    // 4- REGRESSION server_azure_CVT_VW_37W_Internal
    void openResult_server_azure_CVT_VW_37W_Internal_Regression(int bn, WebDriver driver) throws AWTException,
            InterruptedException {
        buildNo = bn;
        LinkedHashMap<String, Integer> langs = new LinkedHashMap<>();
        langs.put("CZC", 1);
        langs.put("FRF", 2);
        langs.put("GED", 3);
        langs.put("ITI", 4);

        for (Map.Entry entry : langs.entrySet()) {
            String url_server_azure_CVT_VW_ICAS3_Int_Regression;
            url_server_azure_CVT_VW_ICAS3_Int_Regression = "http://gh-dsk0247:8080/job/MIB3+%20VW-37W%20Cloud%20-%20" +
                    "Regression/Language=ALL," +
                    "Server=server_azure_CVT_VW_37W_Internal," +
                    "label=master/" + bn + "/artifact/logs/MIB3+VW/" + entry.getKey() + "/Regression_All_Tests" +
                    "/server_azure_CVT_VW_37W_Internal" +
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

    // 5- REGRESSION server_mtldev_VW_37W_InternalPS
    void openResult_server_mtldev_VW_37W_InternalPS_Regression(int bn, WebDriver driver) throws AWTException,
            InterruptedException {
        buildNo = bn;
        LinkedHashMap<String, Integer> langs = new LinkedHashMap<>();
        langs.put("CZC", 1);
        langs.put("FRF", 2);
        langs.put("GED", 3);
        langs.put("ITI", 4);

        for (Map.Entry entry : langs.entrySet()) {
            String url_server_mtldev_VW_37W_InternalPS_Regression;
            url_server_mtldev_VW_37W_InternalPS_Regression = "http://gh-dsk0247:8080/job/MIB3+%20VW-37W%20Cloud%20" +
                    "-%20Regression/Language=ALL," +
                    "Server=server_mtldev_VW_37W_InternalPS," +
                    "label=master/" + bn + "/artifact/logs/MIB3+VW/" + entry.getKey() + "/Regression_All_Tests" +
                    "/server_mtldev_VW_37W_InternalPS" +
                    "/report_email.html";
            System.out.println(url_server_mtldev_VW_37W_InternalPS_Regression);
            driver.get(url_server_mtldev_VW_37W_InternalPS_Regression);
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

    // 6- REGRESSION server_mtldev_VW_37W_External
    void openResult_server_mtldev_VW_37W_External_Regression(int bn, WebDriver driver) throws AWTException,
            InterruptedException {
        buildNo = bn;
        LinkedHashMap<String, Integer> langs = new LinkedHashMap<>();
        langs.put("CZC", 1);
        langs.put("FRF", 2);
        langs.put("GED", 3);
        langs.put("ITI", 4);

        for (Map.Entry entry : langs.entrySet()) {
            String url_server_mtldev_VW_37W_External_Regression;
            url_server_mtldev_VW_37W_External_Regression = "http://gh-dsk0247:8080/job/MIB3+%20VW-37W%20Cloud%20" +
                    "-%20Regression/Language=ALL," +
                    "Server=server_mtldev_VW_37W_External," +
                    "label=master/" + bn + "/artifact/logs/MIB3+VW/" + entry.getKey() + "/Regression_All_Tests" +
                    "/server_mtldev_VW_37W_External" +
                    "/report_email.html";
            System.out.println(url_server_mtldev_VW_37W_External_Regression);
            driver.get(url_server_mtldev_VW_37W_External_Regression);
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

public class MIB3_VW_37W_Cloud {
    public static void main(String[] args) throws AWTException, InterruptedException {
        ServerResults_37W serverResults37W = new ServerResults_37W();
        WebDriver driver = serverResults37W.makeDriver();

        // Functional
        int newBuildNo = 529; // TODO: Update build numbers
        int oldBuildNo = 528;

        // Regression
//        int newBuildNo = 126; // TODO: Update build numbers
//        int oldBuildNo = 123;

        // 1- FUNCTIONAL server_azure_CVT_VW_37W_Internal
        serverResults37W.openResult_server_azure_CVT_VW_37W_Internal_Functional(oldBuildNo, driver);
        WebDriver driver1 = serverResults37W.makeDriver();
        serverResults37W.openResult_server_azure_CVT_VW_37W_Internal_Functional(newBuildNo, driver1);

        // 2- FUNCTIONAL server_mtldev_VW_37W_InternalPS
//        serverResults37W.openResult_server_mtldev_VW_37W_InternalPS_Functional(oldBuildNo,driver);
//        WebDriver driver1 = serverResults37W.makeDriver();
//        serverResults37W.openResult_server_mtldev_VW_37W_InternalPS_Functional(newBuildNo,driver1);

        // 3- FUNCTIONAL server_mtldev_VW_37W_External
//        serverResults37W.openResult_server_mtldev_VW_37W_External_Functional(oldBuildNo, driver);
//        WebDriver driver1 = serverResults37W.makeDriver();
//        serverResults37W.openResult_server_mtldev_VW_37W_External_Functional(newBuildNo, driver1);

        // 4- REGRESSION server_azure_CVT_VW_37W_Internal
//        serverResults37W.openResult_server_azure_CVT_VW_37W_Internal_Regression(oldBuildNo, driver);
//        WebDriver driver1 = serverResults37W.makeDriver();
//        serverResults37W.openResult_server_azure_CVT_VW_37W_Internal_Regression(newBuildNo, driver1);

        // 5- REGRESSION server_mtldev_VW_37W_InternalPS
//        serverResults37W.openResult_server_mtldev_VW_37W_InternalPS_Regression(oldBuildNo, driver);
//        WebDriver driver1 = serverResults37W.makeDriver();
//        serverResults37W.openResult_server_mtldev_VW_37W_InternalPS_Regression(newBuildNo, driver1);

        // 6- REGRESSION server_mtldev_VW_37W_External
//        serverResults37W.openResult_server_mtldev_VW_37W_External_Regression(oldBuildNo, driver);
//        WebDriver driver1 = serverResults37W.makeDriver();
//        serverResults37W.openResult_server_mtldev_VW_37W_External_Regression(newBuildNo, driver1);
    }
}
