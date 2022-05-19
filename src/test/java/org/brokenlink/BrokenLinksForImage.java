package org.brokenlink;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinksForImage {
	WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement Button = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		Button.click();
		driver.manage().window().maximize();
	
		List<WebElement> allLinks = driver.findElements(By.tagName("div"));
		int brokencount= 0;	
		for (int i = 0; i < allLinks.size(); i++) {
			WebElement ele = allLinks.get(i);
			String attribute = ele.getAttribute("img");
			
			URL url = new URL(attribute);
			URLConnection openConnection = url.openConnection();
			
			HttpsURLConnection connection= (HttpsURLConnection) openConnection;
			int responseCode = connection.getResponseCode();
			
		if (responseCode!=200) {
			brokencount++;
			System.out.println("Broken Links are:"+attribute);
			
		}
			
		}
		
	}

}
