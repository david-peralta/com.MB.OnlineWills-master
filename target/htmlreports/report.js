$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/features/Contracts.feature");
formatter.feature({
  "line": 1,
  "name": "APT - Sprint 08",
  "description": "I want to use this feature file for testing APT - Sprint 08 user stories",
  "id": "apt---sprint-08",
  "keyword": "Feature"
});
formatter.before({
  "duration": 205125915,
  "status": "passed"
});
formatter.scenario({
  "line": 780,
  "name": "APT-1645: 01. As a Product team member, I want to view PRICE information for a selected contract",
  "description": "",
  "id": "apt---sprint-08;apt-1645:-01.-as-a-product-team-member,-i-want-to-view-price-information-for-a-selected-contract",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 779,
      "name": "@Regression1"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 781,
      "value": "# Additional Scenario: APT-1655: 04. As a Product team member, I want to indicate that Non-Commission has been specified for a price in a contract"
    },
    {
      "line": 782,
      "value": "# Additional Scenario: APT-1656: 05. As a Product team member, I want action icons to be displayed in a cell in the price table when I hover on the cell"
    },
    {
      "line": 783,
      "value": "# Additional Scenario: APT-1657: 06. As a Product team member, I want to navigate between pages in Price Tables in contract prices accordion"
    },
    {
      "line": 784,
      "value": "# Scenario 1:"
    },
    {
      "line": 785,
      "value": "# And Scenario 3:"
    },
    {
      "line": 786,
      "value": "# And Scenario 4:"
    },
    {
      "line": 787,
      "value": "# And Scenario 5:"
    },
    {
      "line": 788,
      "value": "# And Scenario 6:"
    },
    {
      "line": 789,
      "value": "# And Scenario 7:"
    }
  ],
  "line": 790,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 791,
  "name": "user logs into app",
  "keyword": "When "
});
formatter.step({
  "line": 792,
  "name": "user navigates to contracts page",
  "keyword": "And "
});
formatter.step({
  "line": 793,
  "name": "user searches for a contract by id",
  "keyword": "And "
});
formatter.step({
  "line": 794,
  "name": "user updates the contract",
  "keyword": "And "
});
formatter.step({
  "line": 795,
  "name": "user sees the buttons of the contract price section",
  "keyword": "Then "
});
formatter.step({
  "line": 796,
  "name": "user sorts the first contract price category data",
  "keyword": "When "
});
formatter.step({
  "line": 797,
  "name": "user uses column filters to filter the first contract price category",
  "keyword": "And "
});
formatter.step({
  "line": 798,
  "name": "user sees the first contract price category accordion expanded and its contents",
  "keyword": "Then "
});
formatter.step({
  "line": 799,
  "name": "user expands the second contract price category",
  "keyword": "When "
});
formatter.step({
  "line": 800,
  "name": "user sees the second contract price category contents",
  "keyword": "Then "
});
formatter.step({
  "line": 801,
  "name": "user sees the price that is non commission with a coloured dot and also the legend explaining the coloured dot means",
  "keyword": "And "
});
formatter.step({
  "line": 802,
  "name": "user collapses the second contract price category",
  "keyword": "When "
});
formatter.step({
  "line": 803,
  "name": "user does not see the second contract price category contents",
  "keyword": "Then "
});
formatter.step({
  "line": 804,
  "name": "user hovers over a certain cell that is not empty in the contract prices table",
  "keyword": "When "
});
formatter.step({
  "line": 805,
  "name": "user sees the edit and delete icons beside the contract price data",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 806,
      "value": "# Scenario 2:"
    }
  ],
  "line": 807,
  "name": "user is on \"ContractDetails\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 808,
  "name": "user logs out of the app",
  "keyword": "When "
});
formatter.step({
  "line": 809,
  "name": "user with view rights logs into app",
  "keyword": "And "
});
formatter.step({
  "line": 810,
  "name": "user navigates to contracts page",
  "keyword": "And "
});
formatter.step({
  "line": 811,
  "name": "user searches for a contract by id",
  "keyword": "And "
});
formatter.step({
  "line": 812,
  "name": "user views the contract",
  "keyword": "And "
});
formatter.step({
  "line": 813,
  "name": "user uses column filters to filter the first contract price category",
  "keyword": "And "
});
formatter.step({
  "line": 814,
  "name": "user sees the contract price section and its contents without the write options",
  "keyword": "Then "
});
formatter.step({
  "line": 815,
  "name": "user hovers over a certain cell that is not empty in the contract prices table",
  "keyword": "When "
});
formatter.step({
  "line": 816,
  "name": "user sees the view icon beside the contract price data",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.user_opens_browser()"
});
formatter.result({
  "duration": 24621642348,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_logs_into_app()"
});
formatter.result({
  "duration": 9042963046,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_navigates_to_contracts_page()"
});
formatter.result({
  "duration": 8677574919,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_searches_for_a_contract_by_id()"
});
formatter.result({
  "duration": 3012248175,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_updates_the_contract()"
});
formatter.result({
  "duration": 16885464495,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_sees_the_buttons_of_the_contract_price_section()"
});
formatter.result({
  "duration": 325844672,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_sorts_the_first_contract_price_category_data()"
});
formatter.result({
  "duration": 2711384544,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_uses_column_filters_to_filter_the_first_contract_price_category()"
});
formatter.result({
  "duration": 8607902547,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_sees_the_first_contract_price_category_accordion_expanded_and_its_contents()"
});
formatter.result({
  "duration": 6726878797,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_expands_the_second_contract_price_category()"
});
formatter.result({
  "duration": 2647725327,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_sees_the_second_contract_price_category_contents()"
});
formatter.result({
  "duration": 30339537254,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_sees_the_price_that_is_non_commission_with_a_coloured_dot_and_also_the_legend_explaining_the_coloured_dot_means()"
});
formatter.result({
  "duration": 123075663,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_collapses_the_second_contract_price_category()"
});
formatter.result({
  "duration": 2575322858,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_does_not_see_the_second_contract_price_category_contents()"
});
formatter.result({
  "duration": 30343243564,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_hovers_over_a_certain_cell_that_is_not_empty_in_the_contract_prices_table()"
});
formatter.result({
  "duration": 2593729822,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_sees_the_edit_and_delete_icons_beside_the_contract_price_data()"
});
formatter.result({
  "duration": 121595414,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ContractDetails",
      "offset": 12
    }
  ],
  "location": "StepDefinitions.user_is_on_page(String)"
});
formatter.result({
  "duration": 19231284,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_logs_out_of_the_app()"
});
formatter.result({
  "duration": 20837052633,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_with_view_rights_logs_into_app()"
});
formatter.result({
  "duration": 8774014073,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_navigates_to_contracts_page()"
});
formatter.result({
  "duration": 8679884038,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_searches_for_a_contract_by_id()"
});
formatter.result({
  "duration": 3029410979,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_views_the_contract()"
});
formatter.result({
  "duration": 22122044268,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_uses_column_filters_to_filter_the_first_contract_price_category()"
});
formatter.result({
  "duration": 9654793200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_sees_the_contract_price_section_and_its_contents_without_the_write_options()"
});
formatter.result({
  "duration": 2187853885,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_hovers_over_a_certain_cell_that_is_not_empty_in_the_contract_prices_table()"
});
formatter.result({
  "duration": 2680228784,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_sees_the_view_icon_beside_the_contract_price_data()"
});
formatter.result({
  "duration": 95390124,
  "status": "passed"
});
formatter.after({
  "duration": 717406231,
  "status": "passed"
});
});