package Pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class giftCardPage {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	private WebElement _buyGiftCards;
	private WebElement _sendAGift;
	
	public giftCardPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickBuygiftcards() {
		try {
			_buyGiftCards = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"footer\"]/div/div[1]/div[2]/div[3]/a")));
			
		} catch (NoSuchElementException e) {
			System.out.println("Buy gift cards link not found!");
			
		}
		
		if (_buyGiftCards != null) {
			try {
				Thread.sleep(3000);
				_buyGiftCards.click();
				
			} catch (InterruptedException e) {
				System.out.println("Exception interrupted");
				
			}
			
		}
		
	}

	public void clickSendagift() {
		try {
			_sendAGift = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Send a gift")));
			
		} catch (NoSuchElementException e) {
			System.out.println("Send a gift button not found!");
			
		}
		
		if (_sendAGift != null) {
			try {
				Thread.sleep(3000);
				_sendAGift.click();
				
			} catch (InterruptedException e) {
				System.out.println("Exception interrupted");
				
			}
			
		}
	}
	
}
