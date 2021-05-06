package jar;



import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class LoginLogoutTC {
	
	public static AppiumDriver<MobileElement> Driver;
	public static void main(String[] args) {
	
		try {
			openApp();
		} catch (Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
			}
		
		
	}
	public static void openApp() throws Exception
	{
		DesiredCapabilities cap =new DesiredCapabilities();
		cap.setCapability("deviceName", "Redmi");
		cap.setCapability("udid", "ssv85hgunjzdq4q8");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10.0");
		cap.setCapability("appPackage", "com.coalshastralive.android.app");
		cap.setCapability("appActivity", "com.coalshastralive.android.app.subusers.UserDetails - CoalShashtra");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		Driver = new AppiumDriver<MobileElement>(url,cap);
		System.out.println("Application Started");
	}

}
