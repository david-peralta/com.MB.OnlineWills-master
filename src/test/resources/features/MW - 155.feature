Feature: MW - 155 : As a Administrator, I want to access the Admin Portal, So that I can view the Dashboard, run reports and manage Unions

  @Sprint
  Scenario Outline: Scenario 1: Login to Admin Portal
    # Go to admin site and log in
    Given user opens admin page
    When user logs into app with the "<email>" and "<password>" as the admin login credentials
    Then user is on "Dashboard" page

    Examples: 
      | email    | password     |
      | backuser | Password123! |

  @Sprint
  Scenario Outline: Scenario 2: Customer locks account / Scenario 3: Customer attempts to login during the lockout period
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the admin login credentials
    And user logs into app with the "<email>" and "<password>" as the admin login credentials
    And user logs into app with the "<email>" and "<password>" as the admin login credentials
    And user logs into app with the "<email>" and "<password>" as the admin login credentials
    Then user is on "Login" page
    When user becomes inactive for "1" minutes
    And user sees feedback message "Too many failed login attempts. Please try again in a few minutes."
    When user becomes inactive for "1" minutes
    And user logs into app with the "<email>" and "<password>" as the admin login credentials
    Then user sees feedback message "Invalid username or password."
    When user logs into app with the "<email>" and "<password>" as the admin login credentials
    And user logs into app with the "<email>" and "<password>" as the admin login credentials
    And user logs into app with the "<email>" and "<password>" as the admin login credentials
    And user logs into app with the "<email>" and "<password>" as the admin login credentials
    And user logs into app with the "<email>" and "<password>" as the admin login credentials
    Then user is on "Login" page
    And user sees feedback message "Too many failed login attempts. Please try again in a few minutes."
    When user becomes inactive for "30" minutes
    And user logs into app with the "<email>" and "<password>" as the admin login credentials
    Then user sees feedback message "Invalid username or password."
    When user logs into app with the "<email>" and "<password>" as the admin login credentials
    And user logs into app with the "<email>" and "<password>" as the admin login credentials
    And user logs into app with the "<email>" and "<password>" as the admin login credentials
    And user logs into app with the "<email>" and "<password>" as the admin login credentials
    And user logs into app with the "<email>" and "<password>" as the admin login credentials
    And user logs into app with the "<email>" and "<password>" as the admin login credentials
   When user becomes inactive for "1" minutes
    Then user sees feedback message "Too many failed login attempts. Please try again in 60 minutes."

    Examples: 
      | email             | password     |
      | jaycool@gmail.com | WrongMistake |

  @Sprint
  Scenario Outline: Scenario 4: Customer's session has been inactive
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    # And user clicks on new order on incomplete order popup
    Then user is on "Landing" page
    When user becomes inactive for "20" minutes
    And user selects couples product
    And user clicks Standard will product for couples
    Then user is on "Landing" page

   Examples: 
      | email             | password     |
      | jaycool@gmail.com | WrongMistake |
