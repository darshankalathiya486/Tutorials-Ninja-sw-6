Feature: Verify products are displayed in High to Low order


  @regression
  Scenario: Verify Products Price Display High to Low Successfully
    Given I am In Home Page
    When I Mouse Hover On Laptops & Notebooks Tab
    And I call select Menu method and pass menu Show All Laptops & Notebooks
    And I selects Sort By Price High > Low
    Then I verifies the Product prices are arranged in High to Low order

  @regression
  Scenario: Verify That User Places an Order Successfully
    Given I am In Home Page
    When I Mouse Hover On Currency Dropdown and click
    And I Mouse hover on £Pound Sterling and click
    And I Mouse Hover On Laptops & Notebooks Tab
    And I call select Menu method and pass menu Show All Laptops & Notebooks
    And I selects Sort By Price High > Low
    And I selects Product MacBook
    And I verifies the text MacBook
    And I clicks on the Add To Cart button
    Then I verifies the message Success: You have added MacBook to your shopping cart!
    And I clicks on the link shopping cart displayed in the success message
    And I verifies the text Shopping Cart
    And I verifies the product name MacBook
    And I changes the quantity
    And I clicks on the Update button
    Then I verifies the message Success: You have modified your shopping cart!
    And I verifies the total
    And I clicks on the Checkout button
    And I verifies the text Checkout
    And I verifies the text New Customer
    And I clicks on the Guest Checkout radio button
    And I clicks on the Continue button
    And I fills the mandatory fields
    And I click on the Continue Button
    And I adds comments about the order into the text area
    And I checks the Terms & Conditions checkbox
    And I clicks on the Continue button
    Then I verifies the message Warning: Payment method required!


