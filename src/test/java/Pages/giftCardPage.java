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

public class giftCardPage {
	
	Logger logger = LogManager.getLogger(giftCardPage.class);
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	@FindBy(xpath = "//*[@id=\"footer\"]/div/div[1]/div[2]/div[3]/a")
	private WebElement buyGiftCards;
	
	@FindBy(xpath = "//a[@href='https://ubereats.cashstar.com/store/?ref=landingpage']")
	private WebElement sendAGift;
	
	@FindBy(id = "recipientName-input")
	private WebElement recipientName;
	
	@FindBy(id = "senderName-input")
	private WebElement userName;
	
	@FindBy(xpath = "//*[@id=\"app-root\"]/div/main/div/form/div/button")
	private WebElement pickAGiftCard;
	
	@FindBy(xpath = "//*[@id=\"app-root\"]/div/main/div/form/section/div[1]/button")
	private WebElement sendADigitalCard;
	
	@FindBy(xpath = "//*[@id=\"faceplate-4-label\"]/img")
	private WebElement giftCardDesign;
	
	@FindBy(xpath = "//*[@id=\"app-root\"]/div/main/div/form/div[2]/div/button")
	private WebElement howMuch;
	
	//@FindBy(xpath = "/html/body/div[1]/div/main/div/form/section/div/div[1]/div[1]/div/div/button[2]")
	@FindBy(xpath = "//button[contains(@aria-label, 'Increment amount')]")
	private WebElement incrementAmount;
	
	//@FindBy(xpath = "/html/body/div[1]/div/main/div/form/section/div/div[1]/div[1]/div/div/button[1]")
	@FindBy(xpath = "//button[contains(@aria-label, 'Decrement amount')]")
	private WebElement decrementAmount;
	
	//@FindBy(xpath = "/html/body/div[1]/div/main/div/form/section/div/div[3]/div/div/button[2]")
	@FindBy(xpath = "//button[contains(@aria-label, 'Increment quantity')]")
	private WebElement incrementQuantity;
	
	//@FindBy(xpath = "/html/body/div[1]/div/main/div/form/section/div/div[3]/div/div/button[1]")
	@FindBy(xpath = "//button[contains(@aria-label, 'Decrement quantity')]")
	private WebElement decrementQuantity;
	
	//@FindBy(xpath = "/html/body/div[1]/div/main/div/form/div/button")
	@FindBy(xpath = "//button[contains(@data-cashbot-id, 'amount-button-submit')]")
	private WebElement addAMessage;
	
	@FindBy(id = "message-input")
	private WebElement messageTextbox;
	
	@FindBy(xpath = "/html/body/div[1]/div/main/div/form/div/button")
	private WebElement next;
	
	@FindBy(id = "recipientEmail-input")
	private WebElement recipientEmail;
	
	@FindBy(xpath = "/html/body/div[1]/div/main/div/form/div/button")
	private WebElement addToCart;
	
	@FindBy(xpath = "//*[@id=\"app-root\"]/div/main/div[1]/h2/span")
	private WebElement reviewYourCart;

	
	public giftCardPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
		PageFactory.initElements(driver, this);
	}
	
	public void clickBuygiftcards() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(buyGiftCards));
			
		} catch (NoSuchElementException e) {
			logger.error("Buy gift cards link not found!");
			
		}
		
		if (buyGiftCards != null) {
			try {
				Thread.sleep(3000);
				buyGiftCards.click();
				
			} catch (InterruptedException e) {
				logger.error("Exception interrupted");
				
			}
			
		}
		
	}

	public void clickSendagift() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(sendAGift));
			
		} catch (NoSuchElementException e) {
			logger.error("Send a gift button not found!");
			
		}
		
		if (sendAGift != null) {
			try {
				Thread.sleep(3000);
				sendAGift.click();
				
			} catch (InterruptedException e) {
				logger.error("Exception interrupted");
				
			}
			
		}
	}
	
	public void fillInNames(String recipientNameStr, String userNameStr) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(recipientName));
			wait.until(ExpectedConditions.elementToBeClickable(userName));
		} catch (NoSuchElementException e) {
			logger.error("Either recipientName or userName not found!");
			
		}
		recipientName.click();
		recipientName.sendKeys(recipientNameStr);
		userName.click();
		userName.sendKeys(userNameStr);
		
	}

	public void clickPickagiftcard() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(pickAGiftCard));
			
		} catch (NoSuchElementException e) {
			logger.error("Buy gift cards link not found!");
			
		}
		
		if (pickAGiftCard != null) {
			try {
				Thread.sleep(3000);
				pickAGiftCard.click();
				
			} catch (InterruptedException e) {
				logger.error("Exception interrupted");
				
			}
			
		}
	}
	
	public void clickSendadigitalcard() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(sendADigitalCard));
			
		} catch (NoSuchElementException e) {
			logger.error("Buy gift cards link not found!");
			
		}
		
		if (sendADigitalCard != null) {
			try {
				Thread.sleep(3000);
				sendADigitalCard.click();
				
			} catch (InterruptedException e) {
				logger.error("Exception interrupted");
				
			}
			
		}
	}

	public void chooseGiftcarddesign() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(giftCardDesign));
			
		} catch (NoSuchElementException e) {
			logger.error("Buy gift cards link not found!");
			
		}
		
		if (giftCardDesign != null) {
			try {
				Thread.sleep(3000);
				giftCardDesign.click();
				
			} catch (InterruptedException e) {
				logger.error("Exception interrupted");
				
			}
			
		}
	}
	
	public void clickHowmuch() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(howMuch));
			
		} catch (NoSuchElementException e) {
			logger.error("Buy gift cards link not found!");
			
		}
		
		if (howMuch != null) {
			try {
				Thread.sleep(3000);
				howMuch.click();
				
			} catch (InterruptedException e) {
				logger.error("Exception interrupted");
				
			}
			
		}
	}

	public void enterAmountandQuantity(int amount, int quantity) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(incrementAmount));
			wait.until(ExpectedConditions.elementToBeClickable(decrementAmount));
			wait.until(ExpectedConditions.elementToBeClickable(incrementQuantity));
			wait.until(ExpectedConditions.elementToBeClickable(decrementQuantity));
			
		} catch (NoSuchElementException e) {
			logger.error("One or more button(s) not found!");
			
		}
		
		amount -= amount % 5;
		int currAmount = 60;
		while (currAmount != amount) {
			if (currAmount < amount) {
				incrementAmount.click();
				currAmount += 5;
			}
			else {
				decrementAmount.click();
				currAmount -= 5;
			}
		}
		
		int currQuantity = 1;
		while (currQuantity != quantity) {
			if (currQuantity < quantity) {
				incrementQuantity.click();
				currQuantity++;
			}
			else {
				decrementQuantity.click();
				currQuantity--;
			}
		}
		
	}

	public void clickAddamessage() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(addAMessage));
			
		} catch (NoSuchElementException e) {
			logger.error("Add a message button not found!");
			
		}
		
		if (addAMessage != null) {
			try {
				Thread.sleep(3000);
				addAMessage.click();
				
			} catch (InterruptedException e) {
				logger.error("Exception interrupted");
				
			}
			
		}
	}
	
	public void enterMessage(String msg) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(messageTextbox));
			
		}
		catch (NoSuchElementException e) {
			logger.error("Message textbox not found!");
			
		}
		
		messageTextbox.sendKeys(msg);
		 
	}
	
	public void clickNext() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(next));
			
		} catch (NoSuchElementException e) {
			logger.error("Buy gift cards link not found!");
			
		}
		
		if (next != null) {
			try {
				Thread.sleep(3000);
				next.click();
				
			} catch (InterruptedException e) {
				logger.error("Exception interrupted");
				
			}
			
		}
	}
	
	public void fillInEmails(String email) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(recipientEmail));
			
		} catch (NoSuchElementException e) {
			logger.error("Textbox to enter recipient email not found!");
			
		}
		
		recipientEmail.sendKeys(email);

	}
	
	public void clickAddtocart() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(addToCart));
			
		} catch (NoSuchElementException e) {
			logger.error("Add a cart button not found!");
			
		}
		
		if (addToCart != null) {
			try {
				Thread.sleep(3000);
				addToCart.click();
				
			} catch (InterruptedException e) {
				logger.error("Exception interrupted");
				
			}
		}
		
	}
	
	public void inGiftCardPage() {
		
		if (!reviewYourCart.getText().equals("Review Your Cart")) {
			logger.error("Unsuccessful redirection to cart review");
			
		}
		
		try {
	    	Thread.sleep(8000);
	    	
	    } catch (InterruptedException e) {
	    	logger.error("Interrupted exception");
	    	
	    }
		
	}
}
