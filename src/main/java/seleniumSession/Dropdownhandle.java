package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownhandle {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
	//WebElement country=driver.findElement(By.id("Form_submitForm_Country"));
	//Select select=new Select(country);
	//select.selectByIndex(5);
	//select.selectByVisibleText("Australia");
	
	
	By country=By.id("Form_submitForm_Country");
	By state=By.id("Form_submitForm_State");
	selectbyvisibletect(country,"India");
	Thread.sleep(2000);
	selectbyvisibletect(state,"Assam");

	}
	
	public static  WebElement GetElement(By locator) {
	return	driver.findElement(locator);
	}
	public static void selectbyvisibletect(By locator,String text) {
		Select select=new Select(GetElement(locator));
		select.selectByVisibleText(text);
		
	}
	public static void selectbyindex(By locator,int index) {
		Select select=new Select(GetElement(locator));
		select.selectByIndex(index);

}
	public static void selectbyvalue(By locator,String value) {
		Select select=new Select(GetElement(locator));
		select.selectByValue(value);

}
}

