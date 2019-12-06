Feature: MW-174

  @Sprint3
  Scenario Outline: 
    #Scenario 5: Primary User has invited Spouse to complete Will (with POA)
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    And user clicks on new order on incomplete order popup
    And user selects couples product
    And user clicks Standard will product for couples
    When user selects "Dr" as title on personal page
    When user inputs "01/01/1993" as date of birth on personal page
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
    And user selects "Married" as Relationship Status on about page
    And user fill up the all required fields for married status
    And user clicks no to do you want to do your will with your spouse or partner question
    And user click the next button on the about page
    And user clicks no to do you have assets question
    And user clicks no to do you have debts question
    And user clicks no to do you have any superannuation question
    And user clicks no to do you have life insurance separate from your superannuation
    And user clicks no to do you control a trust question
    And user clicks no to do you control a self-managed superannuation fund question
    And user clicks no to do you own your own business or are you a partner in a partnership question
    And user click the next button on the assets page
    And user clicks no to do you want to leave your whole estate to your spouse/partner if they survive you question
    And user clicks yes to Do you want to include any children you have in the future question
    And user clicks no to If any of your children predecease you, do you want to divide it equally amongst their children question
    And user clicks no to Do you wish to leave any gifts question
    And user click the next button on the beneficiaries page
    And user clicks on add executor
    And user adds first option executor
    And user clicks on add executor
    And user adds back up executor
    And user clicks no to Would you like Maurice Blackburn to help your Executor manage your estate question
    And user selects i have no wish on funeral wishes
    And user click the next button on the executors page
    And user agrees to terms and agreement inside the ID docs Page
    And user selects Foreign Passport as first identification type
    And user adds foreign passport details
    And user selects Driver License as second identification type
    And user adds driver license details
    And user clicks next button on the ID docs page
    And user is on "Review and Confirm" page
    And user confirms will details
    When user click the next button on the review and confirm page
    Then user is on "Add-Ons" page
    And user sees the add your spouse/partner option
    And user checks spouse invitation message
    When user input spouse email
    Then user clicks save spouse email

    Examples: 
      | email                   | password     | Address1  | Suburb         |
      | david.peralta@yahoo.com | Password123! | Australia | Executive Lane |
