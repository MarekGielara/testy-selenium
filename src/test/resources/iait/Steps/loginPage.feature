@tag
Feature: Flight reservation
  I want to login and reserve some flight

  @tag1
  Scenario: login to the app
    Given I open main page
    When I fill the login form with login "gm@op.pl" and pass "zaq123"
    Then I should see the flight reservation form
  
