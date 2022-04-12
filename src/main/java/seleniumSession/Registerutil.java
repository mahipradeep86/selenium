package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Registerutil {
	
	static WebDriver driver;

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
 driver=new ChromeDriver();
	driver.get("https://demo.opencart.com/index.php?route=account/register");
	
By fn= By.id("input-firstname");
By ln= By.id("input-firstname");
By email=By.id("input-email");
By phone=By.id("input-telephone");
By password=By.id("input-password");
By cpassword=By.id("input-confirm");



sendKeys1(fn,"mahi");
sendKeys1(ln,"pradee");
sendKeys1(email,"smahi86@gmail.com");
sendKeys1(phone,"9193445920");
sendKeys1(password,"Hariha#4");
sendKeys1(cpassword,"Hariha#4");



	
	}
	
	public static WebElement getElement(By locator) {
		 return driver.findElement(locator);
		 
	}
	
	public static void sendKeys1(By locator, String value1) {
	getElement(locator).sendKeys(value1);
	}
	
}

