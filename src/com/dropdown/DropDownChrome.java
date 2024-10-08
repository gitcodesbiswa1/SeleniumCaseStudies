package com.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownChrome {
	
	WebDriver dr;
	
	@Test
	public void ChromeTesting() throws Exception {
		int daylen=0,monlen=0,yrlen=0;
		System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
		dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.facebook.com/campaign/landing.php?");		
		Thread.sleep(3000);
		WebElement month= dr.findElement(By.xpath("//*[@id=\"month\"]"));
		Select month_dd= new Select(month);
		month_dd.selectByIndex(3);
		WebElement day= dr.findElement(By.xpath("//*[@id=\"day\"]"));
		Select day_dd= new Select(day);
		day_dd.selectByValue("20");
		WebElement year= dr.findElement(By.xpath("//*[@id=\"year\"]"));
		Select year_dd= new Select(year);
		year_dd.selectByVisibleText("2001");
		
		
		List<WebElement> days= day_dd.getOptions();
		
		daylen=days.size();
		System.out.println("The number of elements in day dropdown "+daylen);
		
		List<WebElement> months= month_dd.getOptions();
		
		monlen=months.size();
		System.out.println("The number of elements in month dropdown "+monlen);
		
		
		List<WebElement> years= year_dd.getOptions();
		
		yrlen=years.size();
		System.out.println("The number of elements in year dropdown "+yrlen);
		


		
		dr.quit();
		
}
	
	
	
	@Test
	public void EdgeTesting() throws Exception {
		int daylen=0,monlen=0,yrlen=0;
		System.setProperty("webdriver.edge.driver", "./EdgeBrowserJars/msedgedriver.exe");
		dr=new EdgeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.facebook.com/campaign/landing.php?");		
		Thread.sleep(3000);
		WebElement month= dr.findElement(By.xpath("//*[@id=\"month\"]"));
		Select month_dd= new Select(month);
		month_dd.selectByIndex(3);
		WebElement day= dr.findElement(By.xpath("//*[@id=\"day\"]"));
		Select day_dd= new Select(day);
		day_dd.selectByValue("20");
		WebElement year= dr.findElement(By.xpath("//*[@id=\"year\"]"));
		Select year_dd= new Select(year);
		year_dd.selectByVisibleText("2001");
		
		
		List<WebElement> days= day_dd.getOptions();
		
		daylen=days.size();
		System.out.println("The number of elements in day dropdown "+daylen);
		
		List<WebElement> months= month_dd.getOptions();
		
		monlen=months.size();
		System.out.println("The number of elements in month dropdown "+monlen);
		
		
		List<WebElement> years= year_dd.getOptions();
		
		yrlen=years.size();
		System.out.println("The number of elements in year dropdown "+yrlen);
		


		
		dr.quit();
		
}
}
