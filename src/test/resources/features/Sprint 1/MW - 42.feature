Feature: MW - 42 : As a customer, I want to view additional products I can purchase

	@Sprint1
	Scenario Outline: 1-Single: Single and doesn’t live in VIC
		Given user opens browser
		When user logs into app with the "<email>" and "<password>" as the login credentials
		And user selects singles product
		And user clicks Standard will product for singles
		And user selects "Dr" as title on personal page
		And user inputs "Today" as date of birth on personal page
		And user inputs "4772834" as Phone Number on personal page
		And user inputs "Consultant" as Occupation on personal page
		And user inputs "<Address1>" as Residential address line one on personal page
		And user inputs "<Suburb>" as Residential suburb on personal page
		And user selects "ACT" as Residential state on personal page
		And user selects "4103" as Residential Postcode on personal page
		And user selects Postal Address same as Residential checkbox
		And user selects no on first question
		And user selects no on second question
		And user clicks on Next button on personal page
		And user selects "Single" as Relationship Status on about page
    And user fill up the all required fields for single status
		And user click the next button on the about page
		And user clicks no to do you have assets question
		And user clicks yes to do you have debts question
		And user clicks no to do you have any superannuation question
		And user clicks no to do you have life insurance separate from your superannuation
		And user clicks no to do you control a trust question
		And user clicks no to do you control a self-managed superannuation fund question
		And user clicks no to do you own your own business or are you a partner in a partnership question
		And user click the next button on the assets page
		And user clicks yes to Do you want to give the whole estate equally to your children question
		And user clicks no to Do you want to include any children you have in the future question
		And user clicks no to If any of your children predecease you, do you want to divide it equally amongst their children question
		And user clicks no to Do you wish to leave any gifts question
		And user click the next button on the beneficiaries page
		And user clicks on add executor
		And user adds first option executor
		And user clicks on add executor
		And user adds back up executor
		And user clicks no to Would you like Maurice Blackburn to help your Executor manage your estate question
		And user selects i have no wish on funeral wishes
		And user click the next button on the executors page
		And user agrees to terms and agreement inside the ID docs Page
		And user selects Driver License as first identification type
		And user adds driver license details
		And user selects Medicare as second identification type
		And user adds medicare details
		And user adds medicare details
		And user clicks next button on the ID docs page
		Then user is on "ReviewAndConfirm" page
		When user confirms that he completed the form himself
		And user clicks the next button
		Then user is on "Payment" page

		Examples: 
			| email            | password     |
			| Demeth@gmail.com | Password123! |

	@Sprint1
	Scenario Outline: 1-Widowed: Single and doesn’t live in VIC
		Given user opens browser
		When user logs into app with the "<email>" and "<password>" as the login credentials
		And user selects singles product
		And user clicks Standard will product for singles
		And user selects "Dr" as title on personal page
		And user inputs "Today" as date of birth on personal page
		And user inputs "4772834" as Phone Number on personal page
		And user inputs "Consultant" as Occupation on personal page
		And user inputs "<Address1>" as Residential address line one on personal page
		And user inputs "<Suburb>" as Residential suburb on personal page
		And user selects "ACT" as Residential state on personal page
		And user selects "4103" as Residential Postcode on personal page
		And user selects Postal Address same as Residential checkbox
		And user selects no on first question
		And user selects no on second question
		And user clicks on Next button on personal page
		And user selects "Widowed" as Relationship Status on about page
    And user fill up the all required fields for widowed status
		And user click the next button on the about page
		And user clicks no to do you have assets question
		And user clicks yes to do you have debts question
		And user clicks no to do you have any superannuation question
		And user clicks no to do you have life insurance separate from your superannuation
		And user clicks no to do you control a trust question
		And user clicks no to do you control a self-managed superannuation fund question
		And user clicks no to do you own your own business or are you a partner in a partnership question
		And user click the next button on the assets page
		And user clicks yes to Do you want to give the whole estate equally to your children question
		And user clicks no to Do you want to include any children you have in the future question
		And user clicks no to If any of your children predecease you, do you want to divide it equally amongst their children question
		And user clicks no to Do you wish to leave any gifts question
		And user click the next button on the beneficiaries page
		And user clicks on add executor
		And user adds first option executor
		And user clicks on add executor
		And user adds back up executor
		And user clicks no to Would you like Maurice Blackburn to help your Executor manage your estate question
		And user selects i have no wish on funeral wishes
		And user click the next button on the executors page
		And user agrees to terms and agreement inside the ID docs Page
		And user selects Driver License as first identification type
		And user adds driver license details
		And user selects Medicare as second identification type
		And user adds medicare details
		And user adds medicare details
		And user clicks next button on the ID docs page
		Then user is on "ReviewAndConfirm" page
		When user confirms that he completed the form himself
		And user clicks the next button
		Then user is on "Payment" page

		Examples: 
			| email            | password     |
			| Demeth@gmail.com | Password123! |

	@Sprint1
	Scenario Outline: 1-Separated: Single and doesn’t live in VIC
		Given user opens browser
		When user logs into app with the "<email>" and "<password>" as the login credentials
		And user selects singles product
		And user clicks Standard will product for singles
		And user selects "Dr" as title on personal page
		And user inputs "Today" as date of birth on personal page
		And user inputs "4772834" as Phone Number on personal page
		And user inputs "Consultant" as Occupation on personal page
		And user inputs "<Address1>" as Residential address line one on personal page
		And user inputs "<Suburb>" as Residential suburb on personal page
		And user selects "ACT" as Residential state on personal page
		And user selects "4103" as Residential Postcode on personal page
		And user selects Postal Address same as Residential checkbox
		And user selects no on first question
		And user selects no on second question
		And user clicks on Next button on personal page
		And user selects "Separated" as Relationship Status on about page
    And user fill up the all required fields for separated status
		And user click the next button on the about page
		And user clicks no to do you have assets question
		And user clicks yes to do you have debts question
		And user clicks no to do you have any superannuation question
		And user clicks no to do you have life insurance separate from your superannuation
		And user clicks no to do you control a trust question
		And user clicks no to do you control a self-managed superannuation fund question
		And user clicks no to do you own your own business or are you a partner in a partnership question
		And user click the next button on the assets page
		And user clicks yes to Do you want to give the whole estate equally to your children question
		And user clicks no to Do you want to include any children you have in the future question
		And user clicks no to If any of your children predecease you, do you want to divide it equally amongst their children question
		And user clicks no to Do you wish to leave any gifts question
		And user click the next button on the beneficiaries page
		And user clicks on add executor
		And user adds first option executor
		And user clicks on add executor
		And user adds back up executor
		And user clicks no to Would you like Maurice Blackburn to help your Executor manage your estate question
		And user selects i have no wish on funeral wishes
		And user click the next button on the executors page
		And user agrees to terms and agreement inside the ID docs Page
		And user selects Driver License as first identification type
		And user adds driver license details
		And user selects Medicare as second identification type
		And user adds medicare details
		And user adds medicare details
		And user clicks next button on the ID docs page
		Then user is on "ReviewAndConfirm" page
		When user confirms that he completed the form himself
		And user clicks the next button
		Then user is on "Payment" page

		Examples: 
			| email            | password     |
			| Demeth@gmail.com | Password123! |

	@Sprint1
	Scenario Outline: 1-Divorced: Single and doesn’t live in VIC
		Given user opens browser
		When user logs into app with the "<email>" and "<password>" as the login credentials
		And user selects singles product
		And user clicks Standard will product for singles
		And user selects "Dr" as title on personal page
		And user inputs "Today" as date of birth on personal page
		And user inputs "4772834" as Phone Number on personal page
		And user inputs "Consultant" as Occupation on personal page
		And user inputs "<Address1>" as Residential address line one on personal page
		And user inputs "<Suburb>" as Residential suburb on personal page
		And user selects "ACT" as Residential state on personal page
		And user selects "4103" as Residential Postcode on personal page
		And user selects Postal Address same as Residential checkbox
		And user selects no on first question
		And user selects no on second question
		And user clicks on Next button on personal page
		And user selects "Divorced" as Relationship Status on about page
    And user fill up the all required fields for divorced status
		And user click the next button on the about page
		And user clicks no to do you have assets question
		And user clicks yes to do you have debts question
		And user clicks no to do you have any superannuation question
		And user clicks no to do you have life insurance separate from your superannuation
		And user clicks no to do you control a trust question
		And user clicks no to do you control a self-managed superannuation fund question
		And user clicks no to do you own your own business or are you a partner in a partnership question
		And user click the next button on the assets page
		And user clicks yes to Do you want to give the whole estate equally to your children question
		And user clicks no to Do you want to include any children you have in the future question
		And user clicks no to If any of your children predecease you, do you want to divide it equally amongst their children question
		And user clicks no to Do you wish to leave any gifts question
		And user click the next button on the beneficiaries page
		And user clicks on add executor
		And user adds first option executor
		And user clicks on add executor
		And user adds back up executor
		And user clicks no to Would you like Maurice Blackburn to help your Executor manage your estate question
		And user selects i have no wish on funeral wishes
		And user click the next button on the executors page
		And user agrees to terms and agreement inside the ID docs Page
		And user selects Driver License as first identification type
		And user adds driver license details
		And user selects Medicare as second identification type
		And user adds medicare details
		And user adds medicare details
		And user clicks next button on the ID docs page
		Then user is on "ReviewAndConfirm" page
		When user confirms that he completed the form himself
		And user clicks the next button
		Then user is on "Payment" page

		Examples: 
			| email            | password     |
			| Demeth@gmail.com | Password123! |

	@Sprint1
	Scenario Outline: 2-Single: Single and lives in VIC
		Given user opens browser
		When user logs into app with the "<email>" and "<password>" as the login credentials
		And user selects singles product
		And user clicks Standard will product for singles
		And user selects "Dr" as title on personal page
		And user inputs "Today" as date of birth on personal page
		And user inputs "4772834" as Phone Number on personal page
		And user inputs "Consultant" as Occupation on personal page
		And user inputs "<Address1>" as Residential address line one on personal page
		And user inputs "<Suburb>" as Residential suburb on personal page
		And user selects "VIC" as Residential state on personal page
		And user selects "4103" as Residential Postcode on personal page
		And user selects Postal Address same as Residential checkbox
		And user selects no on first question
		And user selects no on second question
		And user clicks on Next button on personal page
		And user selects "Single" as Relationship Status on about page
    And user fill up the all required fields for single status
		And user click the next button on the about page
		And user clicks no to do you have assets question
		And user clicks yes to do you have debts question
		And user clicks no to do you have any superannuation question
		And user clicks no to do you have life insurance separate from your superannuation
		And user clicks no to do you control a trust question
		And user clicks no to do you control a self-managed superannuation fund question
		And user clicks no to do you own your own business or are you a partner in a partnership question
		And user click the next button on the assets page
		And user clicks yes to Do you want to give the whole estate equally to your children question
		And user clicks no to Do you want to include any children you have in the future question
		And user clicks no to If any of your children predecease you, do you want to divide it equally amongst their children question
		And user clicks no to Do you wish to leave any gifts question
		And user click the next button on the beneficiaries page
		And user clicks on add executor
		And user adds first option executor
		And user clicks on add executor
		And user adds back up executor
		And user clicks no to Would you like Maurice Blackburn to help your Executor manage your estate question
		And user selects i have no wish on funeral wishes
		And user click the next button on the executors page
		And user agrees to terms and agreement inside the ID docs Page
		And user selects Driver License as first identification type
		And user adds driver license details
		And user selects Medicare as second identification type
		And user adds medicare details
		And user adds medicare details
		And user clicks next button on the ID docs page
		Then user is on "ReviewAndConfirm" page
		When user confirms that he completed the form himself
		And user clicks the next button
		Then user is on "Add-Ons" page
		And user sees the power of attorney product

		Examples: 
			| email            | password     |
			| Demeth@gmail.com | Password123! |

	@Sprint1
	Scenario Outline: 2-Widowed: Single and lives in VIC
		Given user opens browser
		When user logs into app with the "<email>" and "<password>" as the login credentials
		And user selects singles product
		And user clicks Standard will product for singles
		And user selects "Dr" as title on personal page
		And user inputs "Today" as date of birth on personal page
		And user inputs "4772834" as Phone Number on personal page
		And user inputs "Consultant" as Occupation on personal page
		And user inputs "<Address1>" as Residential address line one on personal page
		And user inputs "<Suburb>" as Residential suburb on personal page
		And user selects "VIC" as Residential state on personal page
		And user selects "4103" as Residential Postcode on personal page
		And user selects Postal Address same as Residential checkbox
		And user selects no on first question
		And user selects no on second question
		And user clicks on Next button on personal page
		And user selects "Widowed" as Relationship Status on about page
    And user fill up the all required fields for widowed status
		And user click the next button on the about page
		And user clicks no to do you have assets question
		And user clicks yes to do you have debts question
		And user clicks no to do you have any superannuation question
		And user clicks no to do you have life insurance separate from your superannuation
		And user clicks no to do you control a trust question
		And user clicks no to do you control a self-managed superannuation fund question
		And user clicks no to do you own your own business or are you a partner in a partnership question
		And user click the next button on the assets page
		And user clicks yes to Do you want to give the whole estate equally to your children question
		And user clicks no to Do you want to include any children you have in the future question
		And user clicks no to If any of your children predecease you, do you want to divide it equally amongst their children question
		And user clicks no to Do you wish to leave any gifts question
		And user click the next button on the beneficiaries page
		And user clicks on add executor
		And user adds first option executor
		And user clicks on add executor
		And user adds back up executor
		And user clicks no to Would you like Maurice Blackburn to help your Executor manage your estate question
		And user selects i have no wish on funeral wishes
		And user click the next button on the executors page
		And user agrees to terms and agreement inside the ID docs Page
		And user selects Driver License as first identification type
		And user adds driver license details
		And user selects Medicare as second identification type
		And user adds medicare details
		And user adds medicare details
		And user clicks next button on the ID docs page
		Then user is on "ReviewAndConfirm" page
		When user confirms that he completed the form himself
		And user clicks the next button
		Then user is on "Payment" page
		And user sees the power of attorney product

		Examples: 
			| email            | password     |
			| Demeth@gmail.com | Password123! |

	@Sprint1
	Scenario Outline: 2-Separated: Single and lives in VIC
		Given user opens browser
		When user logs into app with the "<email>" and "<password>" as the login credentials
		And user selects singles product
		And user clicks Standard will product for singles
		And user selects "Dr" as title on personal page
		And user inputs "Today" as date of birth on personal page
		And user inputs "4772834" as Phone Number on personal page
		And user inputs "Consultant" as Occupation on personal page
		And user inputs "<Address1>" as Residential address line one on personal page
		And user inputs "<Suburb>" as Residential suburb on personal page
		And user selects "VIC" as Residential state on personal page
		And user selects "4103" as Residential Postcode on personal page
		And user selects Postal Address same as Residential checkbox
		And user selects no on first question
		And user selects no on second question
		And user clicks on Next button on personal page
		And user selects "Separated" as Relationship Status on about page
    And user fill up the all required fields for separated status
		And user click the next button on the about page
		And user clicks no to do you have assets question
		And user clicks yes to do you have debts question
		And user clicks no to do you have any superannuation question
		And user clicks no to do you have life insurance separate from your superannuation
		And user clicks no to do you control a trust question
		And user clicks no to do you control a self-managed superannuation fund question
		And user clicks no to do you own your own business or are you a partner in a partnership question
		And user click the next button on the assets page
		And user clicks yes to Do you want to give the whole estate equally to your children question
		And user clicks no to Do you want to include any children you have in the future question
		And user clicks no to If any of your children predecease you, do you want to divide it equally amongst their children question
		And user clicks no to Do you wish to leave any gifts question
		And user click the next button on the beneficiaries page
		And user clicks on add executor
		And user adds first option executor
		And user clicks on add executor
		And user adds back up executor
		And user clicks no to Would you like Maurice Blackburn to help your Executor manage your estate question
		And user selects i have no wish on funeral wishes
		And user click the next button on the executors page
		And user agrees to terms and agreement inside the ID docs Page
		And user selects Driver License as first identification type
		And user adds driver license details
		And user selects Medicare as second identification type
		And user adds medicare details
		And user adds medicare details
		And user clicks next button on the ID docs page
		Then user is on "ReviewAndConfirm" page
		When user confirms that he completed the form himself
		And user clicks the next button
		Then user is on "Payment" page
		And user sees the power of attorney product

		Examples: 
			| email            | password     |
			| Demeth@gmail.com | Password123! |

	@Sprint1
	Scenario Outline: 2-Divorced: Single and lives in VIC
		Given user opens browser
		When user logs into app with the "<email>" and "<password>" as the login credentials
		And user selects singles product
		And user clicks Standard will product for singles
		And user selects "Dr" as title on personal page
		And user inputs "Today" as date of birth on personal page
		And user inputs "4772834" as Phone Number on personal page
		And user inputs "Consultant" as Occupation on personal page
		And user inputs "<Address1>" as Residential address line one on personal page
		And user inputs "<Suburb>" as Residential suburb on personal page
		And user selects "VIC" as Residential state on personal page
		And user selects "4103" as Residential Postcode on personal page
		And user selects Postal Address same as Residential checkbox
		And user selects no on first question
		And user selects no on second question
		And user clicks on Next button on personal page
		And user selects "Divorced" as Relationship Status on about page
    And user fill up the all required fields for divorced status
		And user click the next button on the about page
		And user clicks no to do you have assets question
		And user clicks yes to do you have debts question
		And user clicks no to do you have any superannuation question
		And user clicks no to do you have life insurance separate from your superannuation
		And user clicks no to do you control a trust question
		And user clicks no to do you control a self-managed superannuation fund question
		And user clicks no to do you own your own business or are you a partner in a partnership question
		And user click the next button on the assets page
		And user clicks yes to Do you want to give the whole estate equally to your children question
		And user clicks no to Do you want to include any children you have in the future question
		And user clicks no to If any of your children predecease you, do you want to divide it equally amongst their children question
		And user clicks no to Do you wish to leave any gifts question
		And user click the next button on the beneficiaries page
		And user clicks on add executor
		And user adds first option executor
		And user clicks on add executor
		And user adds back up executor
		And user clicks no to Would you like Maurice Blackburn to help your Executor manage your estate question
		And user selects i have no wish on funeral wishes
		And user click the next button on the executors page
		And user agrees to terms and agreement inside the ID docs Page
		And user selects Driver License as first identification type
		And user adds driver license details
		And user selects Medicare as second identification type
		And user adds medicare details
		And user adds medicare details
		And user clicks next button on the ID docs page
		Then user is on "ReviewAndConfirm" page
		When user confirms that he completed the form himself
		And user clicks the next button
		Then user is on "Payment" page
		And user sees the power of attorney product

		Examples: 
			| email            | password     |
			| Demeth@gmail.com | Password123! |

	@Sprint1
	Scenario Outline: 3-Couple: Couple who does not live in VIC and did not select the couple package
		Given user opens browser
		When user logs into app with the "<email>" and "<password>" as the login credentials
		And user selects singles product
		And user clicks Standard will product for couples
		And user selects "Dr" as title on personal page
		And user inputs "Today" as date of birth on personal page
		And user inputs "4772834" as Phone Number on personal page
		And user inputs "Consultant" as Occupation on personal page
		And user inputs "<Address1>" as Residential address line one on personal page
		And user inputs "<Suburb>" as Residential suburb on personal page
		And user selects "ACT" as Residential state on personal page
		And user selects "4103" as Residential Postcode on personal page
		And user selects Postal Address same as Residential checkbox
		And user selects no on first question
		And user selects no on second question
		And user clicks on Next button on personal page
    And user selects "Married" as Relationship Status on about page
    And user fill up the all required fields for married status
    And user clicks no to do you want to do your will with your spouse or partner question
		And user click the next button on the about page
		And user clicks no to do you have assets question
		And user clicks yes to do you have debts question
		And user clicks no to do you have any superannuation question
		And user clicks no to do you have life insurance separate from your superannuation
		And user clicks no to do you control a trust question
		And user clicks no to do you control a self-managed superannuation fund question
		And user clicks no to do you own your own business or are you a partner in a partnership question
		And user click the next button on the assets page
    And user clicks no to do you want to leave your whole estate to your spouse/partner if they survive you question
		And user clicks yes to Do you want to give the whole estate equally to your children question
		And user clicks no to If any of your children predecease you, do you want to divide it equally amongst their children question
		And user clicks no to Do you wish to leave any gifts question
		And user click the next button on the beneficiaries page
		And user clicks on add executor
		And user adds first option executor
		And user clicks on add executor
		And user adds back up executor
		And user clicks no to Would you like Maurice Blackburn to help your Executor manage your estate question
		And user selects i have no wish on funeral wishes
		And user click the next button on the executors page
		And user agrees to terms and agreement inside the ID docs Page
		And user selects Driver License as first identification type
		And user adds driver license details
		And user selects Medicare as second identification type
		And user adds medicare details
		And user adds medicare details
		And user clicks next button on the ID docs page
		Then user is on "ReviewAndConfirm" page
		When user confirms that he completed the form himself
		And user clicks the next button
		Then user is on "Add-Ons" page
		And user sees the power of attorney product

		Examples: 
			| email            | password     |
			| Demeth@gmail.com | Password123! |