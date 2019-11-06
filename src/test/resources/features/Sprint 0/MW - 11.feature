Feature: MW - 11 : As a registered customer, I want to log in to MB's portal so that I can access their online wills services

  @Regression
  Scenario: Scenario 1: User views Login page
    Given user opens browser
    Then user is on "Login" page
    And user checks if the contents inside the login page is complete

  @Regression
  Scenario Outline: Scenario 2: Mandatory fields not filled in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    And user checks if validation error for required field appears on login page

    Examples: 
      | email | password |
      |       |          |

  @Regression
  Scenario Outline: Scenario 3: Invalid Credentials Entered
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    And user sees feedback message "Invalid username and/or password.  Please try again."
    And user sees the previous "<email>" value displayed in the email field
    And user checks if password field is cleared

    Examples: 
      | email            | password     |
      | Wrong@Email.com  | Password123! |
      | Demeth@gmail.com | P4ssword123! |

  @Regression
  Scenario Outline: Scenario 4: Valid Credentials Entered
    Given user opens browser
    When user logs into app
    Then user is on "Landing" page
    And user sees message "Welcome"
    And user sees message "<FirstName+LastName>"

    Examples: 
      | FirstName+LastName |
      | dim camuin      |
