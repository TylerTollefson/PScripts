package com.mysite.pfarmscripts.pages;

/**
 * Created by hrobohboy on 8/2/16.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driv){
        driver = driv;
        driver.get("https://pokefarm.com/");
        driver.manage().window().maximize();
    }

    public void ClickLogin(){
        driver.findElement(By.id("quicklogin")).click();
    }

    public void EnterLoginCreds(String uname, String upass){
        WebElement element = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/form/p[1]/label/input"));
        element.clear();
        element.sendKeys(uname);
        element = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/form/p[2]/label/input"));
        element.clear();
        element.sendKeys(upass);
        element = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/form/p[4]/input"));
        element.click();
    }

    public void GoToShelter() throws Exception{
        WebDriverWait wait = new WebDriverWait(driver, 100);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"navbtns\"]/li[4]/a")));
        WebElement element = driver.findElement(By.xpath("//*[@id=\"navbtns\"]/li[4]/a"));
        element.click();
    }

}
