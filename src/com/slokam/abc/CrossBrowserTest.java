package com.slokam.abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CrossBrowserTest {

	
	public void test1(String browser) {
		WebDriver driver=null;
			
		if(browser.equals("firefox")){
			driver = new FirefoxDriver();
		}else if(browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equals("ie")){
			System.setProperty("webdriver.ie.driver", "E:\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.get("http://www.apsrtconline.in/oprs-web/");

		By by1 = By.linkText("Driver Info");
		WebElement driverInfo = driver.findElement(by1);
		driverInfo.click();
		
		WebElement ele2 = driver.findElement(By.xpath("//div[@id='adsa']"));
		
		String st =driver.findElement(By.id("ddf")).getText();
		
		
		By.id("");
		By.name("");
		By.xpath("");
		By.cssSelector("");
		By.className("");
		By.linkText("");
		By.partialLinkText("");
	}
	
	public static void main(String[] args) {
		CrossBrowserTest cb = new CrossBrowserTest();
		cb.test1("ie");
	}
}
