package com.slokam.abc;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook1 {

	public void verifyFacebook() {

		// 1.Launch firefox

		FirefoxDriver driver = new FirefoxDriver();

		// 2.Open http://www.facebook.com/
		driver.get("http://www.facebook.com/");

		// 3.Type email.
		WebElement emailId = driver.findElementById("email");
		emailId.sendKeys("bharath.selenium13@gmail.com");
		
		// 4.Type password.
		WebElement passName = driver.findElementByName("pass");
		passName.sendKeys("selenium123");
		
		// 5.Click on login button.
		WebElement loginId = driver.findElementById("u_0_2");
		loginId.click();
		
		// 6.Validate user has been logged-in or not.

	}

	public static void main(String[] args) {
		Facebook1 fb = new Facebook1();
		fb.verifyFacebook();
	}
}
