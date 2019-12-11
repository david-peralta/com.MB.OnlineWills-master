Feature: MW - 33 : Assests - Debt
  @WIP
  Scenario: 
    #Go to site and log in
    Given user opens browser and proceeds to orders page
    Then user selects "bam@bam.com" on user dropdown
    Then user clicks on delete all button
    Then user close browser

  @Sprint11
  Scenario Outline: 
    # Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    When user selects singles product
    #Select Standard will Package
    When user clicks Standard will product for singles
    Then user is on "Personal" page
    #User filled valid input
    When user fills up mandatory fields inside the personal page for victorian
    When user clicks on Next button on personal page
    Then user is on "About you" page
    #Single
    When user selects "Single" as Relationship Status on about page
    And user fill up the all required fields for single status with children
    And user click the next button on the about page
    Then user is on "Assets" page
    And user clicks no to do you have assets question
    #Asset answer "no" to other question
    #Scenario 1 - Click on Debt
    And user clicks yes to do you have debts question
    And user clicks on add debt
    And user checks mandatory fields in debt
    And user fills up debt
    And user adds another debt
    And user edits debt
    And user removes debt
    And user cancels debt with unsaved changes
    Then user close browser

    #
    #
    #And user clicks no to do you have any superannuation question
    #And user clicks no to do you have life insurance separate from your superannuation
    #And user clicks no to do you control a trust question
    #And user clicks no to do you control a self-managed superannuation fund question
    #And user clicks no to do you own your own business or are you a partner in a partnership question
    #And user click the next button on the assets page
    
    
    Examples: 
      | email            | password     | Address1                                         | Suburb         |
      | bam@bam.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |
