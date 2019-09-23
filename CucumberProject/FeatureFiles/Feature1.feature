Feature: Login feature of new tours application
  
  
  Scenario: To test login scenario with valid credentials
    Given Application is up and running.
    When I enter valid credentials
    Then I should be login successfully
    
 