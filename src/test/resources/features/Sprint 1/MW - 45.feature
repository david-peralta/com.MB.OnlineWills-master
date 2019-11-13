Feature: MW - 45 : As a customer, I want my account locked after a number of unsuccessful login attempts so that unathorised users cannot access my account

	@Sprint1
	Scenario Outline: 1: Customer locks account
		Given user opens browser
		When user logs into app with the "<email>" and "<password>" as the login credentials
		And user logs into app with the "<email>" and "<password>" as the login credentials
		And user logs into app with the "<email>" and "<password>" as the login credentials
		And user logs into app with the "<email>" and "<password>" as the login credentials
		Then user is on "Login" page
		And user sees feedback message "Too many failed login attempts. Please try again in a few minutes."
		When user becomes inactive for "1" minutes
		And user logs into app with the "<email>" and "<password>" as the login credentials
		Then user sees feedback message "Invalid username or password."
		When user logs into app with the "<email>" and "<password>" as the login credentials
		And user logs into app with the "<email>" and "<password>" as the login credentials
		And user logs into app with the "<email>" and "<password>" as the login credentials
		And user logs into app with the "<email>" and "<password>" as the login credentials
		And user logs into app with the "<email>" and "<password>" as the login credentials
		Then user is on "Login" page
		And user sees feedback message "Too many failed login attempts. Please try again in a few minutes."
		When user becomes inactive for "30" minutes
		And user logs into app with the "<email>" and "<password>" as the login credentials
		Then user sees feedback message "Invalid username or password."
		When user logs into app with the "<email>" and "<password>" as the login credentials
		And user logs into app with the "<email>" and "<password>" as the login credentials
		And user logs into app with the "<email>" and "<password>" as the login credentials
		And user logs into app with the "<email>" and "<password>" as the login credentials
		And user logs into app with the "<email>" and "<password>" as the login credentials
		And user logs into app with the "<email>" and "<password>" as the login credentials
		Then user sees feedback message "Too many failed login attempts. Please try again in 60 minutes."

		Examples: 
			| email                  | password     |
			| NonVictorian@gmail.com | ABCDEFGHIJKL |
