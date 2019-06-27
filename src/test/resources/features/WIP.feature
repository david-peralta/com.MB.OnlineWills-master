Feature: TST-1: Login

	@Regression
	Scenario Outline: 1: Successful Login
		Given user opens browser
		Then user is on "Facebook - Log In or Sign Up" page
		When user enters the "<username>" and "<password>" for the login credentials
		Then user is on "Facebook" page

		Examples: 
			| username                       | password       |
			| bahalakasabuhaymo530@gmail.com | fakeaccount123 |

	@Regression
	Scenario Outline: 2: Invalid Login
		Given user opens browser
		Then user is on "Facebook - Log In or Sign Up" page
		When user enters the "<username>" and "<password>" for the login credentials
		Then user is on "Log into Facebook | Facebook" page
		And user sees error message "The password you’ve entered is incorrect. "

		Examples: 
			| username                       | password    |
			| bahalakasabuhaymo530@gmail.com | wrongString |
