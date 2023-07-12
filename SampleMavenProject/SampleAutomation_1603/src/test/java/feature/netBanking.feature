Feature: Application login 

Scenario: Home page default login
Given user is on netbanking login page
When user login to application with username and password
Then homepage is populated
And cards are displayed







