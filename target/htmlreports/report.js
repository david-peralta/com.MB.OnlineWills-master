$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Sprint 3/MW - 136.feature");
formatter.feature({
  "line": 1,
  "name": "MW - 136 : Date of Birth cannot be current date or future date",
  "description": "",
  "id": "mw---136-:-date-of-birth-cannot-be-current-date-or-future-date",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "",
  "description": "",
  "id": "mw---136-:-date-of-birth-cannot-be-current-date-or-future-date;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@WIP"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 4,
      "value": "#Go to site and log in"
    }
  ],
  "line": 5,
  "name": "user opens browser and proceeds to orders page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user selects \"bam@bam.com\" on user dropdown",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user clicks on delete all button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user close browser",
  "keyword": "Then "
});
formatter.scenarioOutline({
  "line": 11,
  "name": "",
  "description": "",
  "id": "mw---136-:-date-of-birth-cannot-be-current-date-or-future-date;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 10,
      "name": "@Sprint"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 12,
      "value": "# Single Package - Union, Standard Will - no POA"
    },
    {
      "line": 13,
      "value": "# Go to site and log in-------------------------------------------------------------------------"
    }
  ],
  "line": 14,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "user logs into app with the \"\u003cemail\u003e\" and \"\u003cpassword\u003e\" as the login credentials",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user is on \"Landing\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user selects singles product",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 18,
      "value": "#Select Standard will Package-------------------------------------------------------------------------"
    }
  ],
  "line": 19,
  "name": "user clicks Standard will product for singles",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user is on \"Personal\" page",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 21,
      "value": "#User filled valid input"
    }
  ],
  "line": 22,
  "name": "user fills up mandatory fields inside the personal page for victorian",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "user clicks on Next button on personal page",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "user sees message \"Date of Birth should not be a current or future date.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "user inputs \"01/01/1993\" as date of birth on personal page",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "user clicks on Next button on personal page",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "user is on \"About you\" page",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 28,
      "value": "#Single-------------------------------------------------------------------------"
    }
  ],
  "line": 29,
  "name": "user selects \"Single\" as Relationship Status on about page",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "user fill up the all required fields for single status",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "user click the next button on the about page",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user is on \"Assets\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "user clicks no to do you have assets question",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 34,
      "value": "#Asset answer \"no\" to other question"
    }
  ],
  "line": 35,
  "name": "user clicks no to all assets question",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user click the next button on the assets page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 37,
      "value": "#Skip Beneficiaries Page-------------------------------------------------------------------------"
    }
  ],
  "line": 38,
  "name": "user clicks yes to Do you want to include any children you have in the future question",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user clicks no to If any of your children predecease you, do you want to divide it equally amongst their children question",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user clicks no to Do you wish to leave any gifts question",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user click the next button on the beneficiaries page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 42,
      "value": "#Executors Page-------------------------------------------------------------------------"
    }
  ],
  "line": 43,
  "name": "user is on \"Executors\" page",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 44,
      "value": "#And user adds first option executor"
    }
  ],
  "line": 45,
  "name": "user clicks on add executor",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "user adds first option executor",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "user clicks on add executor",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "user adds back up executor",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "user clicks no to Would you like Maurice Blackburn to help your Executor manage your estate question",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "user selects i have no wish on funeral wishes",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "user click the next button on the executors page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 52,
      "value": "#ID docs Page-------------------------------------------------------------------------"
    }
  ],
  "line": 53,
  "name": "user is on \"ID Check\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 54,
  "name": "user agrees to terms and agreement inside the ID docs Page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 55,
      "value": "#ADD ID"
    }
  ],
  "line": 56,
  "name": "user selects Foreign Passport as first identification type",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "user adds foreign passport details",
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "user selects Driver License as second identification type",
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "user adds driver license details",
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "user clicks next button on the ID docs page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 61,
      "value": "#Review and confirm-------------------------------------------------------------------------"
    }
  ],
  "line": 62,
  "name": "user is on \"ReviewAndConfirm\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 63,
  "name": "user confirms on the acknowledgement inside the review and confirm page",
  "keyword": "And "
});
formatter.step({
  "line": 64,
  "name": "user clicks the next button on the review and confirm page to go to add-on page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 65,
      "value": "#Add ons page"
    }
  ],
  "line": 66,
  "name": "user is on \"Add-Ons\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 67,
  "name": "user click the next button with POA on the AddOns page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 68,
      "value": "#Payments"
    }
  ],
  "line": 69,
  "name": "user is on \"Payment\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 70,
  "name": "user check on the total",
  "keyword": "And "
});
formatter.step({
  "line": 71,
  "name": "user clicks on proceed button",
  "keyword": "Then "
});
formatter.step({
  "line": 72,
  "name": "user checks on billing information fields",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 73,
      "value": "#Payment Complete"
    }
  ],
  "line": 74,
  "name": "user is on \"Thank You\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 75,
  "name": "user close browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 80,
  "name": "",
  "description": "",
  "id": "mw---136-:-date-of-birth-cannot-be-current-date-or-future-date;;",
  "rows": [
    {
      "cells": [
        "email",
        "password",
        "Address1",
        "Suburb"
      ],
      "line": 81,
      "id": "mw---136-:-date-of-birth-cannot-be-current-date-or-future-date;;;1"
    },
    {
      "cells": [
        "bam@bam.com",
        "Password123!",
        "No.22 Diamond Street Bahayang Pagasa Imus Cavite",
        "Executive Lane"
      ],
      "line": 82,
      "id": "mw---136-:-date-of-birth-cannot-be-current-date-or-future-date;;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 82,
  "name": "",
  "description": "",
  "id": "mw---136-:-date-of-birth-cannot-be-current-date-or-future-date;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 10,
      "name": "@Sprint"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 12,
      "value": "# Single Package - Union, Standard Will - no POA"
    },
    {
      "line": 13,
      "value": "# Go to site and log in-------------------------------------------------------------------------"
    }
  ],
  "line": 14,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "user logs into app with the \"bam@bam.com\" and \"Password123!\" as the login credentials",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user is on \"Landing\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user selects singles product",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 18,
      "value": "#Select Standard will Package-------------------------------------------------------------------------"
    }
  ],
  "line": 19,
  "name": "user clicks Standard will product for singles",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user is on \"Personal\" page",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 21,
      "value": "#User filled valid input"
    }
  ],
  "line": 22,
  "name": "user fills up mandatory fields inside the personal page for victorian",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "user clicks on Next button on personal page",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "user sees message \"Date of Birth should not be a current or future date.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "user inputs \"01/01/1993\" as date of birth on personal page",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "user clicks on Next button on personal page",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "user is on \"About you\" page",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 28,
      "value": "#Single-------------------------------------------------------------------------"
    }
  ],
  "line": 29,
  "name": "user selects \"Single\" as Relationship Status on about page",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "user fill up the all required fields for single status",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "user click the next button on the about page",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user is on \"Assets\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "user clicks no to do you have assets question",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 34,
      "value": "#Asset answer \"no\" to other question"
    }
  ],
  "line": 35,
  "name": "user clicks no to all assets question",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user click the next button on the assets page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 37,
      "value": "#Skip Beneficiaries Page-------------------------------------------------------------------------"
    }
  ],
  "line": 38,
  "name": "user clicks yes to Do you want to include any children you have in the future question",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user clicks no to If any of your children predecease you, do you want to divide it equally amongst their children question",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user clicks no to Do you wish to leave any gifts question",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user click the next button on the beneficiaries page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 42,
      "value": "#Executors Page-------------------------------------------------------------------------"
    }
  ],
  "line": 43,
  "name": "user is on \"Executors\" page",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 44,
      "value": "#And user adds first option executor"
    }
  ],
  "line": 45,
  "name": "user clicks on add executor",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "user adds first option executor",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "user clicks on add executor",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "user adds back up executor",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "user clicks no to Would you like Maurice Blackburn to help your Executor manage your estate question",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "user selects i have no wish on funeral wishes",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "user click the next button on the executors page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 52,
      "value": "#ID docs Page-------------------------------------------------------------------------"
    }
  ],
  "line": 53,
  "name": "user is on \"ID Check\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 54,
  "name": "user agrees to terms and agreement inside the ID docs Page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 55,
      "value": "#ADD ID"
    }
  ],
  "line": 56,
  "name": "user selects Foreign Passport as first identification type",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "user adds foreign passport details",
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "user selects Driver License as second identification type",
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "user adds driver license details",
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "user clicks next button on the ID docs page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 61,
      "value": "#Review and confirm-------------------------------------------------------------------------"
    }
  ],
  "line": 62,
  "name": "user is on \"ReviewAndConfirm\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 63,
  "name": "user confirms on the acknowledgement inside the review and confirm page",
  "keyword": "And "
});
formatter.step({
  "line": 64,
  "name": "user clicks the next button on the review and confirm page to go to add-on page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 65,
      "value": "#Add ons page"
    }
  ],
  "line": 66,
  "name": "user is on \"Add-Ons\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 67,
  "name": "user click the next button with POA on the AddOns page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 68,
      "value": "#Payments"
    }
  ],
  "line": 69,
  "name": "user is on \"Payment\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 70,
  "name": "user check on the total",
  "keyword": "And "
});
formatter.step({
  "line": 71,
  "name": "user clicks on proceed button",
  "keyword": "Then "
});
formatter.step({
  "line": 72,
  "name": "user checks on billing information fields",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 73,
      "value": "#Payment Complete"
    }
  ],
  "line": 74,
  "name": "user is on \"Thank You\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 75,
  "name": "user close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.user_opens_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "bam@bam.com",
      "offset": 29
    },
    {
      "val": "Password123!",
      "offset": 47
    }
  ],
  "location": "StepDefinitions.user_logs_into_app_with_the_and_as_the_login_credentials(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Landing",
      "offset": 12
    }
  ],
  "location": "StepDefinitions.user_is_on_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_selects_singles_product()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_Standard_will_product_for_singles()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Personal",
      "offset": 12
    }
  ],
  "location": "StepDefinitions.user_is_on_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_fills_up_mandatory_fields_inside_the_personal_page_for_victorian()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_Next_button_on_personal_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Date of Birth should not be a current or future date.",
      "offset": 19
    }
  ],
  "location": "StepDefinitions.user_sees_message(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "01/01/1993",
      "offset": 13
    }
  ],
  "location": "StepDefinitions.user_inputs_as_date_of_birth_on_personal_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_Next_button_on_personal_page()"
});
formatter.result({
  "status": "skipped"
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
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Single",
      "offset": 14
    }
  ],
  "location": "StepDefinitions.user_selects_as_Relationship_Status_on_about_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_fill_up_the_all_required_fields_for_single_status()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_click_the_next_button_on_the_about_page()"
});
formatter.result({
  "status": "skipped"
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
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_no_to_do_you_have_assets_question()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_no_to_all_assets_question()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_click_the_next_button_on_the_assets_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_yes_to_Do_you_want_to_include_any_children_you_have_in_the_future_question()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_no_to_If_any_of_your_children_predecease_you_do_you_want_to_divide_it_equally_amongst_their_children_question()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_no_to_Do_you_wish_to_leave_any_gifts_question()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_click_the_next_button_on_the_beneficiaries_page()"
});
formatter.result({
  "status": "skipped"
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
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_add_executor()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_adds_first_option_executor()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_add_executor()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_adds_back_up_executor()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_no_to_Would_you_like_Maurice_Blackburn_to_help_your_Executor_manage_your_estate_question()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_selects_i_have_no_wish_on_funeral_wishes()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_click_the_next_button_on_the_executors_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "ID Check",
      "offset": 12
    }
  ],
  "location": "StepDefinitions.user_is_on_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_agrees_to_terms_and_agreement_inside_the_ID_docs_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_selects_Foreign_Passport_as_first_identification_type()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_adds_foreign_passport_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_selects_Driver_License_as_second_identification_type()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_adds_driver_license_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_next_button_on_the_ID_docs_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "ReviewAndConfirm",
      "offset": 12
    }
  ],
  "location": "StepDefinitions.user_is_on_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_confirms_on_the_acknowledgement_inside_the_review_and_confirm_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_the_next_button_on_the_review_and_confirm_page_to_go_to_addon_page()"
});
formatter.result({
  "status": "skipped"
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
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_click_the_next_button_on_the_AddOns_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Payment",
      "offset": 12
    }
  ],
  "location": "StepDefinitions.user_is_on_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "arguments": [
    {
      "val": "Thank You",
      "offset": 12
    }
  ],
  "location": "StepDefinitions.user_is_on_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_close_browser()"
});
formatter.result({
  "status": "skipped"
});
});