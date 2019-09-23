Feature: Test login feature with multiple datasets

  Scenario Outline: To Test login feature with multiple datasets
    Given Application is up and running.
    When I enter <username> and <password> on login screen
    Then I should be login successfully

    Examples: 
      | username | password |
      | mercury  | mercury  |
      | mercury  | mercury  |
