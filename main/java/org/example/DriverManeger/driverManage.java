package org.example.DriverManeger;

import org.example.util.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class driverManage {
    public static WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public static WebDriver driver;

     public static void BrovserSelector()
    {
        switch (PropertyReader.readKey("browser"))
        {
            case "chrome":
                driver=new ChromeDriver();
             break;
            case "edge":
                 driver=new EdgeDriver();
                 break;

            default: System.out.println("not valid output");

        }
    }
    public static void Driverquit()
        {
            if(getDriver()!=null)
            {
                driver.quit();
                driver=null;
            }
        }


}
