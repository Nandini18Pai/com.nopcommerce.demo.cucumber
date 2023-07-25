package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class ComputerSteps {
    @Given("I click on  tab {string}")
    public void iClickOnTab(String TopMenu) {
        new HomePage().selectFromTopMenu(TopMenu);

    }

    @Then("I should able to verify {string} text")
    public void iShouldAbleToVerifyText(String expectedText) {
        Assert.assertEquals(new ComputerPage().verifyComputerText(), expectedText);
    }

    @When("I click on  sublist  Desktops link")
    public void iClickOnSublistDesktopsLink() {
        new DesktopsPage().clickOnDesktopLink();
    }

    @Then("I should able to verify {string} Desktops text")
    public void iShouldAbleToVerifyDesktopsText(String expectedTextMessage) throws InterruptedException {
         Thread.sleep(2000);
        Assert.assertEquals("Text not Match",new DesktopsPage().verifyDesktopText(), expectedTextMessage);

    }


    @And("I click on product name Build your own computer")
    public void iClickOnProductNameBuildYourOwnComputer() {
        new BuildYourOwnComputerPage().clickOnBuildYourOwnComputer();

    }

    @And("I select processor {string}")
    public void iSelectProcessor(String processor) {
        new BuildYourOwnComputerPage().selectProcessor(processor);


    }

    @And("I select RAM {string}")
    public void iSelectRAM(String ram) {
        new BuildYourOwnComputerPage().selectRam(ram);

    }

    @And("I select HDD {string}")
    public void iSelectHDD(String hdd) {
        new BuildYourOwnComputerPage().selectHDDRadios(hdd);
    }

    @And("I select OS {string}")
    public void iSelectOS(String os) {
        new BuildYourOwnComputerPage().selectOSRadios(os);
    }

    @And("I select Software {string}")
    public void iSelectSoftware(String software) {
        new BuildYourOwnComputerPage().selectSoftware(software);
    }
    @And("I click on ADD TO CART Button")
    public void iClickOnADDTOCARTButton() {
        new BuildYourOwnComputerPage().clickOnAddToCartButton();
    }

    @Then("I should able to verify message {string}")
    public void iShouldAbleToVerifyMessage(String expectedShoppingMessage) {
        Assert.assertEquals(new BuildYourOwnComputerPage().verifyTheProductAddedToYourCart(),expectedShoppingMessage);


    }


}