#@test123
Feature: Search using Appium Inspector

  @Check123
  Scenario Outline: check launch of demo application
    Given Launch the application
    Then Click on "<num>" number
    Examples:
      | num |
      | 5   |

  @Assignment5
  Scenario Outline: Tackle alert box
    Given Launch the application
    Then Click on "<btn>" button
    And Click on "<btn2>" button
    Then Click on "<btn3>" button for dialog box
    And Click on ok button from the alert dialog box
    Examples:
      | btn | btn2          | btn3                            |
      | App | Alert Dialogs | OK Cancel dialog with a message |
