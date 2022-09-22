package org.testing.TestScripts;

import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.interactions.Actions;
import org.testing.Base.Base;
import org.testing.pages.VideoPlay;
import org.testing.utilities.ScreenShotCapture;



public class TC6 extends Base
{

    @Test
 	public void TC_06() throws InterruptedException, IOException
	{
    	VideoPlay vp = new VideoPlay(driver,pr);
		vp.play();
	//	Thread.sleep(10000);
		driver.findElement(By.xpath(pr.getProperty("TC6_1"))).click();
		Actions ac = new Actions(driver);
		int i=0;
		while(driver.findElements(By.xpath(pr.getProperty("TC6_2"))).size()==0)
		{
			while(i<2)
			{
			ac.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
			ac.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
			i++;
			}
			Thread.sleep(2000);	
		}
		driver.findElement(By.cssSelector(pr.getProperty("TC6_3"))).click();
	//	Thread.sleep(3000);
	//	driver.findElement(By.xpath("//*[text()='Add a public comment...' or text()='Commenting publicly as ' or @*='Add a public comment...']")).sendKeys("This is an automated message for youtube");
		driver.findElement(By.xpath(pr.getProperty("TC6_4"))).sendKeys("This is an automated message for youtube");

	//	Thread.sleep(3000); //	Thread.sleep(3000);
//		Thread.sleep(3000); //	Thread.sleep(3000);
		driver.findElement(By.xpath(pr.getProperty("TC6_5"))).click();
	//	Thread.sleep(4000);	
		ScreenShotCapture.TakeScreeShot(driver, "../YTFramework/Screenshot/TC4.png");
	}

}
