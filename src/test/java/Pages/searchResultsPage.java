package Pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class searchResultsPage {

	// Title: Order Food Online | Food Delivery App | Uber Eats
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	private WebElement _more;
	
	public searchResultsPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
		PageFactory.initElements(driver, this);
		
	}
	
	public void inSearchResultsPage() {
		try {
			wait.until(ExpectedConditions.titleIs("Order Food Online | Food Delivery App | Uber Eats"));
			
		} catch (NoSuchElementException e) {
			System.out.println("User not redirected!");
			
		}
	}
	
	public void clickMore() {
		try {
			_more = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"wrapper\"]/main/div[2]/button")));
			
		} catch (NoSuchElementException e) {
			System.out.println("More button not found!");
			
		}
		
		if (_more != null) {
			try {
				Thread.sleep(3000);
				_more.click();
				
			} catch (InterruptedException e) {
				System.out.println("Exception interrupted");
				
			}
			
		}
	}
	
}
