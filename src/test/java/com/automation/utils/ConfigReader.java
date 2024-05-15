package com.automation.utils;

import java.io.FileReader;
import java.util.Properties;

public class ConfigReader {

    static Properties prop;

    public static void initProperties() {
        try {
            prop = new Properties();
            String platform = System.getProperty("platform");
            System.out.println("==============>"+platform);
            prop.load(new FileReader("src/test/resources/config/"+platform.toLowerCase()+"_config.properties"));
        } catch (Exception e) {

        }
    }

    public static String getProperty(String key) {
        return prop.getProperty(key);
    }

    public static void setProperty(String key, String value) {
        prop.setProperty(key, value);
    }
}
