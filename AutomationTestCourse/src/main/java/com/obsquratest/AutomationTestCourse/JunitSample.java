package com.obsquratest.AutomationTestCourse;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.BeforeClass;
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
			String expectedTitle=driver.getTitle();
			assertEquals(expectedTitle,actualTitle)	;
		}
		@Test
		public void getUrlCommand()
		{
			String actualUrl ="https://www.amazon.in/";
			String expectedUrl=driver.getCurrentUrl();
			assertEquals( expectedUrl,actualUrl);
		}
		@Test
		public void getPageSourceCommand()
		{
			String actualPageSource="Search Amazon.in";
			String pageSource=driver.getPageSource();
			assertTrue(pageSource.contains(actualPageSource));
		}
		@After
		public void afterTest()
		{ 
		  //driver.close();
			driver.quit();
		}
		@Test
		public void navigateCommands()
		{
			driver.navigate().to("https://www.flipkart.com/");
			driver.navigate().back();
			driver.navigate().forward();
			driver.navigate().refresh();
		}
		@AfterClass
		public static void afterClass()
		{
			System.out.println("after class");
		}
		@BeforeClass
		public static void beforeClass()
		{
			System.out.println("before class");
		}
		@Test
		public void testCase1()
		{
			System.out.println("test case1");
		}
		@Test
		public void testCase2()
		{
			System.out.println("test case2");
		}
		@After
		public void after()
		{
			System.out.println("after ");
		}
		@Before
		public void before()
		{
			System.out.println("before");
		}
		
}
