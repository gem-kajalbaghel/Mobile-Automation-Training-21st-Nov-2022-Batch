Feature: Launch the application

  Scenario: Test for launching the app successfully
    Given Set the capabilities
    When launch the app
    Then should launch the app successfully
    And close the application
