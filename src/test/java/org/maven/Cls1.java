package org.maven;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Cls1 {
	@Test(retryAnalyzer = Fail.class)
	public void logic() {
		System.out.println("one");
		Assert.assertTrue(false, "WRONG CONDITION");
long id = Thread.currentThread().getId();
System.out.println("cls1 " + id);
	}
	@Test(priority = -3)
	public void supe() {
		// TODO Auto-generated method stub
		//Added Changes
System.out.println("two");
long c = Thread.currentThread().getId();
System.out.println("cls1 " + c);
	}
	@Test(priority =0 )
public void the() {
	// TODO Auto-generated method stub
		//its too done
System.out.println("three");
long m = Thread.currentThread().getId();
System.out.println("cls1 " + m);
}
@Test(priority = 4)
private void man() {
	// TODO Auto-generated method stub
System.out.println("four ");
long r = Thread.currentThread().getId();
System.out.println("cls1 " + r);
}
}
