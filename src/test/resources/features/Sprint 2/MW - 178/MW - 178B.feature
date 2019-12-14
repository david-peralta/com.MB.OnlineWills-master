Feature: MW - 178B

  @Regression 
  Scenario Outline: Delete ORder
    #Delete Order for a fresh start
    Given user opens browser and proceeds to orders page
    Then user selects "<email>" on user dropdown
    Then user clicks on delete all button
    
    Examples: 
      | email                   | 
      | david.peralta@yahoo.com | 

  Scenario Outline: 
    #Scenario2
    #Standard Couple Will - NON VIC
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    #And user clicks on new order on incomplete order popup
    And user verifies if css is displayed
    When user selects couples product
    Then user checks couple will title is displayed
    And user checks couple will body is displayed
    And user checks couple will types is displayed

    Examples: 
      | email                   | password     |
      | david.peralta@yahoo.com | Password123! |

 