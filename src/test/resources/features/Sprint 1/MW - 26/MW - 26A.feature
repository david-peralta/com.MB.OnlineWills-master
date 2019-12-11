Feature: MW - 26A : As a customer, I want to list all my assets so I can provide my financial status to help process my Will
 	  @WIP
  	Scenario: 
    #Go to site and log in
    Given user opens browser and proceeds to orders page
    Then user selects "bam@bam.com" on user dropdown
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
    And user click the next button on the about page
    Then user is on "Assets" page
    #Scenario 1: Customer indicates they have an asset
    And user sees question "Do you have any assets?"
    And user checks if do you have assets question is mandatory
    And user clicks yes to do you have assets question
    And user clicks on Add Asset
    And user checks if Select Asset question is mandatory
    #Select Asset
    #Default value and checking of values
    And user checks on validation on Select Asset
    #Property
    When user selects "Property" as Asset on assets page
    And user checks if validations of fields inside the adding of property asset is implemented
    And user fills up all fields inside the adding of property asset
    Then user close browser

    Examples: 
      | email            | password     | Address1                                         | Suburb         |
      | bam@bam.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |