
Feature: Search using Emulator

  Background:
  Given Launch application

  @test1234
  Scenario: Perform Long press function
    When click on views
    Then click on expandable List
    Then click on custom adaptor
    Then Longpress on people name

    @test1234
    Scenario: Perform alert accept/reject
      Then Navigate to alert and cancel the alert



