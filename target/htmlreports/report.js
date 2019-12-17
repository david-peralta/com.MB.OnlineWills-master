$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Sprint 2/MW - 42/MW - 42.feature");
formatter.feature({
  "line": 1,
  "name": "MW - 42A : As a customer, I want to view additional products I can purchase",
  "description": "",
  "id": "mw---42a-:-as-a-customer,-i-want-to-view-additional-products-i-can-purchase",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6538339500,
  "status": "passed"
});
formatter.scenario({
  "line": 663,
  "name": "",
  "description": "",
  "id": "mw---42a-:-as-a-customer,-i-want-to-view-additional-products-i-can-purchase;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 662,
      "name": "@42-12"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 664,
      "value": "#Go to site and log in"
    }
  ],
  "line": 665,
  "name": "user opens browser and proceeds to orders page",
  "keyword": "Given "
});
formatter.step({
  "line": 666,
  "name": "user selects \"demeth@gmail.com\" on user dropdown",
  "keyword": "Then "
});
formatter.step({
  "line": 667,
  "name": "user clicks on delete all button",
  "keyword": "Then "
});
formatter.step({
  "line": 668,
  "name": "user close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.user_opens_browser_and_proceeds_to_orders_page()"
});
formatter.result({
  "duration": 3307757099,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "demeth@gmail.com",
      "offset": 14
    }
  ],
  "location": "StepDefinitions.user_selects_on_user_dropdown(String)"
});
formatter.result({
  "duration": 10192006099,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_delete_all_button()"
});
formatter.result({
  "duration": 18140354000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_close_browser()"
});
formatter.result({
  "duration": 52387800,
  "status": "passed"
});
formatter.after({
  "duration": 4583599,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 671,
  "name": "4-Married: Couple who does not live in VIC and selected the couple package",
  "description": "",
  "id": "mw---42a-:-as-a-customer,-i-want-to-view-additional-products-i-can-purchase;4-married:-couple-who-does-not-live-in-vic-and-selected-the-couple-package",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 670,
      "name": "@42-12"
    }
  ]
});
formatter.step({
  "line": 672,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 673,
  "name": "user logs into app with the \"\u003cemail\u003e\" and \"\u003cpassword\u003e\" as the login credentials",
  "keyword": "When "
});
formatter.step({
  "line": 674,
  "name": "user selects couples product",
  "keyword": "And "
});
formatter.step({
  "line": 675,
  "name": "user clicks Standard will product for couples",
  "keyword": "And "
});
formatter.step({
  "line": 676,
  "name": "user fills up mandatory fields inside the personal page for victorian",
  "keyword": "When "
});
formatter.step({
  "line": 677,
  "name": "user clicks on Next button on personal page",
  "keyword": "And "
});
formatter.step({
  "line": 678,
  "name": "user is on \"About you\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 679,
  "name": "user selects \"Married\" as Relationship Status on about page",
  "keyword": "And "
});
formatter.step({
  "line": 680,
  "name": "user fill up the all required fields for married status",
  "keyword": "And "
});
formatter.step({
  "line": 681,
  "name": "user clicks yes to do you want to do your will with your spouse or partner question",
  "keyword": "And "
});
formatter.step({
  "line": 682,
  "name": "user inputs \"testspouse@test.com\" as the email address of the spouse/partner",
  "keyword": "And "
});
formatter.step({
  "line": 683,
  "name": "user click the next button on the about page",
  "keyword": "And "
});
formatter.step({
  "line": 684,
  "name": "user is on \"Assets\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 685,
  "name": "user clicks no to all assets question",
  "keyword": "And "
});
formatter.step({
  "line": 686,
  "name": "user click the next button on the assets page",
  "keyword": "And "
});
formatter.step({
  "line": 687,
  "name": "user is on \"Beneficiaries\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 688,
  "name": "user clicks no to do you want to leave your whole estate to your spouse/partner if they survive you question",
  "keyword": "And "
});
formatter.step({
  "line": 689,
  "name": "user clicks yes to Do you want to give to your children question",
  "keyword": "And "
});
formatter.step({
  "line": 690,
  "name": "user clicks no to If any of your children predecease you, do you want to divide it equally amongst their children question",
  "keyword": "And "
});
formatter.step({
  "line": 691,
  "name": "user clicks no to Do you wish to leave any gifts question",
  "keyword": "And "
});
formatter.step({
  "line": 692,
  "name": "user click the next button on the beneficiaries page",
  "keyword": "And "
});
formatter.step({
  "line": 693,
  "name": "user is on \"Executors\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 694,
  "name": "user clicks on add executor",
  "keyword": "And "
});
formatter.step({
  "line": 695,
  "name": "user adds first option executor",
  "keyword": "And "
});
formatter.step({
  "line": 696,
  "name": "user clicks on add executor",
  "keyword": "And "
});
formatter.step({
  "line": 697,
  "name": "user adds back up executor",
  "keyword": "And "
});
formatter.step({
  "line": 698,
  "name": "user clicks no to Would you like Maurice Blackburn to help your Executor manage your estate question",
  "keyword": "And "
});
formatter.step({
  "line": 699,
  "name": "user selects i have no wish on funeral wishes",
  "keyword": "And "
});
formatter.step({
  "line": 700,
  "name": "user click the next button on the executors page",
  "keyword": "And "
});
formatter.step({
  "line": 701,
  "name": "user agrees to terms and agreement inside the ID docs Page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 702,
      "value": "#ADD ID"
    }
  ],
  "line": 703,
  "name": "user clicks on first identification document",
  "keyword": "Then "
});
formatter.step({
  "line": 704,
  "name": "user selects Driver License as first identification type",
  "keyword": "And "
});
formatter.step({
  "line": 705,
  "name": "user adds driver license details",
  "keyword": "And "
});
formatter.step({
  "line": 706,
  "name": "user adds first identification",
  "keyword": "And "
});
formatter.step({
  "line": 707,
  "name": "user clicks on second identification document",
  "keyword": "Then "
});
formatter.step({
  "line": 708,
  "name": "user selects Medicare as second identification type",
  "keyword": "And "
});
formatter.step({
  "line": 709,
  "name": "user adds medicare details",
  "keyword": "And "
});
formatter.step({
  "line": 710,
  "name": "user adds second identification",
  "keyword": "And "
});
formatter.step({
  "line": 711,
  "name": "user clicks next button on the ID docs page",
  "keyword": "And "
});
formatter.step({
  "line": 712,
  "name": "user is on \"Review and Confirm\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 713,
  "name": "user confirms that he completed the form himself",
  "keyword": "When "
});
formatter.step({
  "line": 714,
  "name": "user clicks the next button on the review and confirm page",
  "keyword": "And "
});
formatter.step({
  "line": 715,
  "name": "user is on \"Add-Ons\" page",
  "keyword": "Then "
});
formatter.examples({
  "line": 717,
  "name": "",
  "description": "",
  "id": "mw---42a-:-as-a-customer,-i-want-to-view-additional-products-i-can-purchase;4-married:-couple-who-does-not-live-in-vic-and-selected-the-couple-package;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 718,
      "id": "mw---42a-:-as-a-customer,-i-want-to-view-additional-products-i-can-purchase;4-married:-couple-who-does-not-live-in-vic-and-selected-the-couple-package;;1"
    },
    {
      "cells": [
        "demeth@gmail.com",
        "Password123!"
      ],
      "line": 719,
      "id": "mw---42a-:-as-a-customer,-i-want-to-view-additional-products-i-can-purchase;4-married:-couple-who-does-not-live-in-vic-and-selected-the-couple-package;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5724292500,
  "status": "passed"
});
formatter.scenario({
  "line": 719,
  "name": "4-Married: Couple who does not live in VIC and selected the couple package",
  "description": "",
  "id": "mw---42a-:-as-a-customer,-i-want-to-view-additional-products-i-can-purchase;4-married:-couple-who-does-not-live-in-vic-and-selected-the-couple-package;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 670,
      "name": "@42-12"
    }
  ]
});
formatter.step({
  "line": 672,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 673,
  "name": "user logs into app with the \"demeth@gmail.com\" and \"Password123!\" as the login credentials",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 674,
  "name": "user selects couples product",
  "keyword": "And "
});
formatter.step({
  "line": 675,
  "name": "user clicks Standard will product for couples",
  "keyword": "And "
});
formatter.step({
  "line": 676,
  "name": "user fills up mandatory fields inside the personal page for victorian",
  "keyword": "When "
});
formatter.step({
  "line": 677,
  "name": "user clicks on Next button on personal page",
  "keyword": "And "
});
formatter.step({
  "line": 678,
  "name": "user is on \"About you\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 679,
  "name": "user selects \"Married\" as Relationship Status on about page",
  "keyword": "And "
});
formatter.step({
  "line": 680,
  "name": "user fill up the all required fields for married status",
  "keyword": "And "
});
formatter.step({
  "line": 681,
  "name": "user clicks yes to do you want to do your will with your spouse or partner question",
  "keyword": "And "
});
formatter.step({
  "line": 682,
  "name": "user inputs \"testspouse@test.com\" as the email address of the spouse/partner",
  "keyword": "And "
});
formatter.step({
  "line": 683,
  "name": "user click the next button on the about page",
  "keyword": "And "
});
formatter.step({
  "line": 684,
  "name": "user is on \"Assets\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 685,
  "name": "user clicks no to all assets question",
  "keyword": "And "
});
formatter.step({
  "line": 686,
  "name": "user click the next button on the assets page",
  "keyword": "And "
});
formatter.step({
  "line": 687,
  "name": "user is on \"Beneficiaries\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 688,
  "name": "user clicks no to do you want to leave your whole estate to your spouse/partner if they survive you question",
  "keyword": "And "
});
formatter.step({
  "line": 689,
  "name": "user clicks yes to Do you want to give to your children question",
  "keyword": "And "
});
formatter.step({
  "line": 690,
  "name": "user clicks no to If any of your children predecease you, do you want to divide it equally amongst their children question",
  "keyword": "And "
});
formatter.step({
  "line": 691,
  "name": "user clicks no to Do you wish to leave any gifts question",
  "keyword": "And "
});
formatter.step({
  "line": 692,
  "name": "user click the next button on the beneficiaries page",
  "keyword": "And "
});
formatter.step({
  "line": 693,
  "name": "user is on \"Executors\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 694,
  "name": "user clicks on add executor",
  "keyword": "And "
});
formatter.step({
  "line": 695,
  "name": "user adds first option executor",
  "keyword": "And "
});
formatter.step({
  "line": 696,
  "name": "user clicks on add executor",
  "keyword": "And "
});
formatter.step({
  "line": 697,
  "name": "user adds back up executor",
  "keyword": "And "
});
formatter.step({
  "line": 698,
  "name": "user clicks no to Would you like Maurice Blackburn to help your Executor manage your estate question",
  "keyword": "And "
});
formatter.step({
  "line": 699,
  "name": "user selects i have no wish on funeral wishes",
  "keyword": "And "
});
formatter.step({
  "line": 700,
  "name": "user click the next button on the executors page",
  "keyword": "And "
});
formatter.step({
  "line": 701,
  "name": "user agrees to terms and agreement inside the ID docs Page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 702,
      "value": "#ADD ID"
    }
  ],
  "line": 703,
  "name": "user clicks on first identification document",
  "keyword": "Then "
});
formatter.step({
  "line": 704,
  "name": "user selects Driver License as first identification type",
  "keyword": "And "
});
formatter.step({
  "line": 705,
  "name": "user adds driver license details",
  "keyword": "And "
});
formatter.step({
  "line": 706,
  "name": "user adds first identification",
  "keyword": "And "
});
formatter.step({
  "line": 707,
  "name": "user clicks on second identification document",
  "keyword": "Then "
});
formatter.step({
  "line": 708,
  "name": "user selects Medicare as second identification type",
  "keyword": "And "
});
formatter.step({
  "line": 709,
  "name": "user adds medicare details",
  "keyword": "And "
});
formatter.step({
  "line": 710,
  "name": "user adds second identification",
  "keyword": "And "
});
formatter.step({
  "line": 711,
  "name": "user clicks next button on the ID docs page",
  "keyword": "And "
});
formatter.step({
  "line": 712,
  "name": "user is on \"Review and Confirm\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 713,
  "name": "user confirms that he completed the form himself",
  "keyword": "When "
});
formatter.step({
  "line": 714,
  "name": "user clicks the next button on the review and confirm page",
  "keyword": "And "
});
formatter.step({
  "line": 715,
  "name": "user is on \"Add-Ons\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.user_opens_browser()"
});
formatter.result({
  "duration": 329838700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "demeth@gmail.com",
      "offset": 29
    },
    {
      "val": "Password123!",
      "offset": 52
    }
  ],
  "location": "StepDefinitions.user_logs_into_app_with_the_and_as_the_login_credentials(String,String)"
});
formatter.result({
  "duration": 9685789000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_selects_couples_product()"
});
formatter.result({
  "duration": 5098373601,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_Standard_will_product_for_couples()"
});
formatter.result({
  "duration": 11649711899,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_fills_up_mandatory_fields_inside_the_personal_page_for_victorian()"
});
formatter.result({
  "duration": 46433483901,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_Next_button_on_personal_page()"
});
formatter.result({
  "duration": 7143593900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "About you",
      "offset": 12
    }
  ],
  "location": "StepDefinitions.user_is_on_page(String)"
});
formatter.result({
  "duration": 5010508801,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Married",
      "offset": 14
    }
  ],
  "location": "StepDefinitions.user_selects_as_Relationship_Status_on_about_page(String)"
});
formatter.result({
  "duration": 10151227700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_fill_up_the_all_required_fields_for_married_status()"
});
formatter.result({
  "duration": 76597460599,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_yes_to_do_you_want_to_do_your_will_with_your_spouse_or_partner_question()"
});
formatter.result({
  "duration": 2613713599,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testspouse@test.com",
      "offset": 13
    }
  ],
  "location": "StepDefinitions.user_inputs_as_the_email_address_of_the_spouse_partner(String)"
});
formatter.result({
  "duration": 1766159000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_click_the_next_button_on_the_about_page()"
});
formatter.result({
  "duration": 5103364200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Assets",
      "offset": 12
    }
  ],
  "location": "StepDefinitions.user_is_on_page(String)"
});
formatter.result({
  "duration": 5007645000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_no_to_all_assets_question()"
});
formatter.result({
  "duration": 798357500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_click_the_next_button_on_the_assets_page()"
});
formatter.result({
  "duration": 10117894999,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Beneficiaries",
      "offset": 12
    }
  ],
  "location": "StepDefinitions.user_is_on_page(String)"
});
formatter.result({
  "duration": 5754215500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_no_to_do_you_want_to_leave_your_whole_estate_to_your_spouse_partner_if_they_survive_you_question()"
});
formatter.result({
  "duration": 141685900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_yes_to_Do_you_want_to_give_to_your_children_question()"
});
formatter.result({
  "duration": 5635892800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_no_to_If_any_of_your_children_predecease_you_do_you_want_to_divide_it_equally_amongst_their_children_question()"
});
formatter.result({
  "duration": 5104715400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_no_to_Do_you_wish_to_leave_any_gifts_question()"
});
formatter.result({
  "duration": 10102827799,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_click_the_next_button_on_the_beneficiaries_page()"
});
formatter.result({
  "duration": 5114929501,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Executors",
      "offset": 12
    }
  ],
  "location": "StepDefinitions.user_is_on_page(String)"
});
formatter.result({
  "duration": 5018895900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_add_executor()"
});
formatter.result({
  "duration": 5106399599,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_adds_first_option_executor()"
});
formatter.result({
  "duration": 65390896600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_add_executor()"
});
formatter.result({
  "duration": 5112209300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_adds_back_up_executor()"
});
formatter.result({
  "duration": 76774382300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_no_to_Would_you_like_Maurice_Blackburn_to_help_your_Executor_manage_your_estate_question()"
});
formatter.result({
  "duration": 133298000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_selects_i_have_no_wish_on_funeral_wishes()"
});
formatter.result({
  "duration": 106803100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_click_the_next_button_on_the_executors_page()"
});
formatter.result({
  "duration": 5122011000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_agrees_to_terms_and_agreement_inside_the_ID_docs_Page()"
});
formatter.result({
  "duration": 10125253000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_first_identification_document()"
});
formatter.result({
  "duration": 42596340099,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_selects_Driver_License_as_first_identification_type()"
});
formatter.result({
  "duration": 5139641400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_adds_driver_license_details()"
});
formatter.result({
  "duration": 47482496500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_adds_first_identification()"
});
formatter.result({
  "duration": 5615408000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_second_identification_document()"
});
formatter.result({
  "duration": 6106875901,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_selects_Medicare_as_second_identification_type()"
});
formatter.result({
  "duration": 5133694399,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_adds_medicare_details()"
});
formatter.result({
  "duration": 48873321600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_adds_second_identification()"
});
formatter.result({
  "duration": 5631569099,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_next_button_on_the_ID_docs_page()"
});
formatter.result({
  "duration": 5128982500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Review and Confirm",
      "offset": 12
    }
  ],
  "location": "StepDefinitions.user_is_on_page(String)"
});
formatter.result({
  "duration": 5013207500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_confirms_that_he_completed_the_form_himself()"
});
formatter.result({
  "duration": 111708200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_the_next_button_on_the_review_and_confirm_page()"
});
formatter.result({
  "duration": 107047399,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Add-Ons",
      "offset": 12
    }
  ],
  "location": "StepDefinitions.user_is_on_page(String)"
});
formatter.result({
  "duration": 11157856800,
  "status": "passed"
});
formatter.after({
  "duration": 341700,
  "status": "passed"
});
});