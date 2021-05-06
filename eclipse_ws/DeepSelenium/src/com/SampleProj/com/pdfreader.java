package com.SampleProj.com;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;


import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class pdfreader {
 static WebDriver driver;
	public void verifyPDFContent(String path) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(path);
		driver.manage().window().maximize();
		String Currentlink=driver.getCurrentUrl();
		URL url=new URL(Currentlink);
		InputStream is=url.openStream();
		BufferedInputStream fp=new BufferedInputStream(is);
		PDDocument document=null;
		document=PDDocument.load(fp);
		String pdfContent= new PDFTextStripper().getText(document);
		System.out.println(pdfContent);
		driver.quit();
	}
	public static void main(String[] args) throws Exception {
		pdfreader pf= new pdfreader();
		pf.verifyPDFContent("file:///D:/SeleniumProject/MySeleniumProject/Intellipaat_Feb_09/eclipse_ws/DeepSelenium/pdffile/demo.pdf");
	}
}
