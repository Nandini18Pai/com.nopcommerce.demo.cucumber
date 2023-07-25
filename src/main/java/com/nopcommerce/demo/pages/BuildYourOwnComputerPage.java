package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BuildYourOwnComputerPage extends Utility {


    @FindBy(xpath = " //div[@class='picture']//img[@title='Show details for Build your own computer']")
    WebElement buildYourComputer;

    @FindBy(xpath = " //button[@id='add-to-cart-button-1']")
    WebElement addToCartButton;

    @FindBy(xpath = "//div[@class='bar-notification success'] ")
    WebElement productAddedToCart;

    @FindBy(xpath = "//select[@id='product_attribute_1'] ")
    WebElement processorDropdown;

    @FindBy(xpath = "//select[@id='product_attribute_2'] ")
    WebElement ramDropdown;

    @FindBy(xpath = " //input[@id='product_attribute_3_6']")
    WebElement radio320;

    @FindBy(xpath = " //input[@id='product_attribute_3_7']")
    WebElement radio400;

    @FindBy(xpath = " //input[@id='product_attribute_4_8']")
    WebElement osVistaHome;

    @FindBy(xpath = " //input[@id='product_attribute_4_9']")
    WebElement osVistaPremium;

    @FindBy(xpath = "//dd[@id='product_attribute_input_5']//ul[@class='option-list']")
    List<WebElement> softwareSelection;


    public void clickOnBuildYourOwnComputer() {
        clickOnElement(buildYourComputer);
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
    }

    public String verifyTheProductAddedToYourCart() {
        return getTextFromElement(productAddedToCart);
    }

    public void selectProcessor(String processor) {
        selectByVisibleTextFromDropDown(processorDropdown, processor);

    }

    public void selectRam(String ram) {
        selectByVisibleTextFromDropDown(ramDropdown, ram);

    }


    public void selectHDDRadios(String hddRadio) {

        switch (hddRadio) {
            case "320 GB":
                clickOnElement(radio320);
                break;
            case "400 GB [+$100.00]":
                clickOnElement(radio400);
                break;
        }
    }


    public void selectOSRadios(String osRadio) {
        switch (osRadio) {
            case "Vista Home [+$50.00]":
                clickOnElement(osVistaHome);
                break;
            case "Vista Premium [+$60.00]":
                clickOnElement(osVistaPremium);
                break;
        }

    }

    public void selectSoftware(String software) {
        for (WebElement allType : softwareSelection) {
            if (allType.getText().contains(software)) {
                clickOnElement(allType);
                break;
            }
        }
    }

//    public void buildYourOwnComputer(String processor, String ram, String hdd, String os, String software) {
//
//        selectProcessor(processor);
//        selectRam(ram);
//        selectHDDRadios(hdd);
//        selectOSRadios(os);
//        selectSoftware(software);
//    }



}