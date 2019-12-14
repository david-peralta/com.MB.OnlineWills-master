Feature: MW - 58 - Check Footer

  Scenario Outline: 
    #Delete Order for a fresh start
    Given user opens browser and proceeds to orders page
    Then user selects "<email>" on user dropdown
    Then user clicks on delete all button

    Examples: 
      | email            |
      | demeth@gmail.com |

  @Sprint
  Scenario Outline: 
    # Go to site and log in-------------------------------------------------------------------------
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    #When user clicks on new order on incomplete order popup
    #When user clicks on continue on incomplete order popup
    When user selects singles product
    #Select Standard will Package-------------------------------------------------------------------------
    Then user checks page footer in home page

    Examples: 
      | email            | password     |
      | demeth@gmail.com | Password123! |
