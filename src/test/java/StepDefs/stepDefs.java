package StepDefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefs {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	private homePage _homePage;
	private searchResultsPage _searchResultsPage;
	
	// demoQuery.feature
	
	@Given("user goes to UberEats web page")
	public void user_goes_to_UberEats_web_page() {
		//System.out.println("User goes to www.ubereats.com/");
		if (driver == null) {
			driver = WebDriverSingleton.getInstanceOfWebDriverSingleton().getWebDriver();
			driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			wait = new WebDriverWait(driver, 15);
			_homePage = new homePage(driver, wait);
			
		}
		
		_homePage.openHomePage();
		_searchResultsPage = new searchResultsPage(driver, wait);
	}

	@Given("user enters a delivery address")
	public void user_enters_a_delivery_address() {
		//System.out.println("User enters a delivery address");
	    _homePage.insertAddress("New york 10001");
	}
	
	@When("user clicks Find Food button")
	public void user_clicks_Find_Food_button() {
		//System.out.println("User clicks Find food button");
	    _homePage.clickFindFood();
	}

	@Then("user is redirected to search results")
	public void user_is_redirected_to_search_results() {
		//System.out.println("User successfully redirected");
		_searchResultsPage.inSearchResultsPage();
		
	}
	
	// enterQuery.feature
	
	@Given("user enters an {string}")
	public void user_enters_an(String address) {
		//System.out.println("User enters an " + address);
	    _homePage.insertAddress(address);
	}
	
}
