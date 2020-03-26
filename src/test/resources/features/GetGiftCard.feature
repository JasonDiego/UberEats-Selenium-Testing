@testGetGiftCard
Feature: UberEats gift card functionality

Scenario: Get an UberEats gift card on the UberEats website
Given user goes to UberEats web page
When user goes to gift cards section
When user clicks Send A Gift button
When user enters name of gift recipient and users own name then clicks Pick a gift card button
When user clicks Send A Digital Card button
When user selects a Gift Card Design and clicks How much? button
When user enters an amount and quantity and clicks Add a message button
When user adds a personalized message and clicks Next button
When user enters recipients email address along with a date and clicks Add to card button
Then user is redirected to Review Your Cart page