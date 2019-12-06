Feature: MW - 24 : As a customer, I want to enter the required details about myself, so I can process my Will

  @Sprint1
  Scenario Outline: Scenario 1 to 4: Customer views Personal Details page
    # Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    #Select Standard will Package
    When user clicks Standard will product for couples
    Then user is on "Personal" page
    #Check welcome message
    And user sees message "<Welcome Message>"
    And user sees message "Please ensure that you are the one filling in this form."
    #Check if 22 elements is displayed (based on MB online will form)
    And user checks if the personal details content is complete
    #validation on title dropdown
    And the user checks if titles inside the Title dropdown is complete
    And user check if "Select one" is the default value of the title dropdown
    And user checks if Title dropdown is mandatory
    #validation on FirstName
    And user check if First name field is mandatory
    And user checks if First name field max length is set to fifty
    #validation on MiddleName
    #And user check if Middle name field is not mandatory
    And user checks if Middle name field max length is set to fifty
    #validation on FamilyName
    And user check if Family name field is mandatory
    And user checks if Family name field max length is set to fifty
    #validation on Date of birth
    And user check if Date of birth is mandatory
    #And user check if Date of birth contains format validation
    #validation on Phone Number
    And user check if Phone Number field is mandatory
    And user checks if Phone Number field max length is set to ten
    #validation on Occupation
    And user check if Occupation field is mandatory
    And user checks if Occupation field max length is set to fifty
    #validation on Residential address line 1
    And user check if Residential address line one field is mandatory
    And user checks if Residential address line one field max length is set to fifty
    #validation on Residential address line 2
    # And user check if Residential address line two field is not mandatory
    And user checks if Residential address line two field max length is set to fifty
    #validation on Residential suburb
    And user check if Residential Suburb field is mandatory
    And user checks if Residential Suburb field max length is set to fifty
    #validation on state dropdown
    And the user checks if States inside the Residential State dropdown is complete
    And user check if "Select one" is the default value of the Residential State dropdown
    And user checks if Residential State dropdown is mandatory
    #validation on Residential Postcode
    And user check if Residential Postcode field is mandatory
    And user checks if Residential Postcode field max length is set to ten
    #validation on Postal address line 1
    And user check if Postal address line one field is mandatory
    And user checks if Postal address line one field max length is set to fifty
    #validation on Postal address line 2
    # And user check if Postal address line two field is not mandatory
    And user checks if Postal address line two field max length is set to fifty
    #validation on Postal suburb
    And user check if Postal Suburb field is mandatory
    And user checks if Postal Suburb field max length is set to fifty
    #validation on state dropdown
    And the user checks if States inside the Postal State dropdown is complete
    And user check if "Select one" is the default value of the Postal State dropdown
    And user checks if Postal State dropdown is mandatory
    #validation on Postal Postcode
    And user check if Postal Postcode field is mandatory
    And user checks if Postal Postcode field max length is set to ten
    #validation on Are you currently in hospital? question
    And user check if First Question is mandatory
    #validation on 'Have you been diagnosed with any conditions that affect your cognition or your physical ability to read and sign your Will? question
    And user check if Second Question is mandatory
    #Scenario 2: Customer indicates postal address same as residential
    When user selects Postal Address same as Residential checkbox
    #If 'Checked', Do not display questions#14-18
    #error    #And user checks if All Postal detail fields is not displayed
    #Scenario 3: Customer unchecks the Same as Residential checkbox
    When user selects Postal Address same as Residential checkbox
    #If 'UnChecked', Display questions#14-18
    And user checks if All Postal detail fields is displayed

    #Scenario 4: Mandatory fields not filled in (DONE IN VALIDATIONS IN SCENARIO 1)
    #Scenario 5: Mandatory fields filled in
    Examples: 
      | email            | password     | Welcome Message |
      | demeth@gmail.com | Password123! | Hi dim!         |

  @Sprint1
  Scenario Outline: Scenario 5: Mandatory fields filled in
    # Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    #Select Standard will Package
    When user clicks Standard will product for couples
    Then user is on "Personal" page
    #User filled valid input
    When user selects "Dr" as title on personal page
    When user inputs "01/01/1993" as date of birth on personal page
    When user inputs "Today" as date of birth on personal page
    When user inputs "4772834" as Phone Number on personal page
    When user inputs "Consultant" as Occupation on personal page
    When user inputs "<Address1>" as Residential address line one on personal page
    When user inputs "<Suburb>" as Residential suburb on personal page
    When user selects "VIC" as Residential state on personal page
    When user selects "4103" as Residential Postcode on personal page
    When user selects Postal Address same as Residential checkbox
    #Answer NO on Are you currently in hospital? question
    When user selects no on first question
    #Answer NO on Have you been diagnosed with any physical, cognitive or mental impairments or disorders that may impact your ability to draft or sign your Will? question
    When user selects no on second question
    #Click Next button
    When user clicks on Next button on personal page
    #User checks if About you page is displayed
    Then user is on "About you" page

    Examples: 
      | email            | password     | Address1                                         | Suburb         |
      | demeth@gmail.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |
  @Sprint1
  Scenario Outline: Answer Yes on Are you currently in hospital? question
    # Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    #Select Standard will Package
    When user clicks Standard will product for couples
    Then user is on "Personal" page
    #User filled valid input
    When user selects "Dr" as title on personal page
    When user inputs "01/01/1993" as date of birth on personal page
    When user inputs "Today" as date of birth on personal page
    When user inputs "4772834" as Phone Number on personal page
    When user inputs "Consultant" as Occupation on personal page
    When user inputs "<Address1>" as Residential address line one on personal page
    When user inputs "<Suburb>" as Residential suburb on personal page
    When user selects "VIC" as Residential state on personal page
    When user selects "4103" as Residential Postcode on personal page
    When user selects Postal Address same as Residential checkbox
    #Answer Yes on Are you currently in hospital? question
    When user selects yes on first question
    #Answer NO on Have you been diagnosed with any physical, cognitive or mental impairments or disorders that may impact your ability to draft or sign your Will? question
    When user selects no on second question
    #Click Next button
    When user clicks on Next button on personal page
    #User checks if About you page is displayed
    Then user is on "ReviewAndConfirm" page

    Examples: 
      | email            | password     | Address1                                         | Suburb         |
      | demeth@gmail.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane | 
   @Sprint1
  Scenario Outline: Yes on Have you been diagnosed with any physical, cognitive or mental impairments or disorders that may impact your ability to draft or sign your Will? question
    # Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    #Select Standard will Package
    When user clicks Standard will product for couples
    Then user is on "Personal" page
    #User filled valid input
    When user selects "Dr" as title on personal page
    When user inputs "01/01/1993" as date of birth on personal page
    When user inputs "Today" as date of birth on personal page
    When user inputs "4772834" as Phone Number on personal page
    When user inputs "Consultant" as Occupation on personal page
    When user inputs "<Address1>" as Residential address line one on personal page
    When user inputs "<Suburb>" as Residential suburb on personal page
    When user selects "VIC" as Residential state on personal page
    When user selects "4103" as Residential Postcode on personal page
    When user selects Postal Address same as Residential checkbox
    #Answer No on Are you currently in hospital? question
    When user selects no on first question
    #Answer Yes on Have you been diagnosed with any physical, cognitive or mental impairments or disorders that may impact your ability to draft or sign your Will? question
    When user selects no on second question
    #Click Next button
    When user clicks on Next button on personal page
    #User checks if About you page is displayed
    Then user is on "ReviewAndConfirm" page

    Examples: 
      | email            | password     | Address1                                         | Suburb         |
      | demeth@gmail.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane | 
    @Sprint1
  Scenario Outline: Yes/Yes first and second
    # Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    #Select Standard will Package
    When user clicks Standard will product for couples
    Then user is on "Personal" page
    #User filled valid input
    When user selects "Dr" as title on personal page
    When user inputs "01/01/1993" as date of birth on personal page
    When user inputs "Today" as date of birth on personal page
    When user inputs "4772834" as Phone Number on personal page
    When user inputs "Consultant" as Occupation on personal page
    When user inputs "<Address1>" as Residential address line one on personal page
    When user inputs "<Suburb>" as Residential suburb on personal page
    When user selects "VIC" as Residential state on personal page
    When user selects "4103" as Residential Postcode on personal page
    When user selects Postal Address same as Residential checkbox
    #Answer Yes on Are you currently in hospital? question
    When user selects yes on first question
    #Answer Yes on Have you been diagnosed with any physical, cognitive or mental impairments or disorders that may impact your ability to draft or sign your Will? question
    When user selects yes on second question
    #Click Next button
    When user clicks on Next button on personal page
    #User checks if About you page is displayed
    Then user is on "ReviewAndConfirm" page

    Examples: 
      | email            | password     | Address1                                         | Suburb         |
      | demeth@gmail.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane | 
 
  #@Sprint1
  #Scenario Outline: Scenario 6: Customer cancels with no unsaved changes
    # Go to site and log in
    #Given user opens browser
    #When user logs into app with the "<email>" and "<password>" as the login credentials
    #Then user is on "Landing" page
    #Select Standard will Package
    #When user clicks Standard will product for couples
    #Then user is on "Personal" page
    #Click Cancel button
    #When user clicks on Cancel button on personal page
    #User checks if Landing page is displayed
    #Then user is on "Landing" page
#
    #Examples: 
      #| email            | password     |
      #| demeth@gmail.com | Password123! |
