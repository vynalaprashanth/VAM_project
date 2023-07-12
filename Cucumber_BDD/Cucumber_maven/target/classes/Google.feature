Feature: To test google search functionality 

Scenario: validate google search is working 

	Given  browser is open 
	And   user is on search page 
	When the user type text 
	And click on the search button 
	Then user is navigated to search result
	Then user is logged out 