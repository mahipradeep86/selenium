package seleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browserutil {
	public WebDriver driver;
	
	
	public WebDriver launchbrowser(String browsername)
	{
		System.out.println("The browser name is "+browsername);
		if(browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			  driver=new ChromeDriver();}
		else if(browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else {
			System.out.println("please pass right browser");
		}
		return driver;
	}
		public int launchurl(String url)
		{
			int i = 0;
			if(url == null) {
				System.out.println("pleasw pass the right url");
				driver.close();
				i = 1;
				}
			else if(url.contains("http")||url.contains("https")) {
				driver.get(url);
			}
			else {
				System.out.println("please pass right url");
				driver.close();
				i = 1;
			}

			return i;
		}
		public String getPageTitle()
		{
			
			return driver.getTitle();
		}
		 public String getPageUrl() {
			 return driver.getCurrentUrl();
		 }
		 
		
				
		public void close()
		{
			driver.close();
		}

			public void quit() {
				driver.quit();
			}
			
			
			
		}
	
	


