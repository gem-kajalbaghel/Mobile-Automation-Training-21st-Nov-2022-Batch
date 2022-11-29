
Feature: Click and type into Emulator

  Background:
    Given Launch application

  @DemoTest
  Scenario: Type into Preferences
    When click on preference option

  @AlertTest
  Scenario: Alert and LongPress handling
    When Click on Alert

  @LongPress
  Scenario: Long Press
    When Run Longpress button
