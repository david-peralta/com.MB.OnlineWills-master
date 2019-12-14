Feature: MW - 49 : Affiliated Unions
  @Sprint1
   Scenario Outline: 
    #Delete Order for a fresh start
    Given user opens browser and proceeds to orders page
    Then user selects "<email>" on user dropdown
    Then user clicks on delete all button

    Examples: 
      | email            |
      | demeth@gmail.com |
  
      @Sprint
  Scenario Outline: 
    # Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
   # And user hits the escape key
    And user click free standard will
    #Union details
    Then pop-up header is displayed
    Then affiliated unions dropdown is displayed
    And your member number field is displayed
    And member number footnote is displayed
    And cancel button is displayed
    And user click on confirm button
    #Mandatory fields
    Then affiliated union alert message is displayed
    And your member number alert message is displayed
    
    #Invalid Member ID-----------------------------------------------------
    	#Alpha
     When user selects "Alpha" as affliated unions
     And user enter "123123" on your member number
     And user click on confirm button
     And user sees message "The member number entered is not valid.  Please try again"
     
      #Alphanumeric-pre
     When user selects "Alphanumeric-pre" as affliated unions
     And user enter "123123" on your member number
     And user click on confirm button
     And user sees message "The member number entered is not valid.  Please try again"
    
      #Alphanumeric-Suf
     When user selects "Alphanumeric-Suf" as affliated unions
     And user enter "123123" on your member number
     And user click on confirm button
     And user sees message "The member number entered is not valid.  Please try again"
     
     #Numeric
     When user selects "Numeric" as affliated unions
     And user enter "asdasd" on your member number
     And user click on confirm button
     And user sees message "The member number entered is not valid.  Please try again"
     
    #Valid Member ID-----------------------------------------------------
    	#Alpha
     When user selects "Alpha" as affliated unions
     And user enter "asdasd" on your member number
     And user click on confirm button
     And user is on "Landing" page
     And user check the cost
     
      #Alphanumeric-pre
     And user click free standard will
     When user selects "Alphanumeric-pre" as affliated unions
     And user enter "a123" on your member number
     And user click on confirm button
     And user is on "Landing" page
     And user check the cost

    
      #Alphanumeric-Suf
     And user click free standard will
     When user selects "Alphanumeric-Suf" as affliated unions
     And user enter "123a" on your member number
     And user click on confirm button
     And user is on "Landing" page
     And user check the cost
     
     #Numeric
     And user click free standard will
     When user selects "Numeric" as affliated unions
     And user enter "123123" on your member number
     And user click on confirm button
     And user is on "Landing" page
     And user check the cost
     
      #User cancel union-----------------------------------------------------

      And user click free standard will
      And user click on cancel button
      And user is on "Landing" page
 
    Examples: 
      | email            | password     | 
      | demeth@gmail.com | Password123! | 
