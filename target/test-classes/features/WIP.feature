Feature: Sample
	I want to use this feature file for testing WIP user stories

	@WIP
	Scenario Outline: TASK-123: SAMPLE DESCRIPTION
		# Scenario 1: SAMPLE TITLE
		Given user opens browser
		When user becomes inactive for "<Test1>" minutes
		Then user is on "<Test2>" page

		Examples: 
			| Test1 | Test2  |
			| 123   | SAMPLE |
