Feature: MW - 37 - As a customer, I want to enter the required details about my beneficiaries, so I can process my Will

  @WIP
  Scenario: 
    #Go to site and log in
    Given user opens browser and proceeds to orders page
    Then user selects "david.peralta@yahoo.com" on user dropdown
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
    When user selects singles product
    #Select Standard will Package-------------------------------------------------------------------------
    When user clicks Standard will product for singles
    Then user is on "Personal" page
    #User filled valid input
    When user fills up mandatory fields inside the personal page for victorian
    When user clicks on Next button on personal page
    Then user is on "About you" page
    #Single-------------------------------------------------------------------------
    When user selects "Single" as Relationship Status on about page
    And user fill up the all required fields for single status
    And user click the next button on the about page
    Then user is on "Assets" page
    And user clicks no to do you have assets question
    #Asset answer "no" to other question
    And user clicks no to all assets question
    And user click the next button on the assets page
    #Skip Beneficiaries Page-------------------------------------------------------------------------
    #Scenario1
    Then user clicks no to Do you want to include any children you have in the future question
    When user clicks on add beneficiary
    #Scenario2
    Then user checks the person mandatory fields inside the adding of beneficiaries page
    #Scenario3
    And user adds person beneficiaries with amount
    And user clicks no to Do you wish to leave any gifts question
    #Scenario4 
		And user click the next button on the beneficiaries page
    #return to Assets Page using progress bar-------------------------------------------------------------------------
    When user clicks change to go back to assets page
    Then user is on "Assets" page

    Examples: 
      | email                   | password     | Address1  | Suburb         |
      | david.peralta@yahoo.com | Password123! | Australia | Executive Lane |
