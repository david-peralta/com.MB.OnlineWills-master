Feature: MW-183	Updates to the Account Registration page to include Privacy requirements

  @Sprint3
  Scenario Outline: 
    Given user opens browser
    Then user is on "Login" page
    When the user click on register link
    Then user is on "Registration" page
    When the user clicks on create account button
    Then user sees validation on all required fields
    When user inputs "<First Name>" in the First Name field on registration page
    When user inputs "<Family Name>" in the Family Name field on registration page
    When user inputs "<Email>" in the Email field on registration page
    When user selects "<State>" on state dropdown
    When user inputs "<Password>" in the Password field on registration page
    When user inputs "<Confirm Password>" in the Confirm Password field on registration page
    When user selects "<Source>" on source dropdown
    #Scenario 1: Page updates
    When user agrees on Maurice Blackburn's Terms and Condition by ticking the checkbox
    When user agrees on Maurice Blackburn's Privacy Policy by ticking the checkbox

    Examples: 
      | First Name | Family Name | Email                   | State | Password     | Confirm Password | Source |
      | David      | Peralta     | david.peralta@yahoo.com | VIC   | Password123! | Password123!     | Union  |

  @Sprint3
  Scenario Outline: 
    Given user opens browser
    Then user is on "Login" page
    When the user click on register link
    Then user is on "Registration" page
    When the user clicks on create account button
    Then user sees validation on all required fields
    # Check if I have read and agree to Maurice Blackburn's Privacy Policy checkbox is mandatory
    When user inputs "<First Name>" in the First Name field on registration page
    When user inputs "<Family Name>" in the Family Name field on registration page
    When user inputs "<Email>" in the Email field on registration page
    When user selects "<State>" on state dropdown
    When user inputs "<Password>" in the Password field on registration page
    When user inputs "<Confirm Password>" in the Confirm Password field on registration page
    When user selects "<Source>" on source dropdown
    #Scenario 2: Mandatory Fields
    Then user checks if Maurice Blackburn's Privacy Policy checkbox is mandatory
    And user checks if Maurice Blackburn's Terms and Condition checkbox is mandatory

    Examples: 
      | First Name | Family Name | Email            | State | Password     | Confirm Password | Source |
      | Demeth     | Camuin      | Demeth@gmail.com | VIC   | Password123! | Password123!     | Google |

  @Sprint
  Scenario Outline: 
    Given user opens browser
    Then user is on "Login" page
    When the user click on register link
    Then user is on "Registration" page
    #Scenario 3: Hyperlinks
    When user clicks on Maurice Blackburn's Terms and Collection
    When user clicks on Maurice Blackburn's Collection Statement
    When user clicks on Maurice Blackburn's Privacy Policy

    Examples: 
      | First Name | Family Name | Email            | State | Password     | Confirm Password | Source |
      | Demeth     | Camuin      | Demeth@gmail.com | VIC   | Password123! | Password123!     | Google |
