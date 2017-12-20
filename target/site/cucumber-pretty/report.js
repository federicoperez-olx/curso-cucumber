$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/tourism.feature");
formatter.feature({
  "line": 1,
  "name": "Curso de automation",
  "description": "",
  "id": "curso-de-automation",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Log in to the system",
  "description": "",
  "id": "curso-de-automation;log-in-to-the-system",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I enter a username \u003cusername\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter a password \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click  Sign-In button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "login result must be \u003cresult\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "curso-de-automation;log-in-to-the-system;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "result"
      ],
      "line": 11,
      "id": "curso-de-automation;log-in-to-the-system;;1"
    },
    {
      "cells": [
        "pepe",
        "pepe",
        "badLogin"
      ],
      "line": 12,
      "id": "curso-de-automation;log-in-to-the-system;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 19365829786,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Log in to the system",
  "description": "",
  "id": "curso-de-automation;log-in-to-the-system;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I enter a username pepe",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter a password pepe",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click  Sign-In button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "login result must be badLogin",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "pepe",
      "offset": 19
    }
  ],
  "location": "turism.I_enter_a_username(String)"
});
formatter.result({
  "duration": 263044355,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pepe",
      "offset": 19
    }
  ],
  "location": "turism.I_enter_a_password(String)"
});
formatter.result({
  "duration": 72031164,
  "status": "passed"
});
formatter.match({
  "location": "turism.I_click_sign_in_button()"
});
formatter.result({
  "duration": 1786696835,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "badLogin",
      "offset": 21
    }
  ],
  "location": "turism.login_results_must_be(String)"
});
formatter.result({
  "duration": 53577019,
  "status": "passed"
});
formatter.after({
  "duration": 1092174623,
  "status": "passed"
});
});