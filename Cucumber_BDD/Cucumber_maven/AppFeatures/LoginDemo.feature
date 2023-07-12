Feature: check whether the website is login 

Scenario Outline: verify login is successful with valid crediatials 

	Given browser is opened 
	And user is on login page 
	When user enters <username> and  <password> 
	And click on submit button 
	Then user logged into the url successfully 
	
	Examples: 
		|username|password|
		|prashanthvynala|12345|
		|raju|12345|
		|udith|12345|