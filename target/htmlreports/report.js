$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TST-1 - Login.feature");
formatter.feature({
  "line": 1,
  "name": "TST-1: Login",
  "description": "",
  "id": "tst-1:-login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "1: Successful Login",
  "description": "",
  "id": "tst-1:-login;1:-successful-login",
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
  "line": 5,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is on \"Facebook - Log In or Sign Up\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user enters the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\" for the login credentials",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user is on \"Facebook\" page",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "tst-1:-login;1:-successful-login;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 11,
      "id": "tst-1:-login;1:-successful-login;;1"
    },
    {
      "cells": [
        "bahalakasabuhaymo530@gmail.com",
        "fakeaccount123"
      ],
      "line": 12,
      "id": "tst-1:-login;1:-successful-login;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 267171300,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "1: Successful Login",
  "description": "",
  "id": "tst-1:-login;1:-successful-login;;2",
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
  "line": 5,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is on \"Facebook - Log In or Sign Up\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user enters the \"bahalakasabuhaymo530@gmail.com\" and \"fakeaccount123\" for the login credentials",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user is on \"Facebook\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.user_opens_browser()"
});
formatter.result({
  "duration": 12260223000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Facebook - Log In or Sign Up",
      "offset": 12
    }
  ],
  "location": "StepDefinitions.user_is_on_page(String)"
});
formatter.result({
  "duration": 57283100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bahalakasabuhaymo530@gmail.com",
      "offset": 17
    },
    {
      "val": "fakeaccount123",
      "offset": 54
    }
  ],
  "location": "StepDefinitions.user_enters_the_and_for_the_login_credentials(String,String)"
});
formatter.result({
  "duration": 6152591600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Facebook",
      "offset": 12
    }
  ],
  "location": "StepDefinitions.user_is_on_page(String)"
});
formatter.result({
  "duration": 40087000,
  "status": "passed"
});
formatter.after({
  "duration": 1055052700,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 15,
  "name": "2: Invalid Login",
  "description": "",
  "id": "tst-1:-login;2:-invalid-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 14,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "user is on \"Facebook - Log In or Sign Up\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user enters the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\" for the login credentials",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user is on \"Log into Facebook | Facebook\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "user sees error message \"The password you’ve entered is incorrect. \"",
  "keyword": "And "
});
formatter.examples({
  "line": 22,
  "name": "",
  "description": "",
  "id": "tst-1:-login;2:-invalid-login;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 23,
      "id": "tst-1:-login;2:-invalid-login;;1"
    },
    {
      "cells": [
        "bahalakasabuhaymo530@gmail.com",
        "wrongString"
      ],
      "line": 24,
      "id": "tst-1:-login;2:-invalid-login;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2106400,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "2: Invalid Login",
  "description": "",
  "id": "tst-1:-login;2:-invalid-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 14,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "user is on \"Facebook - Log In or Sign Up\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user enters the \"bahalakasabuhaymo530@gmail.com\" and \"wrongString\" for the login credentials",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user is on \"Log into Facebook | Facebook\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "user sees error message \"The password you’ve entered is incorrect. \"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.user_opens_browser()"
});
formatter.result({
  "duration": 11228523500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Facebook - Log In or Sign Up",
      "offset": 12
    }
  ],
  "location": "StepDefinitions.user_is_on_page(String)"
});
formatter.result({
  "duration": 16890200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bahalakasabuhaymo530@gmail.com",
      "offset": 17
    },
    {
      "val": "wrongString",
      "offset": 54
    }
  ],
  "location": "StepDefinitions.user_enters_the_and_for_the_login_credentials(String,String)"
});
formatter.result({
  "duration": 3955866600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Log into Facebook | Facebook",
      "offset": 12
    }
  ],
  "location": "StepDefinitions.user_is_on_page(String)"
});
formatter.result({
  "duration": 8985200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "The password you’ve entered is incorrect. ",
      "offset": 25
    }
  ],
  "location": "StepDefinitions.user_sees_error_message(String)"
});
formatter.result({
  "duration": 39106900,
  "status": "passed"
});
formatter.after({
  "duration": 719507900,
  "status": "passed"
});
formatter.uri("TST-2 - Upload.feature");
formatter.feature({
  "line": 1,
  "name": "TST-2: Upload Sample",
  "description": "",
  "id": "tst-2:-upload-sample",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "1: Upload Images",
  "description": "",
  "id": "tst-2:-upload-sample;1:-upload-images",
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
  "line": 5,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\" for the login credentials",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user is on \"Facebook\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user decides to create a new post",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user puts \"Test Upload\" as the text contents for the post",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user selects \"C:\\\\Users\\\\Jerome.Amores\\\\Downloads\\\\1.PNG\" as the photo/video to be uploaded",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user selects \"C:\\\\Users\\\\Jerome.Amores\\\\Downloads\\\\2.PNG\" as the photo/video to be uploaded",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user selects \"C:\\\\Users\\\\Jerome.Amores\\\\Downloads\\\\3.PNG\" as the photo/video to be uploaded",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user shares the new post",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user sees the new \"Test Upload\" post with the photos/videos",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "tst-2:-upload-sample;1:-upload-images;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 17,
      "id": "tst-2:-upload-sample;1:-upload-images;;1"
    },
    {
      "cells": [
        "bahalakasabuhaymo530@gmail.com",
        "fakeaccount123"
      ],
      "line": 18,
      "id": "tst-2:-upload-sample;1:-upload-images;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2041700,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "1: Upload Images",
  "description": "",
  "id": "tst-2:-upload-sample;1:-upload-images;;2",
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
  "line": 5,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters the \"bahalakasabuhaymo530@gmail.com\" and \"fakeaccount123\" for the login credentials",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user is on \"Facebook\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user decides to create a new post",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user puts \"Test Upload\" as the text contents for the post",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user selects \"C:\\\\Users\\\\Jerome.Amores\\\\Downloads\\\\1.PNG\" as the photo/video to be uploaded",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user selects \"C:\\\\Users\\\\Jerome.Amores\\\\Downloads\\\\2.PNG\" as the photo/video to be uploaded",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user selects \"C:\\\\Users\\\\Jerome.Amores\\\\Downloads\\\\3.PNG\" as the photo/video to be uploaded",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user shares the new post",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user sees the new \"Test Upload\" post with the photos/videos",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.user_opens_browser()"
});
formatter.result({
  "duration": 11231297500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bahalakasabuhaymo530@gmail.com",
      "offset": 17
    },
    {
      "val": "fakeaccount123",
      "offset": 54
    }
  ],
  "location": "StepDefinitions.user_enters_the_and_for_the_login_credentials(String,String)"
});
formatter.result({
  "duration": 5292662500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Facebook",
      "offset": 12
    }
  ],
  "location": "StepDefinitions.user_is_on_page(String)"
});
formatter.result({
  "duration": 37586800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_decides_to_create_a_new_post()"
});
formatter.result({
  "duration": 208377400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test Upload",
      "offset": 11
    }
  ],
  "location": "StepDefinitions.user_puts_as_the_text_contents_for_the_post(String)"
});
formatter.result({
  "duration": 3527781100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "C:\\\\Users\\\\Jerome.Amores\\\\Downloads\\\\1.PNG",
      "offset": 14
    }
  ],
  "location": "StepDefinitions.user_selects_as_the_photo_video_to_be_uploaded(String)"
});
formatter.result({
  "duration": 63300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "C:\\\\Users\\\\Jerome.Amores\\\\Downloads\\\\2.PNG",
      "offset": 14
    }
  ],
  "location": "StepDefinitions.user_selects_as_the_photo_video_to_be_uploaded(String)"
});
formatter.result({
  "duration": 47000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "C:\\\\Users\\\\Jerome.Amores\\\\Downloads\\\\3.PNG",
      "offset": 14
    }
  ],
  "location": "StepDefinitions.user_selects_as_the_photo_video_to_be_uploaded(String)"
});
formatter.result({
  "duration": 29600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_shares_the_new_post()"
});
formatter.result({
  "duration": 15691591100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test Upload",
      "offset": 19
    }
  ],
  "location": "StepDefinitions.user_sees_the_new_post_with_the_photos_videos(String)"
});
formatter.result({
  "duration": 16068600,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//p[text() \u003d \u0027Test Upload\u0027]//ancestor::div[contains(@class, \u0027userContentWrapper\u0027)]//div[@data-testid \u003d \u0027post_message\u0027]\"}\n  (Session info: chrome\u003d75.0.3770.100)\n  (Driver info: chromedriver\u003d74.0.3729.6 (255758eccf3d244491b8a1317aa76e1ce10d57e9-refs/branch-heads/3729@{#29}),platform\u003dWindows NT 10.0.18362 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027JEROMEAMORES\u0027, ip: \u0027172.18.0.86\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 74.0.3729.6 (255758eccf3d24..., userDataDir: C:\\Users\\JEROME~1.AMO\\AppDa...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:59028}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 75.0.3770.100, webStorageEnabled: true}\nSession ID: d8ef8590d307548a9f151ba7f434c023\n*** Element info: {Using\u003dxpath, value\u003d//p[text() \u003d \u0027Test Upload\u0027]//ancestor::div[contains(@class, \u0027userContentWrapper\u0027)]//div[@data-testid \u003d \u0027post_message\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:424)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat steps.StepDefinitions.user_sees_the_new_post_with_the_photos_videos(StepDefinitions.java:156)\r\n\tat ✽.Then user sees the new \"Test Upload\" post with the photos/videos(TST-2 - Upload.feature:14)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1072557600,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 21,
  "name": "2: Delete Recently Uploaded Images",
  "description": "",
  "id": "tst-2:-upload-sample;2:-delete-recently-uploaded-images",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 20,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "user enters the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\" for the login credentials",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "user is on \"Facebook\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "user decides to delete the new \"Test Upload\" post with the photos/videos",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "user sees the delete post confirmation message",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "user confirms the deletion of the post",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "user does not see the new \"Test Upload\" post with the photos/videos",
  "keyword": "Then "
});
formatter.examples({
  "line": 30,
  "name": "",
  "description": "",
  "id": "tst-2:-upload-sample;2:-delete-recently-uploaded-images;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 31,
      "id": "tst-2:-upload-sample;2:-delete-recently-uploaded-images;;1"
    },
    {
      "cells": [
        "bahalakasabuhaymo530@gmail.com",
        "fakeaccount123"
      ],
      "line": 32,
      "id": "tst-2:-upload-sample;2:-delete-recently-uploaded-images;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3047800,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "2: Delete Recently Uploaded Images",
  "description": "",
  "id": "tst-2:-upload-sample;2:-delete-recently-uploaded-images;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 20,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "user enters the \"bahalakasabuhaymo530@gmail.com\" and \"fakeaccount123\" for the login credentials",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "user is on \"Facebook\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "user decides to delete the new \"Test Upload\" post with the photos/videos",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "user sees the delete post confirmation message",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "user confirms the deletion of the post",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "user does not see the new \"Test Upload\" post with the photos/videos",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.user_opens_browser()"
});
formatter.result({
  "duration": 11507811000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bahalakasabuhaymo530@gmail.com",
      "offset": 17
    },
    {
      "val": "fakeaccount123",
      "offset": 54
    }
  ],
  "location": "StepDefinitions.user_enters_the_and_for_the_login_credentials(String,String)"
});
formatter.result({
  "duration": 8774868300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Facebook",
      "offset": 12
    }
  ],
  "location": "StepDefinitions.user_is_on_page(String)"
});
formatter.result({
  "duration": 51695400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test Upload",
      "offset": 32
    }
  ],
  "location": "StepDefinitions.user_decides_to_delete_the_new_post_with_the_photos_videos(String)"
});
formatter.result({
  "duration": 16155700,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//p[text() \u003d \u0027Test Upload\u0027]//ancestor::div[contains(@class, \u0027userContentWrapper\u0027)]//a[@aria-label \u003d \u0027Story options\u0027]\"}\n  (Session info: chrome\u003d75.0.3770.100)\n  (Driver info: chromedriver\u003d74.0.3729.6 (255758eccf3d244491b8a1317aa76e1ce10d57e9-refs/branch-heads/3729@{#29}),platform\u003dWindows NT 10.0.18362 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027JEROMEAMORES\u0027, ip: \u0027172.18.0.86\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 74.0.3729.6 (255758eccf3d24..., userDataDir: C:\\Users\\JEROME~1.AMO\\AppDa...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:59086}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 75.0.3770.100, webStorageEnabled: true}\nSession ID: 0741072f1ef2e38ba9ea38a652721371\n*** Element info: {Using\u003dxpath, value\u003d//p[text() \u003d \u0027Test Upload\u0027]//ancestor::div[contains(@class, \u0027userContentWrapper\u0027)]//a[@aria-label \u003d \u0027Story options\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:424)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat steps.StepDefinitions.user_decides_to_delete_the_new_post_with_the_photos_videos(StepDefinitions.java:162)\r\n\tat ✽.When user decides to delete the new \"Test Upload\" post with the photos/videos(TST-2 - Upload.feature:25)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinitions.user_sees_the_delete_post_confirmation_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_confirms_the_deletion_of_the_post()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Test Upload",
      "offset": 27
    }
  ],
  "location": "StepDefinitions.user_does_not_see_the_new_post_with_the_photos_videos(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1185967800,
  "status": "passed"
});
});