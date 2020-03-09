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
	
	private WebElement _buyGiftCards, _sendAGift, _recipientName, _userName,
		_pickAGiftCard, _sendADigitalCard, _giftCardDesign, _howMuch,
		_incrementAmount, _decrementAmount, _incrementQuantity, _decrementQuantity,
		_amountTextbox, _quantityTextbox, _addAMessage, _messageTextbox, _next,
		_recipientEmail, _addToCart;
	
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
			_sendAGift = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='https://ubereats.cashstar.com/store/?ref=landingpage']")));
			
		} catch (NoSuchElementException e) {
			System.out.println("Send a gift button not found!");
			
		}
		
		if (_sendAGift != null) {
			try {
				Thread.sleep(3000);
				_sendAGift.click();
				System.out.println("Button clicked!");
				
			} catch (InterruptedException e) {
				System.out.println("Exception interrupted");
				
			}
			
		}
	}
	
	public void fillInNames(String recipientName, String userName) {
		try {
			_recipientName = driver.findElement(By.id("recipientName-input"));
			_userName = driver.findElement(By.id("senderName-input"));
		} catch (NoSuchElementException e) {
			System.out.println("Textbox for name not found!");
			
		}
		_recipientName.click();
		_recipientName.sendKeys(recipientName);
		_userName.click();
		_userName.sendKeys(userName);
		
	}

	public void clickPickagiftcard() {
		try {
			_pickAGiftCard = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app-root\"]/div/main/div/form/div/button")));
			
		} catch (NoSuchElementException e) {
			System.out.println("Buy gift cards link not found!");
			
		}
		
		if (_pickAGiftCard != null) {
			try {
				Thread.sleep(3000);
				_pickAGiftCard.click();
				
			} catch (InterruptedException e) {
				System.out.println("Exception interrupted");
				
			}
			
		}
	}
	
	public void clickSendadigitalcard() {
		try {
			_sendADigitalCard = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app-root\"]/div/main/div/form/section/div[1]/button")));
			
		} catch (NoSuchElementException e) {
			System.out.println("Buy gift cards link not found!");
			
		}
		
		if (_sendADigitalCard != null) {
			try {
				Thread.sleep(3000);
				_sendADigitalCard.click();
				
			} catch (InterruptedException e) {
				System.out.println("Exception interrupted");
				
			}
			
		}
	}

	public void chooseGiftcarddesign() {
		try {
			_giftCardDesign = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"faceplate-4-label\"]/img")));
			
		} catch (NoSuchElementException e) {
			System.out.println("Buy gift cards link not found!");
			
		}
		
		if (_giftCardDesign != null) {
			try {
				Thread.sleep(3000);
				_giftCardDesign.click();
				
			} catch (InterruptedException e) {
				System.out.println("Exception interrupted");
				
			}
			
		}
	}
	
	public void clickHowmuch() {
		try {
			_howMuch = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app-root\"]/div/main/div/form/div[2]/div/button")));
			
		} catch (NoSuchElementException e) {
			System.out.println("Buy gift cards link not found!");
			
		}
		
		if (_howMuch != null) {
			try {
				Thread.sleep(3000);
				_howMuch.click();
				
			} catch (InterruptedException e) {
				System.out.println("Exception interrupted");
				
			}
			
		}
	}

	public void enterAmountandQuantity(int amount, int quantity) {
		try {
			_incrementAmount = driver.findElement(By.xpath("/html/body/div[1]/div/main/div/form/section/div/div[1]/div[1]/div/div/button[2]"));
			_decrementAmount = driver.findElement(By.xpath("/html/body/div[1]/div/main/div/form/section/div/div[1]/div[1]/div/div/button[1]"));
			_incrementQuantity = driver.findElement(By.xpath("/html/body/div[1]/div/main/div/form/section/div/div[3]/div/div/button[2]"));
			_decrementQuantity = driver.findElement(By.xpath("/html/body/div[1]/div/main/div/form/section/div/div[3]/div/div/button[1]"));
			_amountTextbox = driver.findElement(By.id("denomination-input"));
			_quantityTextbox = driver.findElement(By.id("quantity-input"));
			
		} catch (NoSuchElementException e) {
			System.out.println("Textbox or button not found!");
			
		}
		
		amount -= amount % 5;
		int currAmount = 60;
		while (currAmount != amount) {
			if (currAmount < amount) {
				_incrementAmount.click();
				currAmount += 5;
			}
			else {
				_decrementAmount.click();
				currAmount -= 5;
			}
		}
		
		int currQuantity = 1;
		while (currQuantity != quantity) {
			if (currQuantity < quantity) {
				_incrementQuantity.click();
				currQuantity++;
			}
			else {
				_decrementQuantity.click();
				currQuantity--;
			}
		}
		
	}

	public void clickAddamessage() {
		try {
			_addAMessage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/main/div/form/div/button")));
			
		} catch (NoSuchElementException e) {
			System.out.println("Add a message button not found!");
			
		}
		
		if (_addAMessage != null) {
			try {
				Thread.sleep(3000);
				_addAMessage.click();
				
			} catch (InterruptedException e) {
				System.out.println("Exception interrupted");
				
			}
			
		}
	}
	
	public void enterMessage(String msg) {
		_messageTextbox = wait.until(ExpectedConditions.elementToBeClickable(By.id("message-input")));
		_messageTextbox.sendKeys(msg);
		 
	}
	
	public void clickNext() {
		try {
			_next = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/main/div/form/div/button")));
			
		} catch (NoSuchElementException e) {
			System.out.println("Buy gift cards link not found!");
			
		}
		
		if (_next != null) {
			try {
				Thread.sleep(3000);
				_next.click();
				
			} catch (InterruptedException e) {
				System.out.println("Exception interrupted");
				
			}
			
		}
	}
	
	public void fillInEmails(String recipientEmail) {
		_recipientEmail = wait.until(ExpectedConditions.elementToBeClickable(By.id("recipientEmail-input")));
		_recipientEmail.sendKeys(recipientEmail);

	}
	
	public void clickAddtocart() {
		try {
			_addToCart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/main/div/form/div/button")));
			
		} catch (NoSuchElementException e) {
			System.out.println("Add a cart button not found!");
			
		}
		
		if (_addToCart != null) {
			try {
				Thread.sleep(3000);
				_addToCart.click();
				
			} catch (InterruptedException e) {
				System.out.println("Exception interrupted");
				
			}
		}
		
	}
	
}
