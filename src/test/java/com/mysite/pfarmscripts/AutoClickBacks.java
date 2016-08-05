package com.mysite.pfarmscripts;

import com.mysite.pfarmscripts.pages.AllUsersPage;
import com.mysite.pfarmscripts.pages.InteractionsPage;
import com.mysite.pfarmscripts.pages.LoginPage;
import com.mysite.pfarmscripts.resources.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Val on 8/4/2016.
 */
public class AutoClickBacks {
    private static LoginPage lpage;
    private static InteractionsPage interactionsPage;
    private static AllUsersPage allUsersPage;

    @BeforeClass
    public static void setup(){
        WebDriver driver = new ChromeDriver();
        lpage = new LoginPage(driver);
        interactionsPage = new InteractionsPage(driver);
        allUsersPage = new AllUsersPage(driver);
    }

    @Test(priority = 1)
    public void clickLogIn(){
        lpage.clickLogin();
        lpage.enterLoginCreds(User.UserName, User.Password);
    }

    @Test(priority = 2)
    public void clickAllTheBacks() throws Exception {
        lpage.goToInteractions();
        interactionsPage.openAllUsersIfExists();
        allUsersPage.clickAllUsers();
    }

}
