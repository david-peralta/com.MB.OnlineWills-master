Feature: MW - 42L : As a customer, I want to view additional products I can purchase

  @42-12
  Scenario: 
    #Go to site and log in
    Given user opens browser and proceeds to orders page
    Then user selects "demeth@gmail.com" on user dropdown
    Then user clicks on delete all button
    Then user close browser

  @42-12
  Scenario Outline: 4-Married: Couple who does not live in VIC and selected the couple package
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    And user selects couples product
    And user clicks Standard will product for couples
    When user fills up mandatory fields inside the personal page for victorian
    And user clicks on Next button on personal page
    Then user is on "About you" page
    And user selects "Married" as Relationship Status on about page
    And user fill up the all required fields for married status
    And user clicks yes to do you want to do your will with your spouse or partner question
    And user inputs "testspouse@test.com" as the email address of the spouse/partner
    And user click the next button on the about page
    Then user is on "Assets" page
    And user clicks no to all assets question
    And user click the next button on the assets page
    Then user is on "Beneficiaries" page
    And user clicks no to do you want to leave your whole estate to your spouse/partner if they survive you question
    And user clicks yes to Do you want to give to your children question
    And user clicks no to If any of your children predecease you, do you want to divide it equally amongst their children question
    And user clicks no to Do you wish to leave any gifts question
    And user click the next button on the beneficiaries page
    Then user is on "Executors" page
    And user clicks on add executor
    And user adds first option executor
    And user clicks on add executor
    And user adds back up executor
    And user clicks no to Would you like Maurice Blackburn to help your Executor manage your estate question
    And user selects i have no wish on funeral wishes
    And user click the next button on the executors page
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
    Then user is on "Review and Confirm" page
    When user confirms that he completed the form himself
    And user clicks the next button on the review and confirm page
    Then user is on "Add-Ons" page

    Examples: 
      | email            | password     |
      | demeth@gmail.com | Password123! |