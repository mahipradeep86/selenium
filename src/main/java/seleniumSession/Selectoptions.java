package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectoptions {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By country=By.id("Form_submitForm_Country");
		Select select=new Select(driver.findElement(country));
		List<WebElement> countrylist =select.getOptions();
		System.out.println(countrylist.size());
		for(WebElement e:countrylist) {
			String txt= e.getText();
			System.out.println(txt);
			
			
		}
	}

}
