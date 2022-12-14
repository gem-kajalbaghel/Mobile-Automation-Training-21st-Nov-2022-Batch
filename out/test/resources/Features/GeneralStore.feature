Feature: Open Application

  @test1
  Scenario: check launch of application using Serenity Bdd
    Given Launch general store application
    When click on name
    Then click on jordan shoes
    Then Click on added to cart
    Then Click on checkbox
    And click on submit btn
    Then Visit the website
#    With serenity functions

  Scenario: check launch of application using Serenity Bdd functions
    Given Launch general store application
    When Login using serenity functions
    Then click on jordan shoes using serenity functions and add to cart
    Then click on check box and submit btn





