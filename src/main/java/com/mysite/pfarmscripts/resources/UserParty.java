package com.mysite.pfarmscripts.resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.*;

/**
 * Created by Val on 8/4/2016.
 */

public class UserParty {
    private WebDriver driver;

    public UserParty(WebDriver driv) { driver = driv; }

    public void clickAllParty() {
        List<WebElement> actionDivs = driver.findElements(By.className("action"));

        for (WebElement aDiv : actionDivs) {
            // get berries if they exist
            WebElement berriesDiv = aDiv.findElement(By.className("berrybuttons"));

            // click liked berry if exists
            if (berriesDiv != null) {
                String likeBerry = berriesDiv.getAttribute("data-up");
                List<WebElement> berriesLinks = berriesDiv.findElements(By.tagName("a"));

                // click the right berry
                if (likeBerry.equals("sour")){
                    berriesLinks.get(1).click();
                } else if (likeBerry.equals("spicy")) {
                    berriesLinks.get(2).click();
                } else if (likeBerry.equals("dry")) {
                    berriesLinks.get(3).click();
                } else if (likeBerry.equals("sweet")) {
                    berriesLinks.get(4).click();
                } else if (likeBerry.equals("bitter")) {
                    berriesLinks.get(5).click();
                } else if (likeBerry.equals("any")) {
                    berriesLinks.get(1).click();
                }
            } else {
                // HOLD THE EGG!!
                aDiv.findElement(By.tagName("a")).click();
            }
        }
    }
}
