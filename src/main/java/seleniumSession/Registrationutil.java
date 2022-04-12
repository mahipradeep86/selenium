package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registrationutil {
	
	private WebDriver driver;

	public Registrationutil(WebDriver driver) {
		
		this.driver = driver;
	}
	public  WebElement getElement(By locator) {
		 return driver.findElement(locator);
		 
	}
	
	public  void sendKeys1(By locator, String value1) {
	getElement(locator).sendKeys(value1);
	}
	
	
	
	

}
