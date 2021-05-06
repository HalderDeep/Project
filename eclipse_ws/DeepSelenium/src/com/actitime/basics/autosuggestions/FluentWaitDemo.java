package com.actitime.basics.autosuggestions;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitDemo {
	public static void main(String[]  args) throws InterruptedException {
		 
		System.out.println("-----implicit wait demo ---------");
		System.out.println("-----printing hello ---------");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("D:\\SeleniumProject\\MySeleniumProject\\Intellipaat_Feb_09\\html\\tiimeout.html");
		 driver.findElement(By.xpath("//button")).click();
		 
		 FluentWait<WebElement> wait = new FluentWait<WebElement>(
		  driver.findElement(By.id("demo")))
				 .withTimeout(Duration.ofMinutes(3))
			.pollingEvery(Duration.ofMillis(100))
			.ignoring(Exception.class).ignoring(NoSuchElementException.class);
		 
		 
		 
		 
		 Function<WebElement, Boolean> fun = new Function<WebElement, Boolean>() {

			
			

			@Override
			public Boolean apply(WebElement ele) {
				// TODO Auto-generated method stub
				boolean flag= false;
				if(ele.getText().trim().equals("Hello"))
				{
					System.out.println("Element found");
					flag= true;
				}
				else
				{
					System.out.println("Waiting");
					flag= false;
				}
				return flag;
			}
		
		};
		 	
		wait.until(fun);
		driver.close();
			driver.quit();
			driver=null;
			
			System.out.println("End");
			
			
	}
	}
