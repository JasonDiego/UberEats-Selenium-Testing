package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitSingleton {

	private static WebDriverWaitSingleton instanceOfWebDriverWait = null;
	private WebDriverWait wait;
	
	private WebDriverWaitSingleton() {		
		wait = new WebDriverWait(WebDriverSingleton.getInstanceOfWebDriverSingleton().getWebDriver(), 15);
	}
	
	public static WebDriverWaitSingleton getInstanceOfWebDriverWaitSingleton() {
		if (instanceOfWebDriverWait == null) {
			instanceOfWebDriverWait = new WebDriverWaitSingleton();
		}
		return instanceOfWebDriverWait;
	}
	
	public WebDriverWait getWebDriverWait() {
		return wait;
	}
	
}
