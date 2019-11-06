Feature: MW - 26 : As a customer, I want to list all my assets so I can provide my financial status to help process my Will

  @Sprint1
  Scenario Outline: Scenario 1: Customer indicates they have a child/children
    # Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    When user selects singles product
    #Select Standard will Package
    When user clicks Standard will product for singles
    Then user is on "Personal" page
    #User filled valid input
    When user selects "Dr" as title on personal page
    When user inputs "Today" as date of birth on personal page
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
    #Single
    When user selects "Single" as Relationship Status on about page
    And user fill up the all required fields for single status
    And user click the next button on the about page
    Then user is on "Assets" page
    #Scenario 1: Customer indicates they have an asset
    And user sees question "Do you have any assets?"
    And user checks if do you have assets question is mandatory
    And user clicks yes to do you have assets question
    And user clicks on Add Asset
    And user checks if Select Asset question is mandatory
    #Select Asset
    #Default value and checking of values
    And user checks on validation on Select Asset
    #Property
    When user selects "Property" as Asset on assets page
    And user checks if validations of fields inside the adding of property asset is implemented
    And user fills up all fields inside the adding of property asset

    Examples: 
      | email            | password     | Address1                                         | Suburb         |
      | demeth@gmail.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |

  @Sprint1
  Scenario Outline: Scenario 1: Customer indicates they have a child/children
    # Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    When user selects singles product
    #Select Standard will Package
    When user clicks Standard will product for singles
    Then user is on "Personal" page
    #User filled valid input
    When user selects "Dr" as title on personal page
    When user inputs "Today" as date of birth on personal page
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
    #Single
    When user selects "Single" as Relationship Status on about page
    And user fill up the all required fields for single status
    And user click the next button on the about page
    Then user is on "Assets" page
    #Scenario 1: Customer indicates they have an asset
    And user sees question "Do you have any assets?"
    And user checks if do you have assets question is mandatory
    And user clicks yes to do you have assets question
    And user clicks on Add Asset
    And user checks if Select Asset question is mandatory
    #Select Asset
    #Default value and checking of values
    And user checks on validation on Select Asset
    #Property
    When user selects "Bank Account" as Asset on assets page
    And user checks if validations of fields inside the adding of bank account asset is implemented
    And user fills up all fields inside the adding of bank account asset

    Examples: 
      | email            | password     | Address1                                         | Suburb         |
      | demeth@gmail.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |

  @Sprint1
  Scenario Outline: Scenario 1: Customer indicates they have a child/children
    # Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    When user selects singles product
    #Select Standard will Package
    When user clicks Standard will product for singles
    Then user is on "Personal" page
    #User filled valid input
    When user selects "Dr" as title on personal page
    When user inputs "Today" as date of birth on personal page
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
    #Single
    When user selects "Single" as Relationship Status on about page
    And user fill up the all required fields for single status
    And user click the next button on the about page
    Then user is on "Assets" page
    #Scenario 1: Customer indicates they have an asset
    And user sees question "Do you have any assets?"
    And user checks if do you have assets question is mandatory
    And user clicks yes to do you have assets question
    And user clicks on Add Asset
    And user checks if Select Asset question is mandatory
    #Select Asset
    #Default value and checking of values
    And user checks on validation on Select Asset
    #Property
    When user selects "Vehicle" as Asset on assets page
    And user checks if validations of fields inside the adding of vehicle asset is implemented
    And user fills up all fields inside the adding of vehicle asset

    Examples: 
      | email            | password     | Address1                                         | Suburb         |
      | demeth@gmail.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |

  @Sprint1
  Scenario Outline: Scenario 1: Customer indicates they have a child/children
    # Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    When user selects singles product
    #Select Standard will Package
    When user clicks Standard will product for singles
    Then user is on "Personal" page
    #User filled valid input
    When user selects "Dr" as title on personal page
    When user inputs "Today" as date of birth on personal page
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
    #Single
    When user selects "Single" as Relationship Status on about page
    And user fill up the all required fields for single status
    And user click the next button on the about page
    Then user is on "Assets" page
    #Scenario 1: Customer indicates they have an asset
    And user sees question "Do you have any assets?"
    And user checks if do you have assets question is mandatory
    And user clicks yes to do you have assets question
    And user clicks on Add Asset
    And user checks if Select Asset question is mandatory
    #Select Asset
    #Default value and checking of values
    And user checks on validation on Select Asset
    #Property
    When user selects "Shares" as Asset on assets page
    And user checks if validations of fields inside the adding of shares asset is implemented
    And user fills up all fields inside the adding of shares asset

    Examples: 
      | email            | password     | Address1                                         | Suburb         |
      | demeth@gmail.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |

  @Sprint1
  Scenario Outline: Scenario 1: Customer indicates they have a child/children
    # Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    When user selects singles product
    #Select Standard will Package
    When user clicks Standard will product for singles
    Then user is on "Personal" page
    #User filled valid input
    When user selects "Dr" as title on personal page
    When user inputs "Today" as date of birth on personal page
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
    #Single
    When user selects "Single" as Relationship Status on about page
    And user fill up the all required fields for single status
    And user click the next button on the about page
    Then user is on "Assets" page
    #Scenario 1: Customer indicates they have an asset
    And user sees question "Do you have any assets?"
    And user checks if do you have assets question is mandatory
    And user clicks yes to do you have assets question
    And user clicks on Add Asset
    And user checks if Select Asset question is mandatory
    #Select Asset
    #Default value and checking of values
    And user checks on validation on Select Asset
    #Property
    When user selects "Other" as Asset on assets page
    And user checks if validations of fields inside the adding of other asset is implemented
    And user fills up all fields inside the adding of other asset

    Examples: 
      | email            | password     | Address1                                         | Suburb         |
      | demeth@gmail.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |

  @Sprint1
  Scenario Outline: Scenario 1: Customer indicates they have a child/children
    # Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    When user selects singles product
    #Select Standard will Package
    When user clicks Standard will product for singles
    Then user is on "Personal" page
    #User filled valid input
    When user selects "Dr" as title on personal page
    When user inputs "Today" as date of birth on personal page
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
    #Single
    When user selects "Single" as Relationship Status on about page
    And user fill up the all required fields for single status
    And user click the next button on the about page
    Then user is on "Assets" page
    And user clicks yes to do you have assets question
    And user clicks on Add Asset
    And user clicks on Cancel Asset
    And user clicks on Add Asset
    #Select Asset Add / Edit / Delete
    When user selects "Other" as Asset on assets page
    And user fills up all fields inside the adding of other asset
    And user clicks on Edit Asset
    And user edits the details of the newly added asset
    And user clicks on Delete Asset
    #Add 2 asset
    And user clicks on Add Asset
    When user selects "Other" as Asset on assets page
    And user fills up all fields inside the adding of other asset
    And user clicks on Add Asset
    When user selects "Vehicle" as Asset on assets page
    And user fills up all fields inside the adding of vehicle asset

    Examples: 
      | email            | password     | Address1                                         | Suburb         |
      | demeth@gmail.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |
