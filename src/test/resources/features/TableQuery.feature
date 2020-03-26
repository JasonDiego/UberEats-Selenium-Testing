@testTableQuery
Feature: Enter a search query

Scenario Outline: Open UberEats web page, enter a location and search for nearby food vendors
Given user goes to UberEats web page
And user enters an "<address>"
When user clicks Find Food button
Then user is redirected to search results

Examples:
	|address|
	|Atlanta GA 30301|
	|San Francisco CA 94016|
	|Syracuse NY 13201|
	|Phoenix AZ 85001|