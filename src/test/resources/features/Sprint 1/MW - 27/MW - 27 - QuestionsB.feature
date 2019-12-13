Feature: MW - 27B Questions : As a customer, I want to list my beneficiaries so I can allocate my Will
 @WIP
  Scenario: 
    #Go to site and log in
    Given user opens browser and proceeds to orders page
    Then user selects "bam@bam.com" on user dropdown
    Then user clicks on delete all button
    Then user close browser
  @Sprint1
  Scenario Outline: 
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
    And user fill up the all required fields for single status with children
    And user click the next button on the about page
    Then user is on "Assets" page
    And user clicks no to do you have assets question
    #Asset answer "no" to other question
    And user clicks no to all assets question
    And user click the next button on the assets page
    #No Spouse and Yes Children
    And user sees question "Do you want to give the whole estate equally to your children?"
    And user clicks yes to Do you want to give the whole estate equally to your children question
    And user sees question "Do you want to include any children you have in the future?"
    And user clicks yes to Do you want to include any children you have in the future question
    And user sees question "If any of your children predecease you"
    And user clicks no to Do you want to include any children you have in the future question
    And user sees question "If any of your children predecease you"
    And user clicks yes to If any of your children predecease you, do you want to divide it equally amongst their children question
    And user sees disaster question displayed
    And user clicks no to If any of your children predecease you, do you want to divide it equally amongst their children question
    And user sees disaster question displayed
    And user clicks no to Do you want to give the whole estate equally to your children question
    And user sees beneficiary question displayed
    Then user close browser

    Examples: 
      | email       | password     | Address1                                         | Suburb         |
      | bam@bam.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |