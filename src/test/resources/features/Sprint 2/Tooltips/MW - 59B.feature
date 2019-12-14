Feature: MW - 59 - Assets tooltips
  
  Scenario Outline: 
    #Delete Order for a fresh start
    Given user opens browser and proceeds to orders page
    Then user selects "<email>" on user dropdown
    Then user clicks on delete all button

    Examples: 
      | email            |
      | demeth@gmail.com |
  
  Scenario Outline: Assets tooltips
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
    #Assets tooltip----------------------------------
    And user sees assets tooltip
    And user checks the content of assets tooltip
    And user clicks yes to do you have assets question
    And user clicks on Add Asset
    And user selects "Property" as Asset on assets page
    #Ownership Tooltip ----------------------------------
    And user sees ownership tooltip
    And user checks the content of ownership tooltip
    And user fills up all fields inside the adding of property asset
    #Superannuation tooltip
    And user sees superannuation tooltip
    And user checks the content of superannuation tooltip
    #Death beneficiary tooltip----------------------------------
    And user clicks yes to do you have any superannuation question
    And user clicks on add superannuation button
    And user sees Death beneficiary tooltip
    And user checks the content of Death beneficiary tooltip
    #Binding tooltip----------------------------------
    And user clicks yes on Have you nominated a beneficiary
    And user sees binding tooltip
    And user checks the content of binding tooltip
    #Trust tooltip-----------------------------------------------------------------------------------------
    And user sees trusts tooltip
    And user checks the content of trusts tooltip
    #Life Interest will tooltip-----------------------------------------------------------------------------------------
    And user sees life interest tooltip
    And user checks the content of life interest tooltip

    Examples: 
      | email            | password     |
      | demeth@gmail.com | Password123! |

  