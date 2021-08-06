
  @SuccessSearch
  Feature: Realize successful search
    Try to make a search and visualize a table with obtained results

    Scenario: Successful search
      Given on the main page
      When user insert "fish" in the search box
      Then user see the results