package com.nopcommerce.demo.pages;

;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


/**
 * LoginPage - Email, password, Login Button and "Welcome, Please Sign In!" text Locators
 * and create appropriate methods for it.
 */

public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailField;

    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordField;

    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;

    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement incorrectCredential;

    public String verifyWelcomePLeaseSignInMessage(){
        return getTextFromElement(welcomeText);
    }

    public void enterEmailID(String emailId){
        sendTextToElement(emailField, emailId);
    }

    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }

    public String loginWithIncorrectCredentials(){
        return getTextFromElement(incorrectCredential);

    }







}
