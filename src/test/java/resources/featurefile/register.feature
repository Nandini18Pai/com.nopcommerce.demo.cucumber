@Regression
Feature: RegisterPage Test
  As user I want to Register into nop commerce website

  @smoke
  Scenario:I ShouldNavigateToRegisterPageSuccessfully
    Given I am on homepage
    When I click on Register Link
    Then I should able NavigateToRegisterPageSuccessfully

  @sanity
  Scenario: I should verify FirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory
    Given  I am on homepage
    When I click on Register Link
    And  I click on Register button
    And  I should verify the firstname error message "First name is required."
    And  I should verify the error lastname message "Last name is required."
    And  I should verify the error email message "Email is required."
    And  I should verify the error password message "Password is required."
    Then  I should verify the error confirm password message "Password is required."



 @smoke
  Scenario: I Should Create Account Successfully
    Given I am on homepage
    When I click on Register Link
    And I select gender "Female"
    And I enter firstname "Ritu"
    And I enter lastname  "Kelly"
    And I select day    "2"
    And I select month  "March"
    And I select year "2022"
    And I enter email "monday@gmail.com"
    And I enter password "monday1203"
    And I enter Confirm Password "monday1203"
    And I click on Register button
    Then I should able Register Successfully

























