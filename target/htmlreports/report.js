$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/WIP.feature");
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
  "name": "user sees the new \"Test Upload1\" post with the photos/videos",
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
  "duration": 169996300,
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
  "name": "user sees the new \"Test Upload1\" post with the photos/videos",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.user_opens_browser()"
});
formatter.result({
  "duration": 12723304900,
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
  "duration": 5728646200,
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
  "duration": 46187700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_decides_to_create_a_new_post()"
});
formatter.result({
  "duration": 696788500,
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
  "duration": 2365944300,
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
  "duration": 82500,
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
  "duration": 58000,
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
  "duration": 70300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_shares_the_new_post()"
});
formatter.result({
  "duration": 15218460000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test Upload1",
      "offset": 19
    }
  ],
  "location": "StepDefinitions.user_sees_the_new_post_with_the_photos_videos(String)"
});
formatter.result({
  "duration": 16810700,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//p[text() \u003d \u0027Test Upload1\u0027]//ancestor::div[contains(@class, \u0027userContentWrapper\u0027)]//div[@data-testid \u003d \u0027post_message\u0027]\"}\n  (Session info: chrome\u003d75.0.3770.100)\n  (Driver info: chromedriver\u003d74.0.3729.6 (255758eccf3d244491b8a1317aa76e1ce10d57e9-refs/branch-heads/3729@{#29}),platform\u003dWindows NT 10.0.18362 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027DESKTOP-14FGF5A\u0027, ip: \u0027172.18.0.86\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 74.0.3729.6 (255758eccf3d24..., userDataDir: C:\\Users\\JEROME~1.AMO\\AppDa...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:60467}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 75.0.3770.100, webStorageEnabled: true}\nSession ID: 98f716ce171a303893f9e22476c8d664\n*** Element info: {Using\u003dxpath, value\u003d//p[text() \u003d \u0027Test Upload1\u0027]//ancestor::div[contains(@class, \u0027userContentWrapper\u0027)]//div[@data-testid \u003d \u0027post_message\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:424)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat steps.StepDefinitions.user_sees_the_new_post_with_the_photos_videos(StepDefinitions.java:148)\r\n\tat ✽.Then user sees the new \"Test Upload1\" post with the photos/videos(src/test/resources/features/WIP.feature:14)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1091368600,
  "status": "passed"
});
});