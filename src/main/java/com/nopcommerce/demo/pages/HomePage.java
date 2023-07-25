package com.nopcommerce.demo.pages;


import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * HomePage - All Menu (Seven menu), LoginLink, registerLink, nopcommerce logo, My account link and LogOut link locatores
 * and create appropriate methods for it.
 */


public class HomePage extends Utility {
    @CacheLookup

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li")
    List<WebElement> listOfMenu;


    public void selectFromTopMenu(String topMenu){
        for (WebElement menu : listOfMenu) {
            if (menu.getText().contains(topMenu)) {
                clickOnElement(menu);
                break;
            }
        }
    }

    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement register;

    @FindBy(xpath = "//img[@alt='nopCommerce demo store']")
    WebElement nopcommerceLogo;

    @FindBy(xpath = "//a[contains(text(),'My account')]")
    WebElement myAccountLink;

    @FindBy(xpath = " //a[contains(text(),'Log out')]")
    WebElement logOutLink;


    public void clickOnLoginLink() {
        clickOnElement(loginLink);
    }

    public void clickOnLogoutLink() {
        clickOnElement(logOutLink);
    }

    public boolean logOutIsDisplayed() {
        return logOutLink.isDisplayed();
    }


    public boolean logInIsDisplayed() {
        return loginLink.isDisplayed();
    }

    public void clickOnRegisterLink() {
        clickOnElement(register);
    }








}
