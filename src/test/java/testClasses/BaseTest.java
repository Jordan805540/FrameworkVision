package testClasses;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.DashBoardPage;
import pages.LoginPage;

public class BaseTest {

		public	static WebDriver driver;
			
			public LoginPage lp;
			public DashBoardPage db;
			
			@BeforeSuite
			public void initDriver() throws IOException
			{
				
				WebDriverManager.chromedriver().setup();
				 
				 
				 ChromeOptions options = new ChromeOptions();
				 
				 options.addArguments("--disable-notifications");
				 
				 options.addArguments("--start-maximized");
//				 
//				 options.addArguments("--incognito");
				 
//				 options.addArguments("--headless");
				 
				 driver = new ChromeDriver(options);
				

				 Properties prop = new Properties();
				 
				 String filepath = System.getProperty("user.dir")+"\\config.properties";
				 
				 FileInputStream fis = new FileInputStream(filepath);
				 
				 prop.load(fis);
				 
				 
				
				driver.get(prop.getProperty("testsiteurl"));
			}
			
			
			@BeforeClass
			public void createObject() throws IOException
			{
				 lp = new LoginPage(driver);
				 db = new DashBoardPage(driver);
			}

			
			@AfterSuite
			public void tearDown()
			{
				driver.quit();
			}
		}

	


