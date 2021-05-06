package com.actitime.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//Write an automation code snippet to test the below scenarios on the site: Reference url: http://the-internet.herokuapp.com/
//a. Drag and Drop
//b. File Upload
//c. Multiple Windows
//d. Nested Frames
//e. JavaScript Alerts"
public class testtt {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// driver.get("https://www.google.co.in");
		
		//launching application
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Hi");
		driver.switchTo().alert().accept();
		
		
		Thread.sleep(2000);
		
		
	}
	

}
