package org.maven;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestingCls extends BaseCls {
	

	public static void main(String[] args) throws IOException{
		
		openChrome();
		wantUrl("https://en-gb.facebook.com/login.php");
		PojoCls ps=new PojoCls();
		
		keyPassing(ps.getUserbtn(), "yokeh");
		
		keyPassing(ps.getPassbtn(), "theman");
		//(findElement, "yogesh");
		//PojoCls ps=new PojoCls();
		//ps.getUserbtn();
		//ps.getClickbtn();
		//keyPassing(ps.getUserbtn(), "SUPER");
		//keyPassing(ps.getPassbtn(), "theman");
		//pressBtn(ps.getClickbtn());
		
		d.navigate().refresh();
		PojoCls ps1=new PojoCls();
		
		keyPassing(ps1.getUserbtn(), "superman");
		keyPassing(findElement2, "jai");
		
		
	}

	
}
