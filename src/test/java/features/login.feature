Feature: Login Scenarios

Scenario: Home page default login
  Given User is on landing page
  When User enters the correct username "alvina" and password "1234"
  Then User should be navigated to the Home screen
