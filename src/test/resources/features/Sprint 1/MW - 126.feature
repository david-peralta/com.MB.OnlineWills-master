Feature: MW - 126e : Update Product Landing with new UI
  @Sprint1
  Scenario Outline: Scenario 1: Customer views the Products Landing page
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    And user sees products displayed on landing page
    And user checks if Couples product is selected by default
    #Standard Will Product Name
    And user sees message "Standard Will"
    #Standard Will Product Overview
    And user sees message "Provide your instructions in 30 minutes and an expert lawyer Will be in touch to confirm, then draft your Will."
    #Standard Will A ‘Get started’ call to action button
    And user sees Standard will Get Started button for couples product

    Examples: 
      | email                  | password     |
      | NonVictorian@gmail.com | Password123! |

  @Sprint1
  Scenario Outline: Scenario 2: Customer views the products for singles
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    When user selects singles product
    #Standard Will Product Name
    And user sees message "Standard Will"
    #Products price
    And user sees message "$399"

    Examples: 
      | email                  | password     |
      | NonVictorian@gmail.com | Password123! |

  @Sprint1
  Scenario Outline: Scenario 3: Customer views the products for couples
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    When user selects couples product
    #Standard Will Product Name
    And user sees message "Standard Will"
    #Products price
    And user sees message "$599"

    Examples: 
      | email                  | password     |
      | NonVictorian@gmail.com | Password123! |
