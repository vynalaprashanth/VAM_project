Feature: login functionality 

Scenario: check login is successful with valid credentials 

	Given user is on login page 
	When user enters username and password 
	And click on login button 
	Then user is navigated to home page 
	
	
Scenario Outline: check login is successful with valid credentials 

	Given user is on login page 
	When user enters <username> and <password> 
	And click on login button 
	Then user is navigated to home page 
	
	Examples: 
		|username|password|
		|admin1|password1|
		|admin2|password2| 