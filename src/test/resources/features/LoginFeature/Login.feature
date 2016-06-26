Feature: Bizweb tenant signup
  In order to signup customer account
  As a customer
  I want to be able to signup an account

  Scenario Outline: Signin customer account, fail
    Given Prepare browser
      And I want to login to an account
    When I fill email to login form with '<email>'
    When I fill password to login form with '<password>'
    When I click Login button
    Then I should see in login form '<number_of_error>' error messages
    Examples:
      | email       | password | number_of_error |
      |             |          | 2               |
      | abc@art.com | 23456    | 1               |
      | abc@art.com |          | 1               |

    Scenario: Sign in customer account successfully
    Given Prepare browser
      And I want to login to an account
    When I fill email to login form with 'abc@art.com'
    When I fill password to login form with '123456'
    When I click Login button
    Then I should see home page
