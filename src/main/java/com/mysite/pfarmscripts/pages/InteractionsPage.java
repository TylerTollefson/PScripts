package com.mysite.pfarmscripts.pages;

/**
 * Created by Val on 8/4/2016.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InteractionsPage {
    private WebDriver driver;

    public InteractionsPage(WebDriver driv) { driver = driv; }

    public void openAllUsersIfExists() {
        WebDriverWait wait = new WebDriverWait(driver, 100);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"interactionlist\"]/h3[3]")));

        if (driver.findElements(By.xpath("//*[@id=\"interactionlist\"]/div[1]/p[2]/a")).size() > 0) {
            WebElement element = driver.findElement(By.xpath("//*[@id=\"interactionlist\"]/div[1]/p[2]/a"));
            element.click();
        }
    }
}
