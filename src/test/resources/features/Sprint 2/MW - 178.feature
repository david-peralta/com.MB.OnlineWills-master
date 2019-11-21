Feature: MW - 178

  @Regression1
  Scenario Outline: 
    #Scenario1
    #Standard Single Will - NON VIC
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    And user clicks on new order on incomplete order popup
    And user verifies if css is displayed
    When user selects singles product
    Then user checks standard will title is displayed
    And user checks standard will body is displayed

    Examples: 
      | email                   | password     |
      | david.peralta@yahoo.com | Password123! |

  @Regression
  Scenario Outline: 
    #Scenario2
    #Standard Couple Will - NON VIC
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    And user clicks on new order on incomplete order popup
    And user verifies if css is displayed
    When user selects couples product
    Then user checks couple will title is displayed
    And user checks couple will body is displayed
    And user checks couple will types is displayed

    Examples: 
      | email                   | password     |
      | david.peralta@yahoo.com | Password123! |

  @Regression
  Scenario Outline: 
    #Scenario3
    #Standard Single Will - VIC
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    And user clicks on new order on incomplete order popup
    And user verifies if css is displayed
    When user selects singles product
    Then user checks standard will title is displayed
    And user checks standard will body is displayed

    Examples: 
      | email               | password     | Address1                                         | Suburb         |
      | Victorian@gmail.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |

  @Regression
  Scenario Outline: 
    #Scenario3
    #Standard Couple Will - VIC
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    And user clicks on new order on incomplete order popup
    And user verifies if css is displayed
    When user selects couples product
    Then user checks couple will title is displayed
    And user checks couple will body is displayed
    And user checks couple will types is displayed

    Examples: 
      | email               | password     | Address1                                         | Suburb         |
      | Victorian@gmail.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |
