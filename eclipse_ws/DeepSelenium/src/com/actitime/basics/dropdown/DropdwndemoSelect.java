package com.actitime.basics.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdwndemoSelect {
	static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		// driver.get("https://www.google.co.in");
		
		//launching application
		driver.get("https://formy-project.herokuapp.com/form");
		
		//Filling the form
		
		driver.findElement(By.id("first-name")).sendKeys("Deep");
		driver.findElement(By.id("last-name")).sendKeys("Deep");
		driver.findElement(By.id("job-title")).sendKeys("AC-2");
		driver.findElement(By.id("radio-button-3")).click();
		driver.findElement(By.id("checkbox-2")).click();
		
		//dropdown implementaion
		Select dropdwn = new Select(driver.findElement(By.id("select-menu")));
		dropdwn.selectByIndex(1);
	
		
		Thread.sleep(2000);
		dropdwn.selectByValue("4");
		

		Thread.sleep(2000);
		dropdwn.selectByVisibleText("5-9");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Submit")).click();
		Thread.sleep(2000);
		driver.close();
		driver.quit();
		driver=null;
		
		System.out.println("End");
		
	}
}
