Feature: MW - 46 : As a customer, I want the portal to log me out during periods of inactivity so that it prevents my account being used fraudulently

	@Sprint1
	Scenario Outline: 1: Customer's session has been inactive
		Given user opens browser
		When user logs into app with the "<email>" and "<password>" as the login credentials
		Then user is on "Landing" page
		When user becomes inactive for "20" minutes
    And user clicks on new order on incomplete order popup
		Then user is on "Landing" page

		Examples: 
			| email            | password     |
			| Demeth@gmail.com | Password123! |
