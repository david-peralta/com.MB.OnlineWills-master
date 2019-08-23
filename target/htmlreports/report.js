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
  "duration": 12249351400,
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
  "duration": 152562000,
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
  "duration": 26678603900,
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
  "duration": 17680800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_validates_his_account_is_logged_in()"
});
formatter.result({
  "duration": 116538300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_logs_out_of_the_app()"
});
formatter.result({
  "duration": 2188588300,
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
  "duration": 16561600,
  "status": "passed"
});
formatter.after({
  "duration": 1461355900,
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
  "duration": 21588099100,
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
  "duration": 736100,
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
  "duration": 6902327800,
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
  "duration": 36655500,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//span[contains(text(), \u0027Invalid User Credentials\u0027)]\"}\n  (Session info: chrome\u003d76.0.3809.100)\n  (Driver info: chromedriver\u003d2.43.600210 (68dcf5eebde37173d4027fa8635e332711d2874a),platform\u003dWindows NT 10.0.18362 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027AMFSTER\u0027, ip: \u0027192.168.254.102\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002712.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.43.600210 (68dcf5eebde371..., userDataDir: C:\\Users\\Enzo\\AppData\\Local...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:55196}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 76.0.3809.100, webStorageEnabled: true}\nSession ID: 46a7695d15a5b4bfdd748095b034b5b1\n*** Element info: {Using\u003dxpath, value\u003d//span[contains(text(), \u0027Invalid User Credentials\u0027)]}\r\n\tat jdk.internal.reflect.GeneratedConstructorAccessor9.newInstance(Unknown Source)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:424)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat utilities.CommonFunctions.checkFeedbackMessageDisplayed(CommonFunctions.java:517)\r\n\tat steps.StepDefinitions.user_sees_feedback_message(StepDefinitions.java:54)\r\n\tat ✽.Then user sees feedback message \"Invalid User Credentials\"(src/test/resources/features/WIP.feature:20)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 3554548200,
  "status": "passed"
});
});