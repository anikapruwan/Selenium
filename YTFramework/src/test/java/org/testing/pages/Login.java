package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login 
{
	ChromeDriver driver;
	Properties pr;
	public Login(ChromeDriver driver, Properties pr)
	{
		this.driver = driver;
		this.pr = pr;
		
	}
	
	public void signin(String username, String password) throws InterruptedException
	{
		driver.findElement(By.xpath(pr.getProperty("Login_1"))).click();
		Thread.sleep(2000);
		driver.findElement(By.id(pr.getProperty("Login_2"))).sendKeys("vish090amit");
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr.getProperty("Login_3"))).click();
		Thread.sleep(66000);
		driver.findElement(By.xpath(pr.getProperty("Login_4"))).sendKeys("Anirudh@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr.getProperty("Login_5"))).click();
		Thread.sleep(15000);
	}

}
