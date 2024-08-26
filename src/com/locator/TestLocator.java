package com.locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestLocator {
	WebDriver dr;
	@Test
	public void Search() {
		System.setProperty("webdriver.gecko.driver", "./FirefoxDriverJars/geckodriver.exe");
		dr= new FirefoxDriver();
		dr.navigate().to("https://www.login.hiox.com/register?referrer=easycalculation.com");
		dr.manage().window().maximize();
		String title= dr.getTitle();
		System.out.println("Page title: "+title);
		String pgsrc= dr.getPageSource();
		int pgsrclen= pgsrc.length();
		System.out.println("Page source length "+pgsrclen);
		//dr.quit();	
	}
}
