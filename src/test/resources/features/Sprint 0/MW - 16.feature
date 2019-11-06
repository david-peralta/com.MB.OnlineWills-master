Feature: MW - 16 : As a customer, I want to activate my account so that I can login to the portal

  @Regression
  Scenario Outline: Scenario 1: Activation link used before expiry and account not activated
    Given user opens browser
    Then user is on "Login" page
    When the user click on register link
    Then user is on "Registration" page
    #Create User Account
    When user inputs "<First Name>" in the First Name field on registration page
    When user inputs "<Family Name>" in the Family Name field on registration page
    When user inputs "<Email>" in the Email field on registration page
    When user selects "<State>" on state dropdown
    When user inputs "<Password>" in the Password field on registration page
    When user inputs "<Confirm Password>" in the Confirm Password field on registration page
    When user selects "<Source>" on source dropdown
    When user agrees on Maurice Blackburn's Privacy Policy by ticking the checkbox
    When the user clicks on create account button
    And user sees message "Thank you for registering"
    Given user opens browser and decides to proceed to the activation links page
    Then user is on "Codes" page
    When the user clicks on activation link
    And user sees message "Your account has now been successfully activated.  You can now log in."
    #Scenario 2: Activation link used before expiry and account not activated
    Given user opens browser and decides to proceed to the activation links page
    Then user is on "Codes" page
    When the user clicks on activation link
    Then user is on "Activate" page
    And user sees message "Looks like you have already activated your account"
    #Scenario 3: Activation link has expired (Hard to replicate link)
    #Scenario 4: User Re-sends Activation link email (Hard to replicate link)

    Examples: 
      | First Name | Family Name | Email            | State | Password     | Confirm Password | Source        |
      | Demeth     | Camuin      | Demeth@gmail.com | VIC   | Password123! | Password123!     | Word Of Mouth |
