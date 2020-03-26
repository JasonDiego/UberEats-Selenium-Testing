package Pages;

import java.util.NoSuchElementException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class homePage {
	
	// Title: Food Delivery and Takeout | Order Online | Uber Eats
	
	Logger logger = LogManager.getLogger(homePage.class);
	
	private WebDriver driver;
	private WebDriverWait wait;

	@FindBy(xpath = "//*[@id=\"location-typeahead-home-input\"]")
	private WebElement address;
	
	@FindBy(xpath = "//*[@id=\"wrapper\"]/main/div[1]/div[2]/div/button")
	private WebElement findFood;
	
	public homePage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
		PageFactory.initElements(driver, this);
		
	}
	
	public void openHomePage() {
		driver.get("https://www.ubereats.com/");
		
	}
	
	public void insertAddress(String inputAddress) throws NoSuchElementException {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(address));
			
		} catch (NoSuchElementException e) {
			logger.error("Address bar not found!");
			
		}
		if (address != null) {
			address.clear();
			address.click();
			address.sendKeys(inputAddress);
			
		}
	}
	
	public void clickFindFood() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(findFood));
			
		} catch (NoSuchElementException e) {
			logger.error("Find food button not found!");
			
		}
		
		if (findFood != null) {
			try {
				Thread.sleep(3000);
				findFood.click();
				
			} catch (InterruptedException e) {
				logger.error("Exception interrupted");
				
			}
			
		}
	}

}