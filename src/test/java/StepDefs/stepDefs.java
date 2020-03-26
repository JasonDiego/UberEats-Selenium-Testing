package StepDefs;

import Pages.*;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefs {
	
	private static final Logger logger = LogManager.getLogger(stepDefs.class);
	
	private static WebDriver driver;
	private static WebDriverWait wait;
	
	private homePage homePAGE;
	private searchResultsPage searchResultsPAGE;
	private giftCardPage giftCardPAGE;
	
	
	@Before
	public static void setUp() {
		driver = WebDriverSingleton.getInstanceOfWebDriverSingleton().getWebDriver();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		wait = WebDriverWaitSingleton.getInstanceOfWebDriverWaitSingleton().getWebDriverWait();
	}
	
	@After
	public void cleanUp() {
		try {
		driver.manage().deleteAllCookies();
		driver.close();
		}
		catch (Exception e) {
			logger.error("Error closing resources!");
		}
	}
	
	
	// demoQuery.feature
	
	@Given("user goes to UberEats web page")
	public void user_goes_to_UberEats_web_page() {
		homePAGE = new homePage(driver, wait);
		homePAGE.openHomePage();
		
	}

	@Given("user enters a delivery address")
	public void user_enters_a_delivery_address() {
	    homePAGE.insertAddress("New york 10001");
	    
	}
	
	@When("user clicks Find Food button")
	public void user_clicks_Find_Food_button() {
	    homePAGE.clickFindFood();
	    
	}

	@Then("user is redirected to search results")
	public void user_is_redirected_to_search_results() {
		searchResultsPAGE = new searchResultsPage(driver, wait);
		searchResultsPAGE.inSearchResultsPage();
		
	}
	
	
	// enterQuery.feature
	
	@Given("user enters an {string}")
	public void user_enters_an(String address) {
	    homePAGE.insertAddress(address);
	    
	}
	
	
	// getGiftCard.feature
	
	@When("user goes to gift cards section")
	public void user_goes_to_gift_cards_section() {
		giftCardPAGE = new giftCardPage(driver, wait);
		giftCardPAGE.clickBuygiftcards();
		
	}

	@When("user clicks Send A Gift button")
	public void user_clicks_Send_A_Gift_button() {
		giftCardPAGE.clickSendagift();
		
	}

	@When("user enters name of gift recipient and users own name then clicks Pick a gift card button")
	public void user_enters_name_of_gift_recipient_and_users_own_name_then_clicks_Pick_a_gift_card_button() {
	    giftCardPAGE.fillInNames("Rob", "Jason");
	    giftCardPAGE.clickPickagiftcard();
	    
	}

	@When("user clicks Send A Digital Card button")
	public void user_clicks_Send_A_Digital_Card_button() {
	    giftCardPAGE.clickSendadigitalcard();
	    
	}

	@When("user selects a Gift Card Design and clicks How much? button")
	public void user_selects_a_Gift_Card_Design_and_clicks_How_much_button() {
	    giftCardPAGE.chooseGiftcarddesign();
	    giftCardPAGE.clickHowmuch();
	    
	}

	@When("user enters an amount and quantity and clicks Add a message button")
	public void user_enters_an_amount_and_quantity_and_clicks_Add_a_message_button() {
	    giftCardPAGE.enterAmountandQuantity(122, 4);
	    giftCardPAGE.clickAddamessage();
	    
	}

	@When("user adds a personalized message and clicks Next button")
	public void user_adds_a_personalized_message_and_clicks_Next_button() {
	    giftCardPAGE.enterMessage("Treat yourself!");
	    giftCardPAGE.clickNext();
	    
	}

	@When("user enters recipients email address along with a date and clicks Add to card button")
	public void user_enters_recipients_email_address_along_with_a_date_and_clicks_Add_to_card_button() {
	    giftCardPAGE.fillInEmails("rob@mail.com");
	    giftCardPAGE.clickAddtocart();
	    
	}

	@Then("user is redirected to Review Your Cart page")
	public void user_is_redirected_to_Review_Your_Cart_page() {
	    giftCardPAGE.inGiftCardPage();
	    
	}
	
}
