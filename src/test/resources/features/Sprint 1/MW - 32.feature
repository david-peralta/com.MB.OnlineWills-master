Feature: MW - 32 : As a customer, I want to nominate a guardian for my children below 18 years old, so they can be looked after when I have passed away

  @Sprint1
  Scenario Outline: MW - 32 : As a customer, I want to nominate a guardian for my children below 18 years old, so they can be looked after when I have passed away
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
    #About you page
    #Single
    When user selects "Single" as Relationship Status on about page
    And user fill up the all required fields for single status
    And user answers yes to question do have children
    #Add child
    And user adds a legitimate child
    #Scenario 1: Customer indicates they have a child/children under 18
    And user sees question "Would you like to appoint someone to look after your child/children (their Guardian)?"
    And user click the next button on the about page
    And user checks if guardian question is mandatory
    And user selects yes on guardian question
    And user checks if validation on mandatory fields inside the adding of guardian is implemented
    And user checks if the default value for country inside the adding of guardian screen is set to Australia
    #Add a guardian
    And user adds a guardian
    And user sees message "Primary Guardian"
    And user adds secondary guardian
    And user sees message "Secondary Guardian"
    #Edit
    When user edits the detials of secondary guardian
    #Delete
    When user deletes the secondary guardian
    
    #Scenario 7: Customer cancels with no unsaved changes

    Examples: 
      | email            | password     | Address1                                         | Suburb         |
      | demeth@gmail.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |
