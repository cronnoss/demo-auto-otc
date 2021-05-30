@smoketest
Feature: smoke test #1, go through the google page to the block "Exchange rate" and check exchange rate

  Scenario: go through the google page to the block "Exchange rate" and check it

    #actions at google page
    Then Input "Открытие"
    Then Content with "https://www.open.ru" visible
    Then Click "https://www.open.ru" button

    #actions at first page
    Then Content with "курс обмена в " visible
    Then Content with "USD" Selling Rate more than Buying rate is true
    Then Content with "EUR" Selling Rate more than Buying rate is true