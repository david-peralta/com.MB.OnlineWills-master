Feature: MW - 30 : As a customer, I want to list all my children, so I can indicate my family situation in my Will

  @WIP
  Scenario: 
    #Go to site and log in
    Given user opens browser and proceeds to orders page
    Then user selects "david.peralta@yahoo.com" on user dropdown
    Then user clicks on delete all button
    Then user close browser

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
    When user fills up mandatory fields inside the personal page for victorian
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
    Then user close browser

    Examples: 
      | email                   | password     | Address1                                         | Suburb         |
      | david.peralta@yahoo.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |
