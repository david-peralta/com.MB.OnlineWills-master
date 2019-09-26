$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/WIP.feature");
formatter.feature({
  "line": 1,
  "name": "APT-78: As a User, I want to login to Oxy Admin portal so that I can access and use the portal",
  "description": "",
  "id": "apt-78:-as-a-user,-i-want-to-login-to-oxy-admin-portal-so-that-i-can-access-and-use-the-portal",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "1 and 2: Successful Login",
  "description": "",
  "id": "apt-78:-as-a-user,-i-want-to-login-to-oxy-admin-portal-so-that-i-can-access-and-use-the-portal;1-and-2:-successful-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@WIP"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user logs into app with the \"\u003cemail\u003e\" and \"\u003cpassword\u003e\" as the login credentials",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user is on \"HomePage\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user validates his account is logged in",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user logs out of the app",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user is on \"Login\" page",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "apt-78:-as-a-user,-i-want-to-login-to-oxy-admin-portal-so-that-i-can-access-and-use-the-portal;1-and-2:-successful-login;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 13,
      "id": "apt-78:-as-a-user,-i-want-to-login-to-oxy-admin-portal-so-that-i-can-access-and-use-the-portal;1-and-2:-successful-login;;1"
    },
    {
      "cells": [
        "test_user@aptours.com.au",
        "admin67testUser"
      ],
      "line": 14,
      "id": "apt-78:-as-a-user,-i-want-to-login-to-oxy-admin-portal-so-that-i-can-access-and-use-the-portal;1-and-2:-successful-login;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 16400252200,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "1 and 2: Successful Login",
  "description": "",
  "id": "apt-78:-as-a-user,-i-want-to-login-to-oxy-admin-portal-so-that-i-can-access-and-use-the-portal;1-and-2:-successful-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@WIP"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user logs into app with the \"test_user@aptours.com.au\" and \"admin67testUser\" as the login credentials",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user is on \"HomePage\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user validates his account is logged in",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user logs out of the app",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user is on \"Login\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.user_opens_browser()"
});
formatter.result({
  "duration": 264571000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test_user@aptours.com.au",
      "offset": 29
    },
    {
      "val": "admin67testUser",
      "offset": 60
    }
  ],
  "location": "StepDefinitions.user_logs_into_app_with_the_and_as_the_login_credentials(String,String)"
});
formatter.result({
  "duration": 5612558200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HomePage",
      "offset": 12
    }
  ],
  "location": "StepDefinitions.user_is_on_page(String)"
});
formatter.result({
  "duration": 7519400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_validates_his_account_is_logged_in()"
});
formatter.result({
  "duration": 52957100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_logs_out_of_the_app()"
});
formatter.result({
  "duration": 1551899300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 12
    }
  ],
  "location": "StepDefinitions.user_is_on_page(String)"
});
formatter.result({
  "duration": 7989100,
  "status": "passed"
});
formatter.after({
  "duration": 643372000,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 17,
  "name": "3: Invalid Login",
  "description": "",
  "id": "apt-78:-as-a-user,-i-want-to-login-to-oxy-admin-portal-so-that-i-can-access-and-use-the-portal;3:-invalid-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@WIP"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "user logs into app with the \"\u003cemail\u003e\" and \"\u003cpassword\u003e\" as the login credentials",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user sees feedback message \"Invalid User Credentials\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 22,
  "name": "",
  "description": "",
  "id": "apt-78:-as-a-user,-i-want-to-login-to-oxy-admin-portal-so-that-i-can-access-and-use-the-portal;3:-invalid-login;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 23,
      "id": "apt-78:-as-a-user,-i-want-to-login-to-oxy-admin-portal-so-that-i-can-access-and-use-the-portal;3:-invalid-login;;1"
    },
    {
      "cells": [
        "test_user@aptours.com.au",
        "admin67testUser"
      ],
      "line": 24,
      "id": "apt-78:-as-a-user,-i-want-to-login-to-oxy-admin-portal-so-that-i-can-access-and-use-the-portal;3:-invalid-login;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 13105015200,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "3: Invalid Login",
  "description": "",
  "id": "apt-78:-as-a-user,-i-want-to-login-to-oxy-admin-portal-so-that-i-can-access-and-use-the-portal;3:-invalid-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@WIP"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "user logs into app with the \"test_user@aptours.com.au\" and \"admin67testUser\" as the login credentials",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user sees feedback message \"Invalid User Credentials\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.user_opens_browser()"
});
formatter.result({
  "duration": 469100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test_user@aptours.com.au",
      "offset": 29
    },
    {
      "val": "admin67testUser",
      "offset": 60
    }
  ],
  "location": "StepDefinitions.user_logs_into_app_with_the_and_as_the_login_credentials(String,String)"
});
formatter.result({
  "duration": 5499438700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Invalid User Credentials",
      "offset": 28
    }
  ],
  "location": "StepDefinitions.user_sees_feedback_message(String)"
});
formatter.result({
  "duration": 20089600,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//span[contains(text(), \u0027Invalid User Credentials\u0027)]\"}\n  (Session info: chrome\u003d77.0.3865.90)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027JEROMEAMORES\u0027, ip: \u0027172.18.0.31\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 77.0.3865.90, chrome: {chromedriverVersion: 76.0.3809.68 (420c9498db8ce..., userDataDir: C:\\Users\\JEROME~1.AMO\\AppDa...}, goog:chromeOptions: {debuggerAddress: localhost:64254}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: d0f2a839f05fc4b10e4276d300b08ed9\n*** Element info: {Using\u003dxpath, value\u003d//span[contains(text(), \u0027Invalid User Credentials\u0027)]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:424)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat utilities.CommonFunctions.checkFeedbackMessageDisplayed(CommonFunctions.java:506)\r\n\tat steps.StepDefinitions.user_sees_feedback_message(StepDefinitions.java:59)\r\n\tat ✽.Then user sees feedback message \"Invalid User Credentials\"(src/test/resources/features/WIP.feature:20)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1012079400,
  "status": "passed"
});
});