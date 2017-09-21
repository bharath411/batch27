package com.slokam.abc;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Way2SMS {

	WebDriver driver = null;
	public void launchBrowser(){
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://site23.way2sms.com/jsp/UserRegistration.jsp");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	public void chooseCity(){
		WebElement citySelectEle = driver.findElement(By.id("city"));
		Select sel = new Select(citySelectEle);
		//sel.selectByVisibleText("Hyderabad ");
		//
		
		WebElement selectedOp = sel.getFirstSelectedOption();
		System.out.println(selectedOp.getText());
		
		sel.selectByValue("174");
		
		selectedOp = sel.getFirstSelectedOption();
		System.out.println(selectedOp.getText());
		
		List<WebElement> list = sel.getOptions();
		System.out.println(list.size());
		for (WebElement webElement : list) {
			System.out.println(webElement.getText());
		}
		
		/*sel.deselectAll();
		sel.deselectByIndex(1);
		sel.deselectByValue("");
		sel.deselectByVisibleText("");
		
		sel.selectByVisibleText("");
		sel.selectByValue("");
		sel.selectByIndex(1);
		
		List<WebElement> l2 =sel.getAllSelectedOptions();
		
		sel.isMultiple();*/
		
	}
	
	public static void main(String[] args) {
		Way2SMS s =new Way2SMS();
		s.launchBrowser();
		s.chooseCity();
	}
}
