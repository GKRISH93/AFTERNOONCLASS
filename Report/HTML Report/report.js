$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/gopik/eclipse-workspace/CUCUMBER123/src/test/resources/Featurefiles/LOGIN2.FEATURE");
formatter.feature({
  "name": "To check Login Functions",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@newaccount"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "To open chromeDriver",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefintion.toOpenChromeDriver()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To pass valid username and valid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@newaccount"
    }
  ]
});
formatter.step({
  "name": "To pass valid username and password",
  "rows": [
    {
      "cells": [
        "username",
        "blue"
      ]
    },
    {
      "cells": [
        "email",
        "blue@123"
      ]
    },
    {
      "cells": [
        "password",
        "123"
      ]
    },
    {
      "cells": [
        "Numbers",
        "123456"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "stepdefintion.toPassValidUsernameAndPassword(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click LoginButton",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefintion.toClickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "To open chromeDriver",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefintion.toOpenChromeDriver()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To pass invalid username and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@newaccount"
    }
  ]
});
formatter.step({
  "name": "To pass invalid username and valid password",
  "rows": [
    {
      "cells": [
        "user",
        "pass",
        "numbers"
      ]
    },
    {
      "cells": [
        "red",
        "red@123",
        "123"
      ]
    },
    {
      "cells": [
        "blue",
        "blue@456",
        "456"
      ]
    },
    {
      "cells": [
        "orange",
        "orange@789",
        "789"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "stepdefintion.toPassInvalidUsernameAndValidPassword(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click LoginButton",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefintion.toClickLoginButton()"
});
formatter.result({
  "status": "passed"
});
});