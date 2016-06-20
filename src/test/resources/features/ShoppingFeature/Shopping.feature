Feature: Bizweb tenant signup
  In order to signup customer account
  As a customer
  I want to be able to signup an account

  Scenario Outline: Signup customer account
    Given I want to login to an account
    When I fill email to login form with '<email>'
    When I fill password to login form with '<password>'
    When I click Login button
    Then I should see in login form '<number_of_error>' error messages
    Examples:
      | email       | password | number_of_error |
      |             |          | 2               |
      | abc@art.com | 23456    | 1               |
      | abc@art.com |          | 1               |
