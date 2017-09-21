package com.slokam.abc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JQueryUI {

	
	public void test1(){
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Droppable']")).click();;
		
		
		WebElement iframeEle = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(iframeEle);
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target).build().perform();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()='Resizable']")).click();;
		
		
	}
	
	public static void main(String[] args) {
		JQueryUI ui = new JQueryUI();
		ui.test1();
	}
}
