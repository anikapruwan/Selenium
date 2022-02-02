package org.testing.pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		//driver.findElement(By.xpath(pr.getProperty("Login_1"))).click();
	List<WebElement> els=	driver.findElements(By.xpath("//tp-yt-paper-button[@aria-label='Sign in']"));
	els.get(1).click();
		//Thread.sleep(2000);
		driver.findElement(By.id(pr.getProperty("Login_2"))).sendKeys("vish090amit");
		//Thread.sleep(2000);
		driver.findElement(By.xpath(pr.getProperty("Login_3"))).click();
		//Thread.sleep(66000);
		WebElement el = driver.findElement(By.xpath(pr.getProperty("Login_4")));
		WebDriverWait w = new WebDriverWait(driver, 20);
		w.until(ExpectedConditions.visibilityOf(el)).sendKeys("Anirudh@123");
		//driver.findElement(By.xpath(pr.getProperty("Login_4"))).sendKeys("Anirudh@123");
		//Thread.sleep(2000);
		driver.findElement(By.xpath(pr.getProperty("Login_5"))).click();
		//Thread.sleep(15000);
	}

}
