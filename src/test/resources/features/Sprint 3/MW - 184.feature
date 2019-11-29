Feature: MW-184	Updates to About you page for Email consent

  @Sprint3
  Scenario Outline: 
    #Scenario 1
    # Go to site and log in-------------------------------------------------------------------------
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    When user clicks on new order on incomplete order popup
    #When user clicks on continue on incomplete order popup
    When user selects singles product
    #SELECTS UNION - POA
    And user click free standard will
    #Numeric
    When user selects "Numeric" as affliated unions
    And user enter "123123" on your member number
    And user click on confirm button
    #Select Standard will Package-------------------------------------------------------------------------
    When user clicks Standard will product for singles
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
    When user selects no on first question
    When user selects no on second question
    When user clicks on Next button on personal page
    Then user is on "About you" page
    #Single-------------------------------------------------------------------------
    When user selects "Married" as Relationship Status on about page
   	Then user clicks yes to do you want to do your will with your spouse or partner question
    And user checks POA consent for spouse

    Examples: 
      | email                   | password     | Address1  | Suburb         |
      | david.peralta@yahoo.com | Password123! | Australia | Executive Lane |
