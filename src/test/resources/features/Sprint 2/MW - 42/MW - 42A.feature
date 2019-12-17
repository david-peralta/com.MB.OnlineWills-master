Feature: MW - 42 : As a customer, I want to view additional products I can purchase
@WIP
  Scenario: 
    #Go to site and log in
    Given user opens browser and proceeds to orders page
    Then user selects "bam@bam.com" on user dropdown
    Then user clicks on delete all button
    Then user close browser

  @Sprint1
  Scenario Outline: 1-Single: Single and doesn’t live in VIC
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    And user selects singles product
    And user clicks Standard will product for singles
    When user fills up mandatory fields inside the personal page for victorian
    And user clicks on Next button on personal page
    Then user is on "About you" page
    And user selects "Single" as Relationship Status on about page
    And user fill up the all required fields for single status
    And user click the next button on the about page
    Then user is on "Assets" page
    And user clicks no to all assets question
    And user click the next button on the assets page
    Then user is on "Beneficiaries" page
    And user click YES on Do you want to give the whole of your estate equally to any children you have in the future question
    And user click NO If any of your children predecease you, do you want to divide that child's share equally among their children question
    And user clicks NO to Do you wish to leave any gifts question
    And user click the next button on the beneficiaries page

    #And user clicks yes to Do you want to give the whole estate equally to your children question
    #And user clicks no to Do you want to include any children you have in the future question
    #And user clicks no to If any of your children predecease you, do you want to divide it equally amongst their children question
    #And user clicks no to Do you wish to leave any gifts question

    Then user is on "Executors" page
    And user clicks on add executor
    And user adds first option executor
    And user clicks on add executor
    And user adds back up executor
    And user clicks no to Would you like Maurice Blackburn to help your Executor manage your estate question
    And user selects i have no wish on funeral wishes
    And user click the next button on the executors page
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
 
    Then user is on "Review and Confirm" page
    When user confirms that he completed the form himself
    And user clicks the next button on the review and confirm page
    Then user is on "Add-Ons" page

    Examples: 
      | email       | password     |
      | bam@bam.com | Password123! |