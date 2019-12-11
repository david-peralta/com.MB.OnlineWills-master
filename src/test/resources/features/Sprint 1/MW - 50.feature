Feature: MW - 50 : As a customer, I want to view all the products available to me so that I can choose the right product to meet my needs

  @Sprint
  Scenario Outline: Scenario 1: Customer views the Products Landing page
    #Go to site and log in
    Given user opens browser and proceeds to orders page
    Then user selects "victorian@gmail.com" on user dropdown
    Then user clicks on delete all button
    #Go to site and log in
    Given user opens browser and proceeds to orders page
    Then user selects "victorian@gmail.com" on user dropdown
    Then user clicks on delete all button
    #Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    And user sees products displayed on landing page
    And user checks if Couples product is selected by default
    #Standard Will Product Name
    And user sees message "Standard Will"
    #Standard Will Product Overview
    And user sees message "It takes only 30 mins to provide us with all the information we need to draft a Will for you and your spouse/partner."
    #Standard Will A ‘Get started’ call to action button
    And user sees Standard will Get Started button for couples product
    #MyLife Documents Product Name
    And user sees message "MyLife Documents®"
    #MyLife Documents Product Overview
    And user sees message "Two consultations with an expert Wills & Estates lawyer to create five vital documents for you and your spouse/partner."
    #MyLife Documents A ‘Get started’ call to action button
    And user sees MyLife will Get Started button for couples product

    Examples: 
      | email               | password     |
      | Victorian@gmail.com | Password123! |

  @Sprint
  Scenario Outline: Scenario 2: Customer views the products for singles
    #Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    When user selects singles product
    #Standard Will Product Name
    And user sees message "Standard Will"
    #Products price
    And user sees message "$399"
    #MyLife Documents Product Name
    And user sees message "MyLife Documents®"
    #Products price
    And user sees message "$1290"

    Examples: 
      | email               | password     |
      | Victorian@gmail.com | Password123! |

  @Sprint
  Scenario Outline: Scenario 3: Customer views the products for couples
    #Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    When user selects couples product
    #Standard Will Product Name
    And user sees message "Standard Will"
    #Products price
    And user sees message "$599"
    #MyLife Documents Product Name
    And user sees message "MyLife Documents®"
    #Products price
    And user sees message "$1450"

    Examples: 
      | email               | password     |
      | Victorian@gmail.com | Password123! |
