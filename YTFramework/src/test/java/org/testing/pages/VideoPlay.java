package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VideoPlay {
	ChromeDriver driver;
	Properties pr;
	public VideoPlay(ChromeDriver driver, Properties pr)
	{
		this.driver = driver;
		this.pr = pr;
		
	}
	 
	

	public void play()
	{
		driver.findElement(By.id(pr.getProperty("TC4_1"))).click();
	}
}
