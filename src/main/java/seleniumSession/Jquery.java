package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Jquery {
	static WebDriver driver;

	public static void main(String[] args) {
		
			 WebDriverManager.chromedriver().setup();
		       driver=new ChromeDriver();
		      driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		     // driver.findElement(By.id("justAnInputBox")).click();
		     // List<WebElement> choices=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		    //  for(WebElement e:choices) {
		    //	String txt= e.getText();
		    //	 System.out.println(txt);
		    	// if(txt.contains("choice 4")) {
		    	//	 e.click();
		    	 //}
		     // }
		      		
		     By input=By.id("justAnInputBox");
		    By choicelst=By.xpath("//span[@class='comboTreeItemTitle']") ; 
		    WebElement search= getelement(input);
		    search.click();
		    choices(choicelst,"choice 4");
		    
		      }
	 public static WebElement getelement(By locator) {
   	  return driver.findElement(locator);}
	 public static List<WebElement> getelements(By locator) {
	   	  return driver.findElements(locator);}
	 public static void choices(By locator,String value) {
		 List<WebElement>choices= getelements(locator);
		 for(WebElement e:choices) {
		    	String txt= e.getText();
		    	if(txt.contains(value)) {
		    		 e.click();
		    	 }
		    	
		      }
		    	}
	   	  }
	


