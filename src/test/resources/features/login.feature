Feature:  test

  @test
  Scenario Outline: Create new account
    Given I navegate to facebook login page
    When I click in create account
    Then I fill the form
    Then Im able to submit the form using <"first name"><"last name"><Mobile><New Password>
    Examples:
      | "first name" | "last name" | Mobile    | New Password            |
      | pacho        | gomez       | 786123546 | newsupersecretpassword1 |
