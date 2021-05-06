package com.actitime.basics.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintingAllValuesOfDropdown {
		static WebDriver driver = null;
			
			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				// driver.get("https://www.google.co.in");
				
				//launching application
				driver.get("https://formy-project.herokuapp.com/form");
				Select dropdwn = new Select(driver.findElement(By.id("select-menu")));
				List<WebElement> options = dropdwn.getOptions();
			
				for (WebElement webElement : options) {
					//below returns the json code
					System.out.println(webElement);
					// using get text method to retrieve the elemnt
					System.out.println(webElement.getText());
					// to print the no of elements
					System.out.println("the total no of elements in the dropdown are " + options.size());
					
					//
				}
				
			}
}