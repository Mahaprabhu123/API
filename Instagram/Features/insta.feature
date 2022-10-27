Feature: Login of Instagram page

Scenario: User should login insta

Given user  Assign url
When user login "<username>","<password>"
Then verify insta login or not

Examples: 
|username  |password |
|sambath   |1234     |
