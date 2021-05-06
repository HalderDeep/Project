package com.actitime.basics.autosuggestions;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;

public class countfluentwaitAssign {
	static WebDriver driver = null;
	public static void main(String[]  args) throws InterruptedException {
		 
		System.out.println("-----implicit wait assignment ---------");
		System.out.println("-----printing hello ---------");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("D:\\SeleniumProject\\MySeleniumProject\\Intellipaat_Feb_09\\html\\CounterText.html");
		
	
	FluentWait<WebElement> wait = new FluentWait<WebElement>(


			driver.findElement(By.id("counter")))
			.withTimeout(Duration.ofMinutes(3))
			.pollingEvery(Duration.ofMillis(100))
			.ignoring(Exception.class).ignoring(NoSuchElementException.class);
	
	Function<WebElement, Boolean> fun = new Function<WebElement, Boolean>() {
		
		@Override
		public Boolean apply(WebElement ele) {
			// TODO Auto-generated method stub
			Boolean Flag = false;
			if(ele.getText().trim().equals("20"))
			{
				System.out.println("Element Found \n Closing the brwser");
				Flag= true;
			

		
				
				System.out.println("End");
				
			}
			else
				
			{
				System.out.println("Waiting!!!");
				Flag= false;
			}
			return Flag;
		}
		
		
		};
		wait.until(fun);
		driver.close();
		driver.quit();
		driver=null;
		
		System.out.println("End");
			
	}
}
