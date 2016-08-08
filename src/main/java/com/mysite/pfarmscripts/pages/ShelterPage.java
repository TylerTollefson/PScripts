package com.mysite.pfarmscripts.pages;

/**
 * Created by hrobohboy on 8/2/16.
 */
import com.mysite.pfarmscripts.resources.PokeDex;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.*;

public class ShelterPage {
    private List<WebElement> allPokes;
    private WebDriver driver;
    private WebElement foundEgg;
    private LoginPage loginPage;
    
    public ShelterPage(WebDriver driv){
        driver = driv;
        loginPage = new LoginPage(driver);
    }
    
    public void getEgg(String flute, String pokemon) throws Exception{
        Thread.sleep(5000);
        boolean putInParty = false;
        loginPage.GoToShelter();
        WebElement egg = FindEgg(pokemon, putInParty);
        while (egg == null){
            ReloadShelter(flute);
            Thread.sleep(10000);
            egg = FindEgg(pokemon, putInParty);
        }
    }
    
    public WebElement FindEgg(String toFind, boolean putInParty) {
        allPokes = driver.findElements(By.className("big"));
        for (WebElement ele : allPokes) {
            if (ele.getAttribute("src").contains(toFind)) {
                System.out.println("Found egg.");
                foundEgg = ele;
                foundEgg.click();
                if (putInParty){
                    driver.findElement(By.xpath("//*[@id=\"shelterarea\"]/div[54]/span/button[1]")).click();
                    driver.findElement(By.xpath("//*[@id=\"adoptloadbox\"]/div[2]/button[1]")).click();
                }

            }
        }
        return foundEgg;
    }
    public void ReloadShelter(String flute){
        if (flute == "white")
            driver.findElement(By.xpath("//*[@id=\"sheltercommands\"]/button[2]")).click();
        else if (flute == "black")
            driver.findElement(By.xpath("//*[@id=\"sheltercommands\"]/button[3]")).click();
        else
            driver.findElement(By.xpath("//*[@id=\"sheltercommands\"]/button[1]")).click();
    }
}
