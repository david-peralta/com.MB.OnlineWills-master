Feature: MW - 175 : Union Member Payments

  Scenario Outline: 
    # Single Package - Staff, Standard Will + POA
    # Go to site and log in-------------------------------------------------------------------------
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    #When user clicks on new order on incomplete order popup
    #When user clicks on continue on incomplete order popup
    And user click free standard will
    #Union details
    Then pop-up header is displayed
    Then affiliated unions dropdown is displayed
    And your member number field is displayed
    And member number footnote is displayed
    And cancel button is displayed
    #Alpha
    When user selects "StaffUnion" as affliated unions
    And user enter "staffunion" on your member number
    And user click on confirm button
    And user is on "Landing" page
    And user check the cost
    When user selects singles product
    #Select Standard will Package-------------------------------------------------------------------------
    When user clicks Standard will product for singles
    Then user is on "Personal Details" page
    #User filled valid input
   And user fills up mandatory fields inside the personal page for victorian
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
    And user clicks yes to Do you want to include any children you have in the future question
    And user clicks no to If any of your children predecease you, do you want to divide it equally amongst their children question
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
    And user confirms on the acknowledgement inside the review and confirm page
    And user clicks the next button on the review and confirm page to go to add-on page
    #Add ons page
    Then user is on "Add-Ons" page
    Then user clicks on add POA on addons page
    And user click the next button with POA on the AddOns page
    #Financial Decisions
    Then user is on "Enduring Power Of Attorney" page
    #Add Financial Decision Maker-------------------------------------------------------------------------
    #1
    And user selects Only financial matters on enduring power of attorney options
    And user clicks on add financial decision maker on financial decision page
    And user fills up financial decision maker details with Primary Decision Maker
    And user clicks on add financial decision maker
    #Select immediately on start to act dropdown
    And user selects "Immediately" on When do you want your Financial/Personal Decision Makers to start to act dropdown
    #Input limitation
    And user enter "This a test Limitation" as limitation value
    #next button
    And user click the next button with POA on the financial decision page
    #Medical POA page-------------------------------------------------------------------------
    Then user is on "MedicalPOA" page
    Then user click on I do not want a MDM
    Then user click next
    #Review and confirm-------------------------------------------------------------------------
    Then user is on "Review and Confirm" page
    And user confirms on the acknowledgement inside the review and confirm page
    When user clicks the next button on the review and confirm page to go to payments page
    #Payments
    Then user is on "Payment" page
    #Check order summary (With POA)
    #And POA is displayed in the order summary
    And Standard will legal document is displayed in the order summary
    #When user clicks on back button on the order summary page
    #User is redirected back to Review and Confirm-------------------------------------------------------------------------
    #Then user is on "Review and Confirm" page
    #And user clicks the next button on the review and confirm page to go to add-on page
    And user check on the total with POA
    And user clicks on pay now button
    #Checkout page
    Then user is on "Checkout" page
    #Scenario2: Checkout - valid details--------------------------
    Then user enter payment details
    Then user select month
    Then user select year
    When user clicks the pay button
    #Payment Complete
    Then user is on "Thank You" page

    Examples: 
      | email            | password     |
      | Jerome@yehey.com | Password123! |
