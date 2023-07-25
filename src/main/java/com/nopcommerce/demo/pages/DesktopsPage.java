package com.nopcommerce.demo.pages;


import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DesktopsPage extends Utility {
    @CacheLookup
    @FindBy(xpath = " //a[@title='Show products in category Desktops'][normalize-space()='Desktops']")
    WebElement desktopLink;

    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement desktopText;



    public void clickOnDesktopLink() {
        clickOnElement(desktopLink);

    }

    public String verifyDesktopText() {

        return getTextFromElement(desktopText);
    }



}
