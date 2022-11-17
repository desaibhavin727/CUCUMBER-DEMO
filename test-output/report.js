$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Volumes/personal data/NIKUL QA/Selenium_WorkSpace/CucumberPractice/src/main/java/features/Deals.feature");
formatter.feature({
  "line": 1,
  "name": "Deal Creatation",
  "description": "",
  "id": "deal-creatation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Create a new contact scenario",
  "description": "",
  "id": "deal-creatation;free-crm-create-a-new-contact-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already onn Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page iss Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "desaibhavin",
        "911993Sai"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user is on new home page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user moves to new deal page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user enters deal details",
  "rows": [
    {
      "cells": [
        "test deal",
        "1000",
        "50",
        "10"
      ],
      "line": 13
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Closed the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DealsStepDefination.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 10586842541,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefination.title_of_login_page_is_Free_CRM()"
});
formatter.result({
  "duration": 13622916,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefination.user_enters_and(DataTable)"
});
formatter.result({
  "duration": 490719958,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefination.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 3532336875,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefination.user_is_on_home_page()"
});
formatter.result({
  "duration": 105817958,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefination.user_moves_to_new_deal_page()"
});
formatter.result({
  "duration": 1374009833,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefination.user_enters_deal_details(DataTable)"
});
formatter.result({
  "duration": 1045361583,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefination.close_the_browser()"
});
formatter.result({
  "duration": 104266666,
  "status": "passed"
});
});