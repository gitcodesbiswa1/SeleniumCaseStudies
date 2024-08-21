package com.selcs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OrangeHRM {
WebDriver drive;
	
	@Test(priority=1)
	public void ChromeBrowserLaunch() throws Exception{
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriverJars\\chromedriver.exe");
		drive= new ChromeDriver();
		drive.get("https://opensource-demo.orangehrmlive.com/");
		drive.manage().window().maximize();
		String pgtitle=drive.getTitle();
		int pgtitlelen =pgtitle.length();
		System.out.println("Page title "+pgtitle+"Page title length "+pgtitlelen);
		String url=drive.getCurrentUrl();
		System.out.println("Page url "+url);
		String pgsrc= drive.getPageSource();
		int pgsrclen=pgsrc.length();
		System.out.println("Page source length "+pgsrclen);
		
		drive.quit();
	}
	@Test(priority=2)
	public void FirefoxBrowserLaunch() throws Exception{
		System.setProperty("webdriver.gecko.driver",".\\FirefoxDriverJars\\geckodriver.exe");
		drive= new FirefoxDriver();
		drive.get("https://opensource-demo.orangehrmlive.com/");
		drive.manage().window().maximize();
		String pgtitle=drive.getTitle();
		int pgtitlelen =pgtitle.length();
		System.out.println("Page title "+pgtitle+"Page title length "+pgtitlelen);
		String url=drive.getCurrentUrl();
		System.out.println("Page url "+url);
		String pgsrc= drive.getPageSource();
		int pgsrclen=pgsrc.length();
		System.out.println("Page source length "+pgsrclen);
		
		drive.quit();
	}
	@Test(priority=3)
	public void EdgeBrowserLaunch() throws Exception{
		System.setProperty("webdriver.edge.driver",".\\EdgeBrowserJars\\msedgedriver.exe");
		drive= new EdgeDriver();
		drive.get("https://opensource-demo.orangehrmlive.com/");
		drive.manage().window().maximize();
		String pgtitle=drive.getTitle();
		int pgtitlelen =pgtitle.length();
		System.out.println("Page title "+pgtitle+"Page title length "+pgtitlelen);
		String url=drive.getCurrentUrl();
		System.out.println("Page url "+url);
		String pgsrc= drive.getPageSource();
		int pgsrclen=pgsrc.length();
		System.out.println("Page source length "+pgsrclen);
		
		drive.quit();
	}
}

