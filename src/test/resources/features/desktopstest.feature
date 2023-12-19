Feature: Product Feature



  @regression
  Scenario: Verify Product Arrange In Alpha Baltic Order
    Given I am In Home Page
    When I Mouse Hover On Desktop Tab
    And I call select Menu method and pass menu Show All Desktops
    And I click on sort By Position Tab
    And I select Sort By position Name : Z to A
    Then I will see the Product arrange in Descending order


  @regression
  Scenario Outline: Verify Product Added To Shopping Cart SuccessFully
      Given I am In Home Page
      When I Mouse Hover On Currency Dropdown and click
      And I Mouse hover on £Pound Sterling and click
      And I call select Menu method and pass menu Show All Desktops
      And I click on sort By Position Tab
      And I select Sort By position Name : A to Z
      And I selects product "<product>"
      And I verifies the text "<product>"
      And I enters quantity "1" using the Select class
      And I clicks on the Add to Cart button
      Then I verifies the message "Success: You have added “<product>” to your shopping cart!"
      And I clicks on the link shopping cart displayed in the success message
      And I verifies the text Shopping Cart
      And I verifies the product name "<product>"
      And I verifies the model "<model>"
      And I verifies the total "<price>"
      Examples:
      |     product     |     model       |     price     |
      | HTC Touch HD    | Product 1       |  £74.73       |
      | iPhone          | product 11      |  £75.46       |
      | iPod Classic    | product 20      |  £74.73       |
      | MacBook         | Product 16      |  £368.73      |
      | MacBook Air     | Product 17      |  £736.23      |
      | Sony VAIO       | Product 19      |  £736.23      |








