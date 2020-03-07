package StepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefs {
	
	private WebDriver driver;
	
	
	@Given("user goes to UberEats web page")
	public void user_goes_to_UberEats_web_page() {
		System.out.println("User goes to www.ubereats.com/");
		
		
		driver = new ChromeDriver();
	}

	@Given("user enters a {string}, {string}, {string}, {string}, and {string}")
	public void user_enters_a_and(String dest, String ch_in, String ch_out, String rms, String adlts) {
	    System.out.println("User enters information (with data)");
	}
	
	@Given("user enters a destination, check in date, check out date, rooms, and number of adults")
	public void user_enters_a_and() {
	    System.out.println("User enters information (without data)");
	}

	@When("user clicks Search button")
	public void user_clicks_Search_button() {
		System.out.println("User clicks Search button");
	}

	@Then("user is redirected to search results")
	public void user_is_redirected_to_search_results() {
		System.out.println("User is redirected");
	}
}
