Feature: MW - 42 : As a customer, I want to view additional products I can purchase

	@Sprint1
	Scenario Outline: 1: Customer locks account
		Given user opens browser
		When user logs into app with the "<email>" and "<password>" as the login credentials

		Examples: 
			| email            | password     |
			| Demeth@gmail.com | Password123! |
