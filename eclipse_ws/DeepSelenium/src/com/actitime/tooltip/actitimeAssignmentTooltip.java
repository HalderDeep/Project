package com.actitime.tooltip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.actitime.basics.utils.Driverutils;

public class actitimeAssignmentTooltip {
	public static void main(String[] args) {

		WebDriver driver = Driverutils.getMyDriver();
		driver.get("http://localhost/login.do");

		
//		WebElement username = driver.findElement(By.id("username"));
//		WebElement userpwd = driver.findElement(By.name("pwd"));
//		WebElement Clicklogin = driver.findElement(By.id("loginButton"));
//
//		username.sendKeys("admin");
//		userpwd.sendKeys("admin");
//		Clicklogin.click();
		
		
		try {
			Thread.sleep(2000);

		} catch (Exception e) {
			// TODO: handle exception
		}
		String tooltips = driver.findElement(By.id("keepMeLoggedInCaptionContainer")).getAttribute("title");
		System.out.println(tooltips);
		
		driver.close();
		driver.quit();
		

	}

}
