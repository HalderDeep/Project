package com.actitime.basics.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselectdropdowndemo {
static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		// driver.get("https://www.google.co.in");
		
		//launching application
		driver.get("D:\\SeleniumProject\\MySeleniumProject\\Intellipaat_Feb_09\\html\\multiSelect.html");
		Thread.sleep(2000);
		Select dropdwn = new Select(driver.findElement(By.tagName("select")));
		//selecting some values
		dropdwn.selectByIndex(1);	
		Thread.sleep(2000);
		dropdwn.selectByValue("audi");
		Thread.sleep(2000);
		dropdwn.selectByVisibleText("Mercedes");
		Thread.sleep(2000);
		
		// de-selecting values
		dropdwn.deselectByIndex(1);	
		Thread.sleep(2000);
		dropdwn.deselectByValue("audi");
		Thread.sleep(2000);
		dropdwn.deselectByVisibleText("Mercedes");
		Thread.sleep(2000);
		
		//selecting the same value again
		dropdwn.selectByIndex(1);	
		Thread.sleep(2000);
		dropdwn.selectByValue("audi");
		Thread.sleep(2000);
		dropdwn.selectByVisibleText("Mercedes");
		Thread.sleep(2000);
		
		// de-selecting in one go
		dropdwn.deselectAll();
		Thread.sleep(2000);
		
		
		
		
		
		
		driver.close();
		driver.quit();
		driver=null;
		
		System.out.println("End");
	
	}
}
