package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RegisterStep {
    @When("I click on Register Link")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("I should able NavigateToRegisterPageSuccessfully")
    public void iShouldAbleNavigateToRegisterPageSuccessfully() {
        String expectedMessage = "Register";
        String actualMessage = new RegisterPage().verifyRegisterText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @And("I click on Register button")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }


    @And("I should verify the firstname error message {string}")
    public void iShouldVerifyTheFirstnameErrorMessage(String expectedFirstNameErrorMessage) {
        Assert.assertEquals(new RegisterPage().verifyFirstNameErrorMessage(), expectedFirstNameErrorMessage);

    }

    @And("I should verify the error lastname message {string}")
    public void iShouldVerifyTheErrorLastnameMessage(String expectedLastNameErrorMessage) {
        Assert.assertEquals(new RegisterPage().verifyLastNameErrorMessage(), expectedLastNameErrorMessage);

    }

    @And("I should verify the error email message {string}")
    public void iShouldVerifyTheErrorEmailMessage(String expectedEmailRequiredErrorMessage) {
        Assert.assertEquals(new RegisterPage().verifyEmailRequiredErrorMessage(), expectedEmailRequiredErrorMessage);
    }

    @And("I should verify the error password message {string}")
    public void iShouldVerifyTheErrorPasswordMessage(String expectedPasswordRequiredErrorMessage) {
        Assert.assertEquals(new RegisterPage().verifyPasswordRequiredErrorMessage(), expectedPasswordRequiredErrorMessage);

    }

    @Then("I should verify the error confirm password message {string}")
    public void iShouldVerifyTheErrorConfirmPasswordMessage(String expectedConfirmPasswordRequiredErrorMessage) {
        Assert.assertEquals(new RegisterPage().verifyConfirmPasswordRequiredErrorMessage(), expectedConfirmPasswordRequiredErrorMessage);

    }

    @And("I select gender {string}")
    public void iSelectGender(String gender) {
        new RegisterPage().selectFemaleGender();
    }


    @And("I enter firstname {string}")
    public void iEnterFirstname(String name) {
        new RegisterPage().enterFirstName(name);
    }

    @And("I enter lastname  {string}")
    public void iEnterLastname(String lastname) {
        new RegisterPage().enterLastName(lastname);
    }

    @And("I select day    {string}")
    public void iSelectDay(String day) {
        new RegisterPage().selectDay(day);
    }

    @And("I select month  {string}")
    public void iSelectMonth(String month) {
        new RegisterPage().selectMonth(month);
    }

    @And("I select year {string}")
    public void iSelectYear(String year) {
        new RegisterPage().selectYear(year);
    }

    @And("I enter Confirm Password {string}")
    public void iEnterConfirmPassword(String conformPassword) {
        new RegisterPage().enterConfirmPassword(conformPassword);
    }

    @And("I enter email")
    public void iEnterEmail(String email) {
        new RegisterPage().enterEmailId(email);
    }

    @And("I enter password")
    public void iEnterPassword(String password) {
        new RegisterPage().enterPassword(password);
    }


    @Then("I should able Register Successfully")
    public void iShouldAbleToRegisterSuccessfully() {
        String expectedMessage = "Your registration completed";
        String actualMessage = new RegisterPage().verifyRegistrationComplete();
        Assert.assertEquals(expectedMessage, actualMessage);



    }



}
