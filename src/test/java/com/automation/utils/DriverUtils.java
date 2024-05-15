package com.automation.utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.time.Duration;

public class DriverUtils {

    static AppiumDriver driver;

    public static void createDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", ConfigReader.getProperty("device.name"));
        capabilities.setCapability("platformName", ConfigReader.getProperty("platform.name"));
        capabilities.setCapability("appium:automationName", ConfigReader.getProperty("driver.name"));
        capabilities.setCapability("appium:app", ConfigReader.getProperty("app.path"));
        capabilities.setCapability("appium:appPackage", ConfigReader.getProperty("app.package"));
        capabilities.setCapability("appium:appActivity", ConfigReader.getProperty("app.activity"));

        driver = new AppiumDriver(capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public static AppiumDriver getDriver() {
        return driver;
    }


}
