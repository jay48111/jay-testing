package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDemo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium830am\\chromedriver-win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();// to open blank browser
		driver.get("https://www.google.com/");// to open the website
//		Thread.sleep(5000);
		System.out.println("title is.."+driver.getTitle());
		System.out.println("current URL is.."+driver.getCurrentUrl());
		driver.get("https://www.youtube.com");
		Thread.sleep(1000);
		driver.findElement(By.name("search_query")).sendKeys("alone chill lofi mashup song");
		Thread.sleep(1000);
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(3000);
		driver.get("https://www.youtube.com/results?search_query=alone+chill+lofi+mashup+song");
		driver.get("https://www.youtube.com/watch?v=gerbE_43WyY");
		Thread.sleep(1000);
		driver.findElement(By.name("search_query")).sendKeys("mind relax lofi songs");
		driver.get("https://www.youtube.com/watch?v=zh6bLpK0uSA");
		Thread.sleep(20000);
		driver.close();//to close only current tab
		driver.quit();//to close all the tab
	}
}

