package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Nopcommerce {
	WebDriver dr;
	@Test
	public void Search() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./FirefoxDriverJars/geckodriver.exe");
		dr= new FirefoxDriver();
		dr.navigate().to("https://admin-demo.nopcommerce.com/login");
		dr.manage().window().maximize();
		Thread.sleep(10000);		
		boolean sel=dr.findElement(By.id("Email")).isSelected();
		boolean ena=dr.findElement(By.id("Password")).isEnabled();
		/*String title= dr.getTitle();
		System.out.println("Page title: "+title);
		String pgsrc= dr.getPageSource();
		int pgsrclen= pgsrc.length();
		System.out.println("Page source length "+pgsrclen);*/
		//dr.quit();	
	}
}




