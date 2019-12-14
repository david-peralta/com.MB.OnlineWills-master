Feature: MW - 55

  @Sprint1
  Scenario Outline: 
    #Delete Order for a fresh start
    Given user opens browser and proceeds to orders page
    Then user selects "<email>" on user dropdown
    Then user clicks on delete all button

    Examples: 
      | email            |
      | demeth@gmail.com |



  @Regression2
  Scenario Outline: 
    #Scenario3
    # Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
   # When user clicks on new order on incomplete order popup
    When user selects singles product
    #Select Standard will Package
    When user clicks Standard will product for singles
    Then user is on "Personal" page
    #User filled valid input
   And user fills up mandatory fields inside the personal page for victorian
    When user clicks on Next button on personal page
    Then user is on "About you" page
    #Single
    When user selects "Single" as Relationship Status on about page
    And user fill up the all required fields for single status
    And user click the next button on the about page
    Then user is on "Assets" page
    And user clicks no to do you have assets question
    #Asset answer "no" to other question
    And user clicks no to all assets question
    And user click the next button on the assets page
    #Skip Beneficiaries Page
    And user clicks yes to Do you want to include any children you have in the future question
    And user clicks no to If any of your children predecease you, do you want to divide it equally amongst their children question
    And user clicks no to Do you wish to leave any gifts question
    And user click the next button on the beneficiaries page
    #Executors Page
    Then user is on "Executors" page
    #And user adds first option executor
    And user clicks on add executor
    And user adds first option executor
    And user clicks on add executor
    And user adds back up executor
    And user clicks no to Would you like Maurice Blackburn to help your Executor manage your estate question
    And user selects i have no wish on funeral wishes
    And user click the next button on the executors page
    #ID docs Page
    Then user is on "ID Check" page
    #Progress Bar Navigation
    When user redirects to Personal Details page
    Then user is on "Personal Details" page
    When user redirects to About You page
    Then user is on "About you" page
    When user redirects to Assets page
    Then user is on "Assets" page
    When user redirects to Beneficiaries page
    Then user is on "Beneficiaries" page
    When user redirects to Executors page
    Then user is on "Executors" page

    #When user redirects to "About You" page
    #When user redirects to "Assets" page
    #When user redirects to "Beneficiaries" page
    #When user redirects to "Executors" page
    #When user redirects to "ID Check" page
    Examples: 
      | email                   | password     | 
      | demeth.camuin@gmail.com | Password123! | 

