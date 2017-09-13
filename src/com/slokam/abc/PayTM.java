package com.slokam.abc;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PayTM {

	
	public void verifyMovieList(){
		
		FirefoxDriver driver  =new FirefoxDriver();
		driver.get("https://paytm.com");
		
		WebElement moviesLink = driver.findElementByLinkText("Movies");
		moviesLink.click();
		
		
		
	}
	
	public static void main(String[] args) {
		PayTM pay =new PayTM();
		pay.verifyMovieList();
	}
}
