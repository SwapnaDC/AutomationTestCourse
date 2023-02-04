package com.obsquratest.AutomationTestCourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base
	{
	public WebDriver driver;
	public void initilizeBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\EclipseWorkspace\\AutomationTestCourse\\src\\main\\java\\Resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}

	public static void main(String[] args)
	{
		Base base=new Base();
		base.initilizeBrowser();
		

	}

}
