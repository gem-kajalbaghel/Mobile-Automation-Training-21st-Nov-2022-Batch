


@Step
Feature: set the initial setup

  Scenario: launch the Application
    Given step to intialize the app
    Then click on app element
    Then click on Search element
    Then click on invoke Search
    And send data in search
