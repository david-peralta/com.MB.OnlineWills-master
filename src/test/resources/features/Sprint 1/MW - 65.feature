Feature: MW - 65 : Checkout
  @WIP
  Scenario Outline: 
    #Go to site and log in
    Given user opens browser and proceeds to orders page
    Then user selects "bam@bam.com" on user dropdown
    Then user clicks on delete all button
    Then user close browser

  @Sprint
  Scenario Outline:
  
  	#Without POA
   
    # Go to site and log in-------------------------------------------------------------------------
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    When user clicks on new order on incomplete order popup
    #When user clicks on continue on incomplete order popup
    When user selects singles product
    #Select Standard will Package-------------------------------------------------------------------------
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
    #Single-------------------------------------------------------------------------
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
    #ID docs Page
    Then user is on "ID Check" page
    And user agrees to terms and agreement inside the ID docs Page
    #ADD ID
    And user selects Driver License as first identification type
    And user adds driver license details
    And user selects Medicare as second identification type
    And user adds medicare details
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
    And user clicks on pay now button
    
    #User is redirected to checkout
    #Scenario1: Checkout - invalid details--------------------------
    Then user is on "Checkout" page
    When user sees card type option
    When user sees card number input
    And user sees expiration date month selection
    And user sees expiration date year selection
    And user sees CVN input
    When user clicks the pay button
    Then error message Card type is a required field is displayed 
    Then error message Enter a valid card number is displayed
    Then error message Enter a valid expiry date is displayed
    And user clicks the cancel button
    When user sees validation message Are you sure you want to cancel your order?
    Then user clicks no
    Then user is on "Checkout" page
    And user clicks the cancel button
    When user sees validation message Are you sure you want to cancel your order?
    Then user clicks yes
    #Order Canceled Page
    Then user is on "Order Canceled" page
    And user clicks on return to website button
    #Landing Page
    Then user is on "Landing" page
    When user clicks on continue on incomplete order popup
    #Payment Page
		Then user is on "Payment" page
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
		Then user close browser  

    Examples: 
      | email            | password     | Address1  | Suburb         |
      | bam@bam.com | Password123! | Australia | Executive Lane |
      
      
      
      
        @WIP
  Scenario Outline: 
    #Go to site and log in
    Given user opens browser and proceeds to orders page
    Then user selects "bam@bam.com" on user dropdown
    Then user clicks on delete all button
    Then user close browser
      
 @Sprint
  Scenario Outline:
  
  	#With POA
   
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
    #Single-------------------------------------------------------------------------
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
    And user selects Driver License as first identification type
    And user adds driver license details
    And user selects Medicare as second identification type
    And user adds medicare details
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
    And POA is displayed in the order summary
    And Standard will legal document is displayed in the order summary
    When user clicks on back button on the order summary page
    #User is redirected back to Review and Confirm-------------------------------------------------------------------------
    Then user is on "Review and Confirm" page
    And user clicks the next button on the review and confirm page to go to add-on page
    And user clicks on pay now button
    
    #User is redirected to checkout
    #Scenario1: Checkout - invalid details--------------------------
    Then user is on "Checkout" page
    When user sees card type option
    When user sees card number input
    And user sees expiration date month selection
    And user sees expiration date year selection
    And user sees CVN input
    When user clicks the pay button
    Then error message Card type is a required field is displayed 
    Then error message Enter a valid card number is displayed
    Then error message Enter a valid expiry date is displayed
    And user clicks the cancel button
    When user sees validation message Are you sure you want to cancel your order?
    Then user clicks no
    Then user is on "Checkout" page
    And user clicks the cancel button
    When user sees validation message Are you sure you want to cancel your order?
    Then user clicks yes
    #Order Canceled Page
    Then user is on "Order Canceled" page
    And user clicks on return to website button
    #Landing Page
    Then user is on "Landing" page
    When user clicks on continue on incomplete order popup
    #Payment Page
		Then user is on "Payment" page
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
      | email            | password     | Address1  | Suburb         |
      | bam@bam.com | Password123! | Australia | Executive Lane |
      
