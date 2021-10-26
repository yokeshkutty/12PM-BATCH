package org.maven;

import org.testng.annotations.Test;

public class Cls2 {
	@Test(priority = 10)
	public void third() {
		// TODO Auto-generated method stub
System.out.println("five");
System.out.println("cls2 1st "+Thread.currentThread().getId());
	}
	
	@Test(priority = 12)
	public void four() {
		// TODO Auto-generated method stub
System.out.println("six");
System.out.println("cls2 2nd "+Thread.currentThread().getId());
	}
	
	

}
