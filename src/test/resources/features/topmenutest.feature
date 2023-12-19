Feature: Top Menu Feature


  @regression
  Scenario: User Should Navigate To Desktops Page Success fully
    Given I am In Home Page
    When I Mouse Hover On Desktop Tab
    And I call select Menu method and pass menu Show All Desktops
    Then I Successfully on Desktops Page

  @regression
  Scenario: User Should Navigate To Laptops And Notebooks Page Successfully
    Given I am In Home Page
    When I Mouse Hover On Laptops & Notebooks Tab
    And I call select Menu method and pass menu Show All Laptops & Notebooks
    Then I Successfully on Laptops & Notebooks Page

  @regression
  Scenario: User Should Navigate To Components Page Successfully
    Given I am In Home Page
    When I Mouse Hover On Components Tab
    And I call select Menu method and pass menu Show All Components
    Then I Successfully on Components Page



