package com.mysite.pfarmscripts.resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ThreadGuard;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.*;

/**
 * Created by Val on 8/4/2016.
 */

public class UserParty {
    private WebDriver driver;
    private WebDriverWait wait;

    public UserParty(WebDriver driv) {
        driver = driv;
        wait = new WebDriverWait(driver, 100);
    }

    public void clickAllParty() throws InterruptedException {

        // loop this, getting divs each time to account for element removal/replacement on click
        for (int i = 0; i < 6; i++) {

            List<WebElement> partyDivs = getPartyDivs();

            for (WebElement pDiv : partyDivs) {
                // find action div for this party member
                WebElement aDiv = pDiv.findElement(By.className("action"));

                // if action div is not empty, click inside it
                if (aDiv.findElements(By.xpath("*")).size() > 0) {
                    // click inside action div
                    clickPartyMember(aDiv);

                    // force reload of partyDivs after waiting for refresh
                    Thread.sleep(5000);
                    break;
                }
            }
        }
    }

    private void clickPartyMember(WebElement actionDiv){
        // find berry div if it exists
        List<WebElement> berriesDiv = actionDiv.findElements(By.className("berrybuttons"));

        // click liked berry if exists
        if (berriesDiv.size() > 0) {
            // wait for berries to load if necessary
            wait.until(ExpectedConditions.visibilityOf(berriesDiv.get(0)));

            // find the "liked" berry type
            String likeBerry = berriesDiv.get(0).getAttribute("data-up");

            // find the list of all berry links
            List<WebElement> berriesLinks = berriesDiv.get(0).findElements(By.tagName("a"));

            // click the right berry
            if (likeBerry.equals("sour")){
                berriesLinks.get(0).click();
            } else if (likeBerry.equals("spicy")) {
                berriesLinks.get(1).click();
            } else if (likeBerry.equals("dry")) {
                berriesLinks.get(2).click();
            } else if (likeBerry.equals("sweet")) {
                berriesLinks.get(3).click();
            } else if (likeBerry.equals("bitter")) {
                berriesLinks.get(4).click();
            } else if (likeBerry.equals("any")) {
                berriesLinks.get(0).click();
            }
        } else {
            // HOLD THE EGG!!
            actionDiv.findElement(By.tagName("a")).click();
        }
    }

    private List<WebElement> getPartyDivs() {
        // wait for divs to show up
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("party")));

        // find all first-order child divs
        return driver.findElements(By.xpath("//*[@id=\"partybox\"]/div[2]/*"));
    }
}
