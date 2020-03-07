@testDemoQuery
Feature: Enter a search query

Scenario: Open UberEats web page and search for hotels
Given user goes to UberEats web page
And user enters a delivery address
When user clicks Find Food button
Then user is redirected to search results