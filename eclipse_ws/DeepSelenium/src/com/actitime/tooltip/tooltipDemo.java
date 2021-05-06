package com.actitime.tooltip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.actitime.basics.utils.Driverutils;

public class tooltipDemo {
	
	public static void main(String[] args) {
		System.out.println("Welcome to tool tip demo");
		WebDriver Driver = Driverutils.getMyDriver();
		Driver.get("https://www.google.co.in");
		String ToolTip = Driver.findElement(By.xpath("//a[@class='gb_D gb_zc']")).getAttribute("title");
		System.out.println(ToolTip);
		if (ToolTip.equals("Google apps"))
		{
			System.out.println("Passed-----Tool tip is matched");
		}
		else
		{
			System.out.println("Failed.. the output shown is " + ToolTip);
		}
	Driver.close();
	Driver.quit();
	Driver= null;
		
		}
	

}