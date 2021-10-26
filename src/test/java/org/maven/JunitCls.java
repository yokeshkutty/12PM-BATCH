package org.maven;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitCls extends BaseCls {
	
	

	@Test
	public void logic() {
		//openChrome();
		//wantUrl("https://en-gb.facebook.com/login.php");
		PojoCls p=new PojoCls();
		
		String currentUrl = d.getCurrentUrl();
		keyPassing(p.getUserbtn(),"yokesh");
		Assert.assertTrue("currentUrl", true);
		keyPassing(p.getPassbtn(), "passwoerd");

	}
	
	
	
}
