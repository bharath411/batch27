package com.slokam.abc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
		
		actions.click().build().perform();;
		actions.click(ele).build().perform();
		
		actions.clickAndHold().build().perform();
		actions.clickAndHold(ele).build().perform();
		
		actions.release();
		actions.release(ele);
		
		actions.moveByOffset(10, 30);
		
		actions.clickAndHold(ele).moveByOffset(30, 49).release().build().perform();
		
		actions.contextClick().build().perform();
		
		actions.doubleClick().build().perform();
		actions.click().click().build().perform();
		
		actions.dragAndDrop(ele, ele).build().perform();
		actions.dragAndDropBy(ele, 40, 50).build().perform();
		
		actions.sendKeys("sdf").build().perform();
		
		actions.keyDown(Keys.CONTROL).keyDown(Keys.ALT).keyDown(Keys.DELETE).keyUp(Keys.DELETE).keyUp(Keys.ALT).keyUp(Keys.CONTROL).build().perform();
		
		
	}
	
	public static void main(String[] args) {
		QAGeek g = new QAGeek();
		g.test1();
	}
}
