package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Face1 {
	
@Test
	public void run(){
	WebDriver driver=new FirefoxDriver();
	driver.get("http://facebook.com");
	String Title=driver.getTitle();
	System.out.println(Title + "  Hey Mark I m on Facebook");
	driver.close();
	}

@Test
	public void run1(){
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.co.in");
		
		String Title=driver.getTitle();
		Assert.assertTrue(false);
		System.out.println(Title + "  Hey Mark I m on Facebook");
		driver.close();
		}

}
