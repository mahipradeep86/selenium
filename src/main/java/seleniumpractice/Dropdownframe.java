package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownframe {
	//public WebDriver driver;
	

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/?utm_source=google&utm_medium=cpc&utm_campaign=GGL-SRCH-NA-DSA&utm_adgroup=DSA_templates_registration-forms&utm_term=&utm_device=c&AdSource=aw-GGL-SEARCH-NA-DSA&gclid=EAIaIQobChMI7vbH8Iua9gIVid7ICh1uig9YEAAYASAAEgKFa_D_BwE");
	     driver.switchTo().frame("frame-one748593425");
	     driver.findElement(By.id("RESULT_TextField-2")).sendKeys("gjhg");

	}

}
