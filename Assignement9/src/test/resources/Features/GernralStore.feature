Feature: Handling of General Store Application

  @test
  Scenario: Launch General Store Application
    Given Launch general store App
    When Mention all Details and Enter into Application
    Then Order First Item

  @GemWithSere
  Scenario Outline: Launch Application General Store
    Given Launch general store App
    When Enter details for login username "<username>" and country "Argentina"
    Then click on shoes "<shoeName>"
    Then Order the selected item
    Examples:
      |username| shoeName |
      | sandeep |  Nike Blazer Mid '77       |
