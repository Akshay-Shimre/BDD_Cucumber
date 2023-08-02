Feature: Application signup

@smoke
Scenario: HomePage default login
Given user is on login page
When logins to the application with "ABC1" and "pass2"
Then HomePage is displayed
And Cards displayed are "True"

