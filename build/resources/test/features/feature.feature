#@test123
Feature: Search using Appium Inspector

  @Check123
  Scenario Outline: check launch of demo application
    Given Launch the application
    Then Click on "<num>" number
    Examples:
      | num |
      | 5   |
