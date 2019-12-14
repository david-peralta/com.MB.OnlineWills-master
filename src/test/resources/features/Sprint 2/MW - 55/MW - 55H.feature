Feature: MW - 55

  @Sprint1
  Scenario Outline: 
    #Delete Order for a fresh start
    Given user opens browser and proceeds to orders page
    Then user selects "<email>" on user dropdown
    Then user clicks on delete all button

    Examples: 
      | email            |
      | demeth@gmail.com |

  
  @Regression
  Scenario Outline: 
    #Scenario8
    # Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    #And user clicks on new order on incomplete order popup
    When user selects singles product
    #Select Single - MyLife will Package
    #Scenario 1: Customer selects the MyLife Documents product
    When user clicks MyLife will product for singles
    Then user is on "Personal" page
    #User filled valid input
   And user fills up mandatory fields inside the personal page for victorian
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
      | email               | password     | 
      | Victorian@gmail.com | Password123! |
