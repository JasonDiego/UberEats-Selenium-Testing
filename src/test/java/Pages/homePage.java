package Pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class homePage {
	
	private WebDriver driver;
	private WebDriverWait wait;

	private WebElement _findFood;
	private WebElement _address;
	
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
			_address = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"location-typeahead-home-input\"]")));
			
		} catch (NoSuchElementException e) {
			System.out.println("Address bar not found!");
			
		}
		if (_address != null) {
			_address.clear();
			_address.click();
			_address.sendKeys(inputAddress);
			
		}
	}
	
	public void clickFindFood() throws NoSuchElementException, InterruptedException {
		try {
			_findFood = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"wrapper\"]/main/div[1]/div[2]/div/button")));
			
		} catch (NoSuchElementException e) {
			System.out.println("Find food button not found!");
			
		}
		
		if (_findFood != null) {
			try {
				Thread.sleep(3000);
				
			} catch (InterruptedException e) {
				System.out.println("Exception interrupted");
				
			}
			
			_findFood.click();
		}
	}
	
	public void checkIfRedirected() {
		
	}
}