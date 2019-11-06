Feature: MW - 25 : As a customer, I want to enter the required details about my Relationship Status, so I can process my Will

  @Sprint1
  Scenario Outline: EngagedCouples Scenario 2: Customer fills in additional details based on Relationship Status selected
    # Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    #Select Standard will Package
    When user clicks Standard will product for couples
    Then user is on "Personal" page
    #User filled valid input
    When user selects "Dr" as title on personal page
    When user inputs "05/09/1990" as date of birth on personal page
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
    #Engaged is selected
    When user selects "Engaged" as Relationship Status on about page
    #Check if additional questions is displayed
    And user checks if additional questions displayed for engaged is correct when couple product is selected

    Examples: 
      | email            | password     | Address1                                         | Suburb         |
      | demeth@gmail.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |

  @Sprint1
  Scenario Outline: EngagedSingles Scenario 2: Customer fills in additional details based on Relationship Status selected
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
    When user inputs "05/09/1990" as date of birth on personal page
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
    #Engaged is selected
    When user selects "Engaged" as Relationship Status on about page
    #Check if additional questions is displayed
      And user checks if additional questions displayed for engaged is correct when single product is selected

    Examples: 
      | email            | password     | Address1                                         | Suburb         |
      | demeth@gmail.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |
