Feature: MW - 14 : As a customer, I want to change my forgotten password so that I can create a new password I'm more likely to remember

  @Regression
  Scenario: 
    #Scenario: Scenario 1: Reset Password link has been used (Will not automate)
    #Scenario: Scenario 2:  Reset Password link has not been used
    #Forgot Password
    Given user opens browser
    Then user is on "Login" page
    When the user clicks on forgot password link
    Then user is on "ForgottenPassword" page
    When user inputs an "reset@password.com" in the forgotten password email field
    Given user opens browser and decides to proceed to the activation links page
    Then user is on "Codes" page
    When the user clicks on reset password link
    Then user is on "ChangePassword" page
    Then user checks the content of the change password page
    When the user hovers on the password policy tooltip on change password page
    And user sees password policy on tooltip on change password page
    #Scenario: Scenario 3:  Reset Password link has not been used
    When the user clicks on submit button on change password page
    And user checks if validation on required field on change password page is displayed
    #Scenario 4: New Password does not match password policy
    When user inputs "InvalidPassword" in the Password field on change password page
    When user inputs "InvalidConfirmPassword" in the Confirm Password field on change password page
    When the user clicks on submit button on change password page
    And user sees message "Password entered does not meet our password policy. Please try again."
    #Scenario 5: New Password and Confirm Password do not match
    And user sees message "Passwords do not match, please try again."
    #Scenario 6: Password successfully changed
    When user inputs "Password123!" in the Password field on change password page
    When user inputs "Password123!" in the Confirm Password field on change password page
    When the user clicks on submit button on change password page
    And user sees message "Your password has been successfully updated. You can now log in."
