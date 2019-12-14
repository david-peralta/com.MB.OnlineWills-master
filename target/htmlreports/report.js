$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Sprint 1/MW - 27/MW - 27 - QuestionsB.feature");
formatter.feature({
  "line": 1,
  "name": "MW - 27B Questions : As a customer, I want to list my beneficiaries so I can allocate my Will",
  "description": "",
  "id": "mw---27b-questions-:-as-a-customer,-i-want-to-list-my-beneficiaries-so-i-can-allocate-my-will",
  "keyword": "Feature"
});
formatter.before({
  "duration": 24462259500,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "",
  "description": "",
  "id": "mw---27b-questions-:-as-a-customer,-i-want-to-list-my-beneficiaries-so-i-can-allocate-my-will;",
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
  "duration": 4699620700,
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
  "duration": 10449907500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_delete_all_button()"
});
formatter.result({
  "duration": 18402749100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_close_browser()"
});
formatter.result({
  "duration": 67379900,
  "status": "passed"
});
formatter.after({
  "duration": 2918300,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 10,
  "name": "",
  "description": "",
  "id": "mw---27b-questions-:-as-a-customer,-i-want-to-list-my-beneficiaries-so-i-can-allocate-my-will;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@Sprint1"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 11,
      "value": "# Go to site and log in"
    }
  ],
  "line": 12,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "user logs into app with the \"\u003cemail\u003e\" and \"\u003cpassword\u003e\" as the login credentials",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user is on \"Landing\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user selects singles product",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 16,
      "value": "#Select Standard will Package"
    }
  ],
  "line": 17,
  "name": "user clicks Standard will product for singles",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user is on \"Personal\" page",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 19,
      "value": "#User filled valid input"
    }
  ],
  "line": 20,
  "name": "user fills up mandatory fields inside the personal page for victorian",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "user clicks on Next button on personal page",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "user is on \"About you\" page",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 23,
      "value": "#Single"
    }
  ],
  "line": 24,
  "name": "user selects \"Single\" as Relationship Status on about page",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "user fill up the all required fields for single status with children",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user click the next button on the about page",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user is on \"Assets\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "user clicks no to do you have assets question",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 29,
      "value": "#Asset answer \"no\" to other question"
    }
  ],
  "line": 30,
  "name": "user clicks no to all assets question",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "user click the next button on the assets page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 32,
      "value": "#No Spouse and Yes Children"
    }
  ],
  "line": 33,
  "name": "user sees question \"Do you want to give the whole estate equally to your children?\"",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user clicks yes to Do you want to give the whole estate equally to your children question",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user sees question \"Do you want to include any children you have in the future?\"",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user clicks yes to Do you want to include any children you have in the future question",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user sees question \"If any of your children predecease you\"",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user clicks no to Do you want to include any children you have in the future question",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user sees question \"If any of your children predecease you\"",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user clicks yes to If any of your children predecease you, do you want to divide it equally amongst their children question",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user sees disaster question displayed",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user clicks no to If any of your children predecease you, do you want to divide it equally amongst their children question",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user sees disaster question displayed",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "user clicks no to Do you want to give the whole estate equally to your children question",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "user sees beneficiary question displayed",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "user close browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 48,
  "name": "",
  "description": "",
  "id": "mw---27b-questions-:-as-a-customer,-i-want-to-list-my-beneficiaries-so-i-can-allocate-my-will;;",
  "rows": [
    {
      "cells": [
        "email",
        "password",
        "Address1",
        "Suburb"
      ],
      "line": 49,
      "id": "mw---27b-questions-:-as-a-customer,-i-want-to-list-my-beneficiaries-so-i-can-allocate-my-will;;;1"
    },
    {
      "cells": [
        "bam@bam.com",
        "Password123!",
        "No.22 Diamond Street Bahayang Pagasa Imus Cavite",
        "Executive Lane"
      ],
      "line": 50,
      "id": "mw---27b-questions-:-as-a-customer,-i-want-to-list-my-beneficiaries-so-i-can-allocate-my-will;;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 99183393300,
  "status": "passed"
});
formatter.scenario({
  "line": 50,
  "name": "",
  "description": "",
  "id": "mw---27b-questions-:-as-a-customer,-i-want-to-list-my-beneficiaries-so-i-can-allocate-my-will;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@Sprint1"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 11,
      "value": "# Go to site and log in"
    }
  ],
  "line": 12,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "user logs into app with the \"bam@bam.com\" and \"Password123!\" as the login credentials",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user is on \"Landing\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user selects singles product",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 16,
      "value": "#Select Standard will Package"
    }
  ],
  "line": 17,
  "name": "user clicks Standard will product for singles",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user is on \"Personal\" page",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 19,
      "value": "#User filled valid input"
    }
  ],
  "line": 20,
  "name": "user fills up mandatory fields inside the personal page for victorian",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "user clicks on Next button on personal page",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "user is on \"About you\" page",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 23,
      "value": "#Single"
    }
  ],
  "line": 24,
  "name": "user selects \"Single\" as Relationship Status on about page",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "user fill up the all required fields for single status with children",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user click the next button on the about page",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user is on \"Assets\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "user clicks no to do you have assets question",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 29,
      "value": "#Asset answer \"no\" to other question"
    }
  ],
  "line": 30,
  "name": "user clicks no to all assets question",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "user click the next button on the assets page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 32,
      "value": "#No Spouse and Yes Children"
    }
  ],
  "line": 33,
  "name": "user sees question \"Do you want to give the whole estate equally to your children?\"",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user clicks yes to Do you want to give the whole estate equally to your children question",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user sees question \"Do you want to include any children you have in the future?\"",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user clicks yes to Do you want to include any children you have in the future question",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user sees question \"If any of your children predecease you\"",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user clicks no to Do you want to include any children you have in the future question",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user sees question \"If any of your children predecease you\"",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user clicks yes to If any of your children predecease you, do you want to divide it equally amongst their children question",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user sees disaster question displayed",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user clicks no to If any of your children predecease you, do you want to divide it equally amongst their children question",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user sees disaster question displayed",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "user clicks no to Do you want to give the whole estate equally to your children question",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "user sees beneficiary question displayed",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "user close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.user_opens_browser()"
});
formatter.result({
  "duration": 614108800,
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
  "duration": 11843114500,
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
  "duration": 5019826500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_selects_singles_product()"
});
formatter.result({
  "duration": 5253048300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_Standard_will_product_for_singles()"
});
formatter.result({
  "duration": 7452312400,
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
  "duration": 5027312200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_fills_up_mandatory_fields_inside_the_personal_page_for_victorian()"
});
formatter.result({
  "duration": 49933076000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_Next_button_on_personal_page()"
});
formatter.result({
  "duration": 5310831500,
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
  "duration": 5023751700,
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
  "duration": 10417633100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_fill_up_the_all_required_fields_for_single_status_with_children()"
});
formatter.result({
  "duration": 49912760500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_click_the_next_button_on_the_about_page()"
});
formatter.result({
  "duration": 5257507100,
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
  "duration": 5006860100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_no_to_do_you_have_assets_question()"
});
formatter.result({
  "duration": 443625100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_no_to_all_assets_question()"
});
formatter.result({
  "duration": 1890400500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_click_the_next_button_on_the_assets_page()"
});
formatter.result({
  "duration": 5213249300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Do you want to give the whole estate equally to your children?",
      "offset": 20
    }
  ],
  "location": "StepDefinitions.user_sees_question(String)"
});
formatter.result({
  "duration": 5024800000,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat utilities.CommonFunctions.textDisplayedInPage(CommonFunctions.java:814)\r\n\tat steps.StepDefinitions.user_sees_question(StepDefinitions.java:333)\r\n\tat ✽.And user sees question \"Do you want to give the whole estate equally to your children?\"(src/test/resources/features/Sprint 1/MW - 27/MW - 27 - QuestionsB.feature:33)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_yes_to_Do_you_want_to_give_the_whole_estate_equally_to_your_children_question()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Do you want to include any children you have in the future?",
      "offset": 20
    }
  ],
  "location": "StepDefinitions.user_sees_question(String)"
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
  "arguments": [
    {
      "val": "If any of your children predecease you",
      "offset": 20
    }
  ],
  "location": "StepDefinitions.user_sees_question(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_no_to_Do_you_want_to_include_any_children_you_have_in_the_future_question()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "If any of your children predecease you",
      "offset": 20
    }
  ],
  "location": "StepDefinitions.user_sees_question(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_yes_to_If_any_of_your_children_predecease_you_do_you_want_to_divide_it_equally_amongst_their_children_question()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_sees_disaster_question_displayed()"
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
  "location": "StepDefinitions.user_sees_disaster_question_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_no_to_Do_you_want_to_give_the_whole_estate_equally_to_your_children_question()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_sees_beneficiary_question_displayed()"
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
formatter.after({
  "duration": 138883800,
  "status": "passed"
});
});