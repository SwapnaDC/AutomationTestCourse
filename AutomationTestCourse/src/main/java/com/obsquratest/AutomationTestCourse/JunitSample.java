package com.obsquratest.AutomationTestCourse;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class JunitSample
		{
		public WebDriver driver;
		@Before
		public void initilizeBrowser()
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\EclipseWorkspace\\AutomationTestCourse\\src\\main\\java\\Resources\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
		}
		
		@Test
		public void getTitleCommand()
		{
			String actualTitle ="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
					
			String title=driver.getTitle();
			if(title.equals(actualTitle))
			{
				System.out.println("titles are equal");
			}
			else
			{
				System.out.println("titles are not equal");
			}		
		}
		@Test
		public void getUrlCommand()
		{
			String url=driver.getCurrentUrl();
			if(url.equals("https://www.amazon.in/"))
			{
				System.out.println("url are equal");
			}
			else
			{
				System.out.println("url are not equal");
			}
		}
		@Test
		public void getPageSourceCommand()
		{
			String pageSource=driver.getPageSource();
			if(pageSource.contains("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"))
			{
				System.out.println("pagesource are same");
			}
			else
			{
				System.out.println("page source are not same");
			}
			
		}
		@After
		public void afterTest()
		{
			//driver.close();
			driver.quit();
		}
		
		public void navigateCommands()
		{
			driver.navigate().to("https://www.flipkart.com/");
			driver.navigate().back();
			driver.navigate().forward();
			driver.navigate().refresh();
		}
}
