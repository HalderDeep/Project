package com.actitime.basics.autosuggestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutosuggestionsDemo {
	
static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
	
		System.out.println("-----printing suggestions---------");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		 driver.get("https://www.google.co.in");
		 driver.findElement(By.name("q")).sendKeys("Amazon");
		 //Thread.sleep(2000);
		 WebDriverWait wait = new WebDriverWait(driver,20); 
		 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//ul[@role='listbox']"))));
		 
		 List<WebElement> Autosuggestions = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		 
		 System.out.println("Total suggestion displayed by application" + Autosuggestions.size() );
		 
		 
		 for (WebElement suggestion : Autosuggestions) {
			System.out.println(suggestion.getText());
		}
		 driver.close();
			driver.quit();
			driver=null;
			
			System.out.println("End");
	
		 
	
		//launching application
	
	}

}
