# SeleniumProj

*RUNNER
MyRunner.java:
  Runner class tasked with running a specific Cucumber feature file.
  
*PAGE OBJECTS
homePage.java:
  Page object for homepage, contains openHomePage(), insertAddress(), and clickFindFood()
  
*FEATURES
demoQuery.feature:
  Contains the feature of entering a search query on www.ubereats.com
  
enterQuery.feature:
  Contains a scenario outline with predetermined search parameters

*STEP DEFINITIONS
stepDefs.java:
  Contains the step definitions for the feature files
  
*CLASSES
WebDriverSingleton.java:
  Wrapper class which implements Singleton design pattern for WebDriver
  
*POM
pom.xml:
  Maven Project Object Model containing project configuration and cucumber-java, cucumber-junit, junit, and junit-platform-commons
  dependencies
