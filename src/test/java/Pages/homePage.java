package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {
	
	private WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"location-typeahead-home-input\"]")
	private WebElement address;
	
	@FindBy(xpath = "//*[@id=\"wrapper\"]/main/div[1]/div[2]/div/button")
	private WebElement findFood;
	
	public homePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void openHomePage() {
		driver.get("https://www.ubereats.com/");
	}
	
	public void insertAddress(String inputAddress) {
		//WebElement address = driver.findElement(_address);
		address.sendKeys(inputAddress);
	}
	
	public void clickFindFood() {
		//WebElement findFood = driver.findElement(_findFood);
		findFood.click();
	}
}
