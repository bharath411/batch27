package com.slokam.abc;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukari2 {

	WebDriver driver = null;
	public void launchBrowser(){
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.id("login_Layer")).click();
		
		driver.findElement(By.id("closeLB")).click();
		
		
		//Get Active window's handle.
		String mainHandle = driver.getWindowHandle();
		
		Set<String> handles = driver.getWindowHandles();
		
		for(String handle  : handles){
			
			driver.switchTo().window(handle);
			if(!handle.equals(mainHandle)){
				driver.close();
			}
			
			/*if(hTitle.contains("Tech Mahindra")){
				driver.findElement(By.xpath("//img[@alt='Tech Mahindra']")).click();
			}else{
				
			}*/
		}
		
	}
	
	public void test1(){
		launchBrowser();
	}
	public static void main(String[] args) {
		Naukari2 n = new Naukari2();
		n.test1();
	}
}
