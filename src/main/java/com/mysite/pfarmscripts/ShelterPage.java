package com.mysite.pfarmscripts;

/**
 * Created by hrobohboy on 8/2/16.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.*;

public class ShelterPage {
    List<WebElement> allPokes;
    private WebDriver driver;
    private WebElement foundEgg;
    public ShelterPage(WebDriver driv){
        driver = driv;
    }

    public WebElement findEgg(String toFind) {
        allPokes = driver.findElements(By.className("big"));
        for (WebElement ele : allPokes) {
            if (ele.getAttribute("src").contains(toFind)) {
                System.out.println("Found egg.");
                foundEgg = ele;
                foundEgg.click();
            }
        }
        return foundEgg;
    }

    public void reloadShelter(){
        driver.findElement(By.xpath("//*[@id=\"sheltercommands\"]/button[1]")).click();
    }
}
