Feature: Customers shopping
  In order to buy products
  As a customer
  I want to be able to select products and add to cart

  Scenario: Add a product to cart
    Given Prepare browser
      And I want to shopping
    When I select product have name 'Vòng tay Jones New York'
    Then I should see a dialog
      And Quantity of products in mini cart should be '1'

  Scenario: Add two products to cart
    Given Prepare browser
      And I want to shopping
    When I select product have name 'Quần lót ren Cosabella'
    Then I should see a dialog
      And I should see the dialog to close
    When I select product have name 'Vòng tay Jones New York'
    Then I should see a dialog
      And Quantity of products in mini cart should be '2'
  
  Scenario: Check cart before shopping
    Given Prepare browser
      And I want to shopping
    Then Quantity of products in mini cart should be '0'
    When I select product have name 'Thắt lưng 2 mặt Michael Kors'
    Then I should see a dialog
      And I should see the dialog to close
    When I select product have name 'Túi đeo chéo Calvin Klein'
    Then I should see a dialog
      And I should see the dialog to close
      And Quantity of products in mini cart should be '2'



#  Scenario: Duble Add two products to cart
#    Given I want to shopping
#    When I double select product have name 'Túi đeo chéo Calvin Klein'
#    Then I should see a dialog
#    Then I should see the dialog to close
#    Then I should see a dialog
#    Then I should see the dialog to close
#    And Quantity of products in mini cart should be '2'
