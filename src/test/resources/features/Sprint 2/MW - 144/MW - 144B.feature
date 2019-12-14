Feature: MW - 144B / Single Package - Checks if Relationship status for about you page

  @Regression
  Scenario Outline: Delete order
    #Delete Order for a fresh start
    Given user opens browser and proceeds to orders page
    Then user selects "<email>" on user dropdown
    Then user clicks on delete all button

    Examples: 
      | email               |
      | victorian@gmail.com |
      
  Scenario Outline: Singles Product
    #Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    #When user clicks on new order on incomplete order popup
    When user selects singles product
    #Select Standard will Package
    When user clicks Standard victorian will product for singles
    Then user is on "Personal" page
    #User filled valid input
    When user fills up mandatory fields inside the personal page for victorian
    When user clicks on Next button on personal page
    Then user is on "About you" page
    #Scenario 2
    And the user checks if Statuses inside the Relationship Status dropdown is complete

    Examples: 
      | email               | password     |
      | victorian@gmail.com | Password123! |
