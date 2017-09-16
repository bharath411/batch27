package com.slokam.abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class APSRTC {

	
	public void testDriverInfo(){
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.apsrtconline.in/oprs-web/");
		
		WebElement driverInfo = driver.findElement(By.linkText("Driver Info"));
		driverInfo.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//input[@value='Go']"));
		WebElement serviceCodeID =  driver.findElement(By.id("serviceCode"));
		serviceCodeID.sendKeys("6666");
		
		WebElement searchBtnID = driver.findElement(By.id("searchBtn"));
		searchBtnID.click();
		
	}
	
	public void verifyNameOfService(){
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver  =new FirefoxDriver();
		driver.get("http://www.apsrtconline.in/");
		
		
		WebElement fromEle = driver.findElementById("fromPlaceName");
		fromEle.sendKeys("Hyderabad");
		
		sleep(2);
		WebElement fromCityEle = driver.findElementByLinkText("HYDERABAD");
		fromCityEle.click();
		
		
		WebElement toEle = driver.findElementById("toPlaceName");
		toEle.sendKeys("kadapa");
		sleep(2);
		WebElement toCityEle = driver.findElementByLinkText("KADAPA");
		toCityEle.click();
		
		
		WebElement fromCalEle = driver.findElementById("txtJourneyDate");
		fromCalEle.click();
		
		sleep(5);
		WebElement fromDate = driver.findElementByXPath("//a[contains(@class , 'ui-state-active')]");
		fromDate.click();
		
		WebElement checkBtn = driver.findElementByName("searchBtn");
		checkBtn.click();
		
		
		sleep(5);
		WebElement serviceNumberEle = driver.findElementByXPath("//div[@class='srvceNO']");
		String serviceNumberValue= serviceNumberEle.getText();
		System.out.println(serviceNumberValue);
		
		WebElement priceEle = driver.findElementByXPath("//span[@class='TickRate rupeeIco']");
		String price= priceEle.getText();
		System.out.println(price);
		
		driver.findElement(By.xpath("//span[@class='TickRate rupeeIco']")).click();
		driver.findElement(By.xpath("//span[@class='TickRate rupeeIco']")).sendKeys("");
	}
	
	
	public void sleep(int secs){
		
		try {
			Thread.sleep(secs *1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		APSRTC ap = new APSRTC();
		ap.test2();
	}
	
	public void verifyApsrtc(){
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.apsrtconline.in/");
		
		
	}
	
	public void test2(){
		System.setProperty("webdriver.ie.driver","E:\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.get("http://www.apsrtconline.in/");
		
		driver.quit();
	}
}
