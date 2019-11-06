Feature: MW - 25 : As a customer, I want to enter the required details about my Relationship Status, so I can process my Will

  @Sprint1
  Scenario Outline: Single: Scenario 1: Customer views About You page of the Online Wills Request
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
    #Check if Question 1 "Are you in a relationship?" is displayed
    And user sees message "Are you in a relationship"
    And user checks if relationship status dropdown is displayed
    And user checks if Cancel and Back button is displayed
    #Validation on relationship status dropdown
    And the user checks if Statuses inside the Relationship Status dropdown is complete
    And user check if "Select One" is the default value of the Relationship Status dropdown
    And user checks if Relationship Status dropdown is mandatory
    #Scenario 3: Mandatory fields not filled in
    #Select one selected
    And user click the next button on the about page
    And user checks if mandatory fields are validated
    #Single is selected
    When user selects "Single" as Relationship Status on about page
    And user click the next button on the about page
    And user checks if mandatory fields are validated when single is selected
    #Widowed is selected
    When user selects "Widowed" as Relationship Status on about page
    And user click the next button on the about page
    And user checks if mandatory fields are validated when widowed is selected
    #Married is selected
    When user selects "Married" as Relationship Status on about page
    And user click the next button on the about page
    And user checks if mandatory fields are validated when married is selected
    #Defacto is selected
    When user selects "Defacto" as Relationship Status on about page
    And user click the next button on the about page
    And user checks if mandatory fields are validated when defacto is selected
    #Engaged is selected
    When user selects "Engaged" as Relationship Status on about page
    And user click the next button on the about page
    And user checks if mandatory fields are validated when engaged is selected
    #Separated is selected
    When user selects "Separated" as Relationship Status on about page
    And user click the next button on the about page
    And user checks if mandatory fields are validated when separated is selected
     #Divorced is selected
    When user selects "Divorced" as Relationship Status on about page
    And user click the next button on the about page
    And user checks if mandatory fields are validated when divorced is selected

    Examples: 
      | email            | password     | Address1                                         | Suburb         |
      | demeth@gmail.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |
      
      Scenario Outline: Couples: Scenario 1: Customer views About You page of the Online Wills Request
    # Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    #Select Standard will Package
    When user clicks Standard will product for couples
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
    #Check if Question 1 "Are you in a relationship?" is displayed
    And user sees message "Are you in a relationship"
    And user checks if relationship status dropdown is displayed
    And user checks if Cancel and Back button is displayed
    #Validation on relationship status dropdown
    And the user checks if Statuses inside the Relationship Status dropdown is complete
    And user check if "Select One" is the default value of the Relationship Status dropdown
    And user checks if Relationship Status dropdown is mandatory
    #Scenario 3: Mandatory fields not filled in
    #Select one selected
    And user click the next button on the about page
    And user checks if mandatory fields are validated
    #Single is selected
    When user selects "Single" as Relationship Status on about page
    And user click the next button on the about page
    And user checks if mandatory fields are validated when single is selected
    #Widowed is selected
    When user selects "Widowed" as Relationship Status on about page
    And user click the next button on the about page
    And user checks if mandatory fields are validated when widowed is selected
    #Married is selected
    When user selects "Married" as Relationship Status on about page
    And user click the next button on the about page
    And user checks if mandatory fields are validated when married is selected
    #Defacto is selected
    When user selects "Defacto" as Relationship Status on about page
    And user click the next button on the about page
    And user checks if mandatory fields are validated when defacto is selected
    #Engaged is selected
    When user selects "Engaged" as Relationship Status on about page
    And user click the next button on the about page
    And user checks if mandatory fields are validated when engaged is selected
    #Separated is selected
    When user selects "Separated" as Relationship Status on about page
    And user click the next button on the about page
    And user checks if mandatory fields are validated when separated is selected
     #Divorced is selected
    When user selects "Divorced" as Relationship Status on about page
    And user click the next button on the about page
    And user checks if mandatory fields are validated when divorced is selected

    Examples: 
      | email            | password     | Address1                                         | Suburb         |
      | demeth@gmail.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |
      
      #Scenario 4 - Couples Package
  @Sprint1
  Scenario Outline: Single - Scenario 4: Mandatory fields filled in
    # Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    #Select Standard will Package
    When user clicks Standard will product for couples
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
    And user fill up the all required fields for single status
    And user click the next button on the about page
    Then user is on "Assets" page

    Examples: 
      | email            | password     | Address1                                         | Suburb         |
      | demeth@gmail.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |

  @Sprint11
  Scenario Outline: Defacto - Scenario 4: Mandatory fields filled in
    # Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    #Select Standard will Package
    When user clicks Standard will product for couples
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
    #Defacto
    When user selects "Defacto" as Relationship Status on about page
    And user fill up the all required fields for defacto status
    And user click the next button on the about page
    Then user is on "Assets" page

    Examples: 
      | email            | password     | Address1                                         | Suburb         |
      | demeth@gmail.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |

  @Sprint1
  Scenario Outline: Engaged - Scenario 4: Mandatory fields filled in
    # Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    #Select Standard will Package
    When user clicks Standard will product for couples
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
    #Engaged
    When user selects "Engaged" as Relationship Status on about page
    And user fill up the all required fields for engaged status
    And user click the next button on the about page
    Then user is on "Assets" page

    Examples: 
      | email            | password     | Address1                                         | Suburb         |
      | demeth@gmail.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |
      @Sprint1
  Scenario Outline: Married - Scenario 4: Mandatory fields filled in
    # Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    #Select Standard will Package
    When user clicks Standard will product for couples
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
    #Married
    When user selects "Married" as Relationship Status on about page
    And user fill up the all required fields for married status
    And user click the next button on the about page
    Then user is on "Assets" page

    Examples: 
      | email            | password     | Address1                                         | Suburb         |
      | demeth@gmail.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |
      
      Scenario Outline: Widowed - Scenario 4: Mandatory fields filled in
    # Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    #Select Standard will Package
    When user clicks Standard will product for couples
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
    #Widowed
    When user selects "Widowed" as Relationship Status on about page
    And user fill up the all required fields for widowed status
    And user click the next button on the about page
    Then user is on "Assets" page

    Examples: 
      | email            | password     | Address1                                         | Suburb         |
      | demeth@gmail.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |
           @Sprint1
  Scenario Outline: Separated - Scenario 4: Mandatory fields filled in
    # Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    #Select Standard will Package
    When user clicks Standard will product for couples
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
    #Separated
    When user selects "Separated" as Relationship Status on about page
    And user fill up the all required fields for separated status
    And user click the next button on the about page
    Then user is on "Assets" page

    Examples: 
      | email            | password     | Address1                                         | Suburb         |
      | demeth@gmail.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |
      
       Scenario Outline: Divorced - Scenario 4: Mandatory fields filled in
    # Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    #Select Standard will Package
    When user clicks Standard will product for couples
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
    #Divorced
    When user selects "Divorced" as Relationship Status on about page
    And user fill up the all required fields for divorced status
    And user click the next button on the about page
    Then user is on "Assets" page

    Examples: 
      | email            | password     | Address1                                         | Suburb         |
      | demeth@gmail.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |
      
      #Scenario 4 - Single Package
      
       @Sprint1
  Scenario Outline: Single - Scenario 4: Mandatory fields filled in
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
    And user fill up the all required fields for single status
    And user click the next button on the about page
    Then user is on "Assets" page

    Examples: 
      | email            | password     | Address1                                         | Suburb         |
      | demeth@gmail.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |

  @Sprint11
  Scenario Outline: Defacto - Scenario 4: Mandatory fields filled in
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
    #Defacto
    When user selects "Defacto" as Relationship Status on about page
    And user fill up the all required fields for defacto status
    And user click the next button on the about page
    Then user is on "Assets" page

    Examples: 
      | email            | password     | Address1                                         | Suburb         |
      | demeth@gmail.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |

  @Sprint1
  Scenario Outline: Engaged - Scenario 4: Mandatory fields filled in
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
    #Engaged
    When user selects "Engaged" as Relationship Status on about page
    And user fill up the all required fields for engaged status
    And user click the next button on the about page
    Then user is on "Assets" page

    Examples: 
      | email            | password     | Address1                                         | Suburb         |
      | demeth@gmail.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |
      @Sprint1
  Scenario Outline: Married - Scenario 4: Mandatory fields filled in
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
    #Married
    When user selects "Married" as Relationship Status on about page
    And user fill up the all required fields for married status
    And user click the next button on the about page
    Then user is on "Assets" page

    Examples: 
      | email            | password     | Address1                                         | Suburb         |
      | demeth@gmail.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |
      
      Scenario Outline: Widowed - Scenario 4: Mandatory fields filled in
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
    #Widowed
    When user selects "Widowed" as Relationship Status on about page
    And user fill up the all required fields for widowed status
    And user click the next button on the about page
    Then user is on "Assets" page

    Examples: 
      | email            | password     | Address1                                         | Suburb         |
      | demeth@gmail.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |
           @Sprint1
  Scenario Outline: Separated - Scenario 4: Mandatory fields filled in
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
    #Separated
    When user selects "Separated" as Relationship Status on about page
    And user fill up the all required fields for separated status
    And user click the next button on the about page
    Then user is on "Assets" page

    Examples: 
      | email            | password     | Address1                                         | Suburb         |
      | demeth@gmail.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |
      
       Scenario Outline: Divorced - Scenario 4: Mandatory fields filled in
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
    #Divorced
    When user selects "Divorced" as Relationship Status on about page
    And user fill up the all required fields for divorced status
    And user click the next button on the about page
    Then user is on "Assets" page

    Examples: 
      | email            | password     | Address1                                         | Suburb         |
      | demeth@gmail.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |
      
      
      
      
