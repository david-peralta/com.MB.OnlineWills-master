Feature: About you tooltips

  Scenario Outline: 
    #Delete Order for a fresh start
    Given user opens browser and proceeds to orders page
    Then user selects "<email>" on user dropdown
    Then user clicks on delete all button

    Examples: 
      | email            |
      | demeth@gmail.com |

  Scenario Outline: About you tooltips
    # Go to site and log in-------------------------------------------------------------------------
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    #When user clicks on new order on incomplete order popup
    #When user clicks on continue on incomplete order popup
    When user selects singles product
    #Select Standard will Package-------------------------------------------------------------------------
    When user clicks Standard will product for singles
    Then user is on "Personal" page
    #User filled valid input
    And user fills up mandatory fields inside the personal page for victorian
    When user clicks on Next button on personal page
    Then user is on "About you" page
    When user selects "Married" as Relationship Status on about page
    #spouse/partner will tooltip-----------------------------------------------------------------------------------------
    And user sees spouse/partner will tooltip
    And user checks the content of spouse/partner will tooltip
    #significant child will tooltip-----------------------------------------------------------------------------------------
    And user clicks yes to Do you have any children question
    And user clicks add child on about you page
    And user sees significant will tooltip
    And user checks the content of significant will tooltip
    #Guardian tooltip--------
    And user sees guardian tooltip
    And user checks the content of guardian tooltip
    And user sees dependents will tooltip
    And user checks the content of dependents will tooltip
    #Upload will tooltip-----------------------------------------------------------------------------------------
    And user sees upload will tooltip
    And user checks the content of upload will tooltip

    Examples: 
      | email            | password     |
      | demeth@gmail.com | Password123! |
