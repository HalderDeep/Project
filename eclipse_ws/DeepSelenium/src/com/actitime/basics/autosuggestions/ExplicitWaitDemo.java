package com.actitime.basics.autosuggestions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.util.concurrent.Uninterruptibles;

public class ExplicitWaitDemo{

	public static void main(String[]  args) throws InterruptedException {
		 
		System.out.println("-----implicit wait demo ---------");
		System.out.println("-----printing hello ---------");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		
		 driver.get("D:\\SeleniumProject\\MySeleniumProject\\Intellipaat_Feb_09\\html\\tiimeout.html");
		 driver.findElement(By.xpath("//button")).click();
		 WebDriverWait wait = new WebDriverWait(driver,20);
		 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("demo"))));
		 
		 WebElement ele =  driver.findElement(By.id("demo"));
		 System.out.println("Printing message-- " + ele.getText());
		 

		 WebElement ele2 =  driver.findElement(By.id("demo2"));
		 System.out.println("Printing message2-- " + ele2.getText());
		 
		 
		 Thread.sleep(6000);
		 	driver.close();
			driver.quit();
			driver=null;
			
			System.out.println("End");
	}
}
