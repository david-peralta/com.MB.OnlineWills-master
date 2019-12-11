Feature: MW - 27A Questions : As a customer, I want to list my beneficiaries so I can allocate my Will

  @Sprint1
  Scenario Outline: 
    # Go to site and log in
    Given user opens browser
    When user login into app with the "<email>" and "<password>" as the login credentials

    #No Spouse and No Children
    Then user is on "Beneficiaries" page
   	And user sees message "Do you want to give the whole of your estate equally to any children you have in the future?"
    And user clicks yes to Do you want to give the whole of your estate equally to any children you have in the future question
    And user sees message "If any of your children predecease you"
    And user clicks yes to If any of your children predecease you, do you want to divide it equally amongst their children question
    And user sees disaster question displayed
    And user clicks no to If any of your children predecease you, do you want to divide it equally amongst their children question
    And user sees disaster question displayed
    And user clicks no to Do you want to give the whole of your estate equally to any children you have in the future question
    And user sees beneficiary question displayed
    Then user close browser

    Examples: 
      | email       | password     | Address1                                   		  | Suburb         |
      | bam@bam.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |
  