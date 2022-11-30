@BDDtests
Feature: Demo Application

  @MA1
  Scenario: Launching Demo Application
    Given Launch the Application
    Then Check for Application
  @Task1
  Scenario: check for alert
    Given Launch the application
    Then Check for alert message
  @Task2
  Scenario: Check for Long Press
    Given Launch the application
    Then Check for long press