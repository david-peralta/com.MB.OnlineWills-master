Feature: MW - 32 : As a customer, I want to nominate a guardian for my children below 18 years old, so they can be looked after when I have passed away

  @WIP
  Scenario: 
    #Go to site and log in
    Given user opens browser and proceeds to orders page
    Then user selects "david.peralta@yahoo.com" on user dropdown
    Then user clicks on delete all button
    Then user close browser

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
    When user fills up mandatory fields inside the personal page for victorian
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
    And user sees question "Do you want to appoint someone to look after your child/children"
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
    Then user close browser

    #Scenario 7: Customer cancels with no unsaved changes
    Examples: 
      | email                   | password     | Address1                                         | Suburb         |
      | david.peralta@yahoo.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |
