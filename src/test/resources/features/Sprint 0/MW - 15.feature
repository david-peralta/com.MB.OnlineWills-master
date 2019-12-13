Feature: MW - 15 : As a customer, I want to register my account so I can create my will

  @Regression
  Scenario: Scenario 1: Customer accesses 'Register' function
    Given user opens browser
    Then user is on "Login" page
    When the user click on register link
    Then user is on "Registration" page
    And user checks if the registration page contents is complete
    And user checks if describe field is displayed when "Other" is selected as source dropdown
    Then user close browser

  @Regression
  Scenario Outline: Scenario 2: Mandatory fields not filled in
    Given user opens browser
    Then user is on "Login" page
    When the user click on register link
    Then user is on "Registration" page
    When the user clicks on create account button
    Then user sees validation on all required fields
    And user checks if describe field is mandatory field when "Other" is selected as source dropdown
    # Check if I have read and agree to Maurice Blackburn's Privacy Policy checkbox is mandatory
    When user inputs "<First Name>" in the First Name field on registration page
    When user inputs "<Family Name>" in the Family Name field on registration page
    When user inputs "<Email>" in the Email field on registration page
    When user selects "<State>" on state dropdown
    When user inputs "<Password>" in the Password field on registration page
    When user inputs "<Confirm Password>" in the Confirm Password field on registration page
    When user selects "<Source>" on source dropdown
    #Scenario 7: Privacy Policy not acknowledged
    When the user clicks on create account button
    And user checks if Maurice Blackburn's Privacy Policy checkbox is mandatory
    Then user close browser

    Examples: 
      | First Name | Family Name | Email            | State | Password     | Confirm Password | Source        |
      | Demeth     | Camuin      | Demeth@gmail.com | VIC   | Password123! | Password123!     | Word Of Mouth |

  @Regression
  Scenario Outline: Scenario 3: Email not valid
    Given user opens browser
    Then user is on "Login" page
    When the user click on register link
    Then user is on "Registration" page
    When user inputs "<Email>" in the Email field on registration page
    When the user clicks on create account button
    And user checks if validation on invalid email is displayed
    Then user close browser

    Examples: 
      | Email           |
      | Demethgmail.com |

  @Regression
  Scenario: Scenario 4: Email already registered
    Given user opens browser
    Then user is on "Login" page
    When the user click on register link
    Then user is on "Registration" page
    When user input "Demeth@gmail.com" in the Email field on registration page
    When the user clicks on create account button
    #And user sees message "Email address already registered.  Try another"
   And user checks if validation on registered email is displayed
   Then user close browser

  @Regression
  Scenario Outline: Scenario 5: Password does not match password policy
    Given user opens browser
    Then user is on "Login" page
    When the user click on register link
    Then user is on "Registration" page
    When user inputs "<Invalid Password>" in the Password field on registration page
    When the user clicks on create account button
    And user checks if validation on invalid password is displayed
    Then user close browser

    Examples: 
      | Invalid Password |
      |              123 |

  @Regression
  Scenario Outline: Scenario 6: Password and Confirm Password do not match
    Given user opens browser
    Then user is on "Login" page
    When the user click on register link
    Then user is on "Registration" page
    When user inputs "<Password>" in the Password field on registration page
    When user inputs "<Invalid Confirm Password>" in the Confirm Password field on registration page
    When the user clicks on create account button
    And user checks if validation on invalid confirm password is displayed
    Then user close browser

    Examples: 
      | Password     | Invalid Confirm Password |
      | Password123! | P123! |

  @Regression1
  Scenario Outline: Scenario 8: Patient successfully completes registration
    Given user opens browser
    Then user is on "Login" page
    When the user click on register link
    Then user is on "Registration" page
    # Supply all mandatory fields
    When user inputs "<First Name>" in the First Name field on registration page
    When user inputs "<Family Name>" in the Family Name field on registration page
    When user inputs "<Email>" in the Email field on registration page 
    When user selects "<State>" on state dropdown
    When user inputs "<Password>" in the Password field on registration page
    When user inputs "<Confirm Password>" in the Confirm Password field on registration page
    When user selects "<Source>" on source dropdown
    When user agress on I have read and agree to the MyLife Wills
    When user agrees on Maurice Blackburn's Privacy Policy by ticking the checkbox
    When the user clicks on create account button
    And user sees message "Thank you for registering"
    Then user close browser

    #Not automated
    #And an activation email is sent to the email address they entered during registration
    #And the activation email is sent from:<MB email address>
    Examples: 
      | First Name | Family Name | Email            | State | Password     | Confirm Password | Source        |
      | Demeth     | Camuin      | Demeth@gmail.com | VIC   | Password123! | Password123!     | Word Of Mouth |

  @Regression1
  Scenario: Scenario 9: Customer clicks on the Password Policy tool tip
    Given user opens browser
    Then user is on "Login" page
    When the user click on register link
    Then user is on "Registration" page
    When the user hovers on the password policy tooltip
    And user sees password policy on tooltip
    Then user close browser

  @Regression
  Scenario: Scenario 10: Customer views Privacy policy
    Given user opens browser
    Then user is on "Login" page
    When the user click on register link
    Then user is on "Registration" page
    When the user clicks on Privacy policy link
    #Then user is on "PrivacyPolicy" page
    #And user sees message "Privacy Policy"
    Then user close browser
