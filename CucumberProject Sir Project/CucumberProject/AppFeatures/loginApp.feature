Feature: Login Application

@Test1
Scenario: verify valid login
Given user start home page
When user insert username and password
Then user click submit button
Then user close browser 

@Test2
Scenario: verify invalid login
Given user start home page
When user insert username and invalidpassword
Then user click submit button
Then user close browser 

