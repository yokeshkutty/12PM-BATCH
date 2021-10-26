package org.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PojoCls {
	
	
	public PojoCls() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		PageFactory.initElements(driver, this);
		driver.get("https://en-gb.facebook.com/login.php");
		
	}
	
	@FindBy(id="loginbutton")
	private WebElement loginbtn;
	
	@FindBy(id="email")
	private WebElement userbtn ;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement passbtn ;
	
	@FindBy(xpath = "//input[@type='email']")
	private WebElement wazirxlogin;
	
	public WebElement getWazirxlogin() {
		return wazirxlogin;
	}
	public void setWazirxlogin(WebElement wazirxlogin) {
		this.wazirxlogin = wazirxlogin;
	}
	
	public  WebElement getUserbtn() {
		return userbtn;
	}
	public  void setUserbtn(WebElement userbtn) {
		this.userbtn = userbtn;
	}
	public WebElement getPassbtn() {
		return passbtn;
	}
	public void setPassbtn(WebElement passbtn) {
		this.passbtn = passbtn;
	}
	public WebElement getClickbtn() {
		return loginbtn;
	}
	public void setClickbtn(WebElement loginbtn) {
		this.loginbtn = loginbtn;
	}
}
