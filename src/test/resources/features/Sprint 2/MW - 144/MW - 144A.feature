Feature: MW - 144A /Couple Package-  Checks if Relationship status for about you page

  @Regression
  Scenario Outline: Delete Order
    #Delete Order for a fresh start
    Given user opens browser and proceeds to orders page
    Then user selects "<email>" on user dropdown
    Then user clicks on delete all button

    Examples: 
      | email               |
      | victorian@gmail.com |

  Scenario Outline: Couples Product
    #Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
   # When user clicks on new order on incomplete order popup
    When user selects couples product
    #Select Standard will Package
    When user clicks Standard will product for couples
    Then user is on "Personal" page
    #User filled valid input
    When user fills up mandatory fields inside the personal page for victorian
    When user clicks on Next button on personal page
    Then user is on "About you" page
    #Scenario 1
    And user checks relationship status if single and widowed are not available

    Examples: 
      | email               | password     |
      | victorian@gmail.com | Password123! |
