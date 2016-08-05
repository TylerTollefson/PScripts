package com.mysite.pfarmscripts;

/**
 * Created by hrobohboy on 8/2/16.
 */
import com.mysite.pfarmscripts.pages.ShelterPage;
import com.mysite.pfarmscripts.pages.LoginPage;
import com.mysite.pfarmscripts.resources.User;
import com.mysite.pfarmscripts.resources.PokeDex;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EggFinder {
    private static LoginPage lpage;
    private static ShelterPage shelterPage;

    @BeforeClass
    public static void setup(){
        WebDriver driver = new ChromeDriver();
        lpage = new LoginPage(driver);
        shelterPage = new ShelterPage(driver);
    }

    @Test(priority = 1)
    public void clickLogIn(){
        lpage.clickLogin();
        lpage.enterLoginCreds(User.UserName, User.Password);
    }

    @Test(priority = 2)
    public void findEgg() throws Exception{
        Thread.sleep(5000);
        String toFind = PokeDex.Rhyhorn;
        boolean putInParty = false;
        lpage.goToShelter();
        WebElement egg = shelterPage.findEgg(toFind, putInParty);
        while (egg == null){
            shelterPage.reloadShelter();
            Thread.sleep(10000);
            egg = shelterPage.findEgg(toFind, putInParty);
        }
    }
}
