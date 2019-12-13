Feature: MW - 38 : Beneficiaries - Gifts

  @WIP
  Scenario: 
    #Go to site and log in
    Given user opens browser and proceeds to orders page
    Then user selects "david.peralta@yahoo.com" on user dropdown
    Then user clicks on delete all button
    Then user close browser

  @Sprint1
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
    And user fill up the all required fields for single status
    And user click the next button on the about page
    Then user is on "Assets" page
    And user clicks no to do you have assets question
    #Asset answer "no" to other question
    And user clicks no to do you have debts question
    And user clicks no to do you have any superannuation question
    And user clicks no to do you have life insurance separate from your superannuation
    And user clicks no to do you control a trust question
    And user clicks no to do you control a self-managed superannuation fund question
    And user clicks no to do you own your own business or are you a partner in a partnership question
    And user click the next button on the assets page
    #Beneficiaires - select Gift
    #No Spouse and No Children
    Then user is on "Beneficiaries" page
    And user sees question "Do you want to give the whole of your estate equally to any children you have in the future?"
    And user clicks yes to Do you want to give the whole of your estate equally to any children you have in the future question
    And user sees question "If any of your children predecease you"
    And user clicks yes to If any of your children predecease you, do you want to divide it equally amongst their children question
    And user sees disaster question displayed
    #Scenario 1: Customer Indicates gifts to allocate
    #Scenario 2: Mandatory fields not filled in
    #Scenario 3: Mandatory fields filled in
    #Scenario 4: Customer adds another Gift
    #Scenario 5: Customer edits a gift's details
    When user clicks yes to Do you wish to leave any gifts question
    Then user checks required fields in the gift section
    When user fills up gift from beneficiaries
    Then user updates gift from beneficiaries
    And user removes gift beneficiary
    And user cancels created gift beneficiary
    Then user close browser

    Examples: 
      | email                   | password     | Address1                                         | Suburb         |
      | david.peralta@yahoo.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |
