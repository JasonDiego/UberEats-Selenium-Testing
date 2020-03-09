# SeleniumProj

*RUNNER
MyRunner.java:
  Runner class tasked with running a specific Cucumber feature file.
  Test between different feature files using @testDemoQuery, @testQuery, and @testGiftCard.


*PAGE OBJECTS
homePage.java:
  Page class for UberEats homepage.

searchResultsPage.java:
  Page class for UberEats search results page after entering a query.

giftCardPage.java:
  Page class for UberEats gift card series of web pages.


*FEATURES
demoQuery.feature:
  Entering a search query on www.ubereats.com.
  
enterQuery.feature:
  Entering a search query on www.ubereats.com using predetermined arguments.

getGiftCard.feature:
  Taking steps to getting a gift card for someone via www.ubereats.com.


*STEP DEFINITIONS
stepDefs.java:
  Contains the step definitions for all feature files.
  

*CLASSES
WebDriverSingleton.java:
  Wrapper class which implements Singleton design pattern for WebDriver.
  

*POM
pom.xml:
  Maven Project Object Model containing project configuration and cucumber-java, cucumber-junit, junit, and junit-platform-commons
  dependencies
