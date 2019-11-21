Feature: MW - 177 114 115: Union List

  @Sprint
  Scenario Outline: 
    #Login to Online Wills Backoffice
    Given user opens admin page
    When user logs into app with the "<email>" and "<password>" to dashboard
    Then user is on "Dashboard" page
    Then user clicks on union list menu
    #Union List
    Then user is on "Union List" page
    Then user clicks on add union button
    
    #MW-115 Scenario 1: Validation Rule prompt
    Then check add rule
    Then user click save button
    Then user sees alert message
    Then user select alphanumeric string type
    Then user click save button
    Then user sees alert message for alpha location
    #MW-115 Scenario 2: Cancel out of Add
    Then user click cancel button
    Then user clicks on add union button
    
    #MW-177 Scenario 1: Max Length must be greater than the Min Length
    Then check add rule
    Then user select alphanumeric string type
    And user enter min length greater than max length
    Then user click save button
    Then user sees message "Max Length must be greater than the Min Length"
    #MW-177 Scenario 2: Min Length must be greater than 0
    When user enter min length less than zero
    Then user click save button
    Then user sees message "Min Length must be greater than 0"
    #MW-177 Scenario 3: Alpha Length cannot be equal to Max Length
    When user enter alpha length equal to max length
    Then user click save button
    Then user sees message "Alpha Length cannot be equal to or greater than Max Length"
    #MW-177 Scenario 4: Alpha Length cannot be greater than Max Length
    When user enter alpha length greater than to max length
    Then user click save button
    Then user sees message "Alpha Length cannot be equal to or greater than Max Length"
    #MW-177 Scenario 5: Alpha Length cannot be equal to zero
    When user enter alpha length equal to zero
    Then user click save button
    Then user sees message "Alpha Length cannot be equal or less than 0"
    #MW-177 Scenario 6: Alpha Length cannot be less than zero
    When user enter alpha length less than zero
    Then user click save button
    Then user sees message "Alpha Length cannot be equal or less than 0"
    #MW-177 Scenario 7: Max Length must be smaller than 50
    When user enter max length greater than fifty
    Then user click save button
    Then user sees message "Max Length must be smaller than 50"
    Then user click cancel button
    Then user is on "Union List" page    
    
    #MW-115 Scenario 3: Add Rule
    Then user clicks on add union button
    Then check add rule
    And user fill up add union details
    Then user click save button
    Then user is on "Union List" page
    #MW-115 Scenario 4: Edit Rule
    Then user clicks on edit union
    Then user fill up edit union details
    Then user click save button
    Then user is on "Union List" page
    And user check for the edited union
    Then user clicks on edit union then cancel
    Then user fill up edit union details and cancel
    Then user click cancel button
    Then user is on "Union List" page
    And user check for the edited union
    
    #MW-114 Scenario 1: Delete Rule
    Then user click delete button
    And windows alert message is displayed
    When user hits the enter key
    Then user is on "Union List" page
    And user check for the edited union
    
    
    
    
    
    
    	

    Examples: 
      | email    | password     | Address1  | Suburb         |
      | backuser | Password123! | Australia | Executive Lane |
