Feature: MW - 48

  @Sprint
  Scenario Outline: 
    #Go to site and log in
    Given user opens browser and proceeds to orders page
    Then user selects "david.peralta@yahoo.com" on user dropdown
    Then user clicks on delete all button
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
    When user inputs "01/01/1993" as date of birth on personal page
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
    #Review and confirm
    Then user is on "Review and Confirm" page
    And user confirms on the acknowledgement inside the review and confirm page
    And user click the next button on the review and confirm page
    #Add ons page
    Then user is on "Add-Ons" page
    Then user clicks on add POA on addons page
    And user click the next button with POA on the AddOns page
    #Financial Decisions
    Then user is on "Enduring Power Of Attorney" page
    And user sees message "Enduring Power of Attorney"
    And user sees question "Do you want your Enduring Power of Attorney to be for:"
    And user sees question "Are there any limitations that you would like to discuss?"
    And user click the next button with POA on the financial decision page
    And user sees mandatory validation inside the financial decision page
    #Both
    And user selects Both financial and personal matters on enduring power of attorney options
    And user sees message "Financial Decision Maker"
    And user sees message "Personal Decision Makers"
    And user click the next button with POA on the financial decision page
    And user sees mandatory validation inside the financial decision page for both financial and personal matters
    And user clicks yes to Personal Decision Makers question
    And user click the next button with POA on the financial decision page
    And user sees mandatory validation inside the financial decision page for both financial and personal matters with personal
    #Financial
    And user selects Only financial matters on enduring power of attorney options
    And user sees message "Financial Decision Maker"
    And user click the next button with POA on the financial decision page
    And user sees mandatory validation inside the financial decision page for financial matters
    #Personal
    And user selects Only personal matters on enduring power of attorney options
    And user sees message "Personal Decision Makers"
    And user click the next button with POA on the financial decision page
    And user sees mandatory validation inside the financial decision page for personal matters
    #Add Financial Decision Maker
    #1
    And user selects Only financial matters on enduring power of attorney options
    And user clicks on add financial decision maker on financial decision page
    And user clicks on add financial decision maker
    And user sees mandatory fields validation on adding financial decision maker
    And user fills up financial decision maker details with Primary Decision Maker
    And user clicks on add financial decision maker
    #Add Personal Decision Maker
    And user selects Only personal matters on enduring power of attorney options
    And user clicks on add personal decision maker on financial decision page
    #2
    #And user clicks on add financial decision maker on financial decision page
    #And user fills up financial decision maker details with Primary Decision Maker
    #And user clicks on add financial decision maker
    #3
    #And user clicks on add financial decision maker on financial decision page
    #And user fills up financial decision maker details with Primary Decision Maker
    #And user clicks on add financial decision maker
    #4
    #And user clicks on add financial decision maker on financial decision page
    #And user fills up financial decision maker details with Primary Decision Maker
    #And user clicks on add financial decision maker
    #Check if add add financial decision maker on financial decision page is hidden
    #And user checks if add financial decision maker button on financial decision pagencial decision page
    And user clicks on add personal decision maker
    And user sees mandatory fields validation on adding personal decision maker
    And user fills up personal decision maker details with Primary Decision Maker
    And user clicks on add personal decision maker
    #2
    #And user clicks on add personal decision maker on financial decision page
    #And user fills up personal decision maker details with Primary Decision Maker
    #And user clicks on add personal decision maker
    #3
    #And user clicks on add personal decision maker on financial decision page
    #And user fills up personal decision maker details with Primary Decision Maker
    #And user clicks on add personal decision maker
    #4
    #And user clicks on add personal decision maker on financial decision page
    #And user fills up personal decision maker details with Primary Decision Maker
    #And user clicks on add personal decision maker
    #Check if add add financial decision maker on financial decision page is hidden
    #And user checks if add personal decision maker button on financial decision page is hidden
    #Select immediately on start to act dropdown
    And user selects "Immediately" on When do you want your Financial/Personal Decision Makers to start to act dropdown
    #Input limitation
    And user enter "This a test Limitation" as limitation value
    #next button
    And user click the next button with POA on the financial decision page
    #Medical POA page
    Then user is on "MedicalPOA" page
    And user clicks next button on the medical decision page
    And user sees validation on mandatory field inside the medical decision page
    And user clicks on I do not want to appoint a Medical Decision Maker checkbox
    And user clicks next button on the medical decision page
    Then user is on "Review and Confirm" page
    And user clicks back button on review and confirm page to go back to medical decision page
    Then user is on "MedicalPOA" page
    And user clicks on I do not want to appoint a Medical Decision Maker checkbox
    #Add and validate
    And user clicks on add decision maker on medical decision page
    And user clicks on add decision maker
    And user sees validation on mandatory field inside the medical decision page
    And user fills up all required fields on adding a decision maker
    And user clicks on add decision maker
    And user selects no on Do you have an Advance Care Directive currently in place question
    And user selects yes on Do you have an Advance Care Directive currently in place question
    And user inputs date on What date did you sign your Advance Care Directive question
    #Add another one
    And user clicks on add decision maker on medical decision page
    And user fills up all required fields on adding a decision maker
    And user clicks on add decision maker
    #Edit decision
    And user clicks on edit button on medical decision page
    And user edits some details on the added decision maker
    And user clicks on add decision maker
    #Remove decision
    And user clicks on remove button on medical decision page
    And user hits the enter key
    # Next
    And user clicks next button on the medical decision page
    Then user is on "Review and Confirm" page

    Examples: 
      | email                   | password     | Address1                                         | Suburb         |
      | david.peralta@yahoo.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |
