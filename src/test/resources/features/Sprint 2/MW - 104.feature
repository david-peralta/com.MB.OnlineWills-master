Feature: MW - 104 As a Legal Assistant, I want to navigate to a Dashboard, So that I can easily view who I need to contact

  @Regression
  Scenario Outline: 
    # Go to site and log in
    #Scenario1
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" to dashboard
    Then user is on "Dashboard" page
    Then user checks dashboard table displayed
    

    Examples: 
      | email    | password     | Address1                                         | Suburb         |
      | backuser | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |
