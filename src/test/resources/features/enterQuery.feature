@testQuery
Feature: Enter a search query into hotels.com

Scenario Outline: Open Hotels web page and search for hotels
Given user goes to Hotels web page
And user enters a "<destination>", "<check_in_date>", "<check_out_date>", "<rooms>", and "<num_of_adults>"
When user clicks Search button
Then user is redirected to search results

Examples:
	|destination|check_in_date|check_out_date|rooms|num_of_adults|
	|london|03/10/20|03/15/20|1|1|
	|new york|04/01/20|04/05/20|1|2|
	|philadelphia|04/15/20|04/22/20|2|4|