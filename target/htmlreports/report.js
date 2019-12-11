$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Sprint 1/MW - 40.feature");
formatter.feature({
  "line": 1,
  "name": "MW - 40 : Review and confirm",
  "description": "",
  "id": "mw---40-:-review-and-confirm",
  "keyword": "Feature"
});
formatter.before({
  "duration": 12726057300,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "",
  "description": "",
  "id": "mw---40-:-review-and-confirm;",
  "type": "scenario",
  "keyword": "Scenario",
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
formatter.match({
  "location": "StepDefinitions.user_opens_browser_and_proceeds_to_orders_page()"
});
formatter.result({
  "duration": 3383084800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bam@bam.com",
      "offset": 14
    }
  ],
  "location": "StepDefinitions.user_selects_on_user_dropdown(String)"
});
formatter.result({
  "duration": 10186598600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_delete_all_button()"
});
formatter.result({
  "duration": 18133492700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_close_browser()"
});
formatter.result({
  "duration": 590014700,
  "status": "passed"
});
formatter.after({
  "duration": 1392300,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 11,
  "name": "",
  "description": "",
  "id": "mw---40-:-review-and-confirm;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 10,
      "name": "@Sprint11"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 12,
      "value": "# Go to site and log in"
    }
  ],
  "line": 13,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "user logs into app with the \"\u003cemail\u003e\" and \"\u003cpassword\u003e\" as the login credentials",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user is on \"Landing\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user selects singles product",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 17,
      "value": "#Select Standard will Package"
    }
  ],
  "line": 18,
  "name": "user clicks Standard will product for singles",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user is on \"Personal\" page",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 20,
      "value": "#User filled valid input"
    }
  ],
  "line": 21,
  "name": "user fills up mandatory fields inside the personal page for victorian",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "user clicks on Next button on personal page",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "user is on \"About you\" page",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 24,
      "value": "#Single"
    }
  ],
  "line": 25,
  "name": "user selects \"Single\" as Relationship Status on about page",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "user fill up the all required fields for single status",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user click the next button on the about page",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user is on \"Assets\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "user clicks no to do you have assets question",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 30,
      "value": "#Asset answer \"no\" to other question"
    }
  ],
  "line": 31,
  "name": "user clicks no to all assets question",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user click the next button on the assets page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 33,
      "value": "#Skip Beneficiaries Page"
    }
  ],
  "line": 34,
  "name": "user clicks yes to Do you want to include any children you have in the future question",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user clicks no to If any of your children predecease you, do you want to divide it equally amongst their children question",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user clicks no to Do you wish to leave any gifts question",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user click the next button on the beneficiaries page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 38,
      "value": "#Executors Page"
    }
  ],
  "line": 39,
  "name": "user is on \"Executors\" page",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 40,
      "value": "#  And user adds first option executor"
    }
  ],
  "line": 41,
  "name": "user clicks on add executor",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user adds first option executor",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user clicks on add executor",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "user adds back up executor",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "user clicks no to Would you like Maurice Blackburn to help your Executor manage your estate question",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "user selects i have no wish on funeral wishes",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "user click the next button on the executors page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 48,
      "value": "#ID docs Page"
    }
  ],
  "line": 49,
  "name": "user is on \"ID Check\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 50,
  "name": "user agrees to terms and agreement inside the ID docs Page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 51,
      "value": "#ADD ID"
    }
  ],
  "line": 52,
  "name": "user selects Driver License as first identification type",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "user adds driver license details",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "user selects Medicare as second identification type",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "user adds medicare details",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "user clicks next button on the ID docs page",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "user is on \"Review and Confirm\" page",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 58,
      "value": "#Check personal Info summary"
    }
  ],
  "line": 59,
  "name": "user checks the personal info summary details",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 60,
      "value": "#Check AboutYou summary"
    }
  ],
  "line": 61,
  "name": "user checks the About you summary details",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 62,
      "value": "#Check Assets summary"
    }
  ],
  "line": 63,
  "name": "user checks the Assets summary details",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 64,
      "value": "#Check Beneficiaries summary"
    }
  ],
  "line": 65,
  "name": "user checks the Beneficiaries summary details",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 66,
      "value": "#Check Executors summary"
    }
  ],
  "line": 67,
  "name": "user checks the Executors summary details",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 68,
      "value": "#Edit Personal info"
    }
  ],
  "line": 69,
  "name": "user clicks edit button on personal info summary",
  "keyword": "And "
});
formatter.step({
  "line": 70,
  "name": "user is on \"Personal\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 71,
  "name": "user edits some personal details",
  "keyword": "And "
});
formatter.step({
  "line": 72,
  "name": "user clicks on Next button on personal page",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 73,
      "value": "#Edit About you"
    }
  ],
  "line": 74,
  "name": "user edits some about you details",
  "keyword": "And "
});
formatter.step({
  "line": 75,
  "name": "user click the next button on the about page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 76,
      "value": "#Edit Assets"
    }
  ],
  "line": 77,
  "name": "user clicks yes to do you control a trust question",
  "keyword": "And "
});
formatter.step({
  "line": 78,
  "name": "user clicks yes to do you control a self-managed superannuation fund question",
  "keyword": "And "
});
formatter.step({
  "line": 79,
  "name": "user clicks yes to do you own your own business or are you a partner in a partnership question",
  "keyword": "And "
});
formatter.step({
  "line": 80,
  "name": "user click the next button on the assets page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 81,
      "value": "#Edit Benefeciaries"
    }
  ],
  "line": 82,
  "name": "user clicks yes to If any of your children predecease you, do you want to divide it equally amongst their children question",
  "keyword": "And "
});
formatter.step({
  "line": 83,
  "name": "user click the next button on the beneficiaries page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 84,
      "value": "#Next ID Docs"
    }
  ],
  "line": 85,
  "name": "user agrees to terms and agreement inside the ID docs Page",
  "keyword": "And "
});
formatter.step({
  "line": 86,
  "name": "user clicks next button on the ID docs page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 87,
      "value": "#Validate acknowledgement"
    }
  ],
  "line": 88,
  "name": "user click the next button on the review and confirm page",
  "keyword": "And "
});
formatter.step({
  "line": 89,
  "name": "user sees message \"You must confirm and acknowledge the information you have provided\"",
  "keyword": "And "
});
formatter.step({
  "line": 90,
  "name": "user confirms on the acknowledgement inside the review and confirm page",
  "keyword": "And "
});
formatter.step({
  "line": 92,
  "name": "user click the next button on the review and confirm page",
  "keyword": "And "
});
formatter.step({
  "line": 93,
  "name": "user is on \"Add-Ons\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 94,
  "name": "user close browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 95,
  "name": "",
  "description": "",
  "id": "mw---40-:-review-and-confirm;;",
  "rows": [
    {
      "cells": [
        "email",
        "password",
        "Address1",
        "Suburb"
      ],
      "line": 96,
      "id": "mw---40-:-review-and-confirm;;;1"
    },
    {
      "cells": [
        "bam@bam.com",
        "Password123!",
        "No.22 Diamond Street Bahayang Pagasa Imus Cavite",
        "Executive Lane"
      ],
      "line": 97,
      "id": "mw---40-:-review-and-confirm;;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 11721152700,
  "status": "passed"
});
formatter.scenario({
  "line": 97,
  "name": "",
  "description": "",
  "id": "mw---40-:-review-and-confirm;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 10,
      "name": "@Sprint11"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 12,
      "value": "# Go to site and log in"
    }
  ],
  "line": 13,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "user logs into app with the \"bam@bam.com\" and \"Password123!\" as the login credentials",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user is on \"Landing\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user selects singles product",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 17,
      "value": "#Select Standard will Package"
    }
  ],
  "line": 18,
  "name": "user clicks Standard will product for singles",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user is on \"Personal\" page",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 20,
      "value": "#User filled valid input"
    }
  ],
  "line": 21,
  "name": "user fills up mandatory fields inside the personal page for victorian",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "user clicks on Next button on personal page",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "user is on \"About you\" page",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 24,
      "value": "#Single"
    }
  ],
  "line": 25,
  "name": "user selects \"Single\" as Relationship Status on about page",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "user fill up the all required fields for single status",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user click the next button on the about page",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user is on \"Assets\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "user clicks no to do you have assets question",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 30,
      "value": "#Asset answer \"no\" to other question"
    }
  ],
  "line": 31,
  "name": "user clicks no to all assets question",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user click the next button on the assets page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 33,
      "value": "#Skip Beneficiaries Page"
    }
  ],
  "line": 34,
  "name": "user clicks yes to Do you want to include any children you have in the future question",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user clicks no to If any of your children predecease you, do you want to divide it equally amongst their children question",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user clicks no to Do you wish to leave any gifts question",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user click the next button on the beneficiaries page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 38,
      "value": "#Executors Page"
    }
  ],
  "line": 39,
  "name": "user is on \"Executors\" page",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 40,
      "value": "#  And user adds first option executor"
    }
  ],
  "line": 41,
  "name": "user clicks on add executor",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user adds first option executor",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user clicks on add executor",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "user adds back up executor",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "user clicks no to Would you like Maurice Blackburn to help your Executor manage your estate question",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "user selects i have no wish on funeral wishes",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "user click the next button on the executors page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 48,
      "value": "#ID docs Page"
    }
  ],
  "line": 49,
  "name": "user is on \"ID Check\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 50,
  "name": "user agrees to terms and agreement inside the ID docs Page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 51,
      "value": "#ADD ID"
    }
  ],
  "line": 52,
  "name": "user selects Driver License as first identification type",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "user adds driver license details",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "user selects Medicare as second identification type",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "user adds medicare details",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "user clicks next button on the ID docs page",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "user is on \"Review and Confirm\" page",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 58,
      "value": "#Check personal Info summary"
    }
  ],
  "line": 59,
  "name": "user checks the personal info summary details",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 60,
      "value": "#Check AboutYou summary"
    }
  ],
  "line": 61,
  "name": "user checks the About you summary details",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 62,
      "value": "#Check Assets summary"
    }
  ],
  "line": 63,
  "name": "user checks the Assets summary details",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 64,
      "value": "#Check Beneficiaries summary"
    }
  ],
  "line": 65,
  "name": "user checks the Beneficiaries summary details",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 66,
      "value": "#Check Executors summary"
    }
  ],
  "line": 67,
  "name": "user checks the Executors summary details",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 68,
      "value": "#Edit Personal info"
    }
  ],
  "line": 69,
  "name": "user clicks edit button on personal info summary",
  "keyword": "And "
});
formatter.step({
  "line": 70,
  "name": "user is on \"Personal\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 71,
  "name": "user edits some personal details",
  "keyword": "And "
});
formatter.step({
  "line": 72,
  "name": "user clicks on Next button on personal page",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 73,
      "value": "#Edit About you"
    }
  ],
  "line": 74,
  "name": "user edits some about you details",
  "keyword": "And "
});
formatter.step({
  "line": 75,
  "name": "user click the next button on the about page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 76,
      "value": "#Edit Assets"
    }
  ],
  "line": 77,
  "name": "user clicks yes to do you control a trust question",
  "keyword": "And "
});
formatter.step({
  "line": 78,
  "name": "user clicks yes to do you control a self-managed superannuation fund question",
  "keyword": "And "
});
formatter.step({
  "line": 79,
  "name": "user clicks yes to do you own your own business or are you a partner in a partnership question",
  "keyword": "And "
});
formatter.step({
  "line": 80,
  "name": "user click the next button on the assets page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 81,
      "value": "#Edit Benefeciaries"
    }
  ],
  "line": 82,
  "name": "user clicks yes to If any of your children predecease you, do you want to divide it equally amongst their children question",
  "keyword": "And "
});
formatter.step({
  "line": 83,
  "name": "user click the next button on the beneficiaries page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 84,
      "value": "#Next ID Docs"
    }
  ],
  "line": 85,
  "name": "user agrees to terms and agreement inside the ID docs Page",
  "keyword": "And "
});
formatter.step({
  "line": 86,
  "name": "user clicks next button on the ID docs page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 87,
      "value": "#Validate acknowledgement"
    }
  ],
  "line": 88,
  "name": "user click the next button on the review and confirm page",
  "keyword": "And "
});
formatter.step({
  "line": 89,
  "name": "user sees message \"You must confirm and acknowledge the information you have provided\"",
  "keyword": "And "
});
formatter.step({
  "line": 90,
  "name": "user confirms on the acknowledgement inside the review and confirm page",
  "keyword": "And "
});
formatter.step({
  "line": 92,
  "name": "user click the next button on the review and confirm page",
  "keyword": "And "
});
formatter.step({
  "line": 93,
  "name": "user is on \"Add-Ons\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 94,
  "name": "user close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.user_opens_browser()"
});
formatter.result({
  "duration": 309845200,
  "status": "passed"
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
  "duration": 9902992100,
  "status": "passed"
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
  "duration": 5006904600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_selects_singles_product()"
});
formatter.result({
  "duration": 5081632300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_Standard_will_product_for_singles()"
});
formatter.result({
  "duration": 7576024500,
  "status": "passed"
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
  "duration": 5005307500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_fills_up_mandatory_fields_inside_the_personal_page_for_victorian()"
});
formatter.result({
  "duration": 46151443800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_Next_button_on_personal_page()"
});
formatter.result({
  "duration": 5112206400,
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
  "duration": 5006257200,
  "status": "passed"
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
  "duration": 10155744400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_fill_up_the_all_required_fields_for_single_status()"
});
formatter.result({
  "duration": 15341443400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_click_the_next_button_on_the_about_page()"
});
formatter.result({
  "duration": 5117321900,
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
  "duration": 5004325500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_no_to_do_you_have_assets_question()"
});
formatter.result({
  "duration": 121820000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_no_to_all_assets_question()"
});
formatter.result({
  "duration": 796404300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_click_the_next_button_on_the_assets_page()"
});
formatter.result({
  "duration": 5124327200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_yes_to_Do_you_want_to_include_any_children_you_have_in_the_future_question()"
});
formatter.result({
  "duration": 9841690900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_no_to_If_any_of_your_children_predecease_you_do_you_want_to_divide_it_equally_amongst_their_children_question()"
});
formatter.result({
  "duration": 5099391200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_no_to_Do_you_wish_to_leave_any_gifts_question()"
});
formatter.result({
  "duration": 10125506500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_click_the_next_button_on_the_beneficiaries_page()"
});
formatter.result({
  "duration": 5102420400,
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
  "duration": 5017218800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_add_executor()"
});
formatter.result({
  "duration": 5103499400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_adds_first_option_executor()"
});
formatter.result({
  "duration": 57494093500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_add_executor()"
});
formatter.result({
  "duration": 5474456400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_adds_back_up_executor()"
});
formatter.result({
  "duration": 67838478200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_no_to_Would_you_like_Maurice_Blackburn_to_help_your_Executor_manage_your_estate_question()"
});
formatter.result({
  "duration": 90158400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_selects_i_have_no_wish_on_funeral_wishes()"
});
formatter.result({
  "duration": 111587600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_click_the_next_button_on_the_executors_page()"
});
formatter.result({
  "duration": 5113870300,
  "status": "passed"
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
  "duration": 5005512400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_agrees_to_terms_and_agreement_inside_the_ID_docs_Page()"
});
formatter.result({
  "duration": 10092831100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_selects_Driver_License_as_first_identification_type()"
});
formatter.result({
  "duration": 35244819400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_adds_driver_license_details()"
});
formatter.result({
  "duration": 347105222500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_selects_Medicare_as_second_identification_type()"
});
formatter.result({
  "duration": 35516148000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_adds_medicare_details()"
});
