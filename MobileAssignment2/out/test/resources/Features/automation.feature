@TestRunner
Feature: Application launch validate

  Background:
    Given Launch the application

  Scenario: Validate launch of application
    Then validate launch
