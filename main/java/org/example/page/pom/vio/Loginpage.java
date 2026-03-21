package org.example.page.pom.vio;

import org.example.util.waithelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {

    WebDriver driver;

    public Loginpage(WebDriver driver) {
        this.driver = driver;
    }

    private By UserLoc = By.xpath("//input[@id=\"login-username\"]");
    private By PassLoc = By.xpath("//input[@id=\"login-password\"]");
    private By submit = By.xpath("//button[@type=\"submit\" and @data-qa=\"sibequkica\"]");


    public Void loginCorrectVIO(String User, String pass) {
        driver.findElement(UserLoc).sendKeys(User);
        driver.findElement(PassLoc).sendKeys(pass);
        waithelper.checkVisibility(driver, submit, 10);
        driver.findElement(submit).click();

        return null;
    }

}

//    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(27));
//        driver.get("https://app.vwo.com/");
//    //name
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"login-username\"]"))).sendKeys("meswfw9608@supermmw.online");
//    //password
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"login-password\"]"))).sendKeys("bqVki#5EhJtb-95");
//    //submit
//        driver.findElement(By.xpath("//button[@type=\"submit\" and @data-qa=\"sibequkica\"]")).click();











