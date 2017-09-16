package com.slokam.abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QAGeek {

	
	public void test1(){
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qageek.com/");
		
		WebElement ele =driver.findElement(By.xpath("//a[contains(text(),'Videos')]"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(ele).build().perform();;
	}
	
	public static void main(String[] args) {
		QAGeek g = new QAGeek();
		g.test1();
	}
}
