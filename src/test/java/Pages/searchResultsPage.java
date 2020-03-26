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

public class searchResultsPage {

	// Title: Order Food Online | Food Delivery App | Uber Eats
	
	Logger logger = LogManager.getLogger(searchResultsPage.class);
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	@FindBy(xpath = "//*[@id=\"wrapper\"]/main/div[2]/button")
	private WebElement more;
	
	public searchResultsPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
		PageFactory.initElements(driver, this);
		
	}
	
	public void inSearchResultsPage() {
		try {
			wait.until(ExpectedConditions.titleIs("Order Food Online | Food Delivery App | Uber Eats"));
			
		} catch (NoSuchElementException e) {
			logger.error("User not redirected!");
			
		}
	}
	
	public void clickMore() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(more));
			
		} catch (NoSuchElementException e) {
			logger.error("More button not found!");
			
		}
		
		if (more != null) {
			try {
				Thread.sleep(3000);
				more.click();
				
			} catch (InterruptedException e) {
				logger.error("Exception interrupted");
				
			}
			
		}
	}
	
}
