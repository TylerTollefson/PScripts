package com.mysite.pfarmscripts;

/**
 * Created by hrobohboy on 8/2/16.
 */
import com.mysite.pfarmscripts.pages.ShelterPage;
import com.mysite.pfarmscripts.pages.LoginPage;
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
    public static void Setup(){
        WebDriver driver = new ChromeDriver();
        lpage = new LoginPage(driver);
        shelterPage = new ShelterPage(driver);
    }

    @Test(priority = 1)
    public void ClickLogIn(){
        lpage.ClickLogin();
        lpage.EnterLoginCreds(User.UserName, User.Password);
    }

    @Test(priority = 2)
    public void FindEgg() throws Exception{
        Thread.sleep(5000);
        String toFind = PokeDex.Eevee;
        boolean putInParty = false;
        lpage.GoToShelter();
        WebElement egg = shelterPage.FindEgg(toFind, putInParty);
        while (egg == null){
            shelterPage.ReloadShelter();
            Thread.sleep(10000);
            egg = shelterPage.FindEgg(toFind, putInParty);
        }
    }
}
