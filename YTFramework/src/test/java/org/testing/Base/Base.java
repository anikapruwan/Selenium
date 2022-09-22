package org.testing.Base;

import java.io.File;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testing.pages.Login;
import org.testing.pages.Logout;
import org.testing.utilities.Logs;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base 
{
	 
	 public ChromeDriver driver;
	 public Properties pr;
	 public Login lg;
	@BeforeMethod
	public void launch() throws InterruptedException, IOException
	{
		/*	WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setAcceptInsecureCerts(true);
		cap.acceptInsecureCerts();
		cap.setJavascriptEnabled(false);
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		//options.addArguments("--headless");
		options.merge(cap);*/
		WebDriverManager.chromedriver().setup();
		// System.setProperty("webdriver.chrome.driver", "../YTFramework/chromedriver");
		driver = new ChromeDriver();
		
		File f = new File("../YTFramework/Object.properties");
		//properties file read
		FileReader fr = new FileReader(f);
		pr = new Properties();
		pr.load(fr);
		//
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(4000);
		Logs.takeLogs("Base", "in Before method");
	//	ScreenShotCapture.TakeScreeShot(driver, "../YTFramework/Screenshot/Test.png");
		Login l = new Login(driver, pr);
		l.signin("vish090amit", "Anirudh@123");
		
		
	}
	
    @AfterMethod
	public void close() throws InterruptedException
	{
    	Logout l = new Logout(driver, pr);
    	l.signout();
    	
	}
	

}
