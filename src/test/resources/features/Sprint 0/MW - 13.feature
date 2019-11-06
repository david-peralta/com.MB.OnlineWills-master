Feature: MW - 13 : As a registered user, I want to reset my password so that I can access my account again when I have forgotten my password

  @Regression
  Scenario: Scenario 1: Registered customer accesses the Forgot Password function
    Given user opens browser
    When the user clicks on forgot password link
    Then user is on "ForgottenPassword" page
    And user checks if the forgotten password page contents is complete

  @Regression
  Scenario Outline: Scenario 2: Email format not valid
    Given user opens browser
    When the user clicks on forgot password link
    Then user is on "ForgottenPassword" page
    When user inputs an "<Email with invalid format>" in the forgotten password email field
    And user sees message "Looks like this email is not valid. Please try again."

    Examples: 
      | Email with invalid format |
      | userdomain.com            |

  @Regression
  Scenario Outline: Scenario 3: Valid Email belongs to a registered customer
    Given user opens browser
    When the user clicks on forgot password link
    Then user is on "ForgottenPassword" page
    When user inputs an "<Valid email with valid format>" in the forgotten password email field
    And user sees message "Thank you for your request"

    # Will not automate
    #And the ‘Reset Password’ email notification is sent to the user’s registered email address
    #And the Reset Password email notification is sent from:<MB email address>.
    Examples: 
      | Valid email with valid format |
      | reset@password.com            |

  @Regression
  Scenario Outline: Scenario 4: Valid Email does not belong to a registered customer
    Given user opens browser
    When the user clicks on forgot password link
    Then user is on "ForgottenPassword" page
    When user inputs an "<Invalid email with valid format>" in the forgotten password email field
    And user sees message "Email address not registered.  Please try again."

    Examples: 
      | Invalid email with valid format |
      | NotRegistered@email.com         |
