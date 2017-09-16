package com.slokam.abc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class APSRTC2 {

	public static void main(String[] args) {
		APSRTC2 aps = new APSRTC2();
		aps.verifyNameOfService();
	}

	public void verifyNameOfService(){
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/*Options ops =driver.manage();
		Timeouts time = ops.timeouts();
		time.implicitlyWait(30, TimeUnit.SECONDS);
		*/
		
		
		//FirefoxDriver driver  =new FirefoxDriver();
		driver.get("http://www.apsrtconline.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		
		WebElement fromEle = driver.findElement(By.id("fromPlaceName"));
		fromEle.sendKeys("Hyderabad");
		
		WebElement fromCityEle = driver.findElement(By.linkText("HYDERABAD"));
		fromCityEle.click();
		
		
		WebElement toEle = driver.findElement(By.id("toPlaceName"));
		toEle.sendKeys("kadapa");
		
		WebElement toCityEle = driver.findElement(By.linkText("KADAPA"));
		toCityEle.click();
		
		
		WebElement fromCalEle = driver.findElement(By.id("txtJourneyDate"));
		fromCalEle.click();
		
		WebElement fromDate = driver.findElement(By.xpath("//a[contains(@class , 'ui-state-active')]"));
		fromDate.click();
		
		WebElement checkBtn = driver.findElement(By.name("searchBtn"));
		checkBtn.click();
		
		
		WebElement serviceNumberEle = driver.findElement(By.xpath("//div[@class='srvceNO']"));
		String serviceNumberValue= serviceNumberEle.getText();
		System.out.println(serviceNumberValue);
		
		WebElement priceEle = driver.findElement(By.xpath("//span[@class='TickRate rupeeIco']"));
		String price= priceEle.getText();
		System.out.println(price);
		
	}
	
}
