Feature: Customers shopping
  In order to buy products
  As a customer
  I want to be able to select products and add to cart

  Scenario: Add product to cart
    Given I want to shopping
    When I select product have name 'Vòng tay Jones New York'
    Then I should see a dialog
