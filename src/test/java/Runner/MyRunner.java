package Runner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

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
	tags = "@testDemoQuery")

public class MyRunner {
	
}