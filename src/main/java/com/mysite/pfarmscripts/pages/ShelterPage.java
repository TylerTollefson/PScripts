package com.mysite.pfarmscripts.pages;

/**
 * Created by hrobohboy on 8/2/16.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.*;

public class ShelterPage {
    private List<WebElement> allPokes;
    private WebDriver driver;
    private WebElement foundEgg;
    public ShelterPage(WebDriver driv){
        driver = driv;
    }

    public WebElement findEgg(String toFind, boolean putInParty) {
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
    public void reloadShelter(){
        driver.findElement(By.xpath("//*[@id=\"sheltercommands\"]/button[1]")).click();
    }
}
