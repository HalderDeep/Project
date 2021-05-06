package com.actitime.basics.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class actitimeutils extends Driverutils {
	/***
	 * @author Deep
	 * @param Userid enter the userid
	 * @param Pwd    enter the password
	 */
	public static void loginActitime(String Userid, String Pwd) {
		WebElement username = Driver.findElement(By.id("username"));
		WebElement userpwd = Driver.findElement(By.name("pwd"));
		WebElement Clicklogin = Driver.findElement(By.id("loginButton"));

		username.sendKeys(Userid);
		userpwd.sendKeys(Pwd);
		Clicklogin.click();

		try {
			Thread.sleep(2000);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void clickmodules(String ModulName) {
		System.out.println("Clicking on module" + ModulName);
		switch (ModulName.toUpperCase()) {
		case "TIME-TRACK": {
			Driver.findElement(By.xpath("//div[text()='TIME-TRACK']/parent::a")).click();
			System.out.println("TIME-TRACK opened");
			break;
		}

		case "TASKS": {
			Driver.findElement(By.xpath("//div[text()='TASKS']/parent::a")).click();
			System.out.println("TASK opened");
			break;
		}
		case "REPORTS": {
			Driver.findElement(By.xpath("//div[text()='REPORTS']/parent::a")).click();
			System.out.println("Reports opened");
			break;
		}
		case "USERS": {
			Driver.findElement(By.xpath("//div[text()='USERS']/parent::a")).click();
			System.out.println("USERS opened");
			break;
		}
		default:
			System.out.println("please contact automation team to support new module");
			break;
		}

	}

	public static void ClickOnNewCustomerButton() {
		System.out.println("Click on new customer button");
		myClick("xpath", "//div[text()='Add New']/parent::div");
		myClick("xpath", "//div[contains(text(),'New Customer')]");

	}

	public static void CreateACustomer(String Cname, String CusDesc) 
	{
		System.out.println("Creating a customer\n Entering the name" +Cname + "description of the customer" +CusDesc);
		myType("id", "customerLightBox_nameField", Cname);
		myType("id", "customerLightBox_descriptionField", CusDesc);
		myClick("xpath", "//span[text()='Create Customer']/parent::div");
		
	}
	
	public static void Logout()
	{
		System.out.println("Login out");
		myClick("id", "logoutLink");
	}
	
	

}
