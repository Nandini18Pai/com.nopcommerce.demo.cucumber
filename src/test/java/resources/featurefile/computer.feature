@Regression
Feature: ComputerPage Test

  @smoke
  Scenario:I Should Navigate To Computer Page Successfully
    Given I am on homepage
    When  I click on  tab "Computers"
    Then I should able to verify "Computers" text

  @sanity
  Scenario:I  Should Navigate To Desktops Page Successfully
    Given I click on  tab "Computers"
    When  I click on  sublist  Desktops link
    Then I should able to verify "Desktops" text



  @smoke
  Scenario Outline:I  Should Build You Own Computer And Add Them To Cart Successfully
    Given I click on  tab "Computers"
    When  I click on  sublist  Desktops link
    And  I click on product name Build your own computer
    And  I select processor "<processor>"
    And  I select RAM "<ram>"
    And  I select HDD "<hdd>"
    And  I select OS "<os>"
    And  I select Software "<software>"
    And  I click on ADD TO CART Button
    Then I should able to verify message "The product has been added to your shopping cart"

  Examples:
  | processor                                       | ram           | hdd               | os                      | software                   |
  | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
  | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
  | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Vista Home [+$50.00]    | Total Commander [+$5.00]   |



