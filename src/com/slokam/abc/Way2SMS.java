package com.slokam.abc;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
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
		
		driver.close();
		driver.quit();
		
		driver.findElement(By.id(""));
		driver.get("");
		driver.getCurrentUrl();
		driver.getPageSource();
		driver.getTitle();
		
		driver.getWindowHandle();
		driver.getWindowHandles();
		
		driver.manage();
		
		driver.switchTo().frame("");
		driver.switchTo().defaultContent();
		driver.switchTo().window("");
		Alert  alert = driver.switchTo().alert();
		alert.accept();
		alert.dismiss();
		alert.sendKeys("");
		alert.getText();
		
		alert.authenticateUsing(null);
		alert.setCredentials(null);
		
		driver.get("");
		driver.navigate().to("");
		URL url=null;
		try {
			url = new URL("https://www.w3schools.com/js/default.asp");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().to(url);
		
		driver.navigate().refresh();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		Point po = driver.manage().window().getPosition();
		Dimension dim =driver.manage().window().getSize();
		
		int x = po.getX();
		int y = po.getY();
		
		int h = dim.getHeight();
		int w = dim.getWidth();
		
		Point p1 = new Point(10,30);
		driver.manage().window().setPosition(p1);
		Dimension di = new Dimension(30, 100);
		driver.manage().window().setSize(di);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		
		
		WebElement el = driver.findElement(By.id(""));
		
		el.clear();
		el.click();
		el.findElement(null);
		el.findElements(null);
		el.getAttribute("style");
		el.getCssValue("margin-left");
		Point p2 = el.getLocation();
		Rectangle re = el.getRect();
		
		Dimension d2 = el.getSize();
		el.getTagName();
		el.getText();
		
		el.isDisplayed();
		el.isEnabled();
		el.isSelected();
		
		el.sendKeys("");
		el.submit();
		
		
		//TO-DO
		driver.findElements(By.id(""));
		//Cookies
	}
	
	public static void main(String[] args) {
		Way2SMS s =new Way2SMS();
		s.launchBrowser();
		s.chooseCity();
	}
}
