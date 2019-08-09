Feature: APT-78: As a User, I want to login to Oxy Admin portal so that I can access and use the portal

	@WIP
	Scenario Outline: 1 and 2: Successful Login
		Given user opens browser
		When user logs into app with the "<email>" and "<password>" as the login credentials
		Then user is on "HomePage" page
		And user validates his account is logged in
		When user logs out of the app
		Then user is on "Login" page

		Examples: 
			| email                    | password        |
			| test_user@aptours.com.au | admin67testUser |

	@WIP
	Scenario Outline: 3: Invalid Login
		Given user opens browser
		When user logs into app with the "<email>" and "<password>" as the login credentials
		Then user sees feedback message "Invalid User Credentials"

		Examples: 
			| email                    | password    |
			| test_user@aptours.com.au | admin67testUser |
