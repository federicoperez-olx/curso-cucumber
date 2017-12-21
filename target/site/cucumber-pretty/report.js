$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("register.feature");
formatter.feature({
  "line": 1,
  "name": "Register",
  "description": "",
  "id": "register",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 2,
      "value": "#newtours.demoaut.com"
    }
  ],
  "line": 4,
  "name": "Register",
  "description": "",
  "id": "register;register",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is in Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User clicks register link",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User inputs First name \"\u003cFirst name\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User inputs Last name \"\u003cLast name\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User inputs Phone \"\u003cPhone\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User inputs Address1 \"\u003cAddress1\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User inputs Address2 \"\u003cAddress2\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User inputs City \"\u003cCity\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User inputs State \"\u003cState\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User inputs Postal Code \"\u003cPostal Code\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User selects Country \"\u003cCountry\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User inputs User \"\u003cUser\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User inputs Password \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User inputs Confirms Password \"\u003cConfirms Password\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User clicks Submit button",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "\u003cResult\u003e shows up",
  "keyword": "Then "
});
formatter.examples({
  "line": 22,
  "name": "",
  "description": "",
  "id": "register;register;",
  "rows": [
    {
      "cells": [
        "First name",
        "Last name",
        "Phone",
        "Email",
        "Address1",
        "Address2",
        "City",
        "State",
        "Postal Code",
        "Country",
        "User",
        "Password",
        "Confirm Password",
        "Result"
      ],
      "line": 23,
      "id": "register;register;;1"
    },
    {
      "cells": [
        "Carlos",
        "Chavez",
        "1541041234",
        "mail@mail.com",
        "street l0l",
        "a2",
        "Sumaru City",
        "Kyushu",
        "1406",
        "Japan",
        "fede",
        "pass",
        "pass",
        "Success"
      ],
      "line": 24,
      "id": "register;register;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2660241979,
  "status": "passed"
});
formatter.before({
  "duration": 501321287,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Register",
  "description": "",
  "id": "register;register;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is in Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User clicks register link",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User inputs First name \"Carlos\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User inputs Last name \"Chavez\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User inputs Phone \"1541041234\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User inputs Address1 \"street l0l\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User inputs Address2 \"a2\"",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User inputs City \"Sumaru City\"",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User inputs State \"Kyushu\"",
  "matchedColumns": [
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User inputs Postal Code \"1406\"",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User selects Country \"Japan\"",
  "matchedColumns": [
    9
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User inputs User \"fede\"",
  "matchedColumns": [
    10
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User inputs Password \"pass\"",
  "matchedColumns": [
    11
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User inputs Confirms Password \"\u003cConfirms Password\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User clicks Submit button",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Success shows up",
  "matchedColumns": [
    13
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "register.user_is_in_Homepage()"
});
formatter.result({
  "duration": 83816404,
  "status": "passed"
});
formatter.match({
  "location": "register.user_clicks_register_link()"
});
formatter.result({
  "duration": 877664933,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Carlos",
      "offset": 24
    }
  ],
  "location": "register.user_inputs_First_name(String)"
});
formatter.result({
  "duration": 120846055,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Chavez",
      "offset": 23
    }
  ],
  "location": "register.user_inputs_Last_name(String)"
});
formatter.result({
  "duration": 88107012,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1541041234",
      "offset": 19
    }
  ],
  "location": "register.user_inputs_Phone(String)"
});
formatter.result({
  "duration": 93574650,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "street l0l",
      "offset": 22
    }
  ],
  "location": "register.user_inputs_Address(String)"
});
formatter.result({
  "duration": 101515656,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "a2",
      "offset": 22
    }
  ],
  "location": "register.user_inputs_Address2(String)"
});
formatter.result({
  "duration": 43332223,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sumaru City",
      "offset": 18
    }
  ],
  "location": "register.user_inputs_City(String)"
});
formatter.result({
  "duration": 107531037,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Kyushu",
      "offset": 19
    }
  ],
  "location": "register.user_inputs_State(String)"
});
formatter.result({
  "duration": 95936441,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1406",
      "offset": 25
    }
  ],
  "location": "register.user_inputs_Postal_Code(String)"
});
formatter.result({
  "duration": 96680312,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Japan",
      "offset": 22
    }
  ],
  "location": "register.user_selects_Country(String)"
});
formatter.result({
  "duration": 86589536,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "fede",
      "offset": 18
    }
  ],
  "location": "register.user_inputs_User(String)"
});
formatter.result({
  "duration": 77841265,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pass",
      "offset": 22
    }
  ],
  "location": "register.user_inputs_Password(String)"
});
formatter.result({
  "duration": 78672129,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cConfirms Password\u003e",
      "offset": 31
    }
  ],
  "location": "register.user_inputs_Confirms_Password(String)"
});
formatter.result({
  "duration": 103976659,
  "status": "passed"
});
formatter.match({
  "location": "register.user_clicks_Submit_button()"
});
formatter.result({
  "duration": 1043220826,
  "status": "passed"
});
formatter.match({
  "location": "register.success_shows_up()"
});
formatter.result({
  "duration": 29749723,
  "status": "passed"
});
formatter.after({
  "duration": 74334101,
  "status": "passed"
});
formatter.after({
  "duration": 46644,
  "status": "passed"
});
formatter.uri("tourism.feature");
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
  "line": 4,
  "name": "I enter a username \u003cusername\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter a password \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I click  Sign-In button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "login result must be \u003cresult\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
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
      "line": 10,
      "id": "curso-de-automation;log-in-to-the-system;;1"
    },
    {
      "cells": [
        "pepe",
        "pepe",
        "badLogin"
      ],
      "line": 11,
      "id": "curso-de-automation;log-in-to-the-system;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2759690450,
  "status": "passed"
});
formatter.before({
  "duration": 456720775,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Log in to the system",
  "description": "",
  "id": "curso-de-automation;log-in-to-the-system;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I enter a username pepe",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter a password pepe",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I click  Sign-In button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
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
  "duration": 92944474,
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
  "duration": 74907952,
  "status": "passed"
});
formatter.match({
  "location": "turism.I_click_sign_in_button()"
});
formatter.result({
  "duration": 1222818840,
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
  "duration": 36075540,
  "status": "passed"
});
formatter.after({
  "duration": 65784641,
  "status": "passed"
});
formatter.after({
  "duration": 2296127,
  "status": "passed"
});
});