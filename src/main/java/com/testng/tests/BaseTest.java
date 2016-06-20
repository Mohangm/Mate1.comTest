package com.testng.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.mate1.pages.GmailContactsWindow;
import com.mate1.pages.Mate1ProfileCreationPage;
import com.mate1.pages.Mate1ProfileHomePage;
import com.mate1.pages.TellUsAboutYourSelfPage;

	public class BaseTest {
		public WebDriver driver;
		public Mate1ProfileCreationPage profile;
		public TellUsAboutYourSelfPage tellYourSelfPage;
		public GmailContactsWindow gamilContsWindow;
		public Mate1ProfileHomePage mate1ProfileHomePage;
		@BeforeMethod
			public void setUp()
			{
				//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get("http://www.mate1.com/");
			}
			
			@AfterMethod
			public void tearDown()
			{
				driver.close();
			}
		

}
