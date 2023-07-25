package com.nopcommerce.demo.pages;


import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * RegisterPage - Register Text, male female radio, Firstname, lastname, Date of Birth drop downs, email,
 * Password, Confirm Password, Register Button, "First name is required.","Last name is required.",
 * "Email is required.","Password is required.", "Password is required." error message,
 * "Your registration completed" message, "CONTINUE" button
 * Locators and it's actions
 */

public class RegisterPage extends Utility {
    @CacheLookup

    @FindBy(xpath = " //h1[contains(text(),'Register')]")
    WebElement registerText;

    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement maleFemaleRadioBtn;

    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName;

    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastName;

    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement day;

    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement month;

    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement year;

    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;

    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordField;

    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPasswordField;

    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;

    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement firstNameErrorMessage;

    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lastNameErrorMessage;

    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailErrorMessage;

    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordErrorMessage;

    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement confirmPasswordErrorMessage;

    @FindBy(xpath = "//div[@class='result']")
    WebElement registrationCompletedMessage;

    @FindBy(xpath = "//div[@class='result']")
    WebElement yourRegistrationCompletedMessage;

    @FindBy(xpath = " //a[normalize-space()='Continue']")
    WebElement continueButtonAfterRegistration;

    public String verifyRegisterText() {
        return getTextFromElement(registerText);
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
    }

    public String verifyFirstNameErrorMessage() {
        return getTextFromElement(firstNameErrorMessage);
    }

    public String verifyLastNameErrorMessage() {
        return getTextFromElement(lastNameErrorMessage);
    }

    public String verifyEmailRequiredErrorMessage() {
        return getTextFromElement(emailErrorMessage);
    }

    public String verifyPasswordRequiredErrorMessage() {
        return getTextFromElement(passwordErrorMessage);
    }

    public String verifyConfirmPasswordRequiredErrorMessage() {
        return getTextFromElement(confirmPasswordErrorMessage);
    }

    public void selectFemaleGender() {
        clickOnElement(maleFemaleRadioBtn);
    }

    public void enterFirstName(String name) {
        sendTextToElement(firstName, name);
    }

    public void enterLastName(String surname) {
        sendTextToElement(lastName, surname);
    }

    public void enterEmailId(String emailId) {
        sendTextToElement(email, emailId);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void enterConfirmPassword(String password) {
        sendTextToElement(confirmPasswordField, password);
    }

    public void selectDay(String value) {
        selectByValueFromDropDown(day, value);
    }

    public void selectMonth(String Text) {
        selectByVisibleTextFromDropDown(month, Text);
    }

    public void selectYear(String value) {
        selectByValueFromDropDown(year, value);
    }

    public String verifyRegistrationComplete(){
        return getTextFromElement(yourRegistrationCompletedMessage);

    }



}
