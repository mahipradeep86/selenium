package seleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {
	static WebDriver driver;

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
	       driver=new ChromeDriver();
	     driver.get("https://www.amazon.com/");
//List<WebElement> linklist= driver.findElements(By.tagName("a"));
//System.out.println(linklist.size());
//String txt= linklist.get(20).getText();
//System.out.println(txt);
//for(WebElement :linklist)
//{
//	String text= e.getText();
//	if(!text.isEmpty())
	//System.out.println(text);
//}
	    By linkname= By.tagName("a");
	   System.out.println(getelements(linkname).size());
	    // List<String>list =gettextlink(linkname);
	    // System.out.println(list.size());
	    

	}
	public  static List<WebElement> getelements(By locator) {
		return driver.findElements(locator);
	}
	public static List<String> gettextlink(By locator) {
		List <WebElement> getele= getelements(locator);
		List<String> list =new ArrayList<String>();
	
		for(WebElement e:getele) {
			String  txt= e.getText();
			if (!txt.isEmpty()) {
				
				list.add(txt);
			}
			
			}
		return list;
			
			
			
		}
	}


