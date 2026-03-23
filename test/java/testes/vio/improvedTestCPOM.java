package testes.vio;

import jdk.jfr.Description;
import org.example.DriverManeger.driverManage;
import org.example.page.pom.vio.Loginpage;
import org.example.util.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.sql.DriverManager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static org.example.DriverManeger.driverManage.driver;

public class improvedTestCPOM {
 //private Logger logger= LogManager.getLogger(improvedTestCPOM.class);
    Logger logger=LogManager.getLogger(improvedTestCPOM.class);
    @Description("negativetestcase")
    @Test
    public void negativeTestcase(){
        driverManage.BrovserSelector();
        logger.info("browser startyed");


        driver.get(PropertyReader.readKey("URL"));
        logger.error("urlfailledd sgg");
        Loginpage loginpage=new Loginpage(driver);
        loginpage.loginCorrectVIO(PropertyReader.readKey("user"),PropertyReader.readKey("pass"));

        driverManage.Driverquit();

    }
}

