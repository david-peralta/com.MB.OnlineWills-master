Feature: MW - 24E : As a customer, I want to enter the required details about myself, so I can process my Will

		@WIP
    Scenario: 
    #Go to site and log in
    Given user opens browser and proceeds to orders page
    Then user selects "bam@bam.com" on user dropdown
    Then user clicks on delete all button
    Then user close browser
    
    @Sprint1
  	Scenario Outline: Yes/Yes first and second
    # Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    #Select Standard will Package
    When user clicks Standard will product for couples
    Then user is on "Personal" page
    #User filled valid input
    When user fills up mandatory fields inside the personal page for victorian
    #Answer Yes on Are you currently in hospital? question
    When user selects yes on first question
    #Answer Yes on Have you been diagnosed with any physical, cognitive or mental impairments or disorders that may impact your ability to draft or sign your Will? question
    When user selects yes on second question
    #Click Next button
    When user clicks on Next button on personal page
    #User checks if About you page is displayed
    Then user is on "Review and Confirm" page
    Then user close browser

    Examples: 
      | email       | password     | Address1                                         | Suburb         |
      | bam@bam.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane | 