package org.maven;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Fail implements IRetryAnalyzer {
	int m=0; int y=3;

	public boolean retry(ITestResult result) {
		if(m<y) {
			m++;
			return true;
		}
		return false;
	}
	
}
