package com.locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Easycalculation {
	WebDriver dr;
	@Test
	public void ChromeTesting() {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
		dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.easycalculation.com/index.php");
		
		
}
}
