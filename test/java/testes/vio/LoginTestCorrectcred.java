package testes.vio;

import jdk.jfr.Description;
import org.example.DriverManeger.driverManage;
import org.example.page.pom.vio.Loginpage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class LoginTestCorrectcred {
    @Description("verfy correct cred")
    @Test
    public void positivetest(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://app.vwo.com/");
        Loginpage loginpage=new Loginpage(driver);
        loginpage.loginCorrectVIO("meswfw9608@supermmw.online","bqVki#5EhJtb-95");

        driverManage.Driverquit();




    }


}
