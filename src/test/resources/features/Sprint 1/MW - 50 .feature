Feature: MW - 50 : As a customer, I want to view all the products available to me so that I can choose the right product to meet my needs

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
    #MyLife Documents Product Name
    And user sees message "MyLife Documents™"
    #MyLife Documents Product Overview
    And user sees message "Two consultations with a Maurice Blackburn lawyer to create five vital documents."
    #MyLife Documents A ‘Get started’ call to action button
    And user sees MyLife will Get Started button for couples product

    Examples: 
      | email               | password     |
      | Victorian@gmail.com | Password123! |

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
    #MyLife Documents Product Name
    And user sees message "MyLife Documents™"
    #Products price
    And user sees message "$1,290"

    Examples: 
      | email               | password     |
      | Victorian@gmail.com | Password123! |

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
    #MyLife Documents Product Name
    And user sees message "MyLife Documents™"
    #Products price
    And user sees message "$1,450"

    Examples: 
      | email               | password     |
      | Victorian@gmail.com | Password123! |
