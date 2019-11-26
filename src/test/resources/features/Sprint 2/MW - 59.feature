Feature: Tooltips

  Scenario Outline: About you tooltips
    # Go to site and log in-------------------------------------------------------------------------
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    When user clicks on new order on incomplete order popup
    #When user clicks on continue on incomplete order popup
    When user selects singles product
    #Select Standard will Package-------------------------------------------------------------------------
    When user clicks Standard will product for singles
    Then user is on "Personal" page
    #User filled valid input
    And user fills up mandatory fields inside the personal page for victorian
    When user clicks on Next button on personal page
    Then user is on "About you" page
    When user selects "Married" as Relationship Status on about page
    #spouse/partner will tooltip-----------------------------------------------------------------------------------------
    And user sees spouse/partner will tooltip
    And user checks the content of spouse/partner will tooltip
    #significant child will tooltip-----------------------------------------------------------------------------------------
    And user clicks yes to Do you have any children question
    And user clicks add child on about you page
    And user sees significant will tooltip
    And user checks the content of significant will tooltip
    #Guardian tooltip--------
    And user sees guardian tooltip
    And user checks the content of guardian tooltip
    #Dependents will tooltip-----------------------------------------------------------------------------------------
    And user sees dependents will tooltip
    And user checks the content of dependents will tooltip
    #Upload will tooltip-----------------------------------------------------------------------------------------
    And user sees upload will tooltip
    And user checks the content of upload will tooltip

    Examples: 
      | email            | password     |
      | demeth@gmail.com | Password123! |

  Scenario Outline: Assets tooltips
    # Go to site and log in-------------------------------------------------------------------------
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    When user clicks on new order on incomplete order popup
    #When user clicks on continue on incomplete order popup
    When user selects singles product
    #Select Standard will Package-------------------------------------------------------------------------
    When user clicks Standard will product for singles
    Then user is on "Personal" page
    #User filled valid input
    And user fills up mandatory fields inside the personal page for victorian
    When user clicks on Next button on personal page
    Then user is on "About you" page
    When user selects "Single" as Relationship Status on about page
    And user fill up the all required fields for single status
    And user click the next button on the about page
    Then user is on "Assets" page
    #Assets tooltip----------------------------------
    And user sees assets tooltip
    And user checks the content of assets tooltip
    And user clicks yes to do you have assets question
    And user clicks on Add Asset
    And user selects "Property" as Asset on assets page
    #Ownership Tooltip ----------------------------------
    And user sees ownership tooltip
    And user checks the content of ownership tooltip
    And user fills up all fields inside the adding of property asset
    #Superannuation tooltip
    And user sees superannuation tooltip
    And user checks the content of superannuation tooltip
    #Death beneficiary tooltip----------------------------------
    And user clicks yes to do you have any superannuation question
    And user clicks on add superannuation button
    And user sees Death beneficiary tooltip
    And user checks the content of Death beneficiary tooltip
    #Binding tooltip----------------------------------
    And user clicks yes on Have you nominated a beneficiary
    And user sees binding tooltip
    And user checks the content of binding tooltip
    #Trust tooltip-----------------------------------------------------------------------------------------
    And user sees trusts tooltip
    And user checks the content of trusts tooltip
    #Life Interest will tooltip-----------------------------------------------------------------------------------------
    And user sees life interest tooltip
    And user checks the content of life interest tooltip

    Examples: 
      | email            | password     |
      | demeth@gmail.com | Password123! |

  Scenario Outline: beneficiaries tooltips
    # Go to site and log in-------------------------------------------------------------------------
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    When user clicks on new order on incomplete order popup
    #When user clicks on continue on incomplete order popup
    When user selects singles product
    #Select Standard will Package-------------------------------------------------------------------------
    When user clicks Standard will product for singles
    Then user is on "Personal" page
    #User filled valid input
    And user fills up mandatory fields inside the personal page for victorian
    When user clicks on Next button on personal page
    Then user is on "About you" page
    When user selects "Single" as Relationship Status on about page
    And user fill up the all required fields for single status
    And user click the next button on the about page
    Then user is on "Assets" page
    And user clicks no to all assets question
    And user click the next button on the assets page
    Then user is on "Beneficiaries" page
    #Beneficiaries Tooltip --------------
    And user sees beneficiaries tooltip
    And user checks the content of beneficiaries tooltip

    Examples: 
      | email            | password     |
      | demeth@gmail.com | Password123! |

  @Sprint1
  Scenario Outline: Executors tooltips
    # Go to site and log in-------------------------------------------------------------------------
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    When user clicks on new order on incomplete order popup
    #When user clicks on continue on incomplete order popup
    When user selects singles product
    #Select Standard will Package-------------------------------------------------------------------------
    When user clicks Standard will product for singles
    Then user is on "Personal" page
    #User filled valid input
    And user fills up mandatory fields inside the personal page for victorian
    When user clicks on Next button on personal page
    Then user is on "About you" page
    When user selects "Single" as Relationship Status on about page
    And user fill up the all required fields for single status
    And user click the next button on the about page
    Then user is on "Assets" page
    And user clicks no to all assets question
    And user click the next button on the assets page
    Then user is on "Beneficiaries" page
    #Skip Beneficiaries Page-------------------------------------------------------------------------
    And user clicks yes to Do you want to include any children you have in the future question
    And user clicks no to If any of your children predecease you, do you want to divide it equally amongst their children question
    And user clicks no to Do you wish to leave any gifts question
    And user click the next button on the beneficiaries page
    #Executors Page-------------------------------------------------------------------------
    Then user is on "Executors" page
    #Executors Tooltip --------------
    And user sees executors tooltip
    And user checks the content of executors tooltip
    #Lawyers of Your Estate Tooltip --------------
    And user sees Lawyers of Your Estate tooltip
    And user checks the content of Lawyers of Your Estate tooltip

    Examples: 
      | email            | password     |
      | demeth@gmail.com | Password123! |
      Scenario Outline: 
    # Go to site and log in-------------------------------------------------------------------------
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    When user clicks on new order on incomplete order popup
    #When user clicks on continue on incomplete order popup
    When user selects singles product
    #Select Standard will Package-------------------------------------------------------------------------
    When user clicks Standard will product for singles
    Then user is on "Personal" page
    #User filled valid input
    When user selects "Dr" as title on personal page
    When user inputs "01/01/1993" as date of birth on personal page
    When user inputs "4772834" as Phone Number on personal page
    When user inputs "Consultant" as Occupation on personal page
    When user inputs "<Address1>" as Residential address line one on personal page
    When user inputs "<Suburb>" as Residential suburb on personal page
    When user selects "VIC" as Residential state on personal page
    When user selects "4103" as Residential Postcode on personal page
    When user selects Postal Address same as Residential checkbox
    When user selects no on first question
    When user selects no on second question
    When user clicks on Next button on personal page
    Then user is on "About you" page
    #Single-------------------------------------------------------------------------
    When user selects "Single" as Relationship Status on about page
    And user fill up the all required fields for single status
    And user click the next button on the about page
    Then user is on "Assets" page
    And user clicks no to do you have assets question
    #Asset answer "no" to other question
    And user clicks no to do you have debts question
    And user clicks no to do you have any superannuation question
    And user clicks no to do you have life insurance separate from your superannuation
    And user clicks no to do you control a trust question
    And user clicks no to do you control a self-managed superannuation fund question
    And user clicks no to do you own your own business or are you a partner in a partnership question
    And user click the next button on the assets page
    #Skip Beneficiaries Page-------------------------------------------------------------------------
    And user clicks yes to Do you want to include any children you have in the future question
    And user clicks no to If any of your children predecease you, do you want to divide it equally amongst their children question
    And user clicks no to Do you wish to leave any gifts question
    And user click the next button on the beneficiaries page
    #Executors Page-------------------------------------------------------------------------
    Then user is on "Executors" page
    #And user adds first option executor
    And user clicks on add executor
    And user adds first option executor
    And user clicks on add executor
    And user adds back up executor
    And user clicks no to Would you like Maurice Blackburn to help your Executor manage your estate question
    And user selects i have no wish on funeral wishes
    And user click the next button on the executors page
    #ID docs Page-------------------------------------------------------------------------
    Then user is on "ID Check" page
    And user agrees to terms and agreement inside the ID docs Page
    #ADD ID
    And user selects Foreign Passport as first identification type
    And user adds foreign passport details
    And user selects Driver License as second identification type
    And user adds driver license details
    And user clicks next button on the ID docs page
    And user clicks next button on the ID docs page
    #Review and confirm-------------------------------------------------------------------------
    Then user is on "ReviewAndConfirm" page
    And user confirms on the acknowledgement inside the review and confirm page
    And user clicks the next button on the review and confirm page to go to add-on page
    #Add ons page
    Then user is on "Add-Ons" page
    #POA tooltip-----------------------------------------------------------------------------
    And user sees POA tooltip with video
    #Add POA
    Then user clicks on add POA on addons page
    And user click the next button with POA on the AddOns page
    #Financial Decisions
    Then user is on "Enduring Power Of Attorney" page
    #Enduring POA tooltip-----------------------------------------------------------------------------
    And user sees Enduring POA tooltip
    #When to act tooltip-------------------------
    And user sees when to act tooltip
    #Enduring POA
    And user selects Only financial matters on enduring power of attorney options
    And user clicks on add financial decision maker on financial decision page
    And user fills up financial decision maker details with Primary Decision Maker
    And user clicks on add financial decision maker
    #Select immediately on start to act dropdown
    And user selects "Immediately" on When do you want your Financial/Personal Decision Makers to start to act dropdown
    #Input limitation
    And user enter "This a test Limitation" as limitation value
    #next button
    And user click the next button with POA on the financial decision page
    #Medical POA page-------------------------------------------------------------------------
    Then user is on "MedicalPOA" page
    #Medical Decision Maker Tooltip-----------------------------------------------------------------------------
    And user sees Medical Decision Maker tooltip
    #Advance Care  Tooltip-----------------------------------------------
    And user sees Advance Care tooltip

    Examples: 
      | email            | password     | Address1  | Suburb         |
      | demeth@gmail.com | Password123! | Australia | Executive Lane |
      
