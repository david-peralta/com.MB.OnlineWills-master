Feature: MW - 51 - As a customer, I want to skip parts of the form I don’t need to fill in if I’ve indicated I’m in hospital or have a condition that impacts my ability to draft a Will so I can discuss these directly with the lawyer

  @Regression
  Scenario Outline: Answer Yes on Are you currently in hospital? question
    #Scenario1-A (1st Question Yes)
    #Go to site and log in
    Given user opens browser and proceeds to orders page
    Then user selects "david.peralta@yahoo.com" on user dropdown
    Then user clicks on delete all button
    # Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    #Select Standard will Package
    When user clicks Standard will product for couples
    Then user is on "Personal" page
    #User filled valid input
    When user selects "Dr" as title on personal page
    When user inputs "01/01/1993" as date of birth on personal page
    When user inputs "4772834" as Phone Number on personal page
    When user inputs "Consultant" as Occupation on personal page
    When user inputs "<Address1>" as Residential address line one on personal page
    When user inputs "<Suburb>" as Residential suburb on personal page
    When user selects "VIC" as Residential state on personal page
    When user selects "4103" as Residential Postcode on personal page
    When user selects Postal Address same as Residential checkbox
    #Answer Yes on Are you currently in hospital? question
    When user selects yes on first question
    #Answer NO on Have you been diagnosed with any physical, cognitive or mental impairments or disorders that may impact your ability to draft or sign your Will? question
    When user selects no on second question
    #Click Next button
    When user clicks next page to review and confirm details
    #User checks if About you page is displayed
    Then user is on "Review and Confirm" page
    And user sees Are you currently in hospital question with yes answer in personal info summary
    And user confirms will details
    #Scenario2
    When user clicks the next button to confirm will
    Then user is on "Thank You" page
    And user sees message "Thank you"

    Examples: 
      | email                   | password     | Address1                                         | Suburb         |
      | david.peralta@yahoo.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |

  @Regression
  Scenario Outline: Yes on Have you been diagnosed with any physical, cognitive or mental impairments or disorders that may impact your ability to draft or sign your Will? question
    #Scenario1-B (2nd Question Yes)
    #Go to site and log in
    Given user opens browser and proceeds to orders page
    Then user selects "david.peralta@yahoo.com" on user dropdown
    Then user clicks on delete all button
    # Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    #Select Standard will Package
    When user clicks Standard will product for couples
    Then user is on "Personal" page
    #User filled valid input
    When user selects "Dr" as title on personal page
    When user inputs "01/01/1993" as date of birth on personal page
    When user inputs "4772834" as Phone Number on personal page
    When user inputs "Consultant" as Occupation on personal page
    When user inputs "<Address1>" as Residential address line one on personal page
    When user inputs "<Suburb>" as Residential suburb on personal page
    When user selects "VIC" as Residential state on personal page
    When user selects "4103" as Residential Postcode on personal page
    When user selects Postal Address same as Residential checkbox
    #Answer No on Are you currently in hospital? question
    When user selects no on first question
    #Answer Yes on Have you been diagnosed with any physical, cognitive or mental impairments or disorders that may impact your ability to draft or sign your Will? question
    When user selects yes on second question
    #Click Next button
    When user clicks next page to review and confirm details
    #User checks if About you page is displayed
    Then user is on "Review and Confirm" page
    And user sees diagnosed question with yes answer in personal info summary
    And user confirms will details
    #Scenario 2
    When user clicks the next button to confirm will
    Then user is on "Thank You" page
    And user sees message "Thank you"

    Examples: 
      | email                   | password     | Address1                                         | Suburb         |
      | david.peralta@yahoo.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |

  @Regression1
  Scenario Outline: Yes on Have you been diagnosed with any physical, cognitive or mental impairments or disorders that may impact your ability to draft or sign your Will? question
    #Scenario1-C (1st & 2nd Question Yes)
    #Go to site and log in
    Given user opens browser and proceeds to orders page
    Then user selects "david.peralta@yahoo.com" on user dropdown
    Then user clicks on delete all button
    # Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    #Select Standard will Package
    When user clicks Standard will product for couples
    Then user is on "Personal" page
    #User filled valid input
    When user selects "Dr" as title on personal page
    When user inputs "01/01/1993" as date of birth on personal page
    When user inputs "4772834" as Phone Number on personal page
    When user inputs "Consultant" as Occupation on personal page
    When user inputs "<Address1>" as Residential address line one on personal page
    When user inputs "<Suburb>" as Residential suburb on personal page
    When user selects "VIC" as Residential state on personal page
    When user selects "4103" as Residential Postcode on personal page
    When user selects Postal Address same as Residential checkbox
    #Answer No on Are you currently in hospital? question
    When user selects yes on first question
    #Answer Yes on Have you been diagnosed with any physical, cognitive or mental impairments or disorders that may impact your ability to draft or sign your Will? question
    When user selects yes on second question
    #Click Next button
    When user clicks next page to review and confirm details
    #User checks if About you page is displayed
    Then user is on "Review and Confirm" page
    And user sees Are you currently in hospital question with yes answer in personal info summary
    And user sees diagnosed question with yes answer in personal info summary
    #Scenario3
    When user clicks change to go back to personal page
    Then user is on "Personal" page
    Examples: 
      | email                   | password     | Address1                                         | Suburb         |
      | david.peralta@yahoo.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |
