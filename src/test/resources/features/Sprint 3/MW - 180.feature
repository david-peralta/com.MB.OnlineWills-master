Feature: MW - 180

  @Sprint3
  Scenario Outline: 
    #Login to Online Wills Backoffice
    Given user opens admin page
    When user logs into app with the "<email>" and "<password>" to dashboard
    Then user is on "Dashboard" page
    Then user clicks on union list menu
    #Union List
    Then user is on "Union List" page
    #Scenario 1 - Add Union
    Then user clicks on add union button
    Then check add rule
    And user fill up add union details
    Then user click save button
    Then user clicks on add union button
    Then check add rule
    And user fill up add union details
    Then user click save button


    #MW-115 Scenario 4: Edit Rule
    Examples: 
      | email    | password     | Address1  | Suburb         |
      | backuser | Password123! | Australia | Executive Lane |
