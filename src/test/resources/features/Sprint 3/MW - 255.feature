Feature: MW - 255:Standard Will Review Page - Updates

  @WIP
  Scenario: 
    #Go to site and log in
    Given user opens browser and proceeds to orders page
    Then user selects "bam@bam.com" on user dropdown
    Then user clicks on delete all button
    Then user close browser

  @Sprint
  Scenario Outline: 
    # Go to site and log in-------------------------------------------------------------------------
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    #When user clicks on new order on incomplete order popup
    #When user clicks on continue on incomplete order popup
    When user selects couples product
    #Select Standard will Package-------------------------------------------------------------------------
    When user clicks Standard will product for couples
    Then user is on "Personal" page
    #User filled valid input
    When user fills up mandatory fields inside the personal page for victorian
    When user clicks on Next button on personal page
    Then user is on "About you" page
    #Married-------------------------------------------------------------------------
    When user selects "Married" as Relationship Status on about page
    And user fill up the all required fields for married status with spouse email
    And user click the next button on the about page
    Then user is on "Assets" page
    And user clicks no to do you have assets question
    #Asset answer "no" to other question
    And user clicks no to all assets question
    And user click the next button on the assets page
    #Skip Beneficiaries Page-------------------------------------------------------------------------
    #And user clicks yes to Do you want to include any children you have in the future question
    And user clicks yes to Do you want to leave your whole estate to your spouse/partner if they survive you question
    #And user clicks no to If any of your children predecease you, do you want to divide it equally amongst their children question
    And user clicks no to Do you want to give the whole of your estate equally to any children you have in the future question
    And user clicks no to Do you wish to leave any gifts question
    And user click the next button on the beneficiaries page
    #Executors Page-------------------------------------------------------------------------
    Then user is on "Executors" page
    #And user adds first option executor
    And user clicks on add executor
    And user adds first option executor
    And user clicks on add executor
    And user adds back up executor
    And user clicks no to Would you like Maurice Blackburn to help your Executor manage your estate question
    And user selects i have no wish on funeral wishes
    And user click the next button on the executors page
    #ID docs Page-------------------------------------------------------------------------
    Then user is on "ID Check" page
    And user agrees to terms and agreement inside the ID docs Page
    #ADD ID
    Then user clicks on first identification document
    And user selects Driver License as first identification type
    And user adds driver license details
    And user adds first identification
    Then user clicks on second identification document
    And user selects Medicare as second identification type
    And user adds medicare details
    And user adds second identification
    And user clicks next button on the ID docs page
    #Review and confirm-------------------------------------------------------------------------
    Then user is on "Review and Confirm" page
    Then user check on the label
    And user confirms on the acknowledgement inside the review and confirm page
    And user clicks the next button on the review and confirm page to go to add-on page
   

    Examples: 
      | email                   | password     | Address1  | Suburb         |
      | bam@bam.com | Password123! | Australia | Executive Lane |
