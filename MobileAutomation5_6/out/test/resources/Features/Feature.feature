Feature: Assisnment5_6

  Background: Launch theapplication
    Given Launch application
@testx
Scenario: Perform swipe function
When Open views/Gallery/Photos
Then Perform swipe action

Scenario: Perform dropdown function
When Open views
Then dropdown to element

Scenario: Perform Scroll function
When Open views
Then scroll function

Scenario: Toast text
When Open views
Then check toast message


Scenario: Check drag and drop
When Open views
Then click on drag drop button