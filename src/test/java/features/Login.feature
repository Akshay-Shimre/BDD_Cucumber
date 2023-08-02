Feature: Application Login

Background:


@smoke
Scenario: HomePage default login
Given user is on login page
When logins to the application with "ABC1" and "pass2"
Then HomePage is displayed
And Cards displayed are "True"

@smoke
Scenario: HomePage default login
Given user is on login page
When logins to the application with "ABC" and "pass1"
Then HomePage is displayed
And Cards displayed are "False"

@reg
Scenario: HomePage default login
Given user is on login page
When user sign up with following details
| Akshay | Suresh | Shimre | 8424046770 | AK@g.com |
Then HomePage is displayed

@reg
Scenario Outline: HomePage default login
Given user is on login page
When signup to the application with <Username> and <Password>
Then HomePage is displayed
And Cards displayed are "True"

Examples:
|Username |Password|
|User1 |pass1|
|User2 |pass2|
|User3 |pass3|



