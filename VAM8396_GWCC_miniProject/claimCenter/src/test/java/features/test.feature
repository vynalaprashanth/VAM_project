Feature: demo login
	
  Scenario: login into home page
    Given I open base url
    When I pass correct username and password
    Then I login

  Scenario: cliam search
    When Find Policy
    Then Enter the Policy Number
    Then Click on Search

  Scenario: user is on new claim
    When I enter loss date
   

  Scenario: Verificy of Select Involved Policy Vehicles
   Then I select
     
    
    
    Scenario: Verfiy the basic information
    When Select the How Reported from the dropdown list
    Then Select the Name
    Then Choose New Person
    Then Enter First Name
    Then Enter Last Name
    Then Click on Update
    Then Choose Related to Insured as Claimant from dropdown list
   

  Scenario: add Cliams
    Then Select Loss Cause from the dropdown list
    Then Select Location from the dropdown list
   