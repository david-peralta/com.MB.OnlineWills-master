Feature: MW - 102

  @WIP
  Scenario Outline: 
    #Go to site and log in
    Given user opens browser and proceeds to orders page
    Then user selects "victorian@gmail.com" on user dropdown
    Then user clicks on delete all button

    #Then user close browser
    Examples: 
      | email                   | password     | Address1                                         | Suburb         |
      | victorian@gmail.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |

  @Regression
  Scenario Outline: 
    # Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    When user selects singles product
    #Select Single - MyLife will Package
    #Scenario 1: Customer selects the MyLife Documents product
    When user clicks MyLife will product for singles
    Then user is on "Personal" page
    #User filled valid input
    When user fills up mandatory fields inside the personal page for victorian
    #Scenario 2: Customer completes the ‘Personal Details’ page
    When user clicks next page to review and confirm details
    Then user is on "Review and Confirm" page
    #Scenario 3: Customer reviews information entered and confirm acknowledgment
    And user reviews personal details
    And user confirms will details
    When user clicks the next button to confirm will
    Then user is on "Thank You" page
    And user sees message "Thank you"

    Examples: 
      | email                   | password     | Address1                                         | Suburb         |
      | victorian@gmail.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |
