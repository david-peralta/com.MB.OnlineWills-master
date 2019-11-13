Feature: MW - 34 : Super annuation

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
    When user selects "Dr" as title on personal page
    When user inputs "Today" as date of birth on personal page
    When user inputs "4772834" as Phone Number on personal page
    When user inputs "Consultant" as Occupation on personal page
    When user inputs "<Address1>" as Residential address line one on personal page
    When user inputs "<Suburb>" as Residential suburb on personal page
    When user selects "VIC" as Residential state on personal page
    When user selects "4103" as Residential Postcode on personal page
    When user selects Postal Address same as Residential checkbox
    When user selects no on first question
    When user selects no on second question
    When user clicks on Next button on personal page
    Then user is on "About you" page
    #Single
    When user selects "Single" as Relationship Status on about page
    And user fill up the all required fields for single status with children
    And user click the next button on the about page
    Then user is on "Assets" page
    And user clicks no to do you have assets question
    #Asset page
    And user clicks no to do you have debts question
    And user clicks yes to do you have any superannuation question
    #Add Super
    And user clicks on add superannuation button
    #Cancel
    And user clicks cancel button on adding superannuation
    #Validate Mandatory fields
    And user clicks on add superannuation button
    And user clicks save button on adding superannuation
    And user sees mandatory fields validation for adding superannuation
    #Add super without death
    And user adds superannuation with unsure death beneficiary
    And user clicks on add superannuation button
    And user adds superannuation with no death beneficiary
    #Add super with death benef
    And user clicks on add superannuation button
    And user adds superannuation with death beneficiary
    #Then user sees question "Is it Binding?"
    #Then user sees message "Nominated Beneficiaries"
    And user clicks add death benificiary
    And user clicks save button on adding death beneficiary
    And user sees mandatory fields validation for nominating beneficiary
    #Nominate beneficiary
    And user nominates a beneficiary
    And user clicks yes on Is it Binding question
    And user clicks save button on adding death beneficiary
    #Edit beneficiary
    And user clicks edit death benificiary
    And user edits the nominated beneficiary
    And user clicks save button on adding death beneficiary
    And user adds superannuation with death beneficiary
    #Delete beneficiary
    And user deletes the first death benificiary

    Examples: 
      | email            | password     | Address1                                         | Suburb         |
      | demeth@gmail.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |
