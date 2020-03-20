package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/*
 * This Runner class is in charge of running the tagged feature file and its scenarios
 * Each scenario step implements the testing of a functionality on a web page using Selenium
 * */

@RunWith(Cucumber.class)
@CucumberOptions(
	features = {"src/test/resources/features"},
	glue = {"StepDefs"},
	tags = "@testGiftCard")

public class MyRunner {
	
}