Feature: MW - 105 As a Legal Assistant, I want to search through my Dashboard, So that I can easily find the User I want to contact

  @Regression
  Scenario Outline: 
    # Go to site and log in
    #Scenario1
    Given user opens admin page
    When user logs into app with the "<email>" and "<password>" to dashboard
    Then user is on "Dashboard" page
    #Scenario2
    #And user checks dashboard table displayed
    #Scenario3
    #And user checks newest row in dashboard
    #And user checks oldest row in dashboard
    When user searches for a user in dashboard
    When user clicks more option to search

    #When user updates action details in dashboard
    #Then user enters invalid date in action
    #And user sees feedback message "Invalid Date"
    #Then user sorts dashboard column
    
    Examples: 
      | email    | password     |
      | backuser | Password123! |

  @Regression
  Scenario Outline: 
    # Go to site and log in
    #Scenario2
    Given user opens admin page
    When user logs into app with the "<email>" and "<password>" to dashboard
    Then user is on "Dashboard" page
    #And user checks dashboard table displayed
    #And user checks newest row in dashboard
    #And user checks oldest row in dashboard
    When user searches for a user in dashboard
    When user clicks more option to search
    #When user updates action details in dashboard
    #Then user enters invalid date in action
    #And user sees feedback message "Invalid Date"
    #Then user sorts dashboard column
    
    Examples: 
      | email    | password     |
      | backuser | Password123! |

  @Regression
  Scenario Outline: 
    # Go to site and log in
    #Scenario3
    Given user opens admin page
    When user logs into app with the "<email>" and "<password>" to dashboard
    Then user is on "Dashboard" page
    #And user checks dashboard table displayed
    #And user checks newest row in dashboard
    #And user checks oldest row in dashboard
    When user searches for a user in dashboard
    When user clicks more option to search
    #When user updates action details in dashboard
    #Then user enters invalid date in action
    #And user sees feedback message "Invalid Date"
    #Then user sorts dashboard column
    Then user checks if search fields are displayed
    #Scenario 6
    Then user clicks more option to search

    Examples: 
      | email    | password     |
      | backuser | Password123! |
      
  @Regression
  Scenario Outline: 
    # Go to site and log in
    #Scenario4
    Given user opens admin page
    When user logs into app with the "<email>" and "<password>" to dashboard
    Then user is on "Dashboard" page
    Then user clicks more option to search
    And user checks newest row in dashboard
    #Scenario2
    #Scenario3
   

    Examples: 
      | email    | password     |
      | backuser | Password123! |
      
  @Regression
  Scenario Outline: 
    # Go to site and log in
    #Scenario5
    Given user opens admin page
    When user logs into app with the "<email>" and "<password>" to dashboard
    Then user is on "Dashboard" page
    And user searches for a user that is not in dashboard
		And user sees no forms in the dashboard

    Examples: 
      | email    | password     |
      | backuser | Password123! |
