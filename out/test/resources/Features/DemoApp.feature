Feature: Search using Emulator

  Background:
  Given Launch application

    Scenario: prefernce
      When click on preference option

  @test1234
  Scenario: Perform Long press function
    When click on views
    Then click on expandable List
    Then click on custom adaptor
    Then Longpress on people name

    @test1234
    Scenario: Perform alert accept/reject
      Then Navigate to alert and cancel the alert

  @test14
      Scenario: Perform swipe function
        When click on views
        Then click on Gallery
        Then click on Photos
        And Swipe the element

  @test4
    Scenario: Perform dropdown function
    When click on views
    And dropdown to element
  @test4
  Scenario: Perform Scroll function
    When click on views
    And scroll function

  @test41
  Scenario: Check the toast text
    When click on views
    Then check toast message


  @test412
  Scenario: Check drag and drop
    When click on views
    Then click on drag drop btn







