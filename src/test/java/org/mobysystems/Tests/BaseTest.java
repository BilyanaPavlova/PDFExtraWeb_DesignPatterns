package org.mobysystems.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;

public class BaseTest {

    WebDriver driver;
    @BeforeClass
    public void configureDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver_win32\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);

    }

//    @AfterClass
//    public void closeBrowser(){
//        driver.close();
//    }
}
