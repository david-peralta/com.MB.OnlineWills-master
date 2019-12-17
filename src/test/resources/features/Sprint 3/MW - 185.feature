Feature: MW-185	Updates to the Account Registration page to include Privacy requirements

  @WIP
  Scenario: 
    #Go to site and log in
    Given user opens browser and proceeds to orders page
    Then user selects "david.peralta@yahoo.com" on user dropdown
    Then user clicks on delete all button
    Then user close browser

  @Sprint3
  Scenario Outline: 
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    And user selects couples product
    And user clicks Standard will product for couples
    Then user is on "Personal" page
    #User filled valid input
    When user fills up mandatory fields inside the personal page for victorian
    When user clicks on Next button on personal page
    Then user is on "About you" page
    #About You - Married
    And user selects "Married" as Relationship Status on about page
    And user fill up the all required fields for married status
    And user clicks no to do you want to do your will with your spouse or partner question
    And user click the next button on the about page
    Then user is on "Assets" page
    #Asset answer "no" to other question
    And user clicks no to all assets question
    And user click the next button on the assets page
    And user clicks no to do you want to leave your whole estate to your spouse/partner if they survive you question
    And user clicks yes to Do you want to include any children you have in the future question
    And user clicks no to If any of your children predecease you, do you want to divide it equally amongst their children question
    And user clicks no to Do you wish to leave any gifts question
    And user click the next button on the beneficiaries page
    #Executors
    And user clicks on add executor
    And user adds first option executor
    And user clicks on add executor
    And user adds back up executor
    And user clicks no to Would you like Maurice Blackburn to help your Executor manage your estate question
    And user selects i have no wish on funeral wishes
    And user click the next button on the executors page
    #ADD ID DOCS
    And user agrees to terms and agreement inside the ID docs Page
    Then user clicks on first identification document
    And user selects Driver License as first identification type
    And user adds driver license details
    And user adds first identification
    Then user clicks on second identification document
    And user selects Medicare as second identification type
    And user adds medicare details
    And user adds second identification
    And user clicks next button on the ID docs page
    #REVIEW CONFIRM
    Then user is on "Review and Confirm" page
    And user confirms will details
    When user click the next button on the review and confirm page
    Then user is on "Add-Ons" page
    And user sees message "Add your Partner"
    #And user sees the add your spouse/partner option
    And user checks spouse invitation message

    Examples: 
      | email                   | password     | Address1  | Suburb         |
      | david.peralta@yahoo.com | Password123! | Australia | Executive Lane |
