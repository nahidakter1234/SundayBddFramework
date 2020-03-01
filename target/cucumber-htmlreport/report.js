$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("googlesearch.feature");
formatter.feature({
  "line": 2,
  "name": "Users ability to search in google",
  "description": "",
  "id": "users-ability-to-search-in-google",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "User should able to search in google",
  "description": "",
  "id": "users-ability-to-search-in-google;user-should-able-to-search-in-google",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "Browse to Google homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Search by \"\u003cKeyword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Verify search result appear",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "users-ability-to-search-in-google;user-should-able-to-search-in-google;",
  "rows": [
    {
      "cells": [
        "Keyword"
      ],
      "line": 11,
      "id": "users-ability-to-search-in-google;user-should-able-to-search-in-google;;1"
    },
    {
      "cells": [
        "Car"
      ],
      "line": 12,
      "id": "users-ability-to-search-in-google;user-should-able-to-search-in-google;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2824565500,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "User should able to search in google",
  "description": "",
  "id": "users-ability-to-search-in-google;user-should-able-to-search-in-google;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Browse to Google homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Search by \"Car\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Verify search result appear",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleHomePageSteps.browse_to_Google_homepage()"
});
formatter.result({
  "duration": 1730975800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Car",
      "offset": 11
    }
  ],
  "location": "GoogleHomePageSteps.search_by(String)"
});
formatter.result({
  "duration": 1846050800,
  "status": "passed"
});
formatter.match({
  "location": "GoogleHomePageSteps.verify_search_result_appear()"
});
formatter.result({
  "duration": 48500,
  "status": "passed"
});
formatter.after({
  "duration": 618207700,
  "status": "passed"
});
});