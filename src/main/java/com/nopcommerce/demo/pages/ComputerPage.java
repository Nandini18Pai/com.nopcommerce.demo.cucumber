package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility {
    @CacheLookup

    @FindBy(xpath = " //h1[normalize-space()='Computers']")
    WebElement computerText;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops'] ")
    WebElement desktopsLink;

    @FindBy(xpath = " //ul[@class='top-menu notmobile']//a[normalize-space()='Notebooks']")
    WebElement notebooksLink;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Software'] ")
    WebElement softwareLink;

    public String verifyComputerText(){
        return getTextFromElement(computerText);
    }



    public void selectFromSublist(String subList) {

        switch (subList) {
            case "Desktops":
                clickOnElement(desktopsLink);
                break;
            case "Notebooks":
                clickOnElement(notebooksLink);
                break;
            case "Software":
                clickOnElement(softwareLink);
                break;
            default:
                break;
        }
    }





}
