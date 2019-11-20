$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Sprint 2/MW - 104.feature");
formatter.feature({
  "line": 1,
  "name": "MW - 104 As a Legal Assistant, I want to navigate to a Dashboard, So that I can easily view who I need to contact",
  "description": "",
  "id": "mw---104-as-a-legal-assistant,-i-want-to-navigate-to-a-dashboard,-so-that-i-can-easily-view-who-i-need-to-contact",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "",
  "description": "",
  "id": "mw---104-as-a-legal-assistant,-i-want-to-navigate-to-a-dashboard,-so-that-i-can-easily-view-who-i-need-to-contact;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 5,
      "value": "# Go to site and log in"
    }
  ],
  "line": 6,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user logs into app with the \"\u003cemail\u003e\" and \"\u003cpassword\u003e\" as the login credentials",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user is on \"Landing\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks on new order on incomplete order popup",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user selects singles product",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 11,
      "value": "#Select Standard will Package"
    }
  ],
  "line": 12,
  "name": "user clicks Standard will product for singles",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user is on \"Personal\" page",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 14,
      "value": "#User filled valid input"
    }
  ],
  "line": 15,
  "name": "user selects \"Dr\" as title on personal page",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user inputs \"Today\" as date of birth on personal page",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user inputs \"4772834\" as Phone Number on personal page",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user inputs \"Consultant\" as Occupation on personal page",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user inputs \"\u003cAddress1\u003e\" as Residential address line one on personal page",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user inputs \"\u003cSuburb\u003e\" as Residential suburb on personal page",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "user selects \"VIC\" as Residential state on personal page",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "user selects \"4103\" as Residential Postcode on personal page",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "user selects Postal Address same as Residential checkbox",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "user selects no on first question",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "user selects no on second question",
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
      "value": "#Single"
    }
  ],
  "line": 29,
  "name": "user selects \"Single\" as Relationship Status on about page",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 30,
      "value": "#Scenario: 1 - Customer’s Will responses identified as Complex"
    }
  ],
  "line": 31,
  "name": "user fills up for single status for step children",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user click the next button on the about page",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "user is on \"Assets\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "user clicks no to do you have assets question",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 35,
      "value": "#Asset answer \"no\" to other question"
    }
  ],
  "line": 36,
  "name": "user clicks no to do you have debts question",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user clicks no to do you have any superannuation question",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user clicks no to do you have life insurance separate from your superannuation",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user clicks no to do you control a trust question",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user clicks no to do you control a self-managed superannuation fund question",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user clicks no to do you own your own business or are you a partner in a partnership question",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user click the next button on the assets page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 43,
      "value": "#Beneficiaires - select Gift"
    }
  ],
  "line": 44,
  "name": "user clicks yes to Do you want to give the whole estate equally to your children question",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "user clicks no to Do you want to include any children you have in the future question",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "user clicks no to If any of your children predecease you, do you want to divide it equally amongst their children question",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "user clicks no to Do you wish to leave any gifts question",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "user sees disaster question displayed",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 49,
      "value": "#Scenario 2: Customer reviews information entered"
    }
  ],
  "line": 50,
  "name": "user click the next button to the idDocs page",
  "keyword": "When "
});
formatter.step({
  "line": 51,
  "name": "user is on \"ID Check\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 52,
  "name": "user agrees to terms and agreement inside the ID docs Page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 53,
      "value": "#ADD ID"
    }
  ],
  "line": 54,
  "name": "user selects Driver License as first identification type",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "user adds driver license details",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "user selects Medicare as second identification type",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "user adds medicare details",
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "user clicks next button on the ID docs page",
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "user is on \"ReviewAndConfirm\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 60,
  "name": "user reviews and confirms will details",
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "user confirms will details",
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": "user clicks the next button to confirm will",
  "keyword": "When "
});
formatter.step({
  "line": 63,
  "name": "user is on \"Thank You\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 64,
  "name": "user sees message \"Thank you\"",
  "keyword": "And "
});
formatter.examples({
  "line": 66,
  "name": "",
  "description": "",
  "id": "mw---104-as-a-legal-assistant,-i-want-to-navigate-to-a-dashboard,-so-that-i-can-easily-view-who-i-need-to-contact;;",
  "rows": [
    {
      "cells": [
        "email",
        "password",
        "Address1",
        "Suburb"
      ],
      "line": 67,
      "id": "mw---104-as-a-legal-assistant,-i-want-to-navigate-to-a-dashboard,-so-that-i-can-easily-view-who-i-need-to-contact;;;1"
    },
    {
      "cells": [
        "demeth@gmail.com",
        "Password123!",
        "No.22 Diamond Street Bahayang Pagasa Imus Cavite",
        "Executive Lane"
      ],
      "line": 68,
      "id": "mw---104-as-a-legal-assistant,-i-want-to-navigate-to-a-dashboard,-so-that-i-can-easily-view-who-i-need-to-contact;;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 6779308000,
  "status": "passed"
});
formatter.scenario({
  "line": 68,
  "name": "",
  "description": "",
  "id": "mw---104-as-a-legal-assistant,-i-want-to-navigate-to-a-dashboard,-so-that-i-can-easily-view-who-i-need-to-contact;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 5,
      "value": "# Go to site and log in"
    }
  ],
  "line": 6,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user logs into app with the \"demeth@gmail.com\" and \"Password123!\" as the login credentials",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user is on \"Landing\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks on new order on incomplete order popup",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user selects singles product",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 11,
      "value": "#Select Standard will Package"
    }
  ],
  "line": 12,
  "name": "user clicks Standard will product for singles",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user is on \"Personal\" page",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 14,
      "value": "#User filled valid input"
    }
  ],
  "line": 15,
  "name": "user selects \"Dr\" as title on personal page",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user inputs \"Today\" as date of birth on personal page",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user inputs \"4772834\" as Phone Number on personal page",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user inputs \"Consultant\" as Occupation on personal page",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user inputs \"No.22 Diamond Street Bahayang Pagasa Imus Cavite\" as Residential address line one on personal page",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user inputs \"Executive Lane\" as Residential suburb on personal page",
  "matchedColumns": [
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "user selects \"VIC\" as Residential state on personal page",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "user selects \"4103\" as Residential Postcode on personal page",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "user selects Postal Address same as Residential checkbox",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "user selects no on first question",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "user selects no on second question",
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
      "value": "#Single"
    }
  ],
  "line": 29,
  "name": "user selects \"Single\" as Relationship Status on about page",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 30,
      "value": "#Scenario: 1 - Customer’s Will responses identified as Complex"
    }
  ],
  "line": 31,
  "name": "user fills up for single status for step children",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user click the next button on the about page",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "user is on \"Assets\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "user clicks no to do you have assets question",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 35,
      "value": "#Asset answer \"no\" to other question"
    }
  ],
  "line": 36,
  "name": "user clicks no to do you have debts question",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user clicks no to do you have any superannuation question",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user clicks no to do you have life insurance separate from your superannuation",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user clicks no to do you control a trust question",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user clicks no to do you control a self-managed superannuation fund question",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user clicks no to do you own your own business or are you a partner in a partnership question",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user click the next button on the assets page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 43,
      "value": "#Beneficiaires - select Gift"
    }
  ],
  "line": 44,
  "name": "user clicks yes to Do you want to give the whole estate equally to your children question",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "user clicks no to Do you want to include any children you have in the future question",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "user clicks no to If any of your children predecease you, do you want to divide it equally amongst their children question",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "user clicks no to Do you wish to leave any gifts question",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "user sees disaster question displayed",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 49,
      "value": "#Scenario 2: Customer reviews information entered"
    }
  ],
  "line": 50,
  "name": "user click the next button to the idDocs page",
  "keyword": "When "
});
formatter.step({
  "line": 51,
  "name": "user is on \"ID Check\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 52,
  "name": "user agrees to terms and agreement inside the ID docs Page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 53,
      "value": "#ADD ID"
    }
  ],
  "line": 54,
  "name": "user selects Driver License as first identification type",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "user adds driver license details",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "user selects Medicare as second identification type",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "user adds medicare details",
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "user clicks next button on the ID docs page",
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "user is on \"ReviewAndConfirm\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 60,
  "name": "user reviews and confirms will details",
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "user confirms will details",
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": "user clicks the next button to confirm will",
  "keyword": "When "
});
formatter.step({
  "line": 63,
  "name": "user is on \"Thank You\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 64,
  "name": "user sees message \"Thank you\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.user_opens_browser()"
});
formatter.result({
  "duration": 914181800,
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
  "duration": 67271328200,
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
  "duration": 6021710100,
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d78.0.3904.97)\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027DAVIDPERALTA\u0027, ip: \u0027172.18.0.168\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 78.0.3904.97, chrome: {chromedriverVersion: 78.0.3904.70 (edb9c9f3de024..., userDataDir: C:\\Users\\DAVIDP~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:61791}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 48d517b6b4bff7fef4aaa6ca8d0951c7\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:605)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getTitle(RemoteWebDriver.java:280)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$2.apply(ExpectedConditions.java:87)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$2.apply(ExpectedConditions.java:82)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:260)\r\n\tat utilities.CommonFunctions.checkPageTitle(CommonFunctions.java:588)\r\n\tat steps.StepDefinitions.user_is_on_page(StepDefinitions.java:110)\r\n\tat ✽.Then user is on \"Landing\" page(src/test/resources/features/Sprint 2/MW - 104.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_new_order_on_incomplete_order_popup()"
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
  "arguments": [
    {
      "val": "Dr",
      "offset": 14
    }
  ],
  "location": "StepDefinitions.user_selects_as_title_on_personal_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Today",
      "offset": 13
    }
  ],
  "location": "StepDefinitions.user_inputs_as_date_of_birth_on_personal_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "4772834",
      "offset": 13
    }
  ],
  "location": "StepDefinitions.user_inputs_as_Phone_Number_on_personal_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Consultant",
      "offset": 13
    }
  ],
  "location": "StepDefinitions.user_inputs_as_Occupation_on_personal_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "No.22 Diamond Street Bahayang Pagasa Imus Cavite",
      "offset": 13
    }
  ],
  "location": "StepDefinitions.user_inputs_as_Residential_address_line_one_on_personal_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Executive Lane",
      "offset": 13
    }
  ],
  "location": "StepDefinitions.user_inputs_as_Residential_suburb_on_personal_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "VIC",
      "offset": 14
    }
  ],
  "location": "StepDefinitions.user_selects_as_Residential_state_on_personal_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "4103",
      "offset": 14
    }
  ],
  "location": "StepDefinitions.user_selects_as_Residential_Postcode_on_personal_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_selects_Postal_Address_same_as_Residential_checkbox()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_selects_no_on_first_question()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_selects_no_on_second_question()"
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
  "location": "StepDefinitions.user_fills_up_for_single_status_for_step_children()"
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
  "location": "StepDefinitions.user_clicks_no_to_do_you_have_debts_question()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_no_to_do_you_have_any_superannuation_question()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_no_to_do_you_have_life_insurance_separate_from_your_superannuation()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_no_to_do_you_control_a_trust_question()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_no_to_do_you_control_a_self_managed_superannuation_fund_question()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_no_to_do_you_own_your_own_business_or_are_you_a_partner_in_a_partnership_question()"
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
  "location": "StepDefinitions.user_clicks_yes_to_Do_you_want_to_give_the_whole_estate_equally_to_your_children_question()"
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
  "location": "StepDefinitions.user_sees_disaster_question_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_click_the_next_button_to_the_idDocs_page()"
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
  "location": "StepDefinitions.user_selects_Driver_License_as_first_identification_type()"
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
  "location": "StepDefinitions.user_selects_Medicare_as_second_identification_type()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_adds_medicare_details()"
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
  "location": "StepDefinitions.user_reviews_and_confirms_will_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_confirms_will_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_the_next_button_to_confirm_will()"
});
formatter.result({
  "status": "skipped"
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
  "arguments": [
    {
      "val": "Thank you",
      "offset": 19
    }
  ],
  "location": "StepDefinitions.user_sees_message(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 133175700,
  "status": "passed"
});
});