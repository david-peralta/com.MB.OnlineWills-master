Feature: MW - 59D -  Executors tooltips

 Scenario Outline: 
    #Delete Order for a fresh start
    Given user opens browser and proceeds to orders page
    Then user selects "<email>" on user dropdown
    Then user clicks on delete all button

    Examples: 
      | email            |
      | demeth@gmail.com |

  @Sprint1
  Scenario Outline: Executors tooltips
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
    When user selects "Single" as Relationship Status on about page
    And user fill up the all required fields for single status
    And user click the next button on the about page
    Then user is on "Assets" page
    And user clicks no to all assets question
    And user click the next button on the assets page
    Then user is on "Beneficiaries" page
    #Skip Beneficiaries Page-------------------------------------------------------------------------
    And user clicks yes to Do you want to include any children you have in the future question
    And user clicks no to If any of your children predecease you, do you want to divide it equally amongst their children question
    And user clicks no to Do you wish to leave any gifts question
    And user click the next button on the beneficiaries page
    #Executors Page-------------------------------------------------------------------------
    Then user is on "Executors" page
    #Executors Tooltip --------------
    And user sees executors tooltip
    And user checks the content of executors tooltip
    #Lawyers of Your Estate Tooltip --------------
    And user sees Lawyers of Your Estate tooltip
    And user checks the content of Lawyers of Your Estate tooltip

    Examples: 
      | email            | password     |
      | demeth@gmail.com | Password123! |