package org.maven;




import org.testng.annotations.Test;


public class TestngCls extends BaseCls {
	
	
	
	@Test(dataProvider = "mass",dataProviderClass = Data.class)
	private void logic(String w,String r) {
	
System.out.println(w);
System.out.println(r);
	}
	


}



