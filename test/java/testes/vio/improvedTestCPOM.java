package testes.vio;

import jdk.jfr.Description;
import org.example.page.pom.vio.Loginpage;
import org.example.util.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class improvedTestCPOM {

    @Description("negativetestcase")
    @Test
    public void negativeTestcase(){
        WebDriver driver=new ChromeDriver();
        driver.get(PropertyReader.readKey("URL"));
        Loginpage loginpage=new Loginpage(driver);
        loginpage.loginCorrectVIO(PropertyReader.readKey("user"),PropertyReader.readKey("pass"));
        driver.quit();

    }
}

