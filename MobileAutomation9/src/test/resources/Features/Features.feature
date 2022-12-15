Feature: MobileAutomation7
  Scenario: Buy Product
  When User logins
  Then Validate login
  When Open product
  Then User adds product to cart
  And Validate item is added to cart
  Then Open website to purchase