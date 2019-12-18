$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Sprint 3/MW - 192.feature");
formatter.feature({
  "line": 1,
  "name": "MW - 192",
  "description": "",
  "id": "mw---192",
  "keyword": "Feature"
});
formatter.before({
  "duration": 12672690299,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "",
  "description": "",
  "id": "mw---192;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@WIP"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 5,
      "value": "#Go to site and log in"
    }
  ],
  "line": 6,
  "name": "user opens browser and proceeds to orders page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user selects \"david.peralta@yahoo.com\" on user dropdown",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on delete all button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.user_opens_browser_and_proceeds_to_orders_page()"
});
formatter.result({
  "duration": 3686581001,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "david.peralta@yahoo.com",
      "offset": 14
    }
  ],
  "location": "StepDefinitions.user_selects_on_user_dropdown(String)"
});
formatter.result({
  "duration": 10294163199,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_delete_all_button()"
});
formatter.result({
  "duration": 18214866800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_close_browser()"
});
formatter.result({
  "duration": 58783200,
  "status": "passed"
});
formatter.after({
  "duration": 2749100,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 12,
  "name": "",
  "description": "",
  "id": "mw---192;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@Sprint3"
    }
  ]
});
formatter.step({
  "comments": [
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
      "value": "#SELECTS UNION - POA"
    }
  ],
  "line": 19,
  "name": "user click free standard will",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 20,
      "value": "#Numeric"
    }
  ],
  "line": 21,
  "name": "user selects \"Numeric\" as affliated unions",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "user enter \"123123\" on your member number",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user click on confirm button",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 24,
      "value": "#Select Standard will Package-------------------------------------------------------------------------"
    }
  ],
  "line": 25,
  "name": "user clicks Standard will product for singles",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "user is on \"Personal\" page",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 27,
      "value": "#User filled valid input"
    }
  ],
  "line": 28,
  "name": "user fills up mandatory fields inside the personal page for victorian",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "user clicks on Next button on personal page",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "user is on \"About you\" page",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 31,
      "value": "#Single-------------------------------------------------------------------------"
    }
  ],
  "line": 32,
  "name": "user selects \"Single\" as Relationship Status on about page",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "user fill up the all required fields for single status",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user click the next button on the about page",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user is on \"Assets\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "user clicks no to do you have assets question",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 37,
      "value": "#Asset answer \"no\" to other question"
    }
  ],
  "line": 38,
  "name": "user clicks no to all assets question",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user click the next button on the assets page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 40,
      "value": "#Skip Beneficiaries Page-------------------------------------------------------------------------"
    }
  ],
  "line": 41,
  "name": "user clicks yes to Do you want to include any children you have in the future question",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user clicks no to If any of your children predecease you, do you want to divide it equally amongst their children question",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user clicks no to Do you wish to leave any gifts question",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "user click the next button on the beneficiaries page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 45,
      "value": "#Executors Page-------------------------------------------------------------------------"
    }
  ],
  "line": 46,
  "name": "user is on \"Executors\" page",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 47,
      "value": "#And user adds first option executor"
    }
  ],
  "line": 48,
  "name": "user clicks on add executor",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "user adds first option executor",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "user clicks on add executor",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "user adds back up executor",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "user clicks no to Would you like Maurice Blackburn to help your Executor manage your estate question",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "user selects i have no wish on funeral wishes",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "user click the next button on the executors page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 55,
      "value": "#ID docs Page-------------------------------------------------------------------------"
    }
  ],
  "line": 56,
  "name": "user is on \"ID Check\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 57,
  "name": "user agrees to terms and agreement inside the ID docs Page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 58,
      "value": "#ADD ID"
    }
  ],
  "line": 59,
  "name": "user clicks on first identification document",
  "keyword": "Then "
});
formatter.step({
  "line": 60,
  "name": "user selects Driver License as first identification type",
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "user adds driver license details",
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": "user adds first identification",
  "keyword": "And "
});
formatter.step({
  "line": 63,
  "name": "user clicks on second identification document",
  "keyword": "Then "
});
formatter.step({
  "line": 64,
  "name": "user selects Medicare as second identification type",
  "keyword": "And "
});
formatter.step({
  "line": 65,
  "name": "user adds medicare details",
  "keyword": "And "
});
formatter.step({
  "line": 66,
  "name": "user adds second identification",
  "keyword": "And "
});
formatter.step({
  "line": 67,
  "name": "user clicks next button on the ID docs page",
  "keyword": "And "
});
formatter.step({
  "line": 68,
  "name": "user is on \"Review and Confirm\" page",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 69,
      "value": "#Review and confirm-------------------------------------------------------------------------"
    }
  ],
  "line": 70,
  "name": "user is on \"Review and Confirm\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 71,
  "name": "user confirms on the acknowledgement inside the review and confirm page",
  "keyword": "And "
});
formatter.step({
  "line": 72,
  "name": "user click the next button on the review and confirm page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 73,
      "value": "#Add ons page"
    }
  ],
  "line": 74,
  "name": "user is on \"Add-Ons\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 75,
  "name": "user clicks on add POA on addons page",
  "keyword": "Then "
});
formatter.step({
  "line": 76,
  "name": "user click the next button with POA on the AddOns page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 77,
      "value": "#Financial Decisions"
    }
  ],
  "line": 78,
  "name": "user is on \"Enduring Power Of Attorney\" page",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 79,
      "value": "#Add Financial Decision Maker-------------------------------------------------------------------------"
    },
    {
      "line": 80,
      "value": "#1"
    }
  ],
  "line": 81,
  "name": "user selects Only financial matters on enduring power of attorney options",
  "keyword": "And "
});
formatter.step({
  "line": 82,
  "name": "user clicks on add financial decision maker on financial decision page",
  "keyword": "And "
});
formatter.step({
  "line": 83,
  "name": "user fills up financial decision maker details with Primary Decision Maker",
  "keyword": "And "
});
formatter.step({
  "line": 84,
  "name": "user clicks on add financial decision maker",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 85,
      "value": "#Select immediately on start to act dropdown"
    }
  ],
  "line": 86,
  "name": "user selects \"Immediately\" on When do you want your Financial/Personal Decision Makers to start to act dropdown",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 87,
      "value": "#Input limitation"
    }
  ],
  "line": 88,
  "name": "user enter \"This a test Limitation\" as limitation value",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 89,
      "value": "#next button"
    }
  ],
  "line": 90,
  "name": "user click the next button with POA on the financial decision page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 91,
      "value": "#Medical POA page-------------------------------------------------------------------------"
    }
  ],
  "line": 92,
  "name": "user is on \"MedicalPOA\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 93,
  "name": "user click on I do not want a MDM",
  "keyword": "Then "
});
formatter.step({
  "line": 94,
  "name": "user click next",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 95,
      "value": "#Review and confirm-------------------------------------------------------------------------"
    }
  ],
  "line": 96,
  "name": "user is on \"Review and Confirm\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 97,
  "name": "user confirms on the acknowledgement inside the review and confirm page",
  "keyword": "And "
});
formatter.step({
  "line": 98,
  "name": "user clicks the next button on the review and confirm page to go to payments page",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 99,
      "value": "#Payments"
    }
  ],
  "line": 100,
  "name": "user is on \"Payment\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 101,
  "name": "user clicks download cost disclosure",
  "keyword": "And "
});
formatter.examples({
  "line": 103,
  "name": "",
  "description": "",
  "id": "mw---192;;",
  "rows": [
    {
      "cells": [
        "email",
        "password",
        "Address1",
        "Suburb"
      ],
      "line": 104,
      "id": "mw---192;;;1"
    },
    {
      "cells": [
        "david.peralta@yahoo.com",
        "Password123!",
        "Australia",
        "Executive Lane"
      ],
      "line": 105,
      "id": "mw---192;;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 12342500500,
  "status": "passed"
});
formatter.scenario({
  "line": 105,
  "name": "",
  "description": "",
  "id": "mw---192;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@Sprint3"
    }
  ]
});
formatter.step({
  "comments": [
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
  "name": "user logs into app with the \"david.peralta@yahoo.com\" and \"Password123!\" as the login credentials",
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
      "value": "#SELECTS UNION - POA"
    }
  ],
  "line": 19,
  "name": "user click free standard will",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 20,
      "value": "#Numeric"
    }
  ],
  "line": 21,
  "name": "user selects \"Numeric\" as affliated unions",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "user enter \"123123\" on your member number",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user click on confirm button",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 24,
      "value": "#Select Standard will Package-------------------------------------------------------------------------"
    }
  ],
  "line": 25,
  "name": "user clicks Standard will product for singles",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "user is on \"Personal\" page",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 27,
      "value": "#User filled valid input"
    }
  ],
  "line": 28,
  "name": "user fills up mandatory fields inside the personal page for victorian",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "user clicks on Next button on personal page",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "user is on \"About you\" page",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 31,
      "value": "#Single-------------------------------------------------------------------------"
    }
  ],
  "line": 32,
  "name": "user selects \"Single\" as Relationship Status on about page",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "user fill up the all required fields for single status",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user click the next button on the about page",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user is on \"Assets\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "user clicks no to do you have assets question",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 37,
      "value": "#Asset answer \"no\" to other question"
    }
  ],
  "line": 38,
  "name": "user clicks no to all assets question",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user click the next button on the assets page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 40,
      "value": "#Skip Beneficiaries Page-------------------------------------------------------------------------"
    }
  ],
  "line": 41,
  "name": "user clicks yes to Do you want to include any children you have in the future question",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user clicks no to If any of your children predecease you, do you want to divide it equally amongst their children question",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user clicks no to Do you wish to leave any gifts question",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "user click the next button on the beneficiaries page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 45,
      "value": "#Executors Page-------------------------------------------------------------------------"
    }
  ],
  "line": 46,
  "name": "user is on \"Executors\" page",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 47,
      "value": "#And user adds first option executor"
    }
  ],
  "line": 48,
  "name": "user clicks on add executor",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "user adds first option executor",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "user clicks on add executor",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "user adds back up executor",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "user clicks no to Would you like Maurice Blackburn to help your Executor manage your estate question",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "user selects i have no wish on funeral wishes",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "user click the next button on the executors page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 55,
      "value": "#ID docs Page-------------------------------------------------------------------------"
    }
  ],
  "line": 56,
  "name": "user is on \"ID Check\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 57,
  "name": "user agrees to terms and agreement inside the ID docs Page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 58,
      "value": "#ADD ID"
    }
  ],
  "line": 59,
  "name": "user clicks on first identification document",
  "keyword": "Then "
});
formatter.step({
  "line": 60,
  "name": "user selects Driver License as first identification type",
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "user adds driver license details",
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": "user adds first identification",
  "keyword": "And "
});
formatter.step({
  "line": 63,
  "name": "user clicks on second identification document",
  "keyword": "Then "
});
formatter.step({
  "line": 64,
  "name": "user selects Medicare as second identification type",
  "keyword": "And "
});
formatter.step({
  "line": 65,
  "name": "user adds medicare details",
  "keyword": "And "
});
formatter.step({
  "line": 66,
  "name": "user adds second identification",
  "keyword": "And "
});
formatter.step({
  "line": 67,
  "name": "user clicks next button on the ID docs page",
  "keyword": "And "
});
formatter.step({
  "line": 68,
  "name": "user is on \"Review and Confirm\" page",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 69,
      "value": "#Review and confirm-------------------------------------------------------------------------"
    }
  ],
  "line": 70,
  "name": "user is on \"Review and Confirm\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 71,
  "name": "user confirms on the acknowledgement inside the review and confirm page",
  "keyword": "And "
});
formatter.step({
  "line": 72,
  "name": "user click the next button on the review and confirm page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 73,
      "value": "#Add ons page"
    }
  ],
  "line": 74,
  "name": "user is on \"Add-Ons\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 75,
  "name": "user clicks on add POA on addons page",
  "keyword": "Then "
});
formatter.step({
  "line": 76,
  "name": "user click the next button with POA on the AddOns page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 77,
      "value": "#Financial Decisions"
    }
  ],
  "line": 78,
  "name": "user is on \"Enduring Power Of Attorney\" page",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 79,
      "value": "#Add Financial Decision Maker-------------------------------------------------------------------------"
    },
    {
      "line": 80,
      "value": "#1"
    }
  ],
  "line": 81,
  "name": "user selects Only financial matters on enduring power of attorney options",
  "keyword": "And "
});
formatter.step({
  "line": 82,
  "name": "user clicks on add financial decision maker on financial decision page",
  "keyword": "And "
});
formatter.step({
  "line": 83,
  "name": "user fills up financial decision maker details with Primary Decision Maker",
  "keyword": "And "
});
formatter.step({
  "line": 84,
  "name": "user clicks on add financial decision maker",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 85,
      "value": "#Select immediately on start to act dropdown"
    }
  ],
  "line": 86,
  "name": "user selects \"Immediately\" on When do you want your Financial/Personal Decision Makers to start to act dropdown",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 87,
      "value": "#Input limitation"
    }
  ],
  "line": 88,
  "name": "user enter \"This a test Limitation\" as limitation value",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 89,
      "value": "#next button"
    }
  ],
  "line": 90,
  "name": "user click the next button with POA on the financial decision page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 91,
      "value": "#Medical POA page-------------------------------------------------------------------------"
    }
  ],
  "line": 92,
  "name": "user is on \"MedicalPOA\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 93,
  "name": "user click on I do not want a MDM",
  "keyword": "Then "
});
formatter.step({
  "line": 94,
  "name": "user click next",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 95,
      "value": "#Review and confirm-------------------------------------------------------------------------"
    }
  ],
  "line": 96,
  "name": "user is on \"Review and Confirm\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 97,
  "name": "user confirms on the acknowledgement inside the review and confirm page",
  "keyword": "And "
});
formatter.step({
  "line": 98,
  "name": "user clicks the next button on the review and confirm page to go to payments page",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 99,
      "value": "#Payments"
    }
  ],
  "line": 100,
  "name": "user is on \"Payment\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 101,
  "name": "user clicks download cost disclosure",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.user_opens_browser()"
});
formatter.result({
  "duration": 312059499,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "david.peralta@yahoo.com",
      "offset": 29
    },
    {
      "val": "Password123!",
      "offset": 59
    }
  ],
  "location": "StepDefinitions.user_logs_into_app_with_the_and_as_the_login_credentials(String,String)"
});
formatter.result({
  "duration": 10018085700,
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
  "duration": 5016793701,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_selects_singles_product()"
});
formatter.result({
  "duration": 6631495600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_click_free_standard_will()"
});
formatter.result({
  "duration": 3148809200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Numeric",
      "offset": 14
    }
  ],
  "location": "StepDefinitions.user_selects_as_affliated_unions(String)"
});
formatter.result({
  "duration": 177199300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123123",
      "offset": 12
    }
  ],
  "location": "StepDefinitions.user_enter_on_your_member_number(String)"
});
formatter.result({
  "duration": 1328602200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_click_on_confirm_button()"
});
formatter.result({
  "duration": 5104645699,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_Standard_will_product_for_singles()"
});
formatter.result({
  "duration": 6717899699,
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
  "duration": 5004193000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_fills_up_mandatory_fields_inside_the_personal_page_for_victorian()"
});
formatter.result({
  "duration": 46448858400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_Next_button_on_personal_page()"
});
formatter.result({
  "duration": 7292725399,
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
  "duration": 5042081500,
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
  "duration": 10223750200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_fill_up_the_all_required_fields_for_single_status()"
});
formatter.result({
  "duration": 15373465000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_click_the_next_button_on_the_about_page()"
});
formatter.result({
  "duration": 5108318400,
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
  "duration": 5015048999,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_no_to_do_you_have_assets_question()"
});
formatter.result({
  "duration": 186924900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_no_to_all_assets_question()"
});
formatter.result({
  "duration": 681337400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_click_the_next_button_on_the_assets_page()"
});
formatter.result({
  "duration": 15114162300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_yes_to_Do_you_want_to_include_any_children_you_have_in_the_future_question()"
});
formatter.result({
  "duration": 5177419700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_no_to_If_any_of_your_children_predecease_you_do_you_want_to_divide_it_equally_amongst_their_children_question()"
});
formatter.result({
  "duration": 5185764000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_no_to_Do_you_wish_to_leave_any_gifts_question()"
});
formatter.result({
  "duration": 10121882400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_click_the_next_button_on_the_beneficiaries_page()"
});
formatter.result({
  "duration": 5139329601,
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
  "duration": 5006777801,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_add_executor()"
});
formatter.result({
  "duration": 5100204800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_adds_first_option_executor()"
});
formatter.result({
  "duration": 66746892801,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_add_executor()"
});
formatter.result({
  "duration": 5160126400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_adds_back_up_executor()"
});
formatter.result({
  "duration": 78057659401,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_no_to_Would_you_like_Maurice_Blackburn_to_help_your_Executor_manage_your_estate_question()"
});
formatter.result({
  "duration": 111861299,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_selects_i_have_no_wish_on_funeral_wishes()"
});
formatter.result({
  "duration": 107975401,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_click_the_next_button_on_the_executors_page()"
});
formatter.result({
  "duration": 5120864699,
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
  "duration": 5016175000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_agrees_to_terms_and_agreement_inside_the_ID_docs_Page()"
});
formatter.result({
  "duration": 10156011100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_first_identification_document()"
});
formatter.result({
  "duration": 42226465101,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_selects_Driver_License_as_first_identification_type()"
});
formatter.result({
  "duration": 5147987201,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_adds_driver_license_details()"
});
formatter.result({
  "duration": 48010846901,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_adds_first_identification()"
});
formatter.result({
  "duration": 5639079800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_second_identification_document()"
});
formatter.result({
  "duration": 6163453600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_selects_Medicare_as_second_identification_type()"
});
formatter.result({
  "duration": 5258322499,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_adds_medicare_details()"
});
formatter.result({
  "duration": 49283856699,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_adds_second_identification()"
});
formatter.result({
  "duration": 5640906000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_next_button_on_the_ID_docs_page()"
});
formatter.result({
  "duration": 5176727100,
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
  "duration": 5007266799,
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
  "duration": 5017040500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_confirms_on_the_acknowledgement_inside_the_review_and_confirm_page()"
});
formatter.result({
  "duration": 132251799,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_click_the_next_button_on_the_review_and_confirm_page()"
});
formatter.result({
  "duration": 5109793599,
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
  "duration": 5015492301,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_add_POA_on_addons_page()"
});
formatter.result({
  "duration": 5139148800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_click_the_next_button_on_the_AddOns_page()"
});
formatter.result({
  "duration": 11913043900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Enduring Power Of Attorney",
      "offset": 12
    }
  ],
  "location": "StepDefinitions.user_is_on_page(String)"
});
formatter.result({
  "duration": 5014526300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_selects_Only_financial_matters_on_enduring_power_of_attorney_options()"
});
formatter.result({
  "duration": 7128517400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_add_financial_decision_maker_on_financial_decision_page()"
});
formatter.result({
  "duration": 5140646500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_fills_up_financial_decision_maker_details_with_Primary_Decision_Maker()"
});
formatter.result({
  "duration": 26798269199,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_add_financial_decision_maker()"
});
formatter.result({
  "duration": 5152288700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Immediately",
      "offset": 14
    }
  ],
  "location": "StepDefinitions.user_selects_on_When_do_you_want_your_Financial_Personal_Decision_Makers_to_start_to_act_dropdown(String)"
});
formatter.result({
  "duration": 8164464601,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "This a test Limitation",
      "offset": 12
    }
  ],
  "location": "StepDefinitions.user_enter_as_limitation_value(String)"
});
formatter.result({
  "duration": 10493610600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_click_the_next_button_with_POA_on_the_financial_decision_page()"
});
formatter.result({
  "duration": 7163508901,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MedicalPOA",
      "offset": 12
    }
  ],
  "location": "StepDefinitions.user_is_on_page(String)"
});
formatter.result({
  "duration": 5019530400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_click_on_I_do_not_want_a_MDM()"
});
formatter.result({
  "duration": 179858000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_click_next()"
});
formatter.result({
  "duration": 103802300,
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
  "duration": 5022924100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_confirms_on_the_acknowledgement_inside_the_review_and_confirm_page()"
});
formatter.result({
  "duration": 154483001,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_the_next_button_on_the_review_and_confirm_page_to_go_to_payments_page()"
});
formatter.result({
  "duration": 5123512300,
  "status": "passed"
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
  "duration": 5014411499,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_download_cost_disclosure()"
});
formatter.result({
  "duration": 3114279000,
  "status": "passed"
});
formatter.after({
  "duration": 407700,
  "status": "passed"
});
});