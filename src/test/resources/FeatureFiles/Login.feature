Feature: Login functionality
Scenario: Verify the user able to login with valid credential
Given User is on login page
When User is entering user name and password
And User click on login button
Then Login should be successful