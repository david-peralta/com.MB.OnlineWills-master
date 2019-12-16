<<<<<<< HEAD
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Sprint 1/MW - 27/MW - 27 - QuestionsB.feature");
=======
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Sprint 2/MW - 42/MW - 42A.feature");
>>>>>>> stash
formatter.feature({
  "line": 1,
<<<<<<< HEAD
  "name": "MW - 27B Questions : As a customer, I want to list my beneficiaries so I can allocate my Will",
=======
  "name": "MW - 42A : As a customer, I want to view additional products I can purchase",
>>>>>>> stash
  "description": "",
<<<<<<< HEAD
  "id": "mw---27b-questions-:-as-a-customer,-i-want-to-list-my-beneficiaries-so-i-can-allocate-my-will",
=======
  "id": "mw---42a-:-as-a-customer,-i-want-to-view-additional-products-i-can-purchase",
>>>>>>> stash
  "keyword": "Feature"
});
formatter.before({
<<<<<<< HEAD
  "duration": 24462259500,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
=======
  "duration": 6578245000,
  "status": "passed"
});
formatter.scenario({
  "line": 684,
>>>>>>> stash
  "name": "",
  "description": "",
<<<<<<< HEAD
  "id": "mw---27b-questions-:-as-a-customer,-i-want-to-list-my-beneficiaries-so-i-can-allocate-my-will;",
=======
  "id": "mw---42a-:-as-a-customer,-i-want-to-view-additional-products-i-can-purchase;",
>>>>>>> stash
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 683,
      "name": "@42-20"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 685,
      "value": "#Go to site and log in"
    }
  ],
  "line": 686,
  "name": "user opens browser and proceeds to orders page",
  "keyword": "Given "
});
formatter.step({
  "line": 687,
  "name": "user selects \"demeth@gmail.com\" on user dropdown",
  "keyword": "Then "
});
formatter.step({
  "line": 688,
  "name": "user clicks on delete all button",
  "keyword": "Then "
});
formatter.step({
  "line": 689,
  "name": "user close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.user_opens_browser_and_proceeds_to_orders_page()"
});
formatter.result({
<<<<<<< HEAD
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
=======
  "duration": 4077266800,
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
  "duration": 10197825000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_delete_all_button()"
});
formatter.result({
  "duration": 18247711700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_close_browser()"
});
formatter.result({
  "duration": 661414100,
  "status": "passed"
});
formatter.after({
  "duration": 1953200,
>>>>>>> stash
  "status": "passed"
});
formatter.scenarioOutline({
<<<<<<< HEAD
  "line": 10,
  "name": "",
  "description": "",
  "id": "mw---27b-questions-:-as-a-customer,-i-want-to-list-my-beneficiaries-so-i-can-allocate-my-will;",
=======
  "line": 692,
  "name": "6-Engaged: Couple who lives in VIC and selected the couple package",
  "description": "Scenario Outline: 7: Customer views the previous page - Not Applicable\nScenario Outline: 8: Customer skips Add On page",
  "id": "mw---42a-:-as-a-customer,-i-want-to-view-additional-products-i-can-purchase;6-engaged:-couple-who-lives-in-vic-and-selected-the-couple-package",
>>>>>>> stash
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
<<<<<<< HEAD
      "line": 9,
      "name": "@Sprint1"
=======
      "line": 691,
      "name": "@42-20"
>>>>>>> stash
    }
  ]
});
formatter.step({
<<<<<<< HEAD
  "comments": [
    {
      "line": 11,
      "value": "# Go to site and log in"
    }
  ],
  "line": 12,
=======
  "line": 696,
>>>>>>> stash
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
<<<<<<< HEAD
  "line": 13,
=======
  "line": 697,
>>>>>>> stash
  "name": "user logs into app with the \"\u003cemail\u003e\" and \"\u003cpassword\u003e\" as the login credentials",
  "keyword": "When "
});
formatter.step({
<<<<<<< HEAD
  "line": 14,
=======
  "line": 698,
>>>>>>> stash
  "name": "user is on \"Landing\" page",
  "keyword": "Then "
});
formatter.step({
<<<<<<< HEAD
  "line": 15,
  "name": "user selects singles product",
  "keyword": "When "
=======
  "line": 699,
  "name": "user selects couples product",
  "keyword": "And "
>>>>>>> stash
});
formatter.step({
<<<<<<< HEAD
  "comments": [
    {
      "line": 16,
      "value": "#Select Standard will Package"
    }
  ],
  "line": 17,
  "name": "user clicks Standard will product for singles",
  "keyword": "When "
=======
  "line": 700,
  "name": "user clicks Standard will product for couples",
  "keyword": "And "
>>>>>>> stash
});
formatter.step({
<<<<<<< HEAD
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
=======
  "line": 701,
>>>>>>> stash
  "name": "user fills up mandatory fields inside the personal page for victorian",
  "keyword": "When "
});
formatter.step({
<<<<<<< HEAD
  "line": 21,
=======
  "line": 702,
>>>>>>> stash
  "name": "user clicks on Next button on personal page",
  "keyword": "And "
});
formatter.step({
<<<<<<< HEAD
  "line": 22,
=======
  "line": 703,
>>>>>>> stash
  "name": "user is on \"About you\" page",
  "keyword": "Then "
});
formatter.step({
<<<<<<< HEAD
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
=======
  "line": 704,
  "name": "user selects \"Engaged\" as Relationship Status on about page",
>>>>>>> stash
  "keyword": "And "
});
formatter.step({
<<<<<<< HEAD
  "line": 26,
=======
  "line": 705,
  "name": "user fill up the all required fields for engaged status",
  "keyword": "And "
});
formatter.step({
  "line": 706,
  "name": "user clicks yes to do you want to do your will with your spouse or partner question",
  "keyword": "And "
});
formatter.step({
  "line": 707,
  "name": "user inputs \"testspouse@test.com\" as the email address of the spouse/partner",
  "keyword": "And "
});
formatter.step({
  "line": 708,
>>>>>>> stash
  "name": "user click the next button on the about page",
  "keyword": "And "
});
formatter.step({
<<<<<<< HEAD
  "line": 27,
=======
  "line": 709,
>>>>>>> stash
  "name": "user is on \"Assets\" page",
  "keyword": "Then "
});
formatter.step({
<<<<<<< HEAD
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
=======
  "line": 710,
>>>>>>> stash
  "name": "user clicks no to all assets question",
  "keyword": "And "
});
formatter.step({
<<<<<<< HEAD
  "line": 31,
=======
  "line": 711,
>>>>>>> stash
  "name": "user click the next button on the assets page",
  "keyword": "And "
});
formatter.step({
<<<<<<< HEAD
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
=======
  "line": 712,
  "name": "user is on \"Beneficiaries\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 713,
  "name": "user clicks no to do you want to leave your whole estate to your spouse/partner if they survive you question",
>>>>>>> stash
  "keyword": "And "
});
formatter.step({
<<<<<<< HEAD
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
=======
  "line": 714,
  "name": "user clicks yes to Do you want to give the whole estate equally to your children question",
  "keyword": "And "
});
formatter.step({
  "line": 715,
  "name": "user clicks no to If any of your children predecease you, do you want to divide it equally amongst their children question",
>>>>>>> stash
  "keyword": "And "
});
formatter.step({
<<<<<<< HEAD
  "line": 40,
  "name": "user clicks yes to If any of your children predecease you, do you want to divide it equally amongst their children question",
=======
  "line": 716,
  "name": "user clicks no to Do you wish to leave any gifts question",
>>>>>>> stash
  "keyword": "And "
});
formatter.step({
<<<<<<< HEAD
  "line": 41,
  "name": "user sees disaster question displayed",
=======
  "line": 717,
  "name": "user click the next button on the beneficiaries page",
>>>>>>> stash
  "keyword": "And "
});
formatter.step({
<<<<<<< HEAD
  "line": 42,
  "name": "user clicks no to If any of your children predecease you, do you want to divide it equally amongst their children question",
  "keyword": "And "
=======
  "line": 718,
  "name": "user is on \"Executors\" page",
  "keyword": "Then "
>>>>>>> stash
});
formatter.step({
<<<<<<< HEAD
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
=======
  "line": 719,
  "name": "user clicks on add executor",
>>>>>>> stash
  "keyword": "And "
});
formatter.step({
<<<<<<< HEAD
  "line": 46,
  "name": "user close browser",
  "keyword": "Then "
=======
  "line": 720,
  "name": "user adds first option executor",
  "keyword": "And "
});
formatter.step({
  "line": 721,
  "name": "user clicks on add executor",
  "keyword": "And "
});
formatter.step({
  "line": 722,
  "name": "user adds back up executor",
  "keyword": "And "
});
formatter.step({
  "line": 723,
  "name": "user clicks no to Would you like Maurice Blackburn to help your Executor manage your estate question",
  "keyword": "And "
});
formatter.step({
  "line": 724,
  "name": "user selects i have no wish on funeral wishes",
  "keyword": "And "
});
formatter.step({
  "line": 725,
  "name": "user click the next button on the executors page",
  "keyword": "And "
});
formatter.step({
  "line": 726,
  "name": "user is on \"ID Check\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 727,
  "name": "user agrees to terms and agreement inside the ID docs Page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 728,
      "value": "#ADD ID"
    }
  ],
  "line": 729,
  "name": "user clicks on first identification document",
  "keyword": "Then "
});
formatter.step({
  "line": 730,
  "name": "user selects Driver License as first identification type",
  "keyword": "And "
});
formatter.step({
  "line": 731,
  "name": "user adds driver license details",
  "keyword": "And "
});
formatter.step({
  "line": 732,
  "name": "user adds first identification",
  "keyword": "And "
});
formatter.step({
  "line": 733,
  "name": "user clicks on second identification document",
  "keyword": "Then "
});
formatter.step({
  "line": 734,
  "name": "user selects Medicare as second identification type",
  "keyword": "And "
});
formatter.step({
  "line": 735,
  "name": "user adds medicare details",
  "keyword": "And "
});
formatter.step({
  "line": 736,
  "name": "user adds second identification",
  "keyword": "And "
});
formatter.step({
  "line": 737,
  "name": "user clicks next button on the ID docs page",
  "keyword": "And "
});
formatter.step({
  "line": 738,
  "name": "user is on \"Review and Confirm\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 739,
  "name": "user confirms that he completed the form himself",
  "keyword": "When "
});
formatter.step({
  "line": 740,
  "name": "user clicks the next button on the review and confirm page to go to add-on page",
  "keyword": "And "
});
formatter.step({
  "line": 741,
  "name": "user is on \"Add-Ons\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 742,
  "name": "user sees the power of attorney product",
  "keyword": "And "
});
formatter.step({
  "line": 743,
  "name": "user clicks the next button for pending spouse",
  "keyword": "When "
});
formatter.step({
  "line": 744,
  "name": "user is on \"Pending Spouse\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 745,
  "name": "user sees message \"Once your partner has completed their instructions, we will notify you to progress with the payment\"",
  "keyword": "And "
>>>>>>> stash
});
formatter.examples({
<<<<<<< HEAD
  "line": 48,
=======
  "line": 747,
>>>>>>> stash
  "name": "",
  "description": "",
<<<<<<< HEAD
  "id": "mw---27b-questions-:-as-a-customer,-i-want-to-list-my-beneficiaries-so-i-can-allocate-my-will;;",
=======
  "id": "mw---42a-:-as-a-customer,-i-want-to-view-additional-products-i-can-purchase;6-engaged:-couple-who-lives-in-vic-and-selected-the-couple-package;",
>>>>>>> stash
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
<<<<<<< HEAD
      "line": 49,
      "id": "mw---27b-questions-:-as-a-customer,-i-want-to-list-my-beneficiaries-so-i-can-allocate-my-will;;;1"
=======
      "line": 748,
      "id": "mw---42a-:-as-a-customer,-i-want-to-view-additional-products-i-can-purchase;6-engaged:-couple-who-lives-in-vic-and-selected-the-couple-package;;1"
>>>>>>> stash
    },
    {
      "cells": [
        "demeth@gmail.com",
        "Password123!"
      ],
<<<<<<< HEAD
      "line": 50,
      "id": "mw---27b-questions-:-as-a-customer,-i-want-to-list-my-beneficiaries-so-i-can-allocate-my-will;;;2"
=======
      "line": 749,
      "id": "mw---42a-:-as-a-customer,-i-want-to-view-additional-products-i-can-purchase;6-engaged:-couple-who-lives-in-vic-and-selected-the-couple-package;;2"
>>>>>>> stash
    }
  ],
  "keyword": "Examples"
});
formatter.before({
<<<<<<< HEAD
  "duration": 99183393300,
=======
  "duration": 5734356600,
>>>>>>> stash
  "status": "passed"
});
formatter.scenario({
<<<<<<< HEAD
  "line": 50,
  "name": "",
  "description": "",
  "id": "mw---27b-questions-:-as-a-customer,-i-want-to-list-my-beneficiaries-so-i-can-allocate-my-will;;;2",
=======
  "line": 749,
  "name": "6-Engaged: Couple who lives in VIC and selected the couple package",
  "description": "Scenario Outline: 7: Customer views the previous page - Not Applicable\nScenario Outline: 8: Customer skips Add On page",
  "id": "mw---42a-:-as-a-customer,-i-want-to-view-additional-products-i-can-purchase;6-engaged:-couple-who-lives-in-vic-and-selected-the-couple-package;;2",
>>>>>>> stash
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
<<<<<<< HEAD
      "line": 9,
      "name": "@Sprint1"
=======
      "line": 691,
      "name": "@42-20"
>>>>>>> stash
    }
  ]
});
formatter.step({
<<<<<<< HEAD
  "comments": [
    {
      "line": 11,
      "value": "# Go to site and log in"
    }
  ],
  "line": 12,
=======
  "line": 696,
>>>>>>> stash
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
<<<<<<< HEAD
  "line": 13,
  "name": "user logs into app with the \"bam@bam.com\" and \"Password123!\" as the login credentials",
=======
  "line": 697,
  "name": "user logs into app with the \"demeth@gmail.com\" and \"Password123!\" as the login credentials",
>>>>>>> stash
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
<<<<<<< HEAD
  "line": 14,
=======
  "line": 698,
>>>>>>> stash
  "name": "user is on \"Landing\" page",
  "keyword": "Then "
});
formatter.step({
<<<<<<< HEAD
  "line": 15,
  "name": "user selects singles product",
  "keyword": "When "
=======
  "line": 699,
  "name": "user selects couples product",
  "keyword": "And "
>>>>>>> stash
});
formatter.step({
<<<<<<< HEAD
  "comments": [
    {
      "line": 16,
      "value": "#Select Standard will Package"
    }
  ],
  "line": 17,
  "name": "user clicks Standard will product for singles",
  "keyword": "When "
=======
  "line": 700,
  "name": "user clicks Standard will product for couples",
  "keyword": "And "
>>>>>>> stash
});
formatter.step({
<<<<<<< HEAD
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
=======
  "line": 701,
>>>>>>> stash
  "name": "user fills up mandatory fields inside the personal page for victorian",
  "keyword": "When "
});
formatter.step({
<<<<<<< HEAD
  "line": 21,
=======
  "line": 702,
>>>>>>> stash
  "name": "user clicks on Next button on personal page",
  "keyword": "And "
});
formatter.step({
<<<<<<< HEAD
  "line": 22,
=======
  "line": 703,
>>>>>>> stash
  "name": "user is on \"About you\" page",
  "keyword": "Then "
});
formatter.step({
<<<<<<< HEAD
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
=======
  "line": 704,
  "name": "user selects \"Engaged\" as Relationship Status on about page",
>>>>>>> stash
  "keyword": "And "
});
formatter.step({
<<<<<<< HEAD
  "line": 26,
=======
  "line": 705,
  "name": "user fill up the all required fields for engaged status",
  "keyword": "And "
});
formatter.step({
  "line": 706,
  "name": "user clicks yes to do you want to do your will with your spouse or partner question",
  "keyword": "And "
});
formatter.step({
  "line": 707,
  "name": "user inputs \"testspouse@test.com\" as the email address of the spouse/partner",
  "keyword": "And "
});
formatter.step({
  "line": 708,
>>>>>>> stash
  "name": "user click the next button on the about page",
  "keyword": "And "
});
formatter.step({
<<<<<<< HEAD
  "line": 27,
=======
  "line": 709,
>>>>>>> stash
  "name": "user is on \"Assets\" page",
  "keyword": "Then "
});
formatter.step({
<<<<<<< HEAD
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
=======
  "line": 710,
>>>>>>> stash
  "name": "user clicks no to all assets question",
  "keyword": "And "
});
formatter.step({
<<<<<<< HEAD
  "line": 31,
=======
  "line": 711,
>>>>>>> stash
  "name": "user click the next button on the assets page",
  "keyword": "And "
});
formatter.step({
<<<<<<< HEAD
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
=======
  "line": 712,
  "name": "user is on \"Beneficiaries\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 713,
  "name": "user clicks no to do you want to leave your whole estate to your spouse/partner if they survive you question",
>>>>>>> stash
  "keyword": "And "
});
formatter.step({
<<<<<<< HEAD
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
=======
  "line": 714,
  "name": "user clicks yes to Do you want to give the whole estate equally to your children question",
  "keyword": "And "
});
formatter.step({
  "line": 715,
  "name": "user clicks no to If any of your children predecease you, do you want to divide it equally amongst their children question",
>>>>>>> stash
  "keyword": "And "
});
formatter.step({
<<<<<<< HEAD
  "line": 40,
  "name": "user clicks yes to If any of your children predecease you, do you want to divide it equally amongst their children question",
=======
  "line": 716,
  "name": "user clicks no to Do you wish to leave any gifts question",
>>>>>>> stash
  "keyword": "And "
});
formatter.step({
<<<<<<< HEAD
  "line": 41,
  "name": "user sees disaster question displayed",
=======
  "line": 717,
  "name": "user click the next button on the beneficiaries page",
>>>>>>> stash
  "keyword": "And "
});
formatter.step({
<<<<<<< HEAD
  "line": 42,
  "name": "user clicks no to If any of your children predecease you, do you want to divide it equally amongst their children question",
  "keyword": "And "
=======
  "line": 718,
  "name": "user is on \"Executors\" page",
  "keyword": "Then "
>>>>>>> stash
});
formatter.step({
<<<<<<< HEAD
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
=======
  "line": 719,
  "name": "user clicks on add executor",
>>>>>>> stash
  "keyword": "And "
});
formatter.step({
<<<<<<< HEAD
  "line": 46,
  "name": "user close browser",
  "keyword": "Then "
=======
  "line": 720,
  "name": "user adds first option executor",
  "keyword": "And "
});
formatter.step({
  "line": 721,
  "name": "user clicks on add executor",
  "keyword": "And "
});
formatter.step({
  "line": 722,
  "name": "user adds back up executor",
  "keyword": "And "
});
formatter.step({
  "line": 723,
  "name": "user clicks no to Would you like Maurice Blackburn to help your Executor manage your estate question",
  "keyword": "And "
});
formatter.step({
  "line": 724,
  "name": "user selects i have no wish on funeral wishes",
  "keyword": "And "
});
formatter.step({
  "line": 725,
  "name": "user click the next button on the executors page",
  "keyword": "And "
});
formatter.step({
  "line": 726,
  "name": "user is on \"ID Check\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 727,
  "name": "user agrees to terms and agreement inside the ID docs Page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 728,
      "value": "#ADD ID"
    }
  ],
  "line": 729,
  "name": "user clicks on first identification document",
  "keyword": "Then "
});
formatter.step({
  "line": 730,
  "name": "user selects Driver License as first identification type",
  "keyword": "And "
});
formatter.step({
  "line": 731,
  "name": "user adds driver license details",
  "keyword": "And "
});
formatter.step({
  "line": 732,
  "name": "user adds first identification",
  "keyword": "And "
});
formatter.step({
  "line": 733,
  "name": "user clicks on second identification document",
  "keyword": "Then "
});
formatter.step({
  "line": 734,
  "name": "user selects Medicare as second identification type",
  "keyword": "And "
});
formatter.step({
  "line": 735,
  "name": "user adds medicare details",
  "keyword": "And "
});
formatter.step({
  "line": 736,
  "name": "user adds second identification",
  "keyword": "And "
});
formatter.step({
  "line": 737,
  "name": "user clicks next button on the ID docs page",
  "keyword": "And "
});
formatter.step({
  "line": 738,
  "name": "user is on \"Review and Confirm\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 739,
  "name": "user confirms that he completed the form himself",
  "keyword": "When "
});
formatter.step({
  "line": 740,
  "name": "user clicks the next button on the review and confirm page to go to add-on page",
  "keyword": "And "
});
formatter.step({
  "line": 741,
  "name": "user is on \"Add-Ons\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 742,
  "name": "user sees the power of attorney product",
  "keyword": "And "
});
formatter.step({
  "line": 743,
  "name": "user clicks the next button for pending spouse",
  "keyword": "When "
});
formatter.step({
  "line": 744,
  "name": "user is on \"Pending Spouse\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 745,
  "name": "user sees message \"Once your partner has completed their instructions, we will notify you to progress with the payment\"",
  "keyword": "And "
>>>>>>> stash
});
formatter.match({
  "location": "StepDefinitions.user_opens_browser()"
});
formatter.result({
<<<<<<< HEAD
  "duration": 614108800,
=======
  "duration": 325555800,
>>>>>>> stash
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
<<<<<<< HEAD
  "duration": 11843114500,
=======
  "duration": 10215633700,
>>>>>>> stash
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
<<<<<<< HEAD
  "duration": 5019826500,
=======
  "duration": 4999236900,
>>>>>>> stash
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_selects_couples_product()"
});
formatter.result({
<<<<<<< HEAD
  "duration": 5253048300,
=======
  "duration": 5096707900,
>>>>>>> stash
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_Standard_will_product_for_couples()"
});
formatter.result({
<<<<<<< HEAD
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
=======
  "duration": 11641275700,
>>>>>>> stash
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_fills_up_mandatory_fields_inside_the_personal_page_for_victorian()"
});
formatter.result({
<<<<<<< HEAD
  "duration": 49933076000,
=======
  "duration": 47060059200,
>>>>>>> stash
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_Next_button_on_personal_page()"
});
formatter.result({
<<<<<<< HEAD
  "duration": 5310831500,
=======
  "duration": 7183692600,
>>>>>>> stash
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
<<<<<<< HEAD
  "duration": 5023751700,
=======
  "duration": 5008152900,
>>>>>>> stash
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Engaged",
      "offset": 14
    }
  ],
  "location": "StepDefinitions.user_selects_as_Relationship_Status_on_about_page(String)"
});
formatter.result({
<<<<<<< HEAD
  "duration": 10417633100,
=======
  "duration": 10237950100,
>>>>>>> stash
  "status": "passed"
});
formatter.match({
<<<<<<< HEAD
  "location": "StepDefinitions.user_fill_up_the_all_required_fields_for_single_status_with_children()"
=======
  "location": "StepDefinitions.user_fill_up_the_all_required_fields_for_engaged_status()"
>>>>>>> stash
});
formatter.result({
<<<<<<< HEAD
  "duration": 49912760500,
=======
  "duration": 46589862800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_yes_to_do_you_want_to_do_your_will_with_your_spouse_or_partner_question()"
});
formatter.result({
  "duration": 2635804300,
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
  "duration": 1806595200,
>>>>>>> stash
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_click_the_next_button_on_the_about_page()"
});
formatter.result({
<<<<<<< HEAD
  "duration": 5257507100,
=======
  "duration": 5101902000,
>>>>>>> stash
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
<<<<<<< HEAD
  "duration": 5006860100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_no_to_do_you_have_assets_question()"
});
formatter.result({
  "duration": 443625100,
=======
  "duration": 5008401800,
>>>>>>> stash
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_no_to_all_assets_question()"
});
formatter.result({
<<<<<<< HEAD
  "duration": 1890400500,
=======
  "duration": 18000537100,
>>>>>>> stash
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_click_the_next_button_on_the_assets_page()"
});
formatter.result({
<<<<<<< HEAD
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
=======
  "duration": 5160079300,
  "status": "passed"
>>>>>>> stash
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
  "duration": 5014364900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_no_to_do_you_want_to_leave_your_whole_estate_to_your_spouse_partner_if_they_survive_you_question()"
});
formatter.result({
  "duration": 187902400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_yes_to_Do_you_want_to_give_the_whole_estate_equally_to_your_children_question()"
});
formatter.result({
  "duration": 35414707700,
  "status": "passed"
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
  "duration": 35556352300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_sees_disaster_question_displayed()"
});
formatter.result({
  "duration": 10178421100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_no_to_Do_you_want_to_give_the_whole_estate_equally_to_your_children_question()"
});
formatter.result({
  "duration": 5201492100,
  "status": "passed"
});
formatter.match({
<<<<<<< HEAD
  "location": "StepDefinitions.user_sees_beneficiary_question_displayed()"
=======
  "arguments": [
    {
      "val": "Executors",
      "offset": 12
    }
  ],
  "location": "StepDefinitions.user_is_on_page(String)"
});
formatter.result({
  "duration": 5057754100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_add_executor()"
});
formatter.result({
  "duration": 5114001400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_adds_first_option_executor()"
});
formatter.result({
  "duration": 57936188900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_add_executor()"
});
formatter.result({
  "duration": 5104952100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_adds_back_up_executor()"
});
formatter.result({
  "duration": 68467191000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_no_to_Would_you_like_Maurice_Blackburn_to_help_your_Executor_manage_your_estate_question()"
});
formatter.result({
  "duration": 167054100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_selects_i_have_no_wish_on_funeral_wishes()"
});
formatter.result({
  "duration": 109983200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_click_the_next_button_on_the_executors_page()"
});
formatter.result({
  "duration": 5120901400,
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
  "duration": 5008801800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_agrees_to_terms_and_agreement_inside_the_ID_docs_Page()"
});
formatter.result({
  "duration": 10131994600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_first_identification_document()"
});
formatter.result({
  "duration": 42646549200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_selects_Driver_License_as_first_identification_type()"
});
formatter.result({
  "duration": 5144592700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_adds_driver_license_details()"
});
formatter.result({
  "duration": 47666557300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_adds_first_identification()"
});
formatter.result({
  "duration": 5661827400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_second_identification_document()"
});
formatter.result({
  "duration": 6161678800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_selects_Medicare_as_second_identification_type()"
});
formatter.result({
  "duration": 5268494600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_adds_medicare_details()"
});
formatter.result({
  "duration": 49078622800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_adds_second_identification()"
});
formatter.result({
  "duration": 5668535800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_next_button_on_the_ID_docs_page()"
});
formatter.result({
  "duration": 5107328100,
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
  "duration": 5009463800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_confirms_that_he_completed_the_form_himself()"
});
formatter.result({
  "duration": 156728700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_the_next_button_on_the_review_and_confirm_page_to_go_to_addon_page()"
});
formatter.result({
  "duration": 130551600,
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
  "duration": 11177390600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_sees_the_power_of_attorney_product()"
});
formatter.result({
  "duration": 1557200,
  "error_message": "org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027DAVIDPERALTA\u0027, ip: \u0027172.18.0.168\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:125)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.executeScript(RemoteWebDriver.java:485)\r\n\tat utilities.CommonFunctions.scrollToBottomOfPage(CommonFunctions.java:202)\r\n\tat steps.StepDefinitions.user_sees_the_power_of_attorney_product(StepDefinitions.java:2528)\r\n\tat ✽.And user sees the power of attorney product(src/test/resources/features/Sprint 2/MW - 42/MW - 42A.feature:742)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_the_next_button_for_pending_spouse()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Pending Spouse",
      "offset": 12
    }
  ],
  "location": "StepDefinitions.user_is_on_page(String)"
>>>>>>> stash
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Once your partner has completed their instructions, we will notify you to progress with the payment",
      "offset": 19
    }
  ],
  "location": "StepDefinitions.user_sees_message(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
<<<<<<< HEAD
  "duration": 138883800,
=======
  "duration": 302366600,
>>>>>>> stash
  "status": "passed"
});
});