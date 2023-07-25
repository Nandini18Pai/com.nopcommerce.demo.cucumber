@Regression
Feature: LoginPage Test
  As user I want to login into nop commerce website

  @smoke
  Scenario: I should navigate to login page successfully
    Given I am on homepage
    When I click on login Link
    Then I should navigate to login page successfully

  @sanity
  Scenario: I should not able to login successfully with Invalid credentials
    Given I am on homepage
    When I click on login Link
    And I enter email "monday@yahoo.com"
    And I enter password "abc123"
    And  I click on login button
   Then I should able to see the Error message "Login was unsuccessful. Please correct the errors and try again. The credentials provided are incorrect";


  @smoke
  Scenario: I should login successfully with valid credentials
    Given I am on homepage
    When I click on login Link
    And I enter email "monday@gmail.com"
    And I enter password "monday@125"
    And I click on login button
    Then I should able to see LogOut link










































