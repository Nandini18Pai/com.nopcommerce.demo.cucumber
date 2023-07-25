package com.nopcommerce.demo.steps;


import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class LoginSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }
    @When("I click on login Link")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("I should navigate to login page successfully")
    public void iShouldNavigateToLoginPageSuccessfully() {
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = new LoginPage().verifyWelcomePLeaseSignInMessage();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
    }


    @And("I enter email {string}")
    public void iEnterEmail(String email) {
        new LoginPage().enterEmailID(email);

    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I should able to see the Error message {string};")
    public void iShouldAbleToSeeTheErrorMessage(String expectedErrorMessage) {
       Assert.assertEquals(new LoginPage().loginWithIncorrectCredentials(),expectedErrorMessage);

    }

    @Then("I should login successfully")
    public void iShouldLoginSuccessfully() {
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = new LoginPage().verifyWelcomePLeaseSignInMessage();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");

    }

    @Then("I should able to see LogOut link")
    public void iShouldAbleToSeeLogOutLink() {
        new HomePage().logOutIsDisplayed();
    }
}
