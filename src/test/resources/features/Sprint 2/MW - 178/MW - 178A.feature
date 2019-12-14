Feature: MW - 178A

  @Regression
  Scenario Outline: Delete Order
    #Delete Order for a fresh start
    Given user opens browser and proceeds to orders page
    Then user selects "<email>" on user dropdown
    Then user clicks on delete all button

    Examples: 
      | email                   |
      | david.peralta@yahoo.com |

  @Regression
  Scenario Outline: 
    #Scenario1
    #Standard Single Will - NON VIC
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    # And user clicks on new order on incomplete order popup
    And user verifies if css is displayed
    When user selects singles product
    Then user checks standard will title is displayed
    And user checks standard will body is displayed

    Examples: 
      | email                   | password     |
      | david.peralta@yahoo.com | Password123! |
