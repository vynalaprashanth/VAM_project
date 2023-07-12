Feature: Login 
@sanity 
Scenario: Login With valid Credentials 
	Given user is on login page 
	And user opens url "" 
	When user is on login menu 
	And click on login 
	And entered  gamail as "PrashanthVynala@gmail.com" and password as "test@123" 
	And click on login button 
	Then user login to myaccount page