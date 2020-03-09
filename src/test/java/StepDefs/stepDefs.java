package StepDefs;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;`
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
	private giftCardPage _giftCardPage;
	
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
	
	// getGiftCard.feature
	
	@When("user goes to gift cards section")
	public void user_goes_to_gift_cards_section() {
		_giftCardPage = new giftCardPage(driver, wait);
		_giftCardPage.clickBuygiftcards();
		
	}

	@When("user clicks Send A Gift button")
	public void user_clicks_Send_A_Gift_button() {
		_giftCardPage.clickSendagift();
		
	}

	@When("user enters name of gift recipient and users own name then clicks Pick a gift card button")
	public void user_enters_name_of_gift_recipient_and_users_own_name_then_clicks_Pick_a_gift_card_button() {
	    _giftCardPage.fillInNames("Rob", "Jason");
	    _giftCardPage.clickPickagiftcard();
	}

	@When("user clicks Send A Digital Card button")
	public void user_clicks_Send_A_Digital_Card_button() {
	    _giftCardPage.clickSendadigitalcard();
	}

	@When("user selects a Gift Card Design and clicks How much? button")
	public void user_selects_a_Gift_Card_Design_and_clicks_How_much_button() {
	    _giftCardPage.chooseGiftcarddesign();
	    _giftCardPage.clickHowmuch();
	}

	@When("user enters an amount and quantity and clicks Add a message button")
	public void user_enters_an_amount_and_quantity_and_clicks_Add_a_message_button() {
	    _giftCardPage.enterAmountandQuantity(122, 4);
	    _giftCardPage.clickAddamessage();
	}

	@When("user adds a personalized message and clicks Next button")
	public void user_adds_a_personalized_message_and_clicks_Next_button() {
	    _giftCardPage.enterMessage("Treat yourself!");
	    _giftCardPage.clickNext();
	}

	@When("user enters recipients email address along with a date and clicks Add to card button")
	public void user_enters_recipients_email_address_along_with_a_date_and_clicks_Add_to_card_button() {
	    _giftCardPage.fillInEmails("rob@mail.com");
	    _giftCardPage.clickAddtocart();
	}

	@Then("user is redirected to Review Your Cart page")
	public void user_is_redirected_to_Review_Your_Cart_page() {
	    _giftCardPage.inGiftCardPage();
	    
	}
	
}
