
Feature: Search using Appium Inspector

  @Task1
  Scenario Outline: check launch of demo application
    Given Launch the application
    Then Click on number "<number>" of calculator
    Examples:
      | number |
      | 5      |
