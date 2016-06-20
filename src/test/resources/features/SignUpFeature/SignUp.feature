Feature: Bizweb tenant signup
  In order to signup customer account
  As a customer
  I want to be able to signup an account

  Scenario Outline: Signup customer account
    Given I want to sign up an account
    When I fill first name with '<first_name>'
    When I fill last name with '<last_name>'
    When I fill email with '<email>'
    When I fill password with '<password>'
    When I click SignUp button
    Then I should see '<number>' error messages
    Examples:
      | first_name | last_name | email       | password | number |
      |            |           |             |          | 3      |
      | An         |           |             |          | 2      |
      | Teo        | Cucumer   | abc@art.com | 123456   | 1      |
