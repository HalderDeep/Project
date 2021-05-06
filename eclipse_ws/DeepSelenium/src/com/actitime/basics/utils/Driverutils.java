package com.actitime.basics.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/* 
 This is a class with resuable fuction
  wr to Driver
*/
public class Driverutils {
	// Declaring the webdriver as global	
	public static WebDriver Driver= null;
	/***
	 * getmydriver  returns the driver object	
	 * And wait is configured to implicit wait
	 * @author Deep
	 * @return Chrome Driver object is returned 		
	 */
	public static WebDriver getMyDriver() {
		System.out.println("Creating Driver Object");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		Driver= new ChromeDriver();
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		Driver.manage().window().maximize();
		return Driver;
	}
	/***
	 * @author Deep
	 * This will launch the actitime application
	 * @return No return type
	 */
	public static void LaunchApp()
	{
		System.out.println("Launching application");
		Driver.get("http://localhost/login.do");
		System.out.println("Launched the application");
	}
	/***
	 * @author Deep
	 * This will launch the application with the URL mentioned
	 * @return No return type
	 */
	public static void LaunchApp(String url)
	{
		System.out.println("Launching application" + url);
		Driver.get(url);
		System.out.println("Launched the application" + url);
	}

	/***
	 * 
	 * @param typeifIdentifier=>  id, name , css, xpath, tagname, link text,partial link text
	 * @param value  => val;ue corresponding to the type of id
	 */
	public static WebElement getelement (String typeifIdentifier, String value)
	{
		WebElement ele= null;
		switch (typeifIdentifier) {
		case "id":
			 ele= Driver.findElement(By.id(value));
			 break;
		case "linkText":
			 ele= Driver.findElement(By.linkText(value));
			 break;
		case "name":
			 ele= Driver.findElement(By.name(value));
			 break;
		case "cssselector":
			 ele= Driver.findElement(By.cssSelector(value));
			 break;
		case "partiallinktext":
			 ele= Driver.findElement(By.partialLinkText(value));
			 break;
		case "tagname":
			 ele= Driver.findElement(By.tagName(value));
			 break;
		case "xpath":
			 ele= Driver.findElement(By.xpath(value));
			 break;
	
			 

		default:
			System.out.println("Please check the type of identifier passed"+ typeifIdentifier);
			break;
	
		}
		return ele;
		
		
	}
	/***
	 * This function will click on the element which is passed.
	 * @param typeifIdentifier=>  id, name , css, xpath, tagname, link text,partial link text
	 * @param value  => val;ue corresponding to the type of id
	 */
	
public static void 	myClick (String typeifIdentifier, String value )
{
	System.out.println("------Clicking on the element-----");
	getelement(typeifIdentifier, value).click();	
}
	
public static void 	myType (String typeifIdentifier, String value, String TextToType )
{
	System.out.println("------Entering the element----------"+TextToType);
	getelement(typeifIdentifier, value).sendKeys(TextToType);;	
}
	
	
	
	
	/***
	 * @author Deep
	 * This will close the browser
	 * @return No return type
	 */
	public static void CloseBrowser()
	{
		Driver.close();
		Driver.quit();
		Driver=null;
		
		System.out.println("Browser closed");
	}
}
