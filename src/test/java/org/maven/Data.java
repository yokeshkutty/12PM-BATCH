package org.maven;

import org.testng.annotations.DataProvider;

public class Data {
	@DataProvider(name="mass")
	private String[][] getsData() {
		return new String[] [] {
			{"yokesh","yogi"},
			{"sada","tyheey"}
		};
	

	}

}
