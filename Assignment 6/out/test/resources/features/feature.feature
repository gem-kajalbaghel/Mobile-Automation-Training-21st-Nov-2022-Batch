
Feature: Search using Appium Inspector

  @Task1
  Scenario Outline: check launch of demo application
    Given Launch the application
    Then Click on number "<number>" of calculator
    Examples:
      | number |
      | 5      |

  @Task2
  Scenario: Check for Long Press
    Given Launch the application
    Then Check for long press

  @Task3
  Scenario: check for alert
    Given Launch the application
    Then Check for alert message

  @Task4
  Scenario: check for alert
    Given Launch the application
    Then Check for scroll

  @Task5
  Scenario: check for alert
    Given Launch the application
    Then Check for swipe

  @Task6
  Scenario: check for alert
    Given Launch the application
    Then Check for dropdown