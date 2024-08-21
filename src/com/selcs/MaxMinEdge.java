package com.selcs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class MaxMinEdge {
	WebDriver drive;
	@Test(priority=1)
	public void EdgeBrowserLaunch() throws Exception{
		System.setProperty("webdriver.edge.driver",".\\EdgeBrowserJars\\msedgedriver.exe");
		drive= new EdgeDriver();
		drive.get("https://auth.hollandandbarrett.com/u/login");
		drive.manage().window().maximize();
		Thread.sleep(5000);
		drive.manage().window().minimize();
		Thread.sleep(7000);
		drive.quit();
	}
}
