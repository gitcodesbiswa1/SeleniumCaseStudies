package com.Webelement;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class WebelementDD {
	@Test
	public void ddcheck() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		dr.get("https://www.facebook.com/campaign/landing.php");
		dr.manage().window().maximize();
		Thread.sleep(5000);
		WebElement month = dr.findElement(By.id("month"));
		Select month_dd= new Select(month);
		
		WebElement option= month_dd.getFirstSelectedOption();
		String monthindex=option.getText();
		System.out.println(monthindex);
		
		month_dd.selectByIndex(11);
		WebElement option1= month_dd.getFirstSelectedOption();
		String monthindex1=option.getText();
		System.out.println(monthindex1);
		Thread.sleep(5000);
		dr.quit();
	}
}
