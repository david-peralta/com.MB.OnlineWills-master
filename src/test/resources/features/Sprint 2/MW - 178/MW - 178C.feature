Feature: MW - 178C

   @Regression
  Scenario Outline: Delete Order
    #Delete Order for a fresh start
    Given user opens browser and proceeds to orders page
    Then user selects "<email>" on user dropdown
    Then user clicks on delete all button
    
      Examples: 
      | email               | 
      | victorian@gmail.com | 
      
  @Regression
  Scenario Outline:
    #Scenario3
    #Standard Single Will - VIC
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    #And user clicks on new order on incomplete order popup
    And user verifies if css is displayed
    When user selects singles product
    Then user checks standard will title is displayed
    And user checks standard will body is displayed

    Examples: 
      | email               | password     | 
      | victorian@gmail.com | Password123! | 