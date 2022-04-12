package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calendarhandle {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
	      driver=new ChromeDriver();
	     driver.get("https://seleniumpractise.blogspot.com/search?q=how+to+handle+calendar");
	     driver.findElement(By.id("datepicker")).click();
	     //Thread.sleep(2000);
	   //  driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[5]/a")).click();
	     //selectdate("12");
	     futuredate("february 2023","13");
	     

	}
	
	public static void selectdate(String date) {
		 driver.findElement(By.xpath("//a[text()='"+date+"']")).click();

	}
	
	public static void futuredate(String monthyear, String date) throws InterruptedException {
		if(Integer.parseInt(date)>31) {
			System.out.println("wrong date");
			return;}
		if(monthyear.contains("february")&&(Integer.parseInt(date)>29)) {
			System.out.println("wrong date passed");
			return;
		}
		String actmonthyear= driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		System.out.println(actmonthyear);
		
		while(!actmonthyear.equalsIgnoreCase(monthyear)) {
			Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@title=\"Next\"]")).click();
			 actmonthyear= driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();}
		selectdate("12");

		}
		
		}
		
	


