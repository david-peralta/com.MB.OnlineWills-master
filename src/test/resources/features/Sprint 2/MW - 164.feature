Feature: MW - 164
  @Regression
  Scenario Outline: Delete Order
    #Delete Order for a fresh start
    Given user opens browser and proceeds to orders page
    Then user selects "<email>" on user dropdown
    Then user clicks on delete all button

    Examples: 
      | email                   |
      | david.peralta@yahoo.com |

  @Sprint
  Scenario Outline: 
    # Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    #When user clicks on new order on incomplete order popup
    When user selects singles product
    #Select Standard will Package
    When user clicks Standard will product for singles
    Then user is on "Personal" page
    #User filled valid input
    And user fills up mandatory fields inside the personal page for victorian
    When user clicks on Next button on personal page
    #About Page
    Then user is on "About you" page
    When user selects "Single" as Relationship Status on about page
    Then user fill up the all required fields for single status
    #Scenario 1: Upload more than 1 document
    And user sees message "If you have a will, please upload here." 
    And user uploads more than one will inside the about you page  
    And user click the next button on the about page
   	Then user is on "Assets" page
    #Scenario 2: Save more than 1 document
    And user click the back button on the assets page
   	#Remove
    And user removes the attached file on about you page
  


    Examples: 
      | email                   | password     | Address1                                         | Suburb         |
      | david.peralta@yahoo.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |
