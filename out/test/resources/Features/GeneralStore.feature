Feature: Open Application

  @test1
  Scenario: check launch of application using Serenity Bdd
    Given Launch general store application
    When click on name
    Then click on jordan shoes

