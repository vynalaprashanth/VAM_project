Feature: Login Application

@test1
Scenario: verify valid login
Given user start home page
When user insert username and password
Then user click submit button
Then user close browser

@test2
Scenario: verify Invalid login
Given user start home page
When user insert username 
When user insert Invalid password
Then user click submit button
Then user close browser


