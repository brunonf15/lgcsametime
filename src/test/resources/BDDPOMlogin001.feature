Feature: Login LetsGetChecked

  @multi
  Scenario Outline: Test valid login
    Given I am using Selenium on "<browser>"
    And I am at LGC login page
    And I insert valid data
    And I click to sign in button
    Then I will be at dashboard
    Examples: 
      | browser |
      | chrome  |
      | firefox |
      | edge    |
