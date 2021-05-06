package com.actitime.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helloworld {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(" Hello world \n Lets getr started" );
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.get("https://www.google.co.in");
		driver.get("http://localhost/login.do");
			WebElement username = driver.findElement(By.id("username"));
			WebElement userpwd = driver.findElement(By.name("pwd"));
			WebElement Clicklogin = driver.findElement(By.id("loginButton"));
			
		username.sendKeys("admin");
		userpwd.sendKeys("admin");
		Clicklogin.click();
		try {
			Thread.sleep(2000);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		driver.close();
		driver.quit();
		driver=null;
		
		System.out.println("End");
	}
}
