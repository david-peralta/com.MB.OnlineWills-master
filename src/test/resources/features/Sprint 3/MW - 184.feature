Feature: MW-184	Updates to About you page for Email consent

  @WIP
  Scenario: 
    #Go to site and log in
    Given user opens browser and proceeds to orders page
    Then user selects "david.peralta@yahoo.com" on user dropdown
    Then user clicks on delete all button
    Then user close browser

  @Sprint3
  Scenario Outline: 
    #Scenario 1
    # Go to site and log in-------------------------------------------------------------------------
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    #When user clicks on new order on incomplete order popup
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
    When user fills up mandatory fields inside the personal page for victorian
    When user clicks on Next button on personal page
    Then user is on "About you" page
    #Single-------------------------------------------------------------------------
    When user selects "Married" as Relationship Status on about page
    Then user clicks yes to do you want to do your will with your spouse or partner question
    And user checks POA consent for spouse

    Examples: 
      | email                   | password     | Address1  | Suburb         |
      | david.peralta@yahoo.com | Password123! | Australia | Executive Lane |
