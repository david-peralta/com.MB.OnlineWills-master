Feature: MW - 30 : As a customer, I want to list all my children, so I can indicate my family situation in my Will

  @Sprint1
  Scenario Outline: Scenario 1: Customer indicates they have a child/children
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
    And user sees message "Do you have any children?"
    And user answers yes to question do have children
    And user checks if all fields inside the adding of children is complete
    #Scenario 2: Mandatory fields not filled in
    And user check if mandatory fields validation in adding children is implemented
    #Scenario 3: Mandatory fields filled in
    #Add child
    And user adds a legitimate child
    And user check if add child link is displayed for the user to add another child
    #Scenario 4: Customer adds another child
    And user adds another legitimate child
    #Scenario 5: Customer edits their child’s details
    And user edits first child's details
    #Scenario 6: Customer removes child record from the table
    And user removes second child
    Examples: 
      | email            | password     | Address1                                         | Suburb         |
      | demeth@gmail.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |
