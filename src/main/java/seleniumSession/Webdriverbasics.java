package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriverbasics {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver_win32\\chromedriver.exe");

	WebDriver driver= new ChromeDriver();
	driver.get("http://gmail.com/");
	driver.manage().window().maximize();
	  WebElement EmailID = driver.findElement(By.id("Email"));
	  

      driver.findElement(By.id("identifierId")).sendKeys("raj8805"); 
      
	 // WebElement Searchbox = driver.findElement(By.name("Email"));
	 // WebElement Searchbox = driver.findElement(By.xpath("//input[@id='Email']"));
	 // WebElement Searchbox = driver.findElement(By.xpath("//input[@placeholder='Enter your email']"));
	  EmailID.sendKeys("abc@gmail.com");
	  WebElement bNext = driver.findElement(By.id("next"));
	  //WebElement bNext = driver.findElement(By.class("rc-button rc-button-submit"));
	  //WebElement bNext = driver.findElement(By.name("signIn"));
	  //WebElement bNext = driver.findElement(By.xpath("//input[@value='Next'));
	  bNext.click();
	
	}

}
