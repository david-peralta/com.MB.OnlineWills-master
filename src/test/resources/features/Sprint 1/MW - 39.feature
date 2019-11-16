Feature: MW - 39 : As a customer, I want to enter the required details about my funeral wishes, so I can specify what I want done to my body when I pass away

  @Sprint11
  Scenario Outline: 
    # Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    When user clicks on new order on incomplete order popup
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
    And user fill up the all required fields for single status with children
    And user click the next button on the about page
    Then user is on "Assets" page
    And user clicks no to do you have assets question
    #Asset answer "no" to other question
    And user clicks no to do you have debts question
    And user clicks no to do you have any superannuation question
    And user clicks no to do you have life insurance separate from your superannuation
    And user clicks no to do you control a trust question
    And user clicks no to do you control a self-managed superannuation fund question
    And user clicks no to do you own your own business or are you a partner in a partnership question
    And user click the next button on the assets page
    #Skip Beneficiaries Page
    And user clicks yes to Do you want to give the whole estate equally to your children question
    And user clicks no to Do you want to include any children you have in the future question
    And user clicks no to If any of your children predecease you, do you want to divide it equally amongst their children question
    And user clicks no to Do you wish to leave any gifts question
    And user click the next button on the beneficiaries page
    #Executors Page
    Then user is on "Executors" page
    #  And user adds first option executor
    And user clicks on add executor
    And user adds first option executor
    And user clicks on add executor
    And user adds back up executor
    And user clicks no to Would you like Maurice Blackburn to help your Executor manage your estate question
    And user click the next button on the executors page
    And user checks if funeral wishes question is mandatory
    #Buried
    And user selects i have buried on funeral wishes
    And user sees message "I want body buried at:"
    And user sees funeral wishes field
    And user click the next button on the executors page
    Then user is on "ID Check" page
    And user clicks back button on the ID docs page
    Then user is on "Executors" page
    #Cremated
    And user selects i have cremated on funeral wishes
    And user sees message "I wish for my ashes to be:"
    And user sees funeral wishes field
    And user click the next button on the executors page
    Then user is on "ID Check" page
    And user clicks back button on the ID docs page
    Then user is on "Executors" page
    #Other
    And user selects i have other on funeral wishes
    And user sees question "I want..."
    And user sees funeral wishes field
    And user click the next button on the executors page
    Then user is on "ID Check" page
    And user clicks back button on the ID docs page
    Then user is on "Executors" page
    #No Wish
    And user selects i have no wish on funeral wishes
    And user click the next button on the executors page
    Then user is on "ID Check" page

    Examples: 
      | email            | password     | Address1                                         | Suburb         |
      | demeth@gmail.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |