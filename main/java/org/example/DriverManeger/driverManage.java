package org.example.DriverManeger;

import org.openqa.selenium.WebDriver;

public class driverManage {
    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        driverManage.driver = driver;
    }

    public  static WebDriver driver;

    public static void init(){


    }

}
