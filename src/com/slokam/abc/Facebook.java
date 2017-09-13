package com.slokam.abc;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	
	public void testLogin(){
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
	}
	
	public static void main(String[] args) {
		Facebook b = new Facebook();
		b.testLogin();
	}
}
