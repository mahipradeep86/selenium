package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	static WebDriver driver;

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
	      driver=new ChromeDriver();
	     driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/?utm_source=google&utm_medium=cpc&utm_campaign=GGL-SRCH-NA-DSA&utm_adgroup=DSA_templates_registration-forms&utm_term=&utm_device=c&AdSource=aw-GGL-SEARCH-NA-DSA&gclid=EAIaIQobChMI7vbH8Iua9gIVid7ICh1uig9YEAAYASAAEgKFa_D_BwE");
driver.switchTo().frame(driver.findElement(By.id("frame-one748593425")));
By vehicleyr=By.id("RESULT_TextField-2");
By vehclemake=By.id("RESULT_TextField-3");
By vehiclemodel=By.id("RESULT_TextField-4");
By color=By.id("RESULT_TextField-5");
By mileage=By.id("RESULT_TextField-6");
By vin =By.id("RESULT_TextField-7");
By name=By.id("RESULT_TextField-8");
By address=By.id("RESULT_TextField-9");
By city=By.id("RESULT_TextField-11");
By state=By.id("RESULT_RadioButton-12\"");
By zip=By.id("RESULT_TextField-13");
By phone=By.id("RESULT_TextField-14");
sendkeys(vehicleyr,"1986");
sendkeys(vehclemake,"2000");
sendkeys(vehiclemodel,"800");
sendkeys(color,"blue");
sendkeys(mileage,"200");
//selectbyvisibletect(state,"florida");

	}
	public static WebElement findElement(By locator) {
		return driver.findElement(locator);
	}
	public static void sendkeys(By locator,String value) {
		findElement(locator).sendKeys(value);
	}
	// /public static void selectbyvisibletect(By locator,String text) {
		//Select select=new Select(findElement(locator));
		//select.selectByVisibleText(text);}
	

}
