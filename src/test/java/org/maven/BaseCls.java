package org.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseCls {
	static WebDriver d;
	public static void openChrome() {
		WebDriverManager.chromedriver().setup();
	d =new ChromeDriver();

	}
	public static void getURL() {
		d.getTitle();

	}
	public static void wantUrl(String url) {
		d.get(url);

	}
	public static void keyPassing(WebElement userbtn,String value) {
		userbtn.sendKeys(value);
	
	}
	public static void pressBtn(WebElement a ) {
		a.click();

	}
	

}