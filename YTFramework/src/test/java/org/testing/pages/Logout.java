package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logout {
	ChromeDriver driver;
	Properties pr;
	public Logout(ChromeDriver driver, Properties pr)
	{
		this.driver = driver;
		this.pr = pr;
		
	}
	
	public void signout() throws InterruptedException
	{
		Thread.sleep(2000);
    	driver.findElement(By.xpath(pr.getProperty("Logout_1"))).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath(pr.getProperty("Logout_2"))).click();		
    	Thread.sleep(5000);
    	driver.close();
	}

}



