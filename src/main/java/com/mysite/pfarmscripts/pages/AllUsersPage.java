package com.mysite.pfarmscripts.pages;

import com.mysite.pfarmscripts.resources.UserParty;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.*;

/**
 * Created by Val on 8/4/2016.
 */

public class AllUsersPage {
    private WebDriver driver;
    private static UserParty userParty;

    public AllUsersPage(WebDriver driv) {
        driver = driv;
        userParty = new UserParty(driver);
    }

    public void clickAllUsers() {
        List<WebElement> userList = getUserList();

        for (WebElement userLink : userList){
            // click user link to open that user's party
            userLink.click();

            // click all their stuffs
            userParty.clickAllParty();
        }

    }

    private List<WebElement> getUserList() {
        WebElement userListRootElement = driver.findElement(By.xpath("//*[@id=\"multiuser\"]/ul"));
        List<WebElement> userListClickable = userListRootElement.findElements(By.tagName("li"));
        return userListClickable;
    }
}
