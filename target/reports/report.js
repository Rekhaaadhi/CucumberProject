$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/register.feature");
formatter.feature({
  "name": "To validate Register functionality of Waterstones.com page",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should launch the chrome and load the url and maximize",
  "keyword": "Given "
});
formatter.match({
  "location": "RegisterationStepDefinition.user_should_launch_the_chrome_and_load_the_url_and_maximize()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click on the Signin-Register link",
  "keyword": "When "
});
formatter.match({
  "location": "RegisterationStepDefinition.user_should_click_on_the_Signin_Register_link()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify user is able to navigate to Registration page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User should click on the CREATE NEW ACCOUNT link",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterationStepDefinition.user_should_click_on_the_CREATE_NEW_ACCOUNT_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click on the Register button in siginpage",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterationStepDefinition.user_should_click_on_the_Register_button_in_siginpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be navigated to the Registraion page",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterationStepDefinition.user_should_be_navigated_to_the_Registraion_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verify user is able to pass any value in the Firstname textbox",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User should click on the CREATE NEW ACCOUNT link",
  "keyword": "And "
});
formatter.step({
  "name": "User should click on the Register button in siginpage",
  "keyword": "And "
});
formatter.step({
  "name": "User should be able enter values \"\u003cfname\u003e\" to the firstname text box without any error",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "fname"
      ]
    },
    {
      "cells": [
        ""
      ]
    },
    {
      "cells": [
        "@#$"
      ]
    },
    {
      "cells": [
        "123"
      ]
    },
    {
      "cells": [
        "abc"
      ]
    },
    {
      "cells": [
        "a"
      ]
    },
    {
      "cells": [
        "1"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should launch the chrome and load the url and maximize",
  "keyword": "Given "
});
formatter.match({
  "location": "RegisterationStepDefinition.user_should_launch_the_chrome_and_load_the_url_and_maximize()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click on the Signin-Register link",
  "keyword": "When "
});
formatter.match({
  "location": "RegisterationStepDefinition.user_should_click_on_the_Signin_Register_link()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify user is able to pass any value in the Firstname textbox",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User should click on the CREATE NEW ACCOUNT link",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterationStepDefinition.user_should_click_on_the_CREATE_NEW_ACCOUNT_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click on the Register button in siginpage",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterationStepDefinition.user_should_click_on_the_Register_button_in_siginpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able enter values \"\" to the firstname text box without any error",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterationStepDefinition.user_should_be_able_enter_values_to_the_firstname_text_box_without_any_error(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should launch the chrome and load the url and maximize",
  "keyword": "Given "
});
formatter.match({
  "location": "RegisterationStepDefinition.user_should_launch_the_chrome_and_load_the_url_and_maximize()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click on the Signin-Register link",
  "keyword": "When "
});
formatter.match({
  "location": "RegisterationStepDefinition.user_should_click_on_the_Signin_Register_link()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify user is able to pass any value in the Firstname textbox",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User should click on the CREATE NEW ACCOUNT link",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterationStepDefinition.user_should_click_on_the_CREATE_NEW_ACCOUNT_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click on the Register button in siginpage",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterationStepDefinition.user_should_click_on_the_Register_button_in_siginpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able enter values \"@#$\" to the firstname text box without any error",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterationStepDefinition.user_should_be_able_enter_values_to_the_firstname_text_box_without_any_error(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should launch the chrome and load the url and maximize",
  "keyword": "Given "
});
formatter.match({
  "location": "RegisterationStepDefinition.user_should_launch_the_chrome_and_load_the_url_and_maximize()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click on the Signin-Register link",
  "keyword": "When "
});
formatter.match({
  "location": "RegisterationStepDefinition.user_should_click_on_the_Signin_Register_link()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify user is able to pass any value in the Firstname textbox",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User should click on the CREATE NEW ACCOUNT link",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterationStepDefinition.user_should_click_on_the_CREATE_NEW_ACCOUNT_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click on the Register button in siginpage",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterationStepDefinition.user_should_click_on_the_Register_button_in_siginpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able enter values \"123\" to the firstname text box without any error",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterationStepDefinition.user_should_be_able_enter_values_to_the_firstname_text_box_without_any_error(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should launch the chrome and load the url and maximize",
  "keyword": "Given "
});
formatter.match({
  "location": "RegisterationStepDefinition.user_should_launch_the_chrome_and_load_the_url_and_maximize()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click on the Signin-Register link",
  "keyword": "When "
});
formatter.match({
  "location": "RegisterationStepDefinition.user_should_click_on_the_Signin_Register_link()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify user is able to pass any value in the Firstname textbox",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User should click on the CREATE NEW ACCOUNT link",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterationStepDefinition.user_should_click_on_the_CREATE_NEW_ACCOUNT_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click on the Register button in siginpage",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterationStepDefinition.user_should_click_on_the_Register_button_in_siginpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able enter values \"abc\" to the firstname text box without any error",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterationStepDefinition.user_should_be_able_enter_values_to_the_firstname_text_box_without_any_error(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should launch the chrome and load the url and maximize",
  "keyword": "Given "
});
formatter.match({
  "location": "RegisterationStepDefinition.user_should_launch_the_chrome_and_load_the_url_and_maximize()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click on the Signin-Register link",
  "keyword": "When "
});
formatter.match({
  "location": "RegisterationStepDefinition.user_should_click_on_the_Signin_Register_link()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify user is able to pass any value in the Firstname textbox",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User should click on the CREATE NEW ACCOUNT link",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterationStepDefinition.user_should_click_on_the_CREATE_NEW_ACCOUNT_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click on the Register button in siginpage",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterationStepDefinition.user_should_click_on_the_Register_button_in_siginpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able enter values \"a\" to the firstname text box without any error",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterationStepDefinition.user_should_be_able_enter_values_to_the_firstname_text_box_without_any_error(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should launch the chrome and load the url and maximize",
  "keyword": "Given "
});
formatter.match({
  "location": "RegisterationStepDefinition.user_should_launch_the_chrome_and_load_the_url_and_maximize()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click on the Signin-Register link",
  "keyword": "When "
});
formatter.match({
  "location": "RegisterationStepDefinition.user_should_click_on_the_Signin_Register_link()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify user is able to pass any value in the Firstname textbox",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User should click on the CREATE NEW ACCOUNT link",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterationStepDefinition.user_should_click_on_the_CREATE_NEW_ACCOUNT_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click on the Register button in siginpage",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterationStepDefinition.user_should_click_on_the_Register_button_in_siginpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able enter values \"1\" to the firstname text box without any error",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterationStepDefinition.user_should_be_able_enter_values_to_the_firstname_text_box_without_any_error(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should launch the chrome and load the url and maximize",
  "keyword": "Given "
});
formatter.match({
  "location": "RegisterationStepDefinition.user_should_launch_the_chrome_and_load_the_url_and_maximize()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click on the Signin-Register link",
  "keyword": "When "
});
formatter.match({
  "location": "RegisterationStepDefinition.user_should_click_on_the_Signin_Register_link()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify the user able to pass invalid email addresses",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User should click on the CREATE NEW ACCOUNT link",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterationStepDefinition.user_should_click_on_the_CREATE_NEW_ACCOUNT_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click on the Register button in siginpage",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterationStepDefinition.user_should_click_on_the_Register_button_in_siginpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should pass the invalid email ids and gets error message",
  "rows": [
    {
      "cells": [
        "@drft@gmail.com",
        "ert   123  @ty.yh",
        "123.234@co",
        "@@@@.@@co",
        "@yahoo.in",
        "uhj#$87@a.co"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterationStepDefinition.user_should_pass_the_invalid_email_ids_and_gets_error_message(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/FeatureFiles/search.feature");
formatter.feature({
  "name": "To validate Search functionality of Waterstones.com page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify user is able to pass the values to the Search textbox and click search button",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should launch the chrome and load the url and maximize",
  "keyword": "Given "
});
formatter.match({
  "location": "RegisterationStepDefinition.user_should_launch_the_chrome_and_load_the_url_and_maximize()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should pass the value to the search text box",
  "rows": [
    {
      "cells": [
        "You can win"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "ProductSearchStepDefinition.user_should_pass_the_value_to_the_search_text_box(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click search button",
  "keyword": "And "
});
formatter.match({
  "location": "ProductSearchStepDefinition.user_should_click_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be navigated to the search url",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductSearchStepDefinition.user_should_be_navigated_to_the_search_url()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});