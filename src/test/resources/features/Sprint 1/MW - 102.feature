Feature: MW - 73 - As a customer, I want to skip filling in the Executor details if my Will has been identified as complex so that I can discuss this directly with the lawyer

  @Regression
  Scenario Outline: 
    # Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    And user clicks on new order on incomplete order popup
    When user selects singles product
    #Select Single - MyLife will Package
    #Scenario 1: Customer selects the MyLife Documents product
    When user clicks MyLife will product for singles
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
    #Scenario 2: Customer completes the ‘Personal Details’ page
    When user clicks next page to review and confirm details
    Then user is on "ReviewAndConfirm" page
    #Scenario 3: Customer reviews information entered and confirm acknowledgment
    And user reviews personal details
    And user confirms will details
    When user clicks the next button to confirm will
    Then user is on "Thank You" page
    And user sees message "Thank you"

    Examples: 
      | email               | password     | Address1                                         | Suburb         |
      | Victorian@gmail.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |
