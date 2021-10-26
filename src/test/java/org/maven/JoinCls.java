package org.maven;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class JoinCls {
	@Test
	public void five() {
		// TODO Auto-generated method stub
Result runClasses = JUnitCore.runClasses(Cls1.class, Cls2.class);
System.out.println("run"+runClasses.getRunCount());
System.out.println(runClasses.getIgnoreCount());
	}

}
