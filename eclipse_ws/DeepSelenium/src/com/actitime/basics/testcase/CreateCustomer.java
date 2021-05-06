package com.actitime.basics.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.actitime.basics.utils.Driverutils;
import com.actitime.basics.utils.actitimeutils;

public class CreateCustomer {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("--- Customer creation--------");
		WebDriver Driver = actitimeutils.getMyDriver();
		actitimeutils.LaunchApp();
		actitimeutils.loginActitime("admin", "admin");
		actitimeutils.clickmodules("TASKS");
		Thread.sleep(2000);
		actitimeutils.ClickOnNewCustomerButton();
		Thread.sleep(2000);
		actitimeutils.CreateACustomer("feb111", "Hello How are you!");
		
		Thread.sleep(2000);
		actitimeutils.Logout();
		actitimeutils.CloseBrowser();
		
	}

}
