package StepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefs {
	
	private WebDriver driver;
	//private WebDriverSingleton webdriversingleton;
	private homePage _homePage;
	
	@Given("user goes to UberEats web page")
	public void user_goes_to_UberEats_web_page() {
		System.out.println("User goes to www.ubereats.com/");
		 
		//webdriversingleton = WebDriverSingleton.getInstanceOfWebDriverSingleton();
		driver = WebDriverSingleton.getInstanceOfWebDriverSingleton().getWebDriver();
		
		_homePage = new homePage(driver);
		_homePage.openHomePage();
	}

	@Given("user enters a delivery address")
	public void user_enters_a_delivery_address() {
	    _homePage.insertAddress("New york 10001");
	}
	
	@When("user clicks Find Food button")
	public void user_clicks_Find_Food_button() {
	    _homePage.clickFindFood();
	}

	@Then("user is redirected to search results")
	public void user_is_redirected_to_search_results() {
		System.out.println("User is redirected");
	}
}
