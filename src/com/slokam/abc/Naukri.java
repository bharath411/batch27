package com.slokam.abc;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Naukri {

	public void test1() {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		// driver.quit();
		String title = driver.getTitle();
		System.out.println(title);

		String currentUrl = driver.getCurrentUrl();
		String pageSource = driver.getPageSource();

		System.out.println(currentUrl);
		System.out.println(pageSource);

		File file = driver.getScreenshotAs(OutputType.FILE);
		File file2 = new File("D:\\screenshot.jpg");
		try {
			FileUtils.copyFile(file, file2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}

	public static void main(String[] args) {
		Naukri n = new Naukri();
		n.test1();
	}
}
