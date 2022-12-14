
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

  @Scroll
  Scenario: Performs Scroll
    When Scroll to Element

  @Swipe
  Scenario: Perform Swipe
    When Swipe to Element

  @DropDown
  Scenario: Perform DropDown
    When Perform Element Dropdown

  @DragDrop
  Scenario: Perform Drag and Drop
    When Verify drag and drop

  @Mob
  Scenario: Launch Application General Store
    Given Launch general store App
    When Enter details for login
    Then click on shoes