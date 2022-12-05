@steps
Feature: demo APK testing

  @launch_apk_without_serenity
  Scenario: Launch_application_without_serenity
    Given Launching the application
    When Check for Application
    Then Close Application

  @launch_apk_with_serenity
  Scenario: Launch_application_with_serenity
    When Check for Application
    And Long Press Feature
    Then Close Application

  @SendKeys_Wifi_Settings
  Scenario: Launch_application_with_serenity
    When Check for Application
    And Open Preferences and Enter wifi Name
    Then Close Application


  @longPress
  Scenario: Launch_application_with_serenity
    When Check for Application
    And Long Press Feature
    Then Close Application

  @Scroll
  Scenario: Performs Scroll
    When Scroll to Element
    Then Close Application

  @Swipe
  Scenario: Perform Swipe
    When Swipe to Element
    Then Close Application

  @DropDown
  Scenario: Perform DropDown
    When Perform Element Dropdown
    Then Close Application

  @Toast
  Scenario: Get toast message
    Given Get Toast message from apk
    Then Close Application

  @DragDrop
  Scenario: Perform Drag and Drop
    When Verify drag and drop

